package multithread;

public class J extends Thread{
int j;
int sum;
	
	public void run() {
		sum=0;
		for(j=1;j<=20;j++) {
			try{
				sum=sum+3;
				System.out.println("j:"+sum);
				Thread.sleep(200);
			}
			catch(Exception e) {
				System.out.println("j Exception occured!");
			}
		}
	}

}


