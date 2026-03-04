//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ashton Jays
//Date - 03/03/26
//Class - CSI
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		word = "default";
	}

	public StringChecker(String s)
	{
		word = s;
	}

   public void setString(String s)
   {
   	word=s;
   }

	public boolean findLetter(char c)
	{
		if (word.indexOf(c) >= 0 && word.indexOf(c) <= word.length())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean findSubString(String s)
	{
		if (word.indexOf(s) >= 0 && word.indexOf(s) <= word.length())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

 	public String toString()
 	{
 		return word + "\n\n";
	}
}