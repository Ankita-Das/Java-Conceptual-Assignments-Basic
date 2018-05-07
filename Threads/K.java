package multithread;

public class K extends Thread{
int k;
int sum;
	
	public void run() {
		sum=0;
		for(k=1;k<=20;k++) {
			try{
				sum=sum+1;
				System.out.println("k:"+sum);
				Thread.sleep(200);
			}
			catch(Exception e) {
				System.out.println("k Exception occured!");
			}
		}
	}

}



