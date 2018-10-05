
abstract class Cat {
	abstract void call();
	void call2() {
		System.out.println("This is general method");
	}
}

class FirstCat extends Cat {
	@Override
	void call() {
		System.out.println("This is first cat");
	}
}

class SecondCat extends Cat{
	@Override
	void call() {
		System.out.println("THis is second cat");
	}
}

class AbstractTest {                //왜 public으로 하면 안됨??
	public static void main(String[] args) {
		Cat fc = new FirstCat();
		Cat sc = new SecondCat();
		
		fc.call();
		fc.call2();
		sc.call();
		sc.call2();
	}
}