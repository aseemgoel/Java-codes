import java.util.Scanner;
class pilot {
	void fly(){
		System.out.println("The Plane is Flying");
			}
			
   void attack(){
				System.out.println("The Plane is Attacking: You want to use Aritllery Guns(1) Or Missiles(2)");
				Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	if (num == 1){
		
		System.out.println("Using Artillery Guns");
		System.out.println("1 enemy Down !!");
		
	}
	else if(num == 2){
			System.out.println("Using Missiles");
		System.out.println("2 enemies Down !!");
		
	}
	else{
		System.out.println("Enter valid no.");
	}
				
			}
			void target(){
				System.out.println("Using Targeting System");
		System.out.println("Enemy on target !!");
			}
}
class copilot extends pilot{
void guide(){
	System.out.println("Guiding the Pilot");
		
}
void sonar(){
	System.out.println("Using sonar");
		System.out.println("3 enemies found !!");
}
void radar(){
	System.out.println("Using radar");
		System.out.println("4 enemies found !!");
}
void fuel(){
	System.out.println("DO YOU WANT TO REFUEL");
	System.out.println("YES(1) :: No(2)");
	Scanner swan = new Scanner(System.in);
	int bun = swan.nextInt();
	if (bun == 1){
		for (int i=0; i<11; i++){
			int j = i*10;
			try{
			Thread.sleep(2000);}
			catch(InterruptedException e){System.out.println(e);}  
    System.out.println("ReFueling MIG " +j+ "%");
		}
	}
	else {
		System.out.println("Exiting Fuel System");
	}
	
}
}
class qwerty extends copilot{
	pilot a = new pilot();
		copilot b = new copilot();
		void func(){
		System.out.println("Which Function You want to access:-");
		System.out.println("Fly(1)");
		System.out.println("Guide(2)");
		System.out.println("TARGET(3)");
		System.out.println("ATTACK(4)");
		System.out.println("SONAR(5)");
		System.out.println("RADAR(6)");
		System.out.println("FUEL(7)");
		Scanner span = new Scanner(System.in);
	int val = span.nextInt();
	switch(val) {
   case 1 :
    a.fly();
      break;
   
   case 2 :
      b.guide();
      break; 
	  
	  case 3 :
      a.target();
      break; 
	  
	  case 4 :
      a.attack();
      break; 
	  
	  case 5 :
      b.sonar();
      break; 
	  
	  case 6 :
	  b.radar();
      break; 
	  
	  case 7 :
	  b.fuel();
      break;
	  
   
   
   default : 
   System.out.println("INVALID FUNCTION NUMBER!!!!! ");
		System.out.println("PLEASE INPUT AGAIN !!");
}
		}
}
class mig {
	public static void main(String args[]){
		qwerty c = new qwerty();
		System.out.println("Accesing Functions of Mig:");
		c.func();
		System.out.println("Do you want to access functions Again:");
		System.out.println("YES(1) :: No(2)");
	Scanner shan = new Scanner(System.in);
	int fun = shan.nextInt();
	if (fun == 1){
		
	c.func();}
	else {
		System.out.println("Function Systems Offline");
	}
	
	}
}
