package task21_ObjectModelAppliance;

public class BodyCare extends Appliance 
{
	
	public BodyCare(String purpose, String name, String location, double power_use, boolean on) 
	{
		super(purpose, name, location, power_use, on);		
	}


	boolean portable;	
	

	@Override
	void turnOn() 
	{
		System.out.println("Plug it in and turn on");
		checkOn(on, name);
		if (on==false)
		{
			on = true;	
		}
	}

}
