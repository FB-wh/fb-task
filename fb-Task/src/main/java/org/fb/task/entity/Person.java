package org.fb.task.entity;

import java.io.Serializable;

/**
* 
* @auth wh
* @time 2017��5��4������10:11:36
*
**/

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * �û�id
	 */
	private String psnid;
	
	/**
	 * �û���
	 */
	private String psnname;
	
	/**
	 * 0:��
	 * 1��Ů
	 */
	private String sex;

	public String getPsnid() {
		return psnid;
	}

	public void setPsnid(String psnid) {
		this.psnid = psnid;
	}

	public String getPsnname() {
		return psnname;
	}

	public void setPsnname(String psnname) {
		this.psnname = psnname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}

