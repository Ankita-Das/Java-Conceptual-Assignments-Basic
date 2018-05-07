package linkedlist;

public class LinkList {
	public Link firstLink;
	LinkList(){
		firstLink=null;
	}
	
	public boolean isEmpty() {
		return(firstLink==null);
	}
	
	
	public void insertFirstLink(int infor) {
		Link newLink=new Link(infor);
		newLink.next=firstLink;
		firstLink=newLink;
	}
	
	public Link removeFirst() {
		Link delref=firstLink;
		if(firstLink==null) {
			System.out.println("List is empty!");
			
		}
		else
		{
			firstLink=firstLink.next;
			System.out.println("Deleted");
		}
		return delref;
		
	}
	
	public void display() {
		Link theLink=firstLink;
		while(theLink!=null) {
			System.out.println("Info present:"+theLink.info);
			theLink=theLink.next;
		}
	}
	
	public Link search(int cinf) {
		Link theLink=firstLink;
		while(theLink!=null) {
			if(theLink.info==cinf) {
				System.out.println("Found");
				return theLink;
			}
			theLink=theLink.next;
		}
		
		System.out.println("Not Found");
		return null;
		
	}
	
	
	
	

}
