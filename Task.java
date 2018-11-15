package task;

public class Task implements Priority
{
	String thing;
	int importanceRating; // #1-4
	
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
	
	public String toString()
	{
		return "Task: " + thing + "\n" +
				"Priority: " + importanceRating;
	}
}
