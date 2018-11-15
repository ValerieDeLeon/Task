package task;

public class Task implements Priority, Comparable
{
	String thing;
	int importanceRating; // #1-3
	
	public Task(String thing, int importanceRating)
	{
		this.thing = thing;
		this.importanceRating = importanceRating; 
	}
	
	public void setPriority(int newRating)
	{
		 this.importanceRating = newRating;
	}
	
	public int getPriority()
	{
		return importanceRating;
	}
	
	public int compareTo(Object obj)
	{
		int priority = ((Task)obj).getPriority();
		if (importanceRating < priority)
			return -1;
		else if (importanceRating > priority)
			return 1;
		else
			return 0;
	}
	
	public String toString()
	{
		return "Task: " + thing + "\n" +
				"Priority: " + importanceRating;
	}
}
