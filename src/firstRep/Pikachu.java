package firstRep;

public class Pikachu 
{
	private int newlevel;
	private boolean shiny;
	public Pikachu()
	{
		newlevel = 10;
		shiny = false;
	}
	public Pikachu(int level, boolean isShiny)
	{
		newlevel = level; 
		shiny = isShiny;
	}
	public int getLevel()
	{
		return newlevel;
	}
	public String getMove()
	{
		String move1= "";
		String move2= "";
		String move3= "";
		String move4= "";

		if (newlevel>= 1 && newlevel < 5)
		{
			move1= "Tail Whip";
			move2 = "Thunder Shock";
		}
		else if (newlevel >= 5 && newlevel < 7)
		{
			move1= "Tail Whip";
			move2 = "Thunder Shock";
			move3 = "Growl";
		}
		else if (newlevel >= 7 && newlevel < 10)
		{
			move1= "Tail Whip";
			move2 = "Thunder Shock";
			move3 = "Growl";
			move4 = "Play Nice";
		}
		else if (newlevel >= 10 && newlevel < 13)
		{
			move4= "Quick Attack";
			move1 = "Thunder Shock";
			move2 = "Growl";
			move3 = "Play Nice";
		}
		else if (newlevel >= 13 && newlevel < 18)
		{
			move3= "Quick Attack";
			move4 = "Electro Ball";
			move1 = "Growl";
			move2 = "Play Nice";
		}

		else if (newlevel >= 18 && newlevel < 21)
		{
			move2= "Quick Attack";
			move3 = "Electro Ball";
			move4 = "Thunder Wave";
			move1 = "Play Nice";
		}
		else if (newlevel >= 21 && newlevel < 23)
		{
			move1= "Quick Attack";
			move2 = "Electro Ball";
			move3 = "Thunder Wave";
			move4 = "Fient";
		}
		else if (newlevel >= 23 && newlevel < 26)
		{
			move4 = "Double Team";
			move1 = "Electro Ball";
			move2 = "Thunder Wave";
			move3 = "Fient";
		}
		else if (newlevel >= 26 && newlevel < 29)
		{
			move3 = "Double Team";
			move4 = "Spark";
			move1 = "Thunder Wave";
			move2 = "Fient";
		}
		else if (newlevel >= 29 && newlevel < 34)
		{
			move2 = "Double Team";
			move3 = "Spark";
			move4 = "Nuzzle";
			move1 = "Fient";
		}
		else if (newlevel >= 34 && newlevel < 37)
		{
			move1 = "Double Team";
			move2 = "Spark";
			move3 = "Nuzzle";
			move4 = "Discharge";
		}
		else if (newlevel >= 37 && newlevel < 42)
		{
			move4 = "Slam";
			move1 = "Spark";
			move2 = "Nuzzle";
			move3 = "Discharge";
		}
		else if (newlevel >= 37 && newlevel < 42)
		{
			move4 = "Slam";
			move1 = "Spark";
			move2 = "Nuzzle";
			move3 = "Discharge";
		}
		else if (newlevel >= 42 && newlevel < 45)
		{
			move3 = "Slam";
			move4 = "Thunderbolt";
			move1 = "Nuzzle";
			move2 = "Discharge";
		}
		else if (newlevel >= 45 && newlevel < 50)
		{
			move2 = "Slam";
			move3 = "Thunderbolt";
			move4 = "Agility";
			move1 = "Discharge";
		}
		else if (newlevel >= 50 && newlevel < 53)
		{
			move1 = "Slam";
			move2 = "Thunderbolt";
			move3 = "Agility";
			move4 = "Wild Charge";
		}
		else if (newlevel >= 58)
			//learning of thunder before learning of light screen 
		{
			move4 = "Thunder";
			move3 = "Light Screen";
			move1 = "Agility";
			move2 = "Wild Charge";
		}
		else 
		{
			//this is an earlier level than 58
			move4 = "Light Screen";
			move1 = "Thunderbolt";
			move2 = "Agility";
			move3 = "Wild Charge";
		}

		return move1 + "\t" + move2 + " \n" + move3 + "\t" + move4;

	}
}
