package pack02;

public class LinkedList {
	public List list;
	
	public LinkedList()
	{
		list=null;
	}
	
	public boolean isEmpty()
	{
		return list==null;
	}
	
	public void insert(int data)
	{
		List li=new List(data);
		li.next=list;
		list=li;
	}
	
	public boolean delete()
	{
		if(list==null)
			return false;
		list=list.next;
		return true;
	}
	
	public void print()
	{
		List current=list;
		while (current!=null) {
			System.out.println(current.getData());
			current=current.next;
		}
	}
public static void main(String[] args) {
	LinkedList linkedList=new LinkedList();
	linkedList.insert(10);
	linkedList.insert(20);
	linkedList.print();
}
}
