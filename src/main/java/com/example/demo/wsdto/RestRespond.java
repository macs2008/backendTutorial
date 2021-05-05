package com.example.demo.wsdto;

public class RestRespond {

	private Integer responseCode;
	private String messsage;
	
	
	
	public RestRespond(Integer responseCode) {
		super();
		this.responseCode = responseCode;
		
	}
	
	public RestRespond(Integer responseCode,String menssage	) {
		super();
		this.responseCode = responseCode;
		this.messsage = menssage;
		
	}
	
	
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	
	
}
