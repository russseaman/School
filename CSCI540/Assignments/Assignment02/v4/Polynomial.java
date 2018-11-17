
public class Polynomial
{
	
	int value = 0;
	int ind = 0;
	int degree = 0;
	float[] coefficients;
	
	public Polynomial(int value)
	{
		
		this.degree = value;
		coefficients = new float[degree + 1];
		for(int k = 0; k < coefficients.length; k++)
		{		
			coefficients[k] = 0;
		}
	}
	
	public void setCoefficient(int i, int value)
	{
		this.ind = i;
		this.coefficients[ind] = value;	
	}
	
	public int evaluate(int x)
	{
		int exp = x;
		int poly = 0;
		poly += coefficients[0];
		
		for(int l = 1; l < coefficients.length - 1; l++)
		{
			poly += coefficients[l] * exp;
		}
		poly += coefficients[coefficients.length - 1] * Math.pow(exp,degree);
		
		return poly;
	}
}
