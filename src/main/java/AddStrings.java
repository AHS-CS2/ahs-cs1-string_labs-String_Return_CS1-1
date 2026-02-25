//(c)  A+ Computer Science
//www.apluscompsci.com

//Name - Ashton Jays
//Date - 02/23/26
//Class - CSI
//Lab  -

import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
    String sum = "Blank";
   }

   public AddStrings(String one, String two)
   {
    setStrings(one, two);
    add();

   }

   public void setStrings(String one, String two)
   {
    first = one;
    last = two;

   }

 	public void add( )
 	{
    sum = first + last;

	}

 	public String toString()
 	{
    System.out.print("first :: " + first + "\nlast :: " + last + "\nsum :: ");
 		String output= sum;
 		return output + "\n\n";
	}
}