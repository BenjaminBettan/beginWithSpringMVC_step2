# beginWithSpringMVC_step2

adaptation from https://howtodoinjava.com/spring/spring-restful/spring-rest-hello-world-xml-example/

Download zip

import maven project

maven update clean install

add to buildpath Libraries\Server runtime\pivotal tc server developper edition

run as server on eclipse sts

your REST url to test should be : 

http://localhost:8080/springrestexample/employees

http://localhost:8080/springrestexample/employees/0

http://localhost:8080/springrestexample/employees/1

http://localhost:8080/springrestexample/employees/2


####################################################################################

                                ADAPTATION

####################################################################################


Note that the main spring file in your project is :

src/main/webapp/WEB-INF/spring-servlet.xml

inside of it : <context:component-scan base-package="packagelevel_0.packagelevel_1.packagelevel_2" />

So if you want that Spring handle the instantation of your beans, they should be here :

src.main.java.packagelevel_0.packagelevel_1.packagelevel_2.packagelevel_3.MyBeanEntity.java

note that the groupid of the pom should be the same

in our case : 

in pom.xml (groupid)
-> com.bbettan.demospringmvc

our java bean       
-> com.bbettan.demospringmvc.model.Employee.java

our kind of service 
-> com.bbettan.demospringmvc.model.EmployeeList.java

and the servlet conf 
-> src/main/webapp/WEB-INF/spring-servlet.xml -> <context:component-scan base-package="com.bbettan.demospringmvc" />

