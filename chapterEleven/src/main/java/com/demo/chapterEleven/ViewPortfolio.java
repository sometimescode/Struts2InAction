package com.demo.chapterEleven;


import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.demo.chapterEleven.utils.Portfolio;
import com.demo.chapterEleven.utils.PortfolioServiceInterface;
import com.demo.chapterEleven.utils.User;

import com.opensymphony.xwork2.ActionSupport;

/*
 * This action retrieves the data model for viewing a particular portfolio. 
 */

public class ViewPortfolio extends ActionSupport  {

	public String execute(){
		
		setPortfolio(  getPortfolioService().getPortfolio(id) );
		System.out.println("Portfoli pics = " + portfolio.getPics().size());
		
		return SUCCESS;
	}

	/* JavaBeans Properties to Receive Request Parameters */
	
	private Long id;
	private Portfolio portfolio;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}
	
	public Date getCurrentDate(){
		return new Date();
	}
		
	/*
	 * Field with getter and setter for PortfolioService object, which will be injected
	 * via Spring.	
	 */
	
	PortfolioServiceInterface portfolioService;

	public PortfolioServiceInterface getPortfolioService( ) 	{
		
		return portfolioService;
	
	}
	
	public void setPortfolioService(PortfolioServiceInterface portfolioService) {
		this.portfolioService = portfolioService;
	}
	
	

}
