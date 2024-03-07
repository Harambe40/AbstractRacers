import java.util.Random;

public class SovietShip {

   // need fuel - speed -
   
private int speed = 5;
private int fuel = 100;

public void SovietShip()
{

}

public int move(int position)
{
    position += speed;
    fuel = fuel - 5;
   int r = (int) Math.random() * 10;
   if( r == 0 || r == 9)
   {
        System.out.println("crash");
   }

}

}
