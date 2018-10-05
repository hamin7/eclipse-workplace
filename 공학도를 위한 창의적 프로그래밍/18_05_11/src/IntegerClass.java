public class IntegerClass  // 메소드가 6개 getter/setter 2개, add/sub/multiply/printValue 4.
{
	protected int value;  
	public int getValue() { return this.value; }  
	public void setValue (int value) { this.value = value; } 
	public void add (int value) { this.value+=value; }  
	public void subtract(int value) { this.value -= value; }
	public void multiply(int value) { this.value *= value; }
	public void printValue() {
		System.out.println("The value is" + getValue());    
		} 
}