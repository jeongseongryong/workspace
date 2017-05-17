/* enum 문법 : 상수를 전문적으로 정의하는 문법
 * 
 */
package step15;

public enum SchoolLevel2 {
	 HIGH_SCHOOL(1), BACHELOR(2) , MASTER(3) ,DOCTOR(4);
	
	 private final int value;
	 
	SchoolLevel2(int value) {
		this.value = value;
	}
	
	public int value() {
		return this.value;
	}
}