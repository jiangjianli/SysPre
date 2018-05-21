package com.jiang.common;

import lombok.Getter;
import lombok.Setter;


public class JsonData {

	private int status;
	
	private String msg;
	
	private Object data;
	
	
	
	public static JsonData success(int status,String msg,Object data) {
		JsonData jsondata = new JsonData();
		jsondata.setStatus(status);
		jsondata.setMsg(msg);
		jsondata.setData(data);
		return jsondata;
	}

	public static JsonData fail(int status,String msg) {
		JsonData jsondata = new JsonData();
		jsondata.setStatus(status);
		jsondata.setMsg(msg);
		
		return jsondata;
	}
	
	public static JsonData fail(int status,String msg,Object data) {
		JsonData jsondata = new JsonData();
		jsondata.setStatus(status);
		jsondata.setMsg(msg);
		jsondata.setData(data);
		return jsondata;
	}

	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public Object getData() {
		return data;
	}



	public void setData(Object data) {
		this.data = data;
	}
	
	
	
	
	
	
}
