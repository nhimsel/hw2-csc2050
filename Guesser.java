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
        if (Manager.myTurn(guesserNo))
        {
            
        }
    }
    
}
