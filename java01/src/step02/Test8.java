/*변수 선언 :배열 변수와 레퍼런스 */
		package step02;

public class Test8 {
	public static void main(String[] args) {
      //1) 배열 선언과 동시에 배열을 준비시키는 명령을 같이 사용할 수 있다.
      byte[] arr1 = new byte[3];
      
      
     arr1[0] = 10;
     arr1[1] = 20;
     arr1[2] = 30;
     
     System.out.printf("%d,%d,%d\n",arr1[0],arr1[1],arr1[2]);
     
     
     arr1 = new byte[]{40,50,60,70,80};
     System.out.printf("%d,%d,%d,%d,%d\n",arr1[0],arr1[1],arr1[2],arr1[3],arr1[4]);
     
     /* 어 이전에 만든 배열은 어떻게 되는가?
      * =>주소를 잃어 버렸기 떄문에 프로그램이 종료될 때까지 사용할 수 없다.
      * =>주소를 찾는 방법이 없다!
      * =>이렇게 주소를 잃어버려  사용할 수 없는 메모리를
      * 	프로그래밍 용어로 "Dangling object"라 부른다.
      * =>자바에서는 "쓰레기(Garbage)"라 부른다.
      * =>자바에서는 메모리를 효율적으로 관리하기 위해,
      * 	이런 쓰레기를 메모리가 부족할 때 마다 정리한다.
      *   이렇게 쓰레기를 정리해 주는 프로그램을 "쓰레기 수집기(Garbage Collector)"라 부른다.
      *   
      *Dangling Pointer
      *=> 레퍼런스에 저장된 주소가 가리키는 메모리가 정리된 채로 있을 떄,
      *   더이상 그 주소는 유효하지 않다.
      *   이렇게 유효하지 않는 그주소를 "Dangling Pointer"라 부른다.
      */
   }
}
    