HelloWorld w/Annotation
Added convention plugin dependency to use annotation:
https://struts.apache.org/getting-started/annotations
Have to read through this: 
https://struts.apache.org/plugins/convention/
Also can view this sample project as reference:
https://github.com/apache/struts-examples/tree/master/annotations

Created actions folder and moved chapterTwo folder and its java files there to follow convention.
Created content folder and moved chapterTwo folder and its jsp files there to follow convention.
ActionSupport already implements Action, so we don't need to implement Action again.

The original project already follows a part of the convention in that you don't need the suffix "Action" in the action class if it already
implements Action (which it does for AnnotatedNameCollector)

Updated imports on actions. 
- Removed "import org.apache.struts2.dispatcher.ServletDispatcherResult;"
- Changed "import org.apache.struts2.config.Result;" to "import org.apache.struts2.convention.annotation.Result;" which looks like it's the updated equivalent.