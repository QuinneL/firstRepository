package firstRep;
import java.util.*;

public class pikaRunner {

	public static void main(String[] args) 
	{
		int randLevel= (int)(Math.random()*99) + 1;
		int randShiny = (int)Math.random()*10000000;
		boolean shiny = false;
		if (randShiny>9999998)
		{
			shiny = true;
		}
		Pikachu wildPika = new Pikachu(randLevel, shiny);
		Scanner s = new Scanner(System.in);
		System.out.println("A wild pika appears");
		System.out.println ("This Pikachu is level " + wildPika.getLevel());
		System.out.printf("This Pikachu's moves are: \n%s", wildPika.getMove());

	}

}
