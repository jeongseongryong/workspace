/* 메서드 : 반복 실행해야 하는 코드를 묶어 둔 블록*/
package step05;

public class Test03 {
  
  
  
   public static int[] getScore(int studentNo){
    int[] scores = {100, 90, 100};
    return scores;
   }
   
   public static void main(String[] args) {
    int[] arr = getScore(100);
    for (int value : arr) {
    	System.out.println(value);
    }
   }
  }

