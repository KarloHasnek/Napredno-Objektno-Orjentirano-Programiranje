package vjezba6.zadatak2;

public interface ShipFactory {

    public Captain createCaptain(String name);
    public Ship createShip(String name);
    public Crew createCrew(int num);
    public PropulsionSystem createPropulsionSystem();

}