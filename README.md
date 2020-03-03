# SpringTransactionManagementPOC
ref: https://www.javainuse.com/spring/boot-transaction

1. import this
2. resolve all deplendency
3. change db configuration as per user system in application.properties file
4. run on tomcat
5. execute below service: http://localhost:8080/SpringData/testing output in console:
Hibernate: insert into sample_data (first_name) values (?)
2020-03-03 13:01:27.020 ERROR 21983 --- [nio-8080-exec-6] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is java.lang.RuntimeException: thowing exception to test transaction rollback] with root cause

java.lang.RuntimeException: thowing exception to test transaction rollback
	at com.example.service.OnBoardUserService.onBoardUser(OnBoardUserService.java:20) ~[classes/:na]
	at com.example.service.OnBoardUserService$$FastClassBySpringCGLIB$$95d65c2d.invoke(<generated>) ~[classes/:na]
	at org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:204) ~[spring-core-4.3.14.RELEASE.jar:4.3.14.RELEASE]
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:738) ~[spring-aop-4.3.14.RELEASE.jar:4.3.14.RELEASE]
	at 
