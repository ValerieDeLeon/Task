package task;

public class TaskDriver 
{
	public static void main (String[] args)
	{
		Task t1 = new Task("Playing videogames", 1);
		Task t2 = new Task("Doing homework", 2);
		Task t3 = new Task("Checking grades", 3);
		
		System.out.println(t1.compareTo(t2));
		System.out.println(t3.compareTo(t2));
		System.out.println(t1.compareTo(t1));
		
//		System.out.println(t1.toString());
//		System.out.println(t2.toString());
//		System.out.println(t3.toString());
//		System.out.println(t4.toString());
//		
//		System.out.println();
//		
//		t1.setPriority(1);
//		t3.setPriority(2);
//		System.out.println(t1.getPriority());
//		System.out.println(t3.getPriority());
//		System.out.println(t1.toString());
//		System.out.println(t3.toString());
	}
}

