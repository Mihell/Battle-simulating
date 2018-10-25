package unisa.pf.assign02.spells;

public class IceStorm extends TargetedSpell {

    public IceStorm() {
        super("IceStorm", 40, 50, 130);
    }

    @Override
    public String soundItMakes() {
        return "Chatter Boom";
    }
}
