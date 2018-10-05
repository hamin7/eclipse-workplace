
public class AddressBook {
	private String name;              // 필드 name 선언.
	private String address;
	private String telephone;
	private int age;
	private String gender;
	
	public String getName() { return name; }     // getter는 private값(필드값)을 리턴. 메소드 이름 : get + 필드이름 (첫문자 대문자)
	public void setName(String name) { this.name = name ;}  // setter는 외부에서 주어진 값을 필드값으로 수정. // name의 실체가 생기면 name에 name값을 넣어라.
	public String getAddress() { return address; }   // getter는 private값 (필드값)을 리턴. 메소드 이름 : get + 필드이름 (첫문자 대문자)
	public void setAddress(String address) { this.address = address; }  // setter는 외부에서 주어진 값을 필드값으로 수정. // address의 실체가 생기면 address에 address값을 넣어라.
	public String getTelephone() { return telephone; }   // getter는 private값 (필드값)을 리턴. 메소드 이름 : get + 필드이름 (첫문자 대문자)
	public void setTelephone(String telephone) { this.telephone = telephone; }  // setter는 외부에서 주어진 값을 필드값으로 수정.  // telephone의 실체가 생기면 telephone에 telephone값을 넣어라.
	public int getAge() { return age; }    // getter는 private값 (필드값)을 리턴. 메소드 이름 : get + 필드이름 (첫문자 대문자)
	public void setAge(int age) { this.age = age; }  // setter는 외부에서 주어진 값을 필드값으로 수정.  // age의 실체가 생기면 age에 age값을 넣어라.
	public String getGender() { return gender; }  // getter는 private값(필드값)을 리턴. 메소드 이름 : get + 필드이름 (첫문자 대문자)
	public void setGender(String gender) { this.gender = gender; }  // setter는 외부에서 주어진 값을 필드값으로 수정.
	
	
	
	public static void main(String[] args) 
	{
		AddressBook addressbook;             // 클래스 변수 선언.
		addressbook = new AddressBook();     // 객체(오브젝트) 생성.  객체==인스턴스==오브젝트.
		addressbook.setName("Suhyun");       
		addressbook.setAddress("Suwon");
		addressbook.setTelephone("010.5544.2856");
		addressbook.setAge(21);               // age는 int값이기 때문에 ""붙이지 않는것 주의.
		addressbook.setGender("Female");
		
		System.out.println(addressbook.getName());
		System.out.println(addressbook.getAddress());
		System.out.println(addressbook.getTelephone());
		System.out.println(addressbook.getAge());
		System.out.println(addressbook.getGender());
		
	}
}
