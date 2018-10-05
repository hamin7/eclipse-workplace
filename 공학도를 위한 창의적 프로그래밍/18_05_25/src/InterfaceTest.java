
public class InterfaceTest extends CatClass implements CatInterface{
		@Override
		public void call() {
			System.out.println("This is cat");
		}
		
		public static void main(String[] args) {
			InterfaceTest it = new InterfaceTest();
			it.call();
			it.call2();
		}
}