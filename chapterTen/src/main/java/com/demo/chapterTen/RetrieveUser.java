package com.demo.chapterTen;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.demo.chapterTen.utils.PortfolioServiceInterface;
import com.demo.chapterTen.utils.User;
import com.demo.chapterTen.utils.Struts2PortfolioConstants;

import com.opensymphony.xwork2.ActionSupport;

/*
 *
 */

public class RetrieveUser extends ActionSupport  {

	public String execute(){
		
		User user = getPortfolioService().getUser( getUsername() );
		setJsonModel(user);
		
		return SUCCESS;
	}
	private String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	private Object jsonModel;
	
	public Object getJsonModel() {
		return jsonModel;
	}


	public void setJsonModel(Object jsonModel) {
		this.jsonModel = jsonModel;
	}

	
	private PortfolioServiceInterface portfolioService;
	
	public PortfolioServiceInterface getPortfolioService( ) 	{
		
		return portfolioService;
		
	}
	public void setPortfolioService( PortfolioServiceInterface portService){
		portfolioService = portService;
	}
	
	

}
