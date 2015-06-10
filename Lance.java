//Spear Class for Joust in Java
import java.util.Random;
public class Lance 
{
	//Instance Variables
	int lanceX,lanceY;
	double lancePitch;
	Random randomGen;
	//Constructor
	public Lance ()
	{
		randomGen = new Random();
		System.out.println("This is my lance pitch value "+randomGen);
		lanceX = 0;
		lanceY = 0;
		lancePitch = 0;
	}
	//Movement Function
	public void Wobble ()
	{
		lancePitch = randomGen.nextDouble();
	}
}


