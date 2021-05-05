package com.example.demo.wsdto;

import java.util.List;

public class QueryResult {
	
	private Integer totalRegistros;
	private List<Object> list;
	
	
	public Integer getTotalRegistros() {
		return totalRegistros;
	}
	public void setTotalRegistros(Integer totalRegistros) {
		this.totalRegistros = totalRegistros;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}

}
