package calculator;
public class BasicCalc
{
	

	double a,b,c;// include variables a, b, c here
	public double getA() //include getters and setters method to access variables
	
	{
		return a;
	}
	public void setA(double a)
	{
		this.a = a;
	}
	public double getB() 
	{
		return b;
	}
	public void setB(double b) 
	{
		this.b = b;
	}
	double add()//include methods for operations 
	{
		c=a+b;
		return(c);
	}
	double substract()
	{
		c=a-b;
		return(c);
	}
	double multiply()
	{
		c=a*b;
		return(c);
	}
	double divide()
	{
		c=a/b;
		return(c);
	}
}

	
	

