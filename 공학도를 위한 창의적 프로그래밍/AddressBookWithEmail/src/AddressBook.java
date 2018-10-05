
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
