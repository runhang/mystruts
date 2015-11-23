package com.mystruts.core.element;

import java.util.List;

public class ActionElement {

	//xml的节点名称
	private String actionName;
	private String actionClass;
	private String actionMethod = "execute";
	private List<ResultElement> resultElements;
	
	public String getActionName() {
		return actionName;
	}
	
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	
	public String getActionClass() {
		return actionClass;
	}
	
	public void setActionClass(String actionClass) {
		this.actionClass = actionClass;
	}
	
	public String getActionMethod() {
		return actionMethod;
	}
	
	
	public void setActionMethod(String actionMethod) {
		this.actionMethod = actionMethod;
	}
	
	public List<ResultElement> getResultElements() {
		return resultElements;
	}
	
	public void setResultElements(List<ResultElement> resultElements) {
		this.resultElements = resultElements;
	}
	
	
}
