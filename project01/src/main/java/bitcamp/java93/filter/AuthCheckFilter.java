/*역할: 쿠키로 들어온 세션 ID를 가지고 로그인 여부를 검사한다.
 * */

package bitcamp.java93.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitcamp.java93.domain.Member;

@WebFilter({"/member/*", "/classroom/*", "/lect/*"}) //무엇을 실행해도 이 필터를 씌어라.
public class AuthCheckFilter implements Filter{

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {}

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    
    HttpServletRequest httpRequest = (HttpServletRequest) request;
    HttpServletResponse httpResponse = (HttpServletResponse) response;
    
    Member loginMember = (Member)httpRequest.getSession().getAttribute("loginMember");
    
    //로그인 멤버가 null이라면
    if (loginMember == null) { //쿠키에 세션ID가 없다면 
      httpResponse.sendRedirect("../auth/login.do");
      return;
   }
  
    chain.doFilter(request, response);
 }
    

  

  @Override
  public void destroy() {}

}