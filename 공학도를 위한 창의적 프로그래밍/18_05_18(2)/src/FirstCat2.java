
public class FirstCat2 {     // 상속하지 않고 구현.
	void call() {
		System.out.println("This is first cat");
	}
	void call2() {
		System.out.println("This is general method");
	}
}


class SecondCat {
	void call() {
		System.out.println("This is second cat");
	}
	void call2() {
		System.out.println("This is general method");
	}
}

class AbstractTest{
	public static void main(String[] args) {
		FirstCat2 fc = new FirstCat2();
		SecondCat sc = new SecondCat();
		
		fc.call(); 
		fc.call2();
		sc.call(); 
		sc.call2();
	}
}