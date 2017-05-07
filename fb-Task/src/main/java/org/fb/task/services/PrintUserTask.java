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
* 开启多个线程，每5秒打印一次数据库存在的女性信息
* 
* @auth wh
* @time 2017年5月4日下午10:09:01
*
**/
@Service("printUserTask")
public class PrintUserTask {
	@Resource
	private ThreadPoolTaskExecutor taskExecutor;
	@Resource
	private PersonMapper personMapper;
	
	/**
	 * 每5秒打印一次数据库存在的女性信息
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



