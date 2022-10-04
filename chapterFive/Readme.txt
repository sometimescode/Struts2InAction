Chapter Five

Updated import com.opensymphony.xwork2.util.TypeConversionException in
CircleTypeConverter.java to:
com.opensymphony.xwork2.conversion.TypeConversionException

In chapterFive.xml:
Modify <result> to use "/WEB-INF/chapterFive/..." instead of just "/chapterFive/..."

=========================================================================================================
IMPORTANT!!!!!!! ^ MIGHT BE CAUSE FOR ERROR YOU ENCOUNTERED IN CHAPTER 4. CHECK THEN DELETE THIS LINE
=========================================================================================================

Book tells you to try Create an account. RegistrationSuccess' redirect to Admin Portfolio uses different.
"<s:url action='secure/AdminPortfolio'/>" and it recognizes it. Why isn't the value:
"<s:url action='/chapterFive/secure/AdminPortfolio'/>"?
Above value returns an error. 

============

I don't think you're meant to click on the link found in RegistrationSuccess. Just proceed to the next chapter. 

Relevant stack overflow regarding conversion property files:
https://stackoverflow.com/questions/4658937/is-a-conversion-properties-file-always-necessary-for-struts-2