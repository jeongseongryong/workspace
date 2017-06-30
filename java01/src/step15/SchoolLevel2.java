/* enum 문법 : 상수를 정의할 때 값을 지정할 수 있다. */

package step15;

public enum SchoolLevel2 {
  HIGH_SCHOOL(1),  // 의미 SchoolLevel2 HIGH_SCHOOL = new SchoolLevel2(1);
  BACHELOR(2),  // 의미 SchoolLevel2 HBACHELOR = new SchoolLevel2(2);
  MASTER(3),  // 의미 SchoolLevel2 MASTER = new SchoolLevel2(3);
  DOCTOR(4);  // 의미 SchoolLevel2 DOCTOR = new SchoolLevel2(4);
  // 값을 지정하면은 ;을 끝에붙인다.
  
  private final int value;
  
  SchoolLevel2(int value){
    this.value = value;
  }
  
  public int value() {
    return this.value;
  }
  
}
