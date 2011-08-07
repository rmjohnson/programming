public class lsearch
{
	//Variable declarations yo. these are used in the constructor.
	int[] values = new int[10];
	int target;
	//Main or something..idunno
	public static void main(String[] args)
	{
		int[] values = new int[] {1,2,3,4,5};
		int target = 3;
		lsearch obj = new lsearch (values, target);
		if((obj.findIndex(obj.values,obj.target) == -1))
		{
			System.out.println("Yo dawg, couldn't find that target.");
		}
		else
		{
			System.out.println(obj.findIndex(obj.values,obj.target));
		}

	}
	//This is like the constructor, you know?
	public lsearch(int[] pvalues, int ptarget)
	{
		System.arraycopy(pvalues, 0,values,0,pvalues.length);
		target = ptarget;
	}
	//A findindex method, used to find a target's index
	int findIndex(int[] values, int target)
	{
		for(int i=0; i < values.length; i++)
		{
			if( values[i] == target )
			{
				return i;
			}
		}
		return -1;
	}
}
