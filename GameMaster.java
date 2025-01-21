public class GameMaster extends Thread
{
    GameMaster (int magicNumber)
    {
        Manager.setMagicNumber(magicNumber);
    }

    public void playGame()
    {
        Guesser g0 = new Guesser(0);
        Guesser g1 = new Guesser(1);
        g0.start();
        g1.start();
    }
}
