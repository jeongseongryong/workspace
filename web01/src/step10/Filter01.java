/* 웹 애플리케이션 구성 요소 - Filter */

package step10;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter(urlPatterns="/step10/*")
public class Filter01 implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    
    System.out.println("#####  Filter01.init()");
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    
    System.out.println("#####  Filter01.doFilter() 시작  #####");
    
    chain.doFilter(request, response);
    
    System.out.println("@@@@@  Filter01.doFilter() 끝  @@@@@");
  }

  @Override
  public void destroy() {
    
    System.out.println("#####  Filter01.destroy()");
  }
  
}
