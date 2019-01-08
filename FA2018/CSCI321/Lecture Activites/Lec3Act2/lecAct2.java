import java.util.*;

class lecAct2 {

	public int[] X = new int[]{2,4,6,8,10};
	public int[] Y = new int[]{1,3,5,7,9};
	public int[] Z = new int[]{3,9,6,4,1};
	public double []a = new double[5];
	public int sum;

	public double[] getXAvg(){
		return prefixAverages(X);
	}

	public double[] getYAvg(){
		return prefixAverages(Y);
	}

	public double[] getZavg(){
		return prefixAverages(Z);
	}


	public double[] prefixAverages(int[] x) {
		for (int i = 0; i < a.length; i++){
			sum = 0;
			for (int j = 0; j <= i; j++){
				sum += x[j];
			}
			a[i] = sum / (i + 1);
		}
		return a;
	}
}
