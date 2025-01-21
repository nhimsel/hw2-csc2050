import java.util.Random;

public class Manager 
{
    private static int count=0;
    private static int magicNumber;
    private static boolean magicNumberSet=false;

    public static void setMagicNumber(int num)
    {
        if (!magicNumberSet)
        {
            magicNumber=num;
            magicNumberSet=true;
        }
    }

    public static boolean myTurn(int val)
    {
        if (count%2==val)
        {
            count++;
            return true;
        }
        return false;
    }

    public static int guessRandom()
    {
        Random r = new Random();
        return r.nextInt(100)+1;
    }

    public static boolean guess(int num)
    {
        return num==magicNumber;
    }
}
