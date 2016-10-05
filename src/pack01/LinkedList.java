package pack01;

public class LinkedList {

	public Link head;
	public LinkedList()
	{
		head=null;
	}
	public boolean isEmpty()
	{
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
	public void print(){
		Link current=head;
		while (current!=null) {
		System.out.println(current.getData());
			current=current.next;
		}
	}
	public static void main(String[] args) {
	
		LinkedList l1=new LinkedList();
		l1.insert(1);
		l1.insert(23);
		l1.insert(43);
l1.print();
l1.delete();
l1.print();
	}

}
