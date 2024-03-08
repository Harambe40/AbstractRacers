public class RaceRunner 
{
    public static void main(String[] args)
    {
        Race theGreatRace = new Race(100);
        AmericaShip Apollo = new AmericaShip("Apollo");
        SovietShip Луна = new SovietShip("Луна");
        theGreatRace.addContestant(Луна);
        theGreatRace.addContestant(Apollo);
        System.out.println(Apollo.toString());
        System.out.println(Луна.toString());
        theGreatRace.runRace();
        System.out.println("The winner is " + theGreatRace.getWinner().getName() + "!");
    }
}