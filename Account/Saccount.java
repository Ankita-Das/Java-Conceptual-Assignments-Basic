package account;
import java.util.Scanner;
public class Saccount extends Account{
		 double bal;
		 double rate;
		    
		    
		  Saccount(int c1,char ct1,String cn1,String cad1,double b1,double r1){
		      super(c1,ct1,cn1,cad1);
		      bal=b1;
		      rate=r1;
		    }
		    
		    
		  void Update(){
		      double deposit=0.0;
		      Scanner in=new Scanner(System.in);
		      System.out.println("Enter amount to be deposited:");
		      deposit=in.nextFloat();
		      bal=deposit+bal;
		      System.out.println("Updated Current Balance:"+bal);
		    }
		    
		  void withInterest(){
		      bal=bal*rate+bal;
		      System.out.println("After putting interest:"+bal);
		    }
		    
		    void Withdraw(){
		        System.out.println("Enter the amount you want to withdraw:");
		        Scanner in=new Scanner(System.in);
		        double amt=in.nextDouble();
		        bal=bal-amt;
		        
		        
		        System.out.println("After withrawing amount remaining:"+bal);
		    }
		    
		    double CalculateBalance(){
		        
		        Update();
		        withInterest();
		        Withdraw();
		        System.out.println("Calculated Balance is:"+bal);
		        return bal;
		        
		        
		    }
		    
		    void show() {
		    	System.out.println("Savings Account Details:");
		    	//System.out.println("Name:"+super.cname);
		    	//System.out.println("Type:"+super.ctype);
		    	
		    	super.display();
		    	System.out.println("Calculated Balance is:"+bal);
		    	
		    	
		    }
		        
		    
		    
		

	}



