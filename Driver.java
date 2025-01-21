import java.util.Random;

public class Driver
{
	public static void main(String[] args) 
	{
	    Random r = new Random();
	    int secretNumber = r.nextInt(10) + 1;
		GameMaster gm = new GameMaster(secretNumber);
		gm.playGame();
	}
}
