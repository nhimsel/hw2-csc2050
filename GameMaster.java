public class GameMaster extends Thread
{
    private int magicNumber;

    GameMaster (int magicNumber)
    {
        this.magicNumber=magicNumber;
    }

    public void playGame()
    {
        //call 2 guesser threads, they alternate guesses until one of them gets it correct
        //do we want to allow duplicate guesses???
    }
}
