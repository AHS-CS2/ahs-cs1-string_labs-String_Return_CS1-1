//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Ashton Jays
//Date - 02/24/26
//Class -
//Lab  -

import static java.lang.System.*;

public class FirstRunner
{
	public static void main ( String[] args )
	{
		FirstAndLast demo = new FirstAndLast("Hello");
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
		
		//add more test cases	
		demo = new FirstAndLast("World");
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast()) ;

		demo = new FirstAndLast("JukeBox");
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );

		demo = new FirstAndLast("TCEA");
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );

		demo = new FirstAndLast("UIL");
		System.out.println( "first letter ::" + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() );
	}
}