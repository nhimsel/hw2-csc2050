public class GameMaster extends Thread
{
    GameMaster (int magicNumber)
    {
        Manager.setMagicNumber(magicNumber);
    }

    public void playGame()
    {
        //call 2 guesser threads, they alternate guesses until one of them gets it correct
        Guesser g0 = new Guesser(0);
        Guesser g1 = new Guesser(1);
        g0.start();
        g1.start();

        //do we want to allow duplicate guesses???
    }
}
