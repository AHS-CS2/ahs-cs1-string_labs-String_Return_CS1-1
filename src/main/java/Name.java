//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ashton Jays
//Date - 02/27/26
//Class - CSI
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;
	public Name()
	{
		name = "Ashton";
	}

	public Name(String s)
	{
		name = s;
	}

   public void setName(String s)
   {
		name = s;
   }

	public String getFirst()
	{
		String first;
		
			first = name.substring(0, 5);

		return first;
	}

	public String getLast()
	{
		String last;
		if (name.length() == 8) {
			last = name.substring(5, name.length());
		} else {
			last = name.substring(6, name.length());
		}
		return last;
	}

 	public String toString()
 	{
 		return name + "\n\n";
	}
}