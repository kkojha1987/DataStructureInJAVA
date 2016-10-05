package pack01;

public class Example01 {
	static String s=new String("position 1 no. @ dugra is this");
	static String  [] ss=new String[s.length()];
	public static void main(String[] args) {
ss=s.split(" ");

for(int i=ss.length-1; i>=0; i--)
{
	System.out.print(ss[i]+" ");
}
	
int a=5;
int b=6;
b=a++;
System.out.println(b);
	}
}
