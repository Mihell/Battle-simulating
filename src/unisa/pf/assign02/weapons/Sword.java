package unisa.pf.assign02.weapons;

public class Sword extends Weapon{
    public Sword() {
        super("Sword", 1, 25);
    }

    @Override
    public String soundItMakes() {
        return "Wosh";
    }
}
