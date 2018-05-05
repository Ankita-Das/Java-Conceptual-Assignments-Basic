package account;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		/*Caccount ob1=new Caccount(201,'C',"Julia Sinn","Part Street",4000,200,0.1);
        double bal=ob1.CalculateBalance();
        System.out.println("Calculated amount:"+bal);// TODO Auto-generated method stub
        ob1.show();*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Which account do you want to access 1.Savings 2.Curent:");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter account no:");
			int cac1=sc.nextInt();
			System.out.println("Enter name:");
			String cname1=sc.next();
			//System.out.println("Enter Customer type:");
			//char ctype1=sc.next().trim().charAt(0);
			char ctype1='S';
			System.out.println("Enter address:");
			String cadd1=sc.next();
			System.out.println("Enetr present bal:");
			double bal1=sc.nextDouble();
			System.out.println("Enetr interest rate:");
			double rate1=sc.nextDouble();
			Saccount ob1=new Saccount(cac1,ctype1,cname1,cadd1,bal1,rate1);
			double updated1=ob1.CalculateBalance();
			ob1.show();
			break;
		case 2:
			System.out.println("Enter account no:");
			int cac=sc.nextInt();
			System.out.println("Enter name:");
			String cname=sc.next();
			//System.out.println("Enter Customer type:");
			//char ctype=sc.next().trim().charAt(0);
			char ctype='C';
			System.out.println("Enter address:");
			String cadd=sc.next();
			System.out.println("Enetr present bal:");
			double bal=sc.nextDouble();
			System.out.println("Enter penalty:");
			int p1=sc.nextInt();
			System.out.println("Enetr interest rate:");
			double rate=sc.nextDouble();
			Caccount ob=new Caccount(cac,ctype,cname,cadd,bal,p1,rate);
			double updated=ob.CalculateBalance();
			ob.show();
			break;
			
			
		}
		
		
        
        
	}

}
