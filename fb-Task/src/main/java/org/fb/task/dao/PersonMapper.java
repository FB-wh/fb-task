package org.fb.task.dao;

import java.util.List;

import org.fb.task.entity.Person;

/**
* 
* @auth wh
* @time 2017��5��4������10:11:19
*
**/

public interface PersonMapper {

	/**
	 * ����id���Ա�����û�
	 * @param sex
	 * @return
	 */
	List<Person> queryBySex(String sex);
}



