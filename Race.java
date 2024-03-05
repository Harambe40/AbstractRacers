import java.util.ArrayList;

public class Race 
{
    private ArrayList<Racer> contestants;
    private int DISTANCE;
    
    public Race(int distance)
    {
        DISTANCE = distance;
        contestants = new ArrayList<Racer>();
    }

    public void addContestant(Racer r)
    {
        contestants.add(r);
    }

    public ArrayList<Racer> getContestants()
    {
        return contestants;
    }
    
    public int getDistance()
    {
        return DISTANCE;
    }

    public void runRace()
    {
        for (Racer racer : contestants)
        {
            racer.move();
            racer.toString();
            if (racer.getPosition() >= DISTANCE)
            break;
        }
    }
}
