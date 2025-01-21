public class GameMaster extends Thread
{
    GameMaster (int magicNumber)
    {
        Manager.setMagicNumber(magicNumber);
    }

    public void playGame()
    {
        Object lock = new Object(); 

        Guesser g0 = new Guesser(0,lock);
        Guesser g1 = new Guesser(1,lock);
        g0.start();
        g1.start();
    }
}
