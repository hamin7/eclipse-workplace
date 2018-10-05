
public class Sample {
	public static int value;
	public void printValue() {
		System.out.println(value);
	}
	public static void main(String[] args) {
		Sample sample = new Sample();
		Sample sample2 = new Sample();
		
		Sample.value = 5;
		sample.value = 10;      //
		System.out.println(Sample.value);
		sample.printValue();
		sample2.printValue();
		sample2.value = 15;
		System.out.println(Sample.value);
		sample.printValue();
		sample2.printValue();
	}

}
