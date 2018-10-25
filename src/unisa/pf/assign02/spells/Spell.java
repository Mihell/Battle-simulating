package unisa.pf.assign02.spells;

import unisa.pf.assign02.base.Effector;

public abstract class Spell extends Effector {

    private double manaCost;

    public Spell(String name, double minimumImpact, double maximumImpact, double manaCost) {
        super(name, minimumImpact, maximumImpact);
        this.manaCost = manaCost;
    }

    public double getManaCost() {
        return manaCost;
    }

    public abstract double cast();
}
