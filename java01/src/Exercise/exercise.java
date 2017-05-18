package Exercise;


public class exercise {
	
	static void m1 (int v) throws Exception {
		
	}
	
	static void m2 (int v) throws Exception {
		
	}
	static void m3 (int v) throws Exception {
		
	}
	static void m4 (int v) throws Exception {
		
	}
	
	public static void main(String[] args) {
		try {
			
			if (args.length < 1) {
				System.out.println("[사용법] java -cp bin Exercise.exersise 숫자");
				return;
			}
			m1(Integer.parseInt(args[0]));
		} catch (NumberFormatException e){
			System.out.println("ㅇㅁㄴㅇㅁㄴㅇ숫자여야함");
		} catch (Exception e) {
		}
		System.out.println("안녕!");
	}		
}