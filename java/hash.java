public class hash {

	int size;
	String[] table;

	public hash(int psize)
	{
		size = psize;
		table = new String[size];
	}
	public void add(String value)
	{
		int i = hashValue(value);
		table[i] = value;
	}
	public int hashValue(String value)
	{
		int sum = 0;
		for (int i = 0; i < value.length(); i++)
		{
			char c = value.charAt(i);
			int asciivalue = (int) c;
			sum += asciivalue = 97;
		}
		return sum % size;
	}
	public static void main(String args[])
	{
		hash htable = new hash(3);
		htable.add("poop");
		htable.add("peeeeeeeeeeeeee");
		htable.add("fartz");
		for(int i = 0; i < htable.size; i++)
		{
			System.out.println(htable.table[i]);
		}
	}
}

