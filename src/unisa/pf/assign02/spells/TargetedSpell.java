package unisa.pf.assign02.spells;

import unisa.pf.assign02.base.Effector;

public abstract class TargetedSpell extends Spell {
    public TargetedSpell(String name, double minimumImpact, double maximumImpact, double manaCost) {
        super(name, minimumImpact, maximumImpact, manaCost);
    }

    @Override
    public double cast() {
        return Effector.randomNumberInRange(getMinimumImpact(), getMaximumImpact());
    }
}
