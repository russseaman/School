

public class Polynomial
{

	//attribute
	private int Degree;
	private float Coefficients[] = new float[100], answer;
	
	//Constructor
	public Polynomial(int n)
	{
		Degree = n;
	}
	
	//Set methods
	public void setCoefficient(int i, int value)
	{
		Coefficients[i] = value;
	}
	
	//Custom method
	public double evaluate(int x)
	{
						
		for(int i = 0; i <= Degree; ++i)
		{
			answer = (float) ((answer) + (Coefficients[i] * Math.pow(x,i)));
		}
		return answer;
	}
	
}

	

