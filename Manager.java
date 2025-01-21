import java.util.Random;

public class Manager 
{
    private static int count=0;
    private static int magicNumber;
    private static boolean magicNumberSet=false;
    private static String curGuesser=null;
    private static boolean isSolved=false;

    public static void setMagicNumber(int num)
    {
        if (!magicNumberSet)
        {
            magicNumber=num;
            magicNumberSet=true;
        }
    }

    public static void setCurGuesser(int s)
    {
        curGuesser="Guesser "+s;
    }

    public static boolean isSolved()
    {
        return isSolved;
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

    public static int randomNum()
    {
        Random r = new Random();
        return r.nextInt(100)+1;
    }

    public static boolean guessRandom()
    {
        int num=randomNum();
        System.out.println(curGuesser+" guessed: "+num);
        return num==magicNumber;
    }
}
