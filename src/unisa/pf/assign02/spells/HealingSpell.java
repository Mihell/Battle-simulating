package unisa.pf.assign02.spells;

import unisa.pf.assign02.characters.CharacterClass;

public abstract class HealingSpell extends Spell{

    private CharacterClass target;

    public HealingSpell(String name, double minimumImpact, double maximumImpact, double manaCost, CharacterClass target) {
        super(name, minimumImpact, maximumImpact, manaCost);
        this.target = target;
    }

    public CharacterClass getTarget() {
        return target;
    }


}
