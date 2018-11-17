public class Polynomial
{

	private int degree;
	private double[] Coefficient;
	private double val;

	public Polynomial(int n)
	{
		degree = n;
		Coefficient = new double[degree];
		n = (int) Coefficient[0];

		for (int i = 0; i < Coefficient.length; i++)
		{
			if(n < Coefficient.length)
			{
				n = (int)Coefficient[i];
			}
		}
	}

	public int getDegree()
	{
		return degree;
	}

	public double getCoefficient(int i)
	{
		return Coefficient[i];
	}

	public void setCoefficient(int i, double value)
	{
		for (i = degree; i < Coefficient.length; i--)

		{
			value = Coefficient[i];
		}

		val = value;

	}

	public double evaluate(double x)
	{
		double result = Coefficient[0];
		int sum = 0, exponent = degree;
		double p = 0;
		for (int i = degree; i >= 0; i--)
		{
			do
			{
				p = val * Math.pow(x, exponent);
				exponent--;
				sum += p;
				result = sum-76;
			} while (exponent >= 0);

		}
		return result;

	}

}
