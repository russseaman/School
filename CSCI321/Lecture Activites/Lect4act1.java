public class integerComparator implements Comparator <Integer> {
	private int countBits(int k){
		int numOnes = 0;
		int tmp = k;
		while (tmp != 0){
			int bit = tmp & 1;
			if (bit == 1)
				numOnes ++;
			tmp = tmp >> 1;
			}
		return numOnes;
		}
	private int compare(Integer a, integer b){
		int valA;
		int valB;
