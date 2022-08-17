package com.demo.actions.chapterTwo;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

/* 
 * Annotations version of the pass through action.  This action does
 * nothing, but we have to provide this class since annotations
 * are inherently based in a Java class.  We extend ActionSupport 
 * to get its empty logic execute method which does nothing but 
 * forward to the success result, which defaults to the only result 
 * defined in this case.   
 */

@Namespace("/chapterTwo")
@Result(location="AnnotatedNameCollector.jsp")
public class AnnotatedNameCollector extends ActionSupport {
	

}
