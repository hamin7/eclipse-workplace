public class AddressBook {
	protected String name;
	private String address;
	private String telephone;
	private int age;
	private String gender;
	
	public String getName() { return name;}    // name 값을 받아서 리턴해라.
	public void setName(String name) { this.name = name; }  // name의 실체가 생기면 name값에 name을 집어 넣어라!
	public String getAddress() { return address; } // address값을 get해서 리턴해라.
	public void setAddress(String address) { this.address = address; } // address의 실체가 생기면 address값에 address를 집어 넣어라!
	public String getTelephone() { return telephone; } // 
	public void setTelephone(String telephone) { this.telephone = telephone; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public String getGender() { return gender; }
	public void setGender(String gender) { this.gender = gender; }
}

/*
super() C++에서는 ()없음 암튼 자바랑 다름
this super 내용은 같은데 자신 클래스인지 부모 클래스 인지 차이
Overloading 어떤것을 부르느냐. / 같은 이름의 메소드.
overriding 덮어쓴다  같은 이름의 메소드. 부모클래스에도 있고 자식 클래스에도 있고.
@ override == at override // 애노테이션이라고 함 (@으로 시작하는거) // recommended에 해당 안해도 컴파일은 됨
부모클래스의 setName과 다른점이 부모는 값만 채웠는데 
this.name == name; or super.name = name;
// super.setName(name);

// super.setName(name); 부모클래스의 setName이 호출되고 좋은점은 부모클래스의 setName보다 부가적인 기능 추가가능
상속받으면 명의는 내꺼지만 내꺼가 아님 / 자바 : 상속받은것도 내꺼고 부모클래스에서 호출해서 받은것도 내꺼
object b ( getName())
object a ( super.getName(), this.getName()). 
// ( 상속받은 getName , 내가 만든 getName()) // super 와 this로 구분 구별용도!!!!
// 오버라이드를 안했다면 this.sample() = super.sample()
// 오버라이드를 했다면 this.sample() != super.sample()

public void sample(){
	this.setName("hello"); // setName("hello");
}
// 필드는 오버라이드 덮어쓰기 없음 메소드는 오버라이드 가능
// 부모클래스가 private 이면 상속 힘드므로 protected로 바꿔줌

class A{
	f() {}
}

class B extends A{
	f() {}

	call_f() { super.f(); }
}

class C extends B {
	f() {}
	call_f();
	this.f(); super.f(); call_f();
}

// 할아버지꺼랑 부모님꺼 구별 어케함 -> 꼼수를 써야해 call_f()라는 꼼수!@!@!
*/