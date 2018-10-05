package 실습;

public class Appointment {                 // 클래스 Appointment 선언.
	private int year;                      // year는 필드(객체의 데이터가 보관되는곳)
	private int month;                     // month도 필드.
	private int day;                       // 필드 day
	
	Appointment() {this(30);}                   // Appointment(생성자) 생성자의 이름은 class이름과 같아야. // this(30)= 생성자 오버로딩 시 생성자끼리 호출시.(인자 없는 생성자에서 인자 1개 받은 생성자로 지정)
	Appointment(int day) { this(3,day);}         // Appointment(생성자) // this(3,day) 생성자 오버로딩 시 생성자끼리 호출시. 인자 하나 있는 생성자에서 인자 1개 받은 생성자로 지정.)
	Appointment(int month, int day) { this(2018, month, day);}                  // 
	Appointment(int year, int month, int day){setAppointment(year, month, day);}
	
	public void setAppointment(int year, int month, int day) {    // 
		this.year=year;     // this는 객체 자신의 참조  앞의 year는 필드, 뒤의 year는 매개변수.
		this.month=month;   // 앞의 month는 필드, 뒤의 month는 매개변수.
		this.day=day;       // 앞의 day는 필드, 뒤의 day는 매개변수.
	}
	public void printAppointment()
	{
		System.out.print("AppointmentInfo:"+this.year+"-"+this.month+"-"+this.day+"\n");
	}
	public static void main(String[] args)
	{
		Appointment ap1 = new Appointment();         // 객체생성 Appointment(클래스), ap1(변수) , Appointment (생성자)
		ap1.printAppointment();                      // 
		Appointment ap2 = new Appointment(31);
		ap2.printAppointment();
		Appointment ap3 = new Appointment(4,2);
		ap3.printAppointment();
		Appointment ap4 = new Appointment(2019, 4, 28);
		ap4.printAppointment();
	}
	
}
// 코드를 실행을 시켜서 다음주 목요일까지 메일로 보낼것(과제)