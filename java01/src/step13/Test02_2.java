/* nested class: static nested class II
 * 
 */
package step13;


// package member class
public class Test02_2 {

	// static nested class
	static class Member {
		String name;
		String tel;
		int schoolLevel;
		int userType;
		int working;
		int language;
	}
	
	public static void main(String[] args) {
		Member m = new Member();
		m.name = "홍길동";
		m.tel = "1111-1111";
		m.schoolLevel =CSchool.BACHELOR;
		m.working = CWork.NOT_WORKING;
		m.language = CLanguage.JAVA;
	}
}
