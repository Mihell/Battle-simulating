package unisa.pf.assign02.weapons;

public class Axe extends Weapon {

    public Axe() {
        super("Axe", 5, 15);
    }

    @Override
    public String soundItMakes() {
        return "Clink";
    }
}
