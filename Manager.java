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

            //debug
            System.out.println("magic num = "+num);
        }
    }

    synchronized public static void setCurGuesser(int s)
    {
        curGuesser="Guesser "+s;
    }

    public static boolean isSolved()
    {
        return isSolved;
    }

    public static void checkSolved(int num)
    {
        isSolved=(num==magicNumber);
        if (isSolved())
        {
            System.out.println("The solution has been guessed.\nIt took "+count+" tries.");
        }
    }

    synchronized public static boolean myTurn(int val)
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
        return r.nextInt(10)+1;
    }

    synchronized public static void guessRandom()
    {
        int num=randomNum();
        System.out.println(curGuesser+" guessed: "+num);
        checkSolved(num);
    }
}
