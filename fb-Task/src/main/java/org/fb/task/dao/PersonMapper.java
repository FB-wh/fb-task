package org.fb.task.dao;

import java.util.List;

import org.fb.task.entity.Person;

/**
* 
* @auth wh
* @time 2017年5月4日下午10:11:19
*
**/

public interface PersonMapper {

	/**
	 * 根据id和性别查找用户
	 * @param sex
	 * @return
	 */
	List<Person> queryBySex(String sex);
}



