HelloWorld
a) CREATE BASE PROJECT
1) Installed Tomcat for Java
2) Installed apache-tomcat
3) mvn archetype:generate
>struts2
>8
>48
groupid: com.demo
artifactid: helloWorld (will be the name of generated WAR file)
-
b) TRANSFER FILES
1) Extract SampleApplication
2) Duplicate and Rename (or just rename) HelloWorld.war to HelloWorld.zip.
3) Extract HelloWorld.zip
4) Open created HelloWorld folder
5) Transfer [chapterTwo] and [menu] folders into your project's WEB-INF folder
6) Go to [WEB-INF >src>manning] folder and copy [chapterTwo] into your project's  java/com/demo folder. 
7) In your project's newly added chapterTwo folder:
• move chapterTwo.xml into your project's resource folder
• update HelloWorld.java to reflect current format of .java files (see the .java files under [example] folder of your project for reference)
8) Go to [WEB-INF>src] and modify your project's struts.xml using the struts.xml found in that folder. Update the path of include file since we didn't use manning/chapterTwo folders.
