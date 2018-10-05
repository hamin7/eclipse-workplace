package IntegerClass;

public class IntegerClass {
	private int value;
	IntegerClass(){
		this(0);
	}
	IntegerClass(int value){
		setValue(value);
	}
	public int getValue() {return this.value;}
	public IntegerClass setValue(int value) {
		this.value = value;
		return this;
	}
	public IntegerClass add(int value) {
		this.value += value;
		return this;
	}
	public IntegerClass subtract(int value) {
		this.value -= value;
		return this;
	}
	public IntegerClass multiply(int value) {
		this.value *= value;
		return this;
	}
	public void printInformation() {
		System.out.println("This value is" +getValue());
	}
	public static void main(String[] args) {
		IntegerClass sampleInteger = new IntegerClass(3);
		sampleInteger.add(5).subtract(4).multiply(6);
		sampleInteger.printInformation();
	}
}
