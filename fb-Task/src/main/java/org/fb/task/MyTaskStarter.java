package org.fb.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * ��ʱ����������
 * @author wh
 *
 */
public class MyTaskStarter {
	
	private static Logger logger = LoggerFactory.getLogger(MyTaskStarter.class);
	
	public static void main(String[] args) {
		logger.info("===========================��MyTaskStarter��start===========================");
		try {
			@SuppressWarnings("resource")
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-*.xml");
			context.start();
			logger.info("===========================��MyTaskStarter��success===========================");
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("===========================��MyTaskStarter��fail===========================");
		}
	}

}

