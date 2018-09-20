package com.nelioalves.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer Status;
	private String msg;
	private Long timeStamp;
	
	public StandardError(Integer status, String msg, Long timeStamp) {
		super();
		Status = status;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}
	
	public Integer getStatus() {
		return Status;
	}
	public String getMsg() {
		return msg;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	

}
