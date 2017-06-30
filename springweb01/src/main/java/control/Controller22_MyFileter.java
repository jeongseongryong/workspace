package control;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter({"/control/controller22/list.do", "/control/controller22/detail.do"}) // list 와 detail만 필터 실행 
public class Controller22_MyFileter implements Filter{

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    System.out.println("Controller22_MyFilter.init()");
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
   System.out.println("Controller22_MyFilter.doFilter() =============>");
   chain.doFilter(request, response);
   System.out.println("<============= Controller22_Filter.doFilter()");
  }

  @Override
  public void destroy() {
    System.out.println("Controller22_MyFilter.destroy()");
  }
  
}
