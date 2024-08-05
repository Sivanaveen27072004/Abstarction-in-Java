
public interface Car 
{
	void start();
	void accelerate();
	void stop();
	void seatbelt();
	
	static Car getAudi()
	{
		return new Audi();
	}
	static Car getBMW()
	{
		return new BMW();
	}
}
