package bank;

import java.util.Scanner;

import bank.Account.Create_Account;

public class BankManager {
	// 이걸 완성한 후에 이걸로 새로운 기능 추가하고 수정할 예정이니 열심히 코드 짜주세염!
	
	public static void main(String[] args)
	{
		String user_name = null;
		int balance = 0;
		int tmp = 0;
		int withdraw = 0;
		int cb = 0; 
		
		Account[] accounts = new Account[100];
		// 일단 100개 배열을 생성함
		// 팁! Account 배열 객체를 생성했지만, 이것은 모양을 잡은 것 뿐
		// 계좌를 성성할때 또 생성계좌에 대한 객체를 생성해 줘야함

		// to generate Random Account Number
		int accountNumber=0;     //Account배열의 인텍스랄까,,,
		
		
		accountNumber = (int)((Math.random() * 9000)+1000);
		
		Create_Account user = new Create_Account("user", 0, 0); // initialize name, acc_number, Balance, Type
		
		Scanner in = new Scanner(System.in);
		Scanner string = new Scanner(System.in);
		int userChoice;
		boolean quit = false;
		
		do 
		{
			System.out.println("1. Create Account");
			System.out.println("2. Deposit money");
			System.out.println("3. Withdraw money");
			System.out.println("4. Send the money");
			
			System.out.println("0. To quit");
			System.out.println("Enter your Choice");
			userChoice = in.nextInt();
			switch (userChoice)
			{
			case 1:
				System.out.println("Enter yout Name : ");
				user_name = string.nextLine();
				user.insert(user_name, accountNumber);     // inserted
				System.out.println("\n\t Your Account Details \n\t Don't Forget Account Number \n");
				System.out.println("********************");
				user.display_details();
				break;
				
			case 2:     // deposite
				System.out.println("Enter your account Number : ");
				tmp = in.nextInt();
				if(tmp==user.id)
				{
					
				}
			}
		} while(!quit);
		System.out.println("Get out!");
	
		
		// 메뉴 선택하기
		//     1. 계좌 생성 (이름, 계좌, 금액 입력받아 계좌 생성)
		//        동일한 계좌 있는제 검사
		//     2. 입금
		//        계좌 존재하는지 검사
		//     3. 출금
		//        계좌 존재하는지 검사, 출금하려는 금액이 잔액보다 적은지 검사
		//     4. 이체
		//        계좌 존재하는지 검사, 출금하려는 금액이 잔액보다 적은지 검사
		
	}

}
