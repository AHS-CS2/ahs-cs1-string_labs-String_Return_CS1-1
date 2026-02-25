//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ashton Jays
//Date - 2/23/26
//Class - CSI
//Lab  -

import static java.lang.System.*;

public class FirstAndLast
{
	private String word;

	public FirstAndLast(String s)
	{
		word = s;
	}

	public void setString()
	{
		word = "null";
	}

	public String getFirst(String s)
	{
		String first = out.print(s.charAt(0));
		return first;
	}
	
	public String getLast(String s)
	{
		String last = out.print(s.charAt(s.length));
		return last;
	}

 	public String toString()
 	{
 		String output= word;
 		return "word :: " + output + "\n";
	}
}