
class NaturalClass extends IntegerClass{        //매소드가 10개. 상속 6개+override 4개.
	@Override
	public void setValue (int value) {
		if (value > 0) {
			super.setValue(value);
		}
		else {
			System.out.println("Negative");
			System.exit(-1);
		}
	}
	@Override
	public void add(int value) {
		if (value > 0) {
			super.add(value);
		}
		else {
			System.out.println("Negative");
			System.exit(-1);
		}
	}
	@Override
	public void subtract(int value) {
		if (this.value > 0) {                   //왜 this.value 임??
			super.subtract(value);
			if (getValue() < 0) {
				System.out.println("Negative");
				System.exit(-1);
			}
		}
		else {
			System.out.println("Negative");
			System.exit(-1);
		}
	}
	@Override
	public void multiply(int value) {
		if (value > 0)
			super.multiply(value);
		else {
			System.out.println("Negative");
			System.exit(-1);
		}
	}

	public static void main(String[] args) {
	NaturalClass sample = new NaturalClass();    
	//sample.setValue(-1); 
	sample.setValue(5);
	sample.subtract(3); 
	sample.printValue(); 
}	
}
class NaturalClass2 {
	private int value;
	public int getValue() {return value;}
	public void setValue(int value) {
		if (value > 0) {
	}
	}
}

// 자연수 <-> 정수
	// 코드는 재활용 ㅎ안하지만 구조는 동일, NumClass로 묶어라.
	// class NumClass{}
	// class IntegerClass extends NubClass{}
	// class NaturalClass 
	
	// 추상클래스. 