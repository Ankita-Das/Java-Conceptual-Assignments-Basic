package account;

public abstract class Account {
	  int cac;
	    char ctype;
	    String cname;
	    String cadd;
	    
	    Account(){
	        cac=101;
	        ctype='C';
	        cname="Undefined!";
	        cadd="Undefined!";
	    }
	    
	    Account(int c1,char ctype,String cname,String cadd){
	        cac=c1;
	        this.ctype=ctype;
	        this.cname=cname;
	        this.cadd=cadd;
	        
	        
	    }
	    
	    void display(){
	        System.out.println("Account No.:"+cac);
	        System.out.println("Type:"+ctype);
	        System.out.println("Name:"+cname);
	    }
	    
	    abstract double CalculateBalance();//abstract method cannot have a body

	

}
