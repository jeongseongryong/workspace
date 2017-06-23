/* 파일 업로드 : apache file-upload 라이브러리를 사용하여 파일 업로드 처리
 * => 라이브러리 준비 작업
 *    1) mvnrepository.com에서 "apache fileupload" 라이브러리 검색
 *    2) build.gradle 파일에 의존 라이브러리 정보를 추가한다.
 *    3) "gradle eclipse"를 실행하여 이클립스 설정 파일을 갱신한다.
 *    4) 이클립스 프로젝트 폴더를 "refresh" 한다.
 *    5) "Referenced Libraries" 노드를 펼쳐서 file-upload 관련 라이브러리가 추가되었는지 확인한다.
 */
package step14;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/step14/Servlet03")
@SuppressWarnings("serial")
public class Servlet03 extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    DiskFileItemFactory itemFactory = new DiskFileItemFactory();
    
    
    ServletFileUpload multipartDataParser = new ServletFileUpload(itemFactory);
    
    try {
      
      List<FileItem> parts = multipartDataParser.parseRequest(req);
    
      
      HashMap<String,FileItem> partMap = new HashMap<>();
      for (FileItem part : parts) {
        partMap.put(part.getFieldName(), part);
      }
      
      FileItem part = partMap.get("name");
      
      
      String name = part.getString("UTF-8"); 
      
      
      String file1 = partMap.get("file1").getName();
      String file2 = partMap.get("file2").getName();
      
      resp.setContentType("text/plain;charset=UTF-8");
      PrintWriter out = resp.getWriter();
      out.printf("name=%s\n", name);
      out.printf("file1=%s\n", file1);
      out.printf("file2=%s\n", file2);

    } catch (Exception e) {
      throw new ServletException(e);
    }
    
  }
  
}
