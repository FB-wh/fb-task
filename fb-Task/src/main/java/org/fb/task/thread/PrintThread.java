package org.fb.task.thread;

import org.fb.task.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 
* @auth wh
* @time 2017��5��4������10:27:26
*
**/

public class PrintThread implements Runnable{
	private static Logger logger = LoggerFactory.getLogger(PrintThread.class);
	
	private Person person; 
	
	public PrintThread(Person person){
		this.person = person;
	}

	public void run() {
		logger.info("psnid:" + person.getPsnid() +",psnName:" + person.getPsnname());
		/**
		 * ��person����ش���
		 */
	}

}



