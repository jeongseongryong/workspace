package step15;

public class Test04 {

	public static void main(String[] args) {
		SchoolLevel2[] values = SchoolLevel2.values();
		
		for(SchoolLevel2 sl : values) {
		System.out.printf("name()=%s\n", sl.name());
		System.out.printf("toString()=%s\n", sl.toString());
		System.out.printf("ordinal()=%s\n", sl.ordinal());
		System.out.printf("value = %s\n",sl.value());
		System.out.println("--------------------------");
		}
	}
}
