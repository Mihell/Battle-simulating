package unisa.pf.assign02.testing;

import unisa.pf.assign02.base.Effector;
import unisa.pf.assign02.characters.Mage;
import unisa.pf.assign02.characters.CharacterClass;
import unisa.pf.assign02.characters.Warrior;
import unisa.pf.assign02.spells.Spell;
import unisa.pf.assign02.spells.MinorHealing;
import unisa.pf.assign02.spells.TargetedSpell;
import unisa.pf.assign02.spells.Fireball;
import unisa.pf.assign02.spells.HealingSpell;
import unisa.pf.assign02.spells.IceStorm;
import unisa.pf.assign02.weapons.Weapon;
import unisa.pf.assign02.weapons.Axe;
import unisa.pf.assign02.weapons.Sword;
import unisa.pf.assign02.util.Log;

public class HaveBattleOriginal {
	public static void main(String[] args) {
		int numberOfBattles = 5;
		int numberMageWins = 0;
		int numberWarriorWins = 0;
		int draw = 0;

		Log.setFileOut();

		// Log.println("ID Of Student "+args[0]);

		for (int i = 0; i < numberOfBattles; i++) {
			Log.println("****** Round " + (i + 1) + " ********");
			CharacterClass mage = new Mage("Macros the Black Ver(" + i + ")", 120);
			((Mage) mage).addSpell(new Fireball());
			((Mage) mage).addSpell(new IceStorm());
			((Mage) mage).addSpell(new MinorHealing(mage));
			CharacterClass warrior = new Warrior("Ashen-Shugar Ver(" + i + ")", 240, new Axe());
			((Warrior) warrior).addWeapon(new Sword());

			while (mage.isAlive() && warrior.isAlive()) {
				Log.println("+++New Turn+++");
				Log.print("[[Mage Turn]]");
				warrior.receiveDamage(mage.dealDamage());
				Log.println("");
				Log.print("[[Warrior Turn]]");
				mage.receiveDamage(warrior.dealDamage());
				Log.println("\n");
			}

			if (mage.isAlive()) {
				Log.println("Mage " + mage.getName() + " Wins \n[[" + mage + "]]");
				numberMageWins++;
			} else if (warrior.isAlive()) {
				Log.println("Warrior " + warrior.getName() + " Wins \n[[" + warrior + "]]");
				numberWarriorWins++;
			} else {
				Log.println("Killed Each Other No One Wins\nDead:" + mage + "\nDead:" + warrior);
				draw++;
			}
			Log.println("****************************************************\n\n\n");
		}
		Log.println("Mage :" + numberMageWins);
		Log.println("Warrior :" + numberWarriorWins);
		Log.println("Killed Each Other :" + draw);
		Log.println("\n\n");

		Log.println("Debug Structure Code Below");
		// This code will force you to get the structure right.
		CharacterClass x = new Warrior("Mym", 999, new Sword());
		CharacterClass y = new Mage("Atoning Unifex", 9999999);
		Warrior z = new Warrior("Falameezar-aziz-Sulmonmee", 900, new Sword());
		Mage w = new Mage("Jon-Tom", 300);
		Mage u = new Mage("Mondain", 300);
		Spell s1 = new MinorHealing(y);
		HealingSpell s2 = new MinorHealing(y);
		TargetedSpell s3 = new IceStorm();
		Spell s4 = new IceStorm();
		Effector e1 = new Sword();
		Effector e2 = new IceStorm();
		Weapon w1 = new Axe();
		x.addHealth(99);
		z.addWeapon(new Axe());
		x.isAlive();
		Log.println("X Deal Damage");
		x.dealDamage();
		Log.println("\nX Receive Damage");
		x.receiveDamage(999);
		Log.println("\nW Receive Damage");
		w.receiveDamage(999);
		w.dealDamage();

		s4.getMinimumImpact();
		s4.getMaximumImpact();
		s4.getManaCost();

		Log.close();
	}
}
