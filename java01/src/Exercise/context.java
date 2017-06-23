package Exercise;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//@WebListener
public class context implements ServletContextListener {

@Override
public void contextInitialized(ServletContextEvent sce) {
  // ServletContext 객체가 생성되었을 때 호출된다.
  // 즉 웹 애플리케이션이 시작되었을 때 호출된다.
  System.out.println("====> Listener01.contextInitialized()");
}

@Override
public void contextDestroyed(ServletContextEvent sce) {
  // ServletContext 객체가 소멸되기 직전에 호출된다.
  // 즉 웹 애플리케이션이 종료되기 직전에 호출된다.
  System.out.println("====> Listener01.contextDestroyed()");
}

}