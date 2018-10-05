 package bank;

public class Account {
	private String owner;     // 사용자 이름.
	private int id;        // 계좌.       // 계좌 id가 왜 스트링임 int?
	private int balance;      // 잔액.
	
	public Account() {}       // 기본생성자.
	
	// 메뉴의 Source -> Generate Constructor using Fields 들어가서 한번에 생성할 수 있음.
	
	public class Create_Account extends Account
	{
		Create_Account(String owner, int id, int balance)
		{
			super();
			super.owner = owner;
			super.id = id;
			super.balance = balance;
		}
		Create_Account()
		{
			super();
		}
		
		void insert(String owner, int id)
		{
			super.owner = owner;
			super.id = id;
			balance = 0;
		}
		
		void display_details()
		{
			System.out.println("Depositer Name :" +owner);
			System.out.println("Account Number :" +id);
			System.out.println("Account Balance :" +balance);
		}
		
		void deposite(int id, int money)
		{
			balance = money;
		}
		
		int withdraw(int withd)
		{
			balance = balance - withd;
			return balance;
		}
	}
	//toString은 항상 해줘야함! 마찬가지로 Source에 가면 있는데 나는 오류나서 내가 침.
	
	@Override
	public String toString()
	{
		return "owner: "+owner+" id: "+id+" balance: "+balance;
	}

	//메뉴의 Source -> Generate Getters and Setters 들어가면 한번에 게터 세터 생성할 수 있음.

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}