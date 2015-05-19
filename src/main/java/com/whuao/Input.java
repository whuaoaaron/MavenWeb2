package com.whuao;

import java.util.ArrayList;
import java.util.List;

public class Input {

	private String type;

	private List<String> csvInstance = new ArrayList<String>();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getCsvInstance() {
		return csvInstance;
	}

	public void setCsvInstance(List<String> csvInstance) {
		this.csvInstance = csvInstance;
	}
	
	@Override
	public String toString() {
		return "{type:" + this.type + ", csvInstance:" +this.csvInstance + "}";
	}

}
