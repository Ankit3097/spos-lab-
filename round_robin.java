import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class round_robin 
{
	public static void main(String[] args)
	{	
		int n;
		int head;
		int size;
		int re_element;

		System.out.println("Round_robin program");
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the no of process: ");
		n = read.nextInt();
		read.close();

		System.out.println("Tatal no of process : " + n );
		
		Queue<Integer> q = new LinkedList<>(); 
 
		for (int i = 1; i <= 5; i++)
			q.add(i);
		System.out.println("Elements of queue:"+ q);

		head = q.peek();
		System.out.println("Head: P"+ head);
		
		size = q.size();
		System.out.println("Size of queue:" + size);
		
		re_element = q.remove();
		System.out.println("removed element: P" + re_element);
		
		System.out.println("Elements of queue:"+ q);
	
	}
}
