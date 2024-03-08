public class SovietShip extends AbstractRacer
{

    public SovietShip(String name)
    {
        super(name);
        
    }

    public void move()
    {
        double crashChance = Math.random();

        if (crashChance < 0.3)
        {
            System.out.println("Черт побери, американцы, они, должно быть, нас саботировали! << Spaceship has crashed! The Soviets must Restart! >>");
            setPosition(0); 
        }
        else
            setPosition(getPosition() + 5);
    }
}
