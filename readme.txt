###################################################
#created a quick start maven application
#converted quick start to dynamic web module from project facets
#added dependencies
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.0.0.RELEASE</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.0.0.RELEASE</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework/spring-web -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-web</artifactId>
    <version>5.0.0.RELEASE</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.0.0.RELEASE</version>
</dependency>
<!-- https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api -->
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>3.0.1</version>
    <scope>provided</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/javax.servlet.jsp/javax.servlet.jsp-api -->
<dependency>
    <groupId>javax.servlet.jsp</groupId>
    <artifactId>javax.servlet.jsp-api</artifactId>
    <version>2.2.1</version>
    <scope>provided</scope>
</dependency>


<plugin>
    <groupId>org.apache.tomcat.maven</groupId>
    <artifactId>tomcat7-maven-plugin</artifactId>
    <version>2.2</version>
    <configuration>
        <url>http://localhost:8080/manager/text</url>
        <server>TomcatServer</server>
        <path>/sampleapp</path>
    </configuration>
</plugin>



#Add web.xml in WEB-INF
#Configured dispatcher servlet in web.xml
#Create a dispatcher-servlet.xml with below configuration 

<beans xmlns="http://www.springframework.org/schema/beans"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xmlns:context="http://www.springframework.org/schema/context"
 xsi:schemaLocation="http://www.springframework.org/schema/beans
 http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
 http://www.springframework.org/schema/context/spring-context.xsd">
 
 <context:component-scan base-package="com.controller"/>
 
 <bean id="view" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
    <property name="prefix" value="/WEB-INF/view/"/>
    <property name="suffix" value=".jsp"/>
 
 
 </bean>
 
 </beans>






#InternalResourceViewResolver is a class in spring framework that is used to resolve view 
to internal resources such as JSP pages

#create a controller inside com.controller,mark the class with @Controller
#create a handler for handling request
#create and add model classes
#In controller create objects of Model class and send to view

 =================================
 ModelAndView
 ModelAndView is a class in spring framework that represents a model and a view
 It is like a container that holds both model and view
 It has two main properties
 1.Model ,that holds data to be sent to view 
 2.View ,that is to be rendered to the user


#RequestParam is used to capture individual elements from request























