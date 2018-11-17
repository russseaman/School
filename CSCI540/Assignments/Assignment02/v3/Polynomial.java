public class Polynomial
{
private int Degree;
private int Coefficients[]= {3,5,0,2};
public  Polynomial(int n)
{
	Degree=n;
	for (int i =0; i<=Degree;++i)
	{
		Coefficients[i]=(int) Math.pow(0,i);

	}

}

public void setCoefficient (int a, int b)
{
	if (a==0)
	{
		Coefficients[0]=b;
	}
	if (a==1)
	{
		Coefficients[1]=b;
	}
	if (a==2)
	{
		Coefficients[2]=b;
	}
	if (a==3)
	{
		Coefficients[3]=b;
	}
}

int k;
public int evaluate (int a)
{
	int total=0;
	for (int i =0; i<=Degree;++i)
	{

		k=Coefficients[i] * (int) Math.pow(a,i);
		total+=k;
	}
	return total;
}

}
