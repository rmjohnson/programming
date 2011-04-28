public class qsort
{
	int[] list;

	public qsort(int[] plist)
	{
		System.arraycopy(plist,0,list,0,plist.length);
	}
	public int[] sort(int[] list, int low, int high)
	{
		int p = list[(list.length/2)];
		int i = low;
		int j = high;
		int tmp;
		while (i <= j)
		{
			while (list[i]<p) i++;
			while (list[j]>p) j--;
			if (i<=j)
			{
				tmp=list[i];
				list[i]=list[j];
				list[j]=tmp;

				i++;
				j--;
			}
		}

		if (low<j) sort(list,low,high);
		if (i<high) sort(list,low,high);
		return list;
	}
	public static void main(String [] args)
	{
		int[] list = {4,7,6,8,3,9,2};	
		qsort obj = new qsort(list);
		System.out.println(obj.sort(obj.list,0,6));
	}

}
		
