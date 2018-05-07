package multithread;

public class Main {

	public static void main(String[] args)throws Exception {
		I obi=new I();
		J obj=new J();
		K obk=new K();
		
		//join() waits for completion of the thread on which it is called! before starting operation of any other thread.
		System.out.println("Name of thread i:"+obi.getName());
		System.out.println("Name of thread j:"+obj.getName());
		System.out.println("Name of thread k:"+obk.getName());
		
	
		System.out.println("Starting i:");
		obi.start();
		obi.join();
		
		System.out.println("Starting j:");
		obj.start();
		obj.join();
		
		System.out.println("Starting k:");
		obk.start();
		obk.join();
		// TODO uto-generated method stub

	}

}
