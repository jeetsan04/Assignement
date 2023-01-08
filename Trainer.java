package assingment.week3;

public class Trainer {
	
	String name;
	String dept;
	String email;
	int id;
	

	public Trainer(String TrainerName, String TrainerDept, String TrainerEmail, int TrainerEmpId) 
	{
		System.out.println("Cons Called");
		name=TrainerName;
		dept=TrainerDept;
		email=TrainerEmail;
		id=TrainerEmpId;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		Trainer tra1= new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
		Trainer tra2= new Trainer("Hitesh","Dev","mukesh@gmail.com",2);
		Trainer tra3= new Trainer("Sanjeet","DevOps","mukesh@gmail.com,",3);
		
		System.out.println("Trainer Details are below");
		tra1.Selenium();
		tra2.Dev();
		tra3.DevOps();
		
	}

	public void Selenium()
	{
		System.out.println("Trainer Name:"+name+ " Department: "+dept+ "Email Address: "+email+  "  Trainer ID:  "+id );
		
	}
	public void Dev() 
	{
		System.out.println("Trainer Name:"+name+ " Department: "+dept+ "Email Address: "+email+ "Trainer ID:  "+id );
	}
	public void DevOps() 
	{
		System.out.println("Trainer Name:"+name+ " Department: "+dept+ "Email Address: "+email+ "Trainer ID:  "+id );	
	}
}
