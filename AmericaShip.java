public class AmericaShip extends AbstractRacer
{

    public AmericaShip(String name)
    {
        super(name);
        
    }

    public void move()
    {
        double crashChance = Math.random();

        if (crashChance < 0.1)
        {
            System.out.println("Houston, we have a problem... << Spaceship has crashed! The Americans must Restart! >>");
            setPosition(0);
        }
        else
            setPosition(getPosition() + 5);
    }
}
