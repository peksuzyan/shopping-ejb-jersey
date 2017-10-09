Application is ready to be deployed on AS with EJB support like TomcatEE, Weblogic, WildFly.

Data source configuration should be placed into AS.

Testing is carrying out by sending requests.

Add a product to cart:
http://[host]:[port]/ejb-app-view?product=mouse
Checked out a cart:
http://[host]:[port]/ejb-app-view?checkout=yes

P.S. Project is inspired by articles:
https://www.javacodegeeks.com/2013/08/java-ee-stateful-session-bean-ejb-example.html
https://docs.jboss.org/author/display/WFLY8/EJB+invocations+from+a+remote+client+using+JNDI
https://www.codeproject.com/Articles/1060073/RESTFul-Web-Service-Using-Jersey-x-Part-I