package com.demo.chapterEleven;


import com.demo.chapterEleven.utils.PortfolioServiceInterface;
import com.demo.chapterEleven.utils.User;
import com.demo.chapterEleven.utils.UserAware;

import com.opensymphony.xwork2.ActionSupport;

/*
 * UpdateAccount takes the information from the update form and persists
 * the new user account information.
  */

public class UpdateAccount extends ActionSupport implements UserAware {
	


	public String execute(){
		
		/*
		 * Move the new, already validated data onto our application domain object, user, and persist that user.
		 */
		
		portfolioService.updateUser(getUser());
		
		return SUCCESS;
	}
	
	private User user;
	
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	
	private PortfolioServiceInterface portfolioService;
	
	public PortfolioServiceInterface getPortfolioService( ) 	{
		
		return portfolioService;
		
	}	
	public void setPortfolioService( PortfolioServiceInterface portService){
		portfolioService = portService;
	}
	

	
	
}
