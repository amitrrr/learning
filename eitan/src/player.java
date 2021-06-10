public class player {
	
	public player() 
	{
		
	}
	public player(String name) 
	{
		this.name = name;
	}
	public player(boolean active) 
	{
		this.active=active;
	}
	public player(int age)
	{
		this.age=age;
	}
	public player(String name, int age) 
	{
		this.name=name;
		this.age=age;
	}
	public player(String name, boolean active) 
	{
		this.name=name;
		this.active=active;
	}
	public player(boolean active, int age) 
	{
		this.active=active;
		this.age=age;
	}
	public player(String name, int age,boolean active) 
	{
		this.name=name;
		this.active=active;
		this.age=age;
	}
	
	private String name;
	
	private int age;
	private int scores=0;
	private boolean active;
	
	public void addScores(int s) 
	{
		scores+=s;
	}

	public int HowMuchGoals() 
	{
		return scores;
	}
	public void setName(String n) 
	{
		name=n;
	}
	public String getName() 
	{
		return name;
	}
	
	
	
}
