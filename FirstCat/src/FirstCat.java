
public class FirstCat {
	void call() {
		System.out.println("This is first Cat");
	}
	void call2() {
		System.out.println("This is general method");
	}
}

class SecondCat extends FirstCat{
	@Override
	void call() {
		System.out.println("This is second Cat");
	}
}

class AbstractTest {
	public static void main(String[] args) {
		FirstCat fc = new FirstCat();
		SecondCat sc = new SecondCat();
		
		fc.call();
		fc.call2();
		
		sc.call();
		sc.call2();
	}
}