HelloWorld w/Annotation
Added convention plugin dependency to use annotation:
https://struts.apache.org/getting-started/annotations
Have to read through this: 
https://struts.apache.org/plugins/convention/
Project References:
https://github.com/apache/struts-examples/tree/master/annotations
https://mkyong.com/struts2/struts-2-hello-world-annotation-example/

Also:
https://struts.apache.org/plugins/convention/converting

Important: 
Check "http://localhost:8080/helloWorldAnnotation/config-browser/actionNames.action"
To routinely get information on the namespaces and actions that are being made. It's really helpful.

Created actions folder and moved chapterTwo folder and its java files there to follow convention.
Created content folder and moved chapterTwo folder and its jsp files there to follow convention.
ActionSupport already implements Action, so we don't need to implement Action again.

The original project already follows a part of the convention in that you don't need the suffix "Action" in the action class if it already
implements Action (which it does for AnnotatedNameCollector)

Updated imports on actions. 
- Removed "import org.apache.struts2.dispatcher.ServletDispatcherResult;"
- Changed "import org.apache.struts2.config.Result;" to "import org.apache.struts2.convention.annotation.Result;" which looks like it's the updated equivalent.
- Needed to mention Namespace to make it work. I didn't set any action names explicitly, so it will use the file names as actions (check documents above regarding how struts2 names them by default). (See form action in HelloWorld.jsp)  
- Not setting ResultPath and giving it value of "/" (webapp root) in the action file means it will search for the JSP by default under /WEB-INF/content
https://www.codejava.net/frameworks/struts/struts2-beginner-tutorial-with-convention-plugin-zero-configuration#ConventionPlugin

Trying to keep it as close to the original as I can. But for some reason decided to use default convention (so "actions" folder is being looked at for action files by default instead of creating and setting "manning").
Also, I opted to include the @Namespace because what the book says doesn't match. It mentions on p.37:
"The entire Java package namespace isn’t used. The framework only uses the portion
of the package namespace beneath the package specified in the actionPackages
parameter. In our case, we told the framework to look in the manning package, and
our action classes reside in the manning.chapterOne Java package. The framework will
give this package a namespace of chapterOne. In this fashion, all annotated actions in
the same Java package will be added to the same Struts 2 package/namespace."
But what it actually does if you DON'T include @Namespace is that it will assign the namespace chapter-one instead.
Couldn't get s:form in AnnotatedNameCollector.jsp to go to the action using chapter-two as namespace, so decided to include the @Namespace. Already spent too much time in Chapter 2.
