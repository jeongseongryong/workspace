/* 웹 애플리케이션 구성 요소 */

package step09;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class Listener02 implements ServletRequestListener {

  @Override
  public void requestDestroyed(ServletRequestEvent sre) {
//    System.out.println("======>Listener02.requestDestroyed()");
  }

  @Override
  public void requestInitialized(ServletRequestEvent sre) {
//    System.out.println("======>Listener02.requestInitialized()");
    
  }
  
  
  
  
  
  
}
