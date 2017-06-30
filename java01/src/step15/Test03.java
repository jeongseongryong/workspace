/* 상수 값 다루기 : enum 문법 적용후 II*/

package step15;

public class Test03 {

  public static void main(String[] args) {
    System.out.println("step15 Test03 실행");
    System.out.println();
    
    Student2 s = new Student2();
    
    s.setName("홍길동");
    s.setAge(20);
    s.setSchoolLevel(SchoolLevel.DOCTOR);
//    s.setSchoolLevel(4); 
    // 넘어오는 클래스를 int에서 SchoolLevel로 바꾸었기 떄문에 임의의 값을 넣을수가없다
    
    SchoolLevel[] values = SchoolLevel.values();  // 상수객체들의 목록을 배열로 만들어서 리턴한다.
    
    for (SchoolLevel value : values) {
      System.out.printf("name() = %s\n", value.name());
      System.out.printf("toString() = %s\n", value.toString());
      System.out.printf("ordinal() = %s\n", value.ordinal());
    }
    

    
  }
  
}
