package task21_ObjectModelAppliance;

public class HouseKeeping extends Appliance 
{

	public HouseKeeping(String purpose, String name, String location, double power_use, boolean on) 
	{
		super(purpose, name, location, power_use, on);
	}

	@Override
	void turnOn() 
	{
		System.out.println("Go to the basement, turn it on");
		checkOn(on, name);
		if (on!=true)
		{
			on = true;	
		}		
	}

}
