
public class AddressBook {
	private String name;
	private String address; 
	private String telephone; 
	private int age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	
	}	 
	public class AddressBookWithEmail extends AddressBook{
		private String email;
		public String getEmail() {
			return email;
		} 
		public void setEmail(String email) {
			this.email = email;
		}
		
		@Override
		public void setName(String name) {
			System.out.println("******");
			super.setName("Hello");
		}
		
		public void main(String[] args) {
			AddressBookWithEmail sample = new AddressBookWithEmail(); 
			sample.setName("Hamin");
			sample.setAddress("seoul");
			sample.setTelephone("010-2786-8089");
			sample.setAge(25); 
			sample.setGender("male");
			sample.setEmail("ggamini7@gmail.com");
			
			sample.setName("World");
		}
		}
}
