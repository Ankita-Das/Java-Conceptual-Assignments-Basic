package linkedlist;
import java.util.Scanner;
public class Link {
	public int info;
	public Link next;
	
	Link(int n){
		info=n;
	}
	
	public void display() {
		System.out.println("INfo:"+info);
	}

	public static void main(String[] args) {
		
		LinkList theLinkList=new LinkList();
		theLinkList.insertFirstLink(10);
		theLinkList.insertFirstLink(5);
		theLinkList.insertFirstLink(20);
		theLinkList.insertFirstLink(25);
		theLinkList.insertFirstLink(23);
		theLinkList.display();
		Scanner sc=new Scanner(System.in);
		int ip=sc.nextInt();
		theLinkList.search(ip);
		theLinkList.removeFirst();
		theLinkList.display();
		
		
		// TODO Auto-generated method stub

	}

}
