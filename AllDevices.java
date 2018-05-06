package task21_ObjectModelAppliance;

import java.util.ArrayList;

public class AllDevices
{
	public static ArrayList<Appliance> devices = new ArrayList<Appliance>() {
		
		BodyCare hairdr = new BodyCare("dry hair", "hairdryer", "bathroom", 570, false);
		BodyCare shaver = new BodyCare("shave skin", "electric shaver", "bathroom", 3.5, false);
		BodyCare firon = new BodyCare("flat hair", "flat iron", "bedroom", 35.8, false);
		KitchenTools micro = new KitchenTools ("warm food", "microwave", "kitchen", 750, false);
		KitchenTools fridge = new KitchenTools ("keep food", "fridge", "kitchen", 250, true);
		KitchenTools kettle = new KitchenTools ("boil water", "kettle", "kitchen", 1250, false);
		KitchenTools estove = new KitchenTools ("cook", "electric stove", "kitchen", 2500, false);
		HouseKeeping heater = new HouseKeeping ("warm house", "electric heater", "bedroom", 1200, false); 
		HouseKeeping vacuum = new HouseKeeping ("clean dust", "vacuum cleaner", "closet", 1300, false);
		HouseKeeping wmachine = new HouseKeeping ("wash clothes", "washing machine", "bathroom", 400, false);
		HouseKeeping iron = new HouseKeeping ("iron", "iron", "bedroom", 650, false);
	};
}
	
	
