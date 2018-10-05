public class IntegerClass  // 꼭 public 붙여야 함??  안붙여도 컴파일 되는거 같은데? 뭐가다름?
{
	private int value;  // int형 변수 value 선언.
	public int getValue() { return this.value; }  // get value가 int형임?
	public void setValue (int value) { this.value = value; }  // (int value)함수에 int형 변수 value 대입. void는 무슨역할?
	public void add (int value) { this.value+=value; }   // 
	public void subtract(int value) { this.value -= value; }
	public void multiply(int value) { this.value *= value; }
	public void printInformation() {
		System.out.println("The value is" + getValue());    // +는 왜 있는?
		} 
		
		public static void main(String[] args) {
		IntegerClass sampleInteger = new IntegerClass();    // 클래스 변수 선언 및 인스턴스(객체==인스턴스) 생성.
		sampleInteger.setValue(3); 
		sampleInteger.printInformation(); 
		sampleInteger.add(5); 
		sampleInteger.printInformation(); 
		sampleInteger.subtract(4); 
		sampleInteger.printInformation(); 
		sampleInteger.multiply(6); 
		sampleInteger.printInformation();
}
}

// get은 값을 받아주는거 set은 세팅하는거.
// 