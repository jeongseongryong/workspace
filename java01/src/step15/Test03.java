package step15;

public class Test03 {

	public static void main(String[] args) {
		SchoolLevel[] values = SchoolLevel.values();
		
		for(SchoolLevel value : values) {
		System.out.printf("name()=%s", SchoolLevel.DOCTOR.name());
		System.out.printf("toString()=%s", SchoolLevel.DOCTOR.toString());
		System.out.printf("ordinal()=%s", SchoolLevel.DOCTOR.ordinal());
		System.out.println("--------------------------");
		}
	}
}