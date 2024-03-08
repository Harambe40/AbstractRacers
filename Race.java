import java.util.ArrayList;

public class Race 
{
    private ArrayList<AbstractRacer> contestants;
    private int DISTANCE;
    private boolean ended;
    private AbstractRacer winner;
    
    public Race(int distance)
    {
        DISTANCE = distance;
        contestants = new ArrayList<AbstractRacer>();
        ended = false;
    }

    public void addContestant(AbstractRacer r)
    {
        contestants.add(r);
    }

    public ArrayList<AbstractRacer> getContestants()
    {
        return contestants;
    }
    
    public int getDistance()
    {
        return DISTANCE;
    }

    public void runRace()
    {
        while (ended == false)
        {
            System.out.println("Test");
            for (AbstractRacer racer : contestants)
            {
                racer.move();
                System.out.println(racer.toString());
                if (racer.getPosition() >= DISTANCE)
                {
                    ended = true;
                }
            }
        }
    }
    
     public boolean raceOver()
    {
        if (ended == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public AbstractRacer getWinner()
    {
        for (AbstractRacer racer : contestants)
        {
            if (racer.getPosition() >= 100)
            {
                winner = racer;
            }
        }
        return winner;
    }
}
