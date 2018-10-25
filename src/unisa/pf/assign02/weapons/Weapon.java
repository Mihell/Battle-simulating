package unisa.pf.assign02.weapons;

import unisa.pf.assign02.base.Effector;

public abstract class Weapon extends Effector{

    /**
     * Constructor for Weapon.
     *
     * @param name          name of item.
     * @param minimumImpact the minimum effect of the item.
     * @param maximumImpact the maximum effect of the item.
     */
    public Weapon(String name, double minimumImpact, double maximumImpact) {
        super(name, minimumImpact, maximumImpact);
    }

    public double calculateDemage(){
        return Effector.randomNumberInRange(getMinimumImpact(), getMaximumImpact());
    }


}
