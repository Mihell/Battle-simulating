package unisa.pf.assign02.characters;


import unisa.pf.assign02.spells.Spell;
import unisa.pf.assign02.spells.SpellBook;
import unisa.pf.assign02.util.Log;

import java.util.Random;

public class Mage extends CharacterClass {

    private double mana;  // amount of mana of the Mage
    private SpellBook spellBook;

    /**
     * Constructor for Mage.
     * @param name name of mage.
     * @param maxHP the maximum HP of mage.
     */
    public Mage(String name, double maxHP) {
        super(name, maxHP);
        this.mana = maxHP;
        spellBook = new SpellBook();
    }

    @Override
    public double dealDamage() {
        Random r = new Random();
        if (mana < 10) {  // if the mana of the mage is less than 10
            doingNothing();
            return 0;
        }
        if(getCurrentHP() < 30){  // if the hp of the mage is less then 30
            if(spellBook.getHealingSpells().length == 0){
                doingNothing();
                return 0;
            } else{
                Spell randomHealingSpell = spellBook.getHealingSpells()[r.nextInt(spellBook.getHealingSpells().length)];
                if(randomHealingSpell.getManaCost() > mana){
                    doingNothing();
                } else{
                    randomHealingSpell.cast();
                    mana -= randomHealingSpell.getManaCost();
                    Log.println(randomHealingSpell.soundItMakes());
                }
                return 0;
            }
        } else {
            if (spellBook.getTargetedSpells().length == 0) {
                doingNothing();
            } else {
                Spell randomTargetedSpell = spellBook.getTargetedSpells()[r.nextInt(spellBook.getTargetedSpells().length)];
                if (randomTargetedSpell.getManaCost() > mana) {
                    doingNothing();
                    return 0;
                } else {
                    Log.println(randomTargetedSpell.soundItMakes());
                    mana -= randomTargetedSpell.getManaCost();
                    return randomTargetedSpell.cast();
                }
            }
        }
        return 0;
    }

    private void doingNothing() {
        mana += 25;
        setCurrentHP(getCurrentHP() + 4);
        Log.println(getName() + " is rests");
    }

    public void addSpell(Spell spell){
        spellBook.addSpell(spell);
    }

    /**
     * Replace spell book of mage by new clear spell book.
     */
    public void newSpellBook(){
        this.spellBook = new SpellBook();
    }
}
