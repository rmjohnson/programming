using System;

class Daily113Easy
{
	static void Main()
	{
		Console.WriteLine("Enter the text to be type'd: ");
		Console.WriteLine(get_type(Console.ReadLine()));
		Console.ReadLine();
	}
	
	public String get_type(String TypeString)
	{
		(System.Text.RegularExpressions.Regex.IsMatch(TypeString, ".", System.Text.RegularExpressions.RegexOptions.IgnoreCase) ? return "float";
		(System.Text.RegularExpressions.Regex.IsMatch(TypeString, "\d{2}-\d{2}-\d{4}", System.Text.RegularExpressions.RegexOptions.IgnoreCase) ? return "date";
		(System.Text.RegularExpressions.Regex.IsMatch(TypeString, "[^a-z]", System.Text.RegularExpressions.RegexOptions.IgnoreCase) ? return "int";
		return "text";
	}
}