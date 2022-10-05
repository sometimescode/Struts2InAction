Chapter Six

Outdated syntax for s:set in SetTag.jsp.
Replaced <s:set name="username" value="user.username"/> with:
<s:set var="username" value="user.username"/>
https://struts.apache.org/tag-developers/set-tag

Outdated syntax for s:bean in BeanTag1.jsp. This is correct in the book's snippet, but not in the given file.
Replaced <s:bean name="org.apache.struts2.util.Counter" id="counter"> with:
<s:bean name="org.apache.struts2.util.Counter" var="counter">
https://struts.apache.org/tag-developers/bean-tag

Note for ActionTagNoResult.jsp: Since 2.6, RequestAware is deprecated.
https://struts.apache.org/maven/struts2-core/apidocs/org/apache/struts2/interceptor/RequestAware.html

Outdated syntax for s:url in UrlTag.jsp. This is correct in the book's snippet, but not in the given file.
Replaced <s:url action="IteratorTag" id="myUrl"> with:
<s:url action="IteratorTag" var="myUrl">

Outputs errors in "<i18n> and <text> Tags" but still works.