public class Guesser extends Thread
{
    Object lock;

    private int guesserNo;
    private int count;

    public Guesser(int guesserNo, Object lock) 
    {
        this.guesserNo=guesserNo;
        this.lock=lock;
    }

    @Override
    public void run()
    {
        synchronized (lock)
        {
            while (!Manager.isSolved())
            {
                lock.notify();
                if (Manager.myTurn(guesserNo))
                {
                    Manager.setCurGuesser(guesserNo);
                    Manager.guessRandom();
                    count++;
                }
                try {lock.wait();} catch(Exception e){}
            }
            lock.notify();
            System.out.println("Guesser "+guesserNo+" took "+count+" tries.");
        }
    }
}
