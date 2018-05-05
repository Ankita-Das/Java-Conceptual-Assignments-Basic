package account;

import java.util.Scanner;
public class Caccount extends Account{
	 double bal;
	    double penalty;
	    double rate;
	    
	    
	    Caccount(int c1,char ct1,String cn1,String cad1,double b1,double p1,double r1){
	        super(c1,ct1,cn1,cad1);
	        bal=b1;
	        rate=r1;
	        penalty=p1;
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
	    
	    void checkPen(){
	        if(bal<5000){
	            bal=bal-penalty;
	        }
	        
	        System.out.println("After imposing penalty:"+bal);
	    }
	    
	    double CalculateBalance(){
	        
	        Update();
	        withInterest();
	        checkPen();
	        System.out.println("Calculated Balance is:"+bal);
	        return bal;
	        
	        
	    }
	    
	    void show() {
	    	System.out.println("Current Account Details:");
	    	//System.out.println("Name:"+super.cname);
	    	//System.out.println("Type:"+super.ctype);
	    	//System.out.println(""
	    	super.display();
	    	System.out.println("Calculated Balance is:"+bal);
	    	
	    	
	    }
	        
	    
	    
	

}
