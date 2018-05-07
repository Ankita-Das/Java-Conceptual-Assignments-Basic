package multithread;

public class I extends Thread{
	int i;
	int sum;
	
	public void run() {
		for(i=1;i<=20;i++) {
			try{
				sum=sum+2;
				System.out.println("i:"+sum);
				Thread.sleep(200);
			}
			catch(Exception e) {
				System.out.println("i Exception occured!");
			}
		}
	}

}
