public class Audi implements Car
{

	@Override
	public void start() {
		System.out.println("Audi car Started v8");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Audi accelerated in 10 sec");
		
	}

	@Override
	public void stop() 
	{
		System.out.println("The petrol Consumption is 100ml");
		
	}

	@Override
	public void seatbelt() 
	{
		System.out.println("There are 4 Seatbelts");
		
	}

}
