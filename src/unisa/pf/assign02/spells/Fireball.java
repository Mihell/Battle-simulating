package unisa.pf.assign02.spells;

public class Fireball extends TargetedSpell {
    public Fireball() {
        super("Fireball", 30, 40, 125);
    }

    @Override
    public String soundItMakes() {
        return "Crackle Boom";
    }
}
