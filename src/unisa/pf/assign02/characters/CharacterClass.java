package unisa.pf.assign02.characters;

public abstract class CharacterClass {
    private String name;
    private double currentHP;
    private double maxHP;


    /**
     * Constructor for CharacterClass.
     * @param name name of character.
     * @param maxHP the maximum HP of character.
     */
    public CharacterClass(String name, double maxHP) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
    }

    public abstract double dealDamage();



    public void receiveDamage(double amount){
        currentHP -= amount;
    }

    public boolean isAlive(){
        return currentHP > 0;
    }

    /**
     * Add some amount of HP to the current HP.
     * @param newAmount amount of HP which added.
     */
    public void addHealth(double newAmount){
        currentHP = (currentHP + newAmount) >= maxHP ? maxHP : currentHP + newAmount;
    }

    public double getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(double currentHP) {
        this.currentHP = currentHP;
    }

    public String getName() {
        return name;
    }
}
