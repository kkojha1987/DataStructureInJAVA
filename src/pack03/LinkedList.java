package pack03;

public class LinkedList {

	public Link head;
	
	public LinkedList()
	{
		head=null;
	}
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public void insert(int data)
	{
		Link newLink=new Link(data);
		newLink.next=head;
		head=newLink;
	}
	
	public boolean delete()
	{
		if(head==null)
			return false;
		head=head.next;
		return true;
	}
	
	public void print()
	{
		Link currentList=head;
		while(currentList!=null){
		System.out.println(currentList.getData());
		currentList=currentList.next;}
	}
	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.insert(10);
		linkedList.insert(20);
		linkedList.print();
	}

}
