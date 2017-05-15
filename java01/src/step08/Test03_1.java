/*유틸리티 클래스 : object
 * =>주요 메서드
 * toString() : 인스턴스에 대한 설명을 간단하게 문자열로 리턴한다.
 * equals() : 인스턴스의 주소를 비교하여 true/false 값을 리턴.
 * hashCode() : 인스턴스를 구별할 때 사용하는 4바이트 숫자로 된 ID 값.
 * getClass() : 클래스 설계도를 리턴한다.
 * finalize() : 쓰레기 수집기 (garbage collector)가 가비지를 메모리에서 제거하기 전에
 *              호출 하는메서드
 */
package step08;


// super 클래스를 지정하지 않으면 자동으로 object가 수퍼 클래스가됨
public class Test03_1 /* extend Object */ {
	static class Student /* extend Object */ {
		String name;
	}
	public static void main(String[] args){
		Student s = new Student();
		System.out.println(s.toString());
		System.out.println(s.equals(s));
		System.out.println(s.hashCode());

	}
}
	
	


