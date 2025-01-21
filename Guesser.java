

public class Guesser extends Thread
{
    int guesserNo;

    public Guesser(int guesserNo) 
    {
        this.guesserNo = guesserNo;
    }

    @Override
    public void run()
    {
        while (Manager.isSolved())
        {
            if (Manager.myTurn(guesserNo))
            {
                Manager.setCurGuesser(guesserNo);
                Manager.guessRandom();
            }
        }
    }
    
}
