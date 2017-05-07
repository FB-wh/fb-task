package org.fb.task.services;

import java.util.List;

import javax.annotation.Resource;

import org.fb.task.dao.PersonMapper;
import org.fb.task.entity.Person;
import org.fb.task.thread.PrintThread;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
* ��������̣߳�ÿ5���ӡһ�����ݿ���ڵ�Ů����Ϣ
* 
* @auth wh
* @time 2017��5��4������10:09:01
*
**/
@Service("printUserTask")
public class PrintUserTask {
	@Resource
	private ThreadPoolTaskExecutor taskExecutor;
	@Resource
	private PersonMapper personMapper;
	
	/**
	 * ÿ5���ӡһ�����ݿ���ڵ�Ů����Ϣ
	 */
	@Scheduled(cron = "0/5 * * * * ?") 
	public void queryFemale(){
		System.out.println("in...");
		List<Person> females =  personMapper.queryBySex("1");
		for(Person female : females){
			taskExecutor.execute(new PrintThread(female));
		}
	}
}



