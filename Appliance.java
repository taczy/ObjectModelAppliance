package task21_ObjectModelAppliance;

public abstract class Appliance 

{
	protected String purpose;
	protected String name;
	protected String location;
	protected double power_use;
	protected boolean on;
	
	//constructor 
	public Appliance(String purpose, String name, String location, double power_use, boolean on)
	{
		this.purpose = purpose;
		this.name = name;
		this.location = location;
		this.power_use = power_use;
		this.on = on;
		
	}
	
	public String getPurpose() {
		return purpose;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}

	public double getPower_use() {
		return power_use;
	}

	public boolean getOn() {
		return on;
	}


		
	
	
	
	//abstract method of turning On
	abstract void turnOn();
	
	// method of checking if appliance is On or Off	
	public void checkOn(boolean on, String name)
	{
		if (on = true)
		{
			System.out.println("The "+ name + " is on");
		}
		
		else 
		{
			System.out.println("The "+ name + " is off");
		}
	}	
}
