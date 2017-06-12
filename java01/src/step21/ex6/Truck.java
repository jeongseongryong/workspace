package step21.ex6;

public class Truck  extends Loader{
	
	String maker;
	int cc;

	

	public Truck(String model, String maker, int cc){
		super(model, maker, cc);

	}
	
	public void run() {
		System.out.println("부와아앙~~ 힘차게 달린다.");
	}
	// 수퍼클래스 Loader의 load()를 오버라이딩 한다.
	public void load(Object obj) {
		this.storage = obj;
		if(obj != null){
			super.load(obj);
		System.out.printf("%s를 실었습니다.\n", obj);
	} else {
		System.out.println("비었습니다.");		
		}
	}
		
		public void dump() {
			if(storage != null) {			
				System.out.printf("%s를 내렸습니다.", this.storage);
				this.storage = null;
			} else {
				System.out.println("내릴것이 없습니다.");
			}
			
		}
	}
