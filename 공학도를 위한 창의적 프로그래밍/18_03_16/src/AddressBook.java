// 3강 예제.
public class AddressBook {
	private String name;
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
	
	public static void main(String[] args)    // 왜 static으로 써야하고 args는 무슨 효과??
	{            
		AddressBook addressBook;
		addressBook = new AddressBook();  // AddressBook class에 추가? // 선언과 인스턴스 생성을 합
		addressBook.setName("Suhyun");  // addressBook에 name필드 suhyun 입력.
		addressBook.setAddress("Suwon"); // addressBook에 address "suwon"추가.
		addressBook.setTelephone("010-5544-2856");
		addressBook.setAge(21);
		addressBook.setGender("Female");
		
		System.out.println(addressBook.getName());
		System.out.println(addressBook.getAddress());
		System.out.println(addressBook.getTelephone());
		System.out.println(addressBook.getAge());
		System.out.println(addressBook.getGender());
	}
}

// 함수랑 메소드 같은거? 클래스 이름이랑 같은건 생성자 다른건 함수.
