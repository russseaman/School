public class Progression<k>{
	protected k first;
	protected k cur;
	Progression(){
		first=cur;
	}
	protected k firstValue(){
		cur=first;
		return cur;
	}
	protected k nextValue(){
		return cur;
	}
}
class GeomProgression extends Progression<Long>{
	protected long r;
	GeomProgression(){
		this(1,1);
	}
	GeomProgression(long a, long base){
		first = a;
		r = base;
	}
	protected long nextValue(){
		cur *= r;
		return cur;
	}
}
		
