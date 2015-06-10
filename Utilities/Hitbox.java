//Hitbox class for Joust

public class Hitbox
{
	//Instance Variables
	double locX,locY,length,width;
	//Constructor with provided arguments
	public Hitbox(double xVal, double yVal, double lengthValue, double widthValue)
	{
		locX = xVal;
		locY = yVal;
		length = lengthValue;
		width = widthValue;
	}
	private void setLoc(double x, double y)
	{
		locX = x;
		locY = y;
	}
	private void setX(double x)
	{
		locX = x;
	}
	private void setY(double y)
	{
		locY = y;
	}
	private double getX()
	{
		return locX;
	}
	private double getY()
	{
		return locY;
	}
	private void getLoc()
	{
		getX();
		getY();
	}
}
