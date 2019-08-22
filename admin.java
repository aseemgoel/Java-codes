import java.util.Scanner;

class SCS{
	
private	int ssid, salary ;
public void get(int value){
	ssid = value;
}
public void set(int qwerty){
	salary = qwerty;
}
public void show(){
	System.out.println("SSID: " +ssid);
	System.out.println("SALARY: " +salary);
	
}
}
class Cybernetics extends SCS{
	void a(){
		System.out.println("The Faculty is Mr.Dhirendra Kumar Sharma ");
		System.out.println("This is Department of Cybernetics ");

	}

}
class Informatics extends Cybernetics{
	void b(){
		System.out.println("The Faculty is Mr.Ratnesh Pandey ");
		System.out.println("This is Department of Informatics ");
	}
}
class Analytics extends Informatics{
	void c(){
		System.out.println("The Faculty is Mr.Ahatsham Hayat ");
		System.out.println("This is Department of Analytics ");
	}
}
class Virtualization extends Analytics{
	void d(){
		System.out.println("The Faculty is Mr.Monit Kapoor ");
		System.out.println("This is Department of Virtualization ");
	}
}
class admin{
	public static void main(String args[]){
	System.out.println("WHICH DEPARTMENT YOU WANT TO KNOW SUBJECTS ABOUT: CYBERNETICS(1) , INFORMATICS(2) , ANALYTICS(3) , VIRTUALIZATION(4)");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	SCS obj = new SCS() ;
	Cybernetics obj1 = new Cybernetics();
		Informatics obj2 = new Informatics();
		Analytics obj3 = new Analytics();
		Virtualization obj4 = new Virtualization();
	if (num == 1){
		
		System.out.println("THIS IS SEMESTER I");
		obj1.a();
		obj.get(112233);
		obj.set(1500000);
	}
	else if(num == 2){
			
		System.out.println("THIS IS SEMESTER II");
		obj2.b();
		obj.get(223344);
		obj.set(1100000);
	}
	else if(num == 3){
		
		System.out.println("THIS IS SEMESTER III");
		obj3.c();
		obj.get(334455);
		obj.set(1300000);
	}
	else if(num == 4){
		
		System.out.println("THIS IS SEMESTER III");
		obj4.d();
		obj.get(445566);
		obj.set(1200000);
	}
	else{
		System.out.println("INVALID NUMBER!!!!! ");
		System.out.println("PLEASE INPUT AGAIN !!");
	}
	}
}