package unisa.pf.assign02.spells;

import unisa.pf.assign02.characters.CharacterClass;

public class MinorHealing extends HealingSpell {

    public MinorHealing(CharacterClass target) {
        super("MinorHealing", 40, 40, 20, target);
    }

    @Override
    public String soundItMakes() {
        return "Warble";
    }

    @Override
    public double cast() {
        getTarget().addHealth(40);
        return 0;
    }
}
