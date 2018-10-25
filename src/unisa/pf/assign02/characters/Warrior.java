package unisa.pf.assign02.characters;

import unisa.pf.assign02.util.Log;
import unisa.pf.assign02.weapons.Weapon;

import java.util.ArrayList;
import java.util.Random;

public class Warrior extends CharacterClass{

    private ArrayList<Weapon> weapons = new ArrayList<>(5);

    /**
     * Constructor for Warrior.
     * @param name name of warrior.
     * @param maxHP the maximum HP of warrior.
     * @param weapon the initial weapon of warrior.
     */
    public Warrior(String name, double maxHP, Weapon weapon) {
        super(name, maxHP);
        this.weapons.add(weapon);
    }

    @Override
    public void receiveDamage(double amount){
        amount = (amount - 10) > 0 ? amount - 10 : 0;  // implicit armor that offsets 10 damage
        setCurrentHP(getCurrentHP() - amount);
    }

    public void addWeapon(Weapon weapon){
        if(weapons.size() >= 5){  // warriors can have up to 5 weapons
            return;
        } else{
            weapons.add(weapon);
        }
    }

    @Override
    public double dealDamage() {
        Random random = new Random();
        Weapon randomWeapon = weapons.get(random.nextInt(weapons.size()));
        Log.println(randomWeapon.soundItMakes());
        return randomWeapon.calculateDemage();
    }
}
