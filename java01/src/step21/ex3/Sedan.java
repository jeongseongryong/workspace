package step21.ex3;

public class Sedan extends Loader {
	boolean auto;
	public Sedan(String model, String maker, int cc, boolean auto){	
	super(model, maker, cc);
	this.auto = auto;
	}
	
	public void run() {
		System.out.println("부웅~~~부드럽게 달린다.");
	}
}
