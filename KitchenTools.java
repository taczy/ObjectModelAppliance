package task21_ObjectModelAppliance;

public class KitchenTools extends Appliance 

{	
	public KitchenTools(String purpose, String name, String location, double power_use, boolean on) 
	{
		super(purpose, name, location, power_use, on);		
	}

	@Override
	void turnOn() 
	{	
		System.out.println("Turn it on if it's off");
		checkOn(on, name);
		if (on!=true)
		{
			on = true;	
		}
	}

}
