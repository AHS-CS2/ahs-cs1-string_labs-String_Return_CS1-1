//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ashton Jays
//Date - 02/27/26
//Class - CSI
//Lab  -

import static java.lang.System.*;

public class StringRipper
{
	private String word;
	
	public StringRipper()
	{
		word = "default";
	}

	public StringRipper(String s)
	{
		word = s;
	}
	
   public void setString(String s)
   {
		word = s;
   }	

	public String ripString(int x, int y)
	{
		String sub = word.substring(x, y);
		return sub;
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}