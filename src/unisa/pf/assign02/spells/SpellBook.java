package unisa.pf.assign02.spells;

import java.util.LinkedList;

public class SpellBook {
	LinkedList<Spell> pages = new LinkedList<Spell>();

	public Spell[] getTargetedSpells() {
		LinkedList<Spell> offensive = new LinkedList<Spell>();
		
		for (Spell i: pages) {
			if(i instanceof TargetedSpell) {
				offensive.add(i);
			}
		}
		
		Spell[] returnVal = new Spell[offensive.size()];
		for(int i=0;i<returnVal.length;i++) {
			returnVal[i] = offensive.get(i);
		}
		
		return returnVal;
	}
	
	
	public Spell[] getHealingSpells() {
		LinkedList<Spell> healing = new LinkedList<Spell>();
		
		for (Spell i: pages) {
			if(i instanceof HealingSpell) {
				healing.add(i);
			}
		}
		
		Spell[] returnVal = new Spell[healing.size()];
		for(int i=0;i<returnVal.length;i++) {
			returnVal[i] = healing.get(i);
		}
		
		return returnVal;
	}
	
	
	public void addSpell(Spell newSpell) {
		pages.add(newSpell);
	}
	
	
	public Spell getSpell(int location) {
		return pages.get(location);
	}
	
	public int length() {
		return pages.size();
	}


	@Override
	public String toString() {
		String spells = "SpellBook [";
		for (int i=0;i<pages.size();i++) {
			spells += pages.get(i).toString();
		}
		return spells + "]";
	}
}
