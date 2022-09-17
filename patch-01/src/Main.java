class From{
	private String username;
	private int addres;
	
	void setUsername(String username){
		this.username = username;
	}
	String getUsername(){
		return username;
	}
	void setAddres(int addres){
		this.addres = addres;
	}
	int getAddres(){
		return addres;
	}
	void Display(){
		System.out.println("Data log");
	}
}

class Login extends From{
	private String username; 
	private int addres;
	
	@Override
	void setUsername(String username){
		this.username = username;
	}
	@Override
	String getUsername(){
		return username;
	}
	@Override
	void setAddres(int addres){
		this.addres = addres;
	}
	@Override
	int getAddres(){
		return addres;
	}
}

class Hax extends  From{
	String name;
	int amount;
	
	Hax(String name,int amount){
		this.name = name;
		this.amount = amount;
	}
	@Override
	void Display(){
		System.out.println("Date from : "+this.name);
		System.out.println("Date from : "+this.amount);
		super.Display();
	}
}

class Ddos {
	String data = "SOLFAIBSKF";
	
	void Doc(){
		System.out.println("Data : "+data);
	}
}

class Server extends Ddos {
	int server;
	
	@Override
	void Doc(){
		String region = "Wakanda";
		System.out.println("server : "+server+" || Region : "+region);
		System.out.println("Error server");
	}
}

abstract class SSH{
	abstract void SSHms();
	abstract void SSHMAXms();
	abstract void SSHerror();
}

class UserSSH extends SSH{
	
	@Override
	void SSHms(){
		System.out.println("84249662");
	}
	@Override
	void SSHMAXms(){
		System.out.println("83829482");
	}
	@Override
	void SSHerror(){
		System.out.println("8188881");
	}
}

class Process {	
	int result;
	int a = 1091449;
	int b = 2114950;
	char oprator;
	
	void load(){
		if(oprator == '+'){
			result = a+b;
			System.out.println("IP addres result : "+result);
		}else if(a > b){
			result = a-b;
			System.out.println("IP addres result : "+result);
		}
		else {
			System.out.println("Error");
		}
	}
	
	// interface

	public static void main(String[] args) {
		
		From obj1 = new From();
		obj1.setUsername("budi");
		obj1.setAddres(9294829);
		System.out.println("Username : "+obj1.getUsername()+" || Addres : "+obj1.getAddres());
		obj1.Display();
		
		Hax obj2 = new Hax("Budi",3);
		obj2.Display();
		
		Ddos obj3 = new Ddos();
		obj3.Doc();
		
		Ddos obj4 = new Server();
		obj4.Doc();
		
		UserSSH obj5 = new UserSSH();
		obj5.SSHms();
		obj5.SSHMAXms();
		obj5.SSHerror();
		
		Process obj6 = new Process();
		obj6.load();
	}
};
		obj3.Doc();
		
		Ddos obj4 = new Server();
		obj4.Doc();
		
		UserSSH obj5 = new UserSSH();
		obj5.SSHms();
		obj5.SSHMAXms();
		obj5.SSHerror();
		
		Process obj6 = new Process();
		obj6.load();
		
	}
}
