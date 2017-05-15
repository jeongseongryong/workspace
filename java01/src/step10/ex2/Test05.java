/*다형성 - 다형적 변수와 형변환
 *
 */
package step10.ex2;

public class Test05 {

	public static void main(String[] args) {
		Member m = new FreeStudent();
		m.name = "홍길동";
		m.id = "hong";
		m.password = "1111";
		m.email = "hong@test.com";
		m.tel = "1111-1111";
		
		FreeStudent s = (FreeStudent)m;
		s.schoolName = "비트대학교";
		s.grade =4;
		s.account = "111-11-1111-111";
		s.bank = "비트은행";
		s.working = true;
		
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.password);
		System.out.println(s.email);
		System.out.println(s.tel);
		System.out.println(s.grade);
		System.out.println(s.account);
		System.out.println(s.bank);
		System.out.println(s.working);
		
	} 
}