package com.bw.myaccess.vo;

import java.io.Serializable;
import java.util.List;

public class RightVo<T> implements Serializable{
	private String text;
	
	private  List<T> nodes;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<T> getNodes() {
		return nodes;
	}

	public void setNodes(List<T> nodes) {
		this.nodes = nodes;
	}
	
	
}
