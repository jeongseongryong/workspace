/*변수 선언 :2차원 배열의 초기화  */
		package step02;

public class Test11 {
	public static void main(String[] args) {
      //1) 배열 선언과 동시에 배열을 준비시키는 명령을 같이 사용할 수 있다.
      String[] names = {"홍길동", "임꺽정", "유관순"};
      byte[][] scores = {{100, 100, 100}, {90, 90, 90}, {80, 80, 90}};
      short[] totals = {300, 270, 240};
      float[] aver = {100f, 90f, 80.0f};
      
      for(int i =0; i < 3; i++) {
      	System.out.printf("%s %d %d %d %d %.1f\n",
           names[i], scores[i][0], scores[i][1], scores[i][2], totals[i], aver[i]);
     }
	}
}
    
