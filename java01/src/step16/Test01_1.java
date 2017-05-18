/* File 다루기 - File 클래스 사용법
 * 
 */
package step16;

import java.io.File;
import java.util.Calendar;

public class Test01_1 {

	public static void main(String[] args) throws Exception {
		File f = new File("./build.gradle"); //현재 폴더 정보를 가져온다.
		
		System.out.printf("getAbsolutePath()= %s\n",f.getAbsolutePath());
		
		System.out.printf("getAbsolutePath()= %s\n",f.getCanonicalFile());
		
		// File의 경로가 가리키는 디스크의 여유 공간을 바이트 단위로 리턴한다.
		System.out.printf("getFreeSpace() = %d\n",f.getFreeSpace());
		
		System.out.printf("getTotalSpace() = %d\n",f.getTotalSpace());
		
		// 여유 공간중에서 사용 가능한디스크의 총 크기를 바이트 단위로 리턴한것
		System.out.printf("getUsableSpace() = %d\n",f.getUsableSpace());
		
		// 디렉토리명 또는 파일명
		System.out.printf("getName() = %s\n", f.getName());
		
		// 파일 클래스에서 지정한 경로
		System.out.printf("getPath()= %s\n",f.getPath());
		
		// 해당 경로의 디렉토리 또는 파일 존재 여부 리턴
		System.out.printf("getpath() = %s\n", f.exists());
		// 파일 객체가 가리키는 경로가 디렉토리인지 여부를 리턴
		System.out.printf("isDiretory() = %b\n", f.isDirectory());
		//파일 객체가 가리키는 경로가 파일인지 여부를 리턴
		System.out.printf("isFile() = %b\n", f.isFile());
		// 파일의 크기를 바이트 단위로 리턴
		System.out.printf("islength() = %d\n", f.length());
		
		System.out.printf("islastModified() = %d\n",f.lastModified());
		
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(f.lastModified());
		System.out.printf("%d-%d-%d %s %d:%d:%d\n",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,
				cal.get(Calendar.DAY_OF_WEEK_IN_MONTH),
				(cal.get(Calendar.AM_PM) == Calendar.AM) ? "AM":"PM",
				cal.get(Calendar.HOUR),
				cal.get(Calendar.MINUTE),
				cal.get(Calendar.SECOND));
		
		
	}

}
