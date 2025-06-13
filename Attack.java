package game;

import java.util.Random;

public class Attack {
	private enum Type {
		NORMAL, FIGHTING, POISON, GROUND, FLYING, BUG, ROCK, GHOST,
		STEEL, FIRE, WATER, ELECTRIC, GRASS, ICE, PSYCHIC, DRAGON, DARK, FAIRY, NULL;
	}
	private double damage;
	private double multiply;
	Random rand = new Random();
	
	private final double[][] effectivenessChart = {
			{1, 1, 1, 1, 1, 1, 0.5, 0.1, 0.5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, //NORMAL
			{2, 1, 0.5, 1, 0.5, 0.5, 2, 0.1, 2, 1, 1, 1, 1, 2, 0.5, 1, 2, 0.5, 1}, //FIGHTING
			{1, 1, 0.5, 0.5, 1, 1, 0.5, 0.5, 0.1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1}, // POISON
			{1, 1, 2, 1, 0.1, 0.5, 2, 1, 2, 2, 1, 2, 0.5, 1, 1, 1, 1, 1, 1}, //GROUND
			{1, 2, 1, 1, 1, 2, 0.5, 1, 0.5, 1, 1, 0.5, 2, 1, 1, 1, 1, 1, 1}, //FLYING
			{1, 0.5, 0.5, 1, 0.5, 1, 1, 0.5, 0.5, 0.5, 1, 1, 2, 1, 2, 1, 2, 0.5, 1}, //BUG
			{1, 0.5, 1, 0.5, 2, 2, 1, 1, 0.5, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1}, //ROCK
			{0.1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 0.5, 1, 1}, //GHOST
			{1, 1, 1, 1, 1, 1, 2, 1, 0.5, 0.5, 0.5, 0.5, 1, 2, 1, 1, 1, 2, 1}, //STEEL
			{1, 1, 1, 1, 1, 2, 0.5, 1, 2, 0.5, 0.5, 1, 2, 2, 1, 0.5, 1, 1, 1}, //FIRE
			{1, 1, 1, 2, 1, 1, 2, 1, 1, 2, 0.5, 1, 0.5, 1, 1, 0.5, 1, 1, 1}, //WATER
			{1, 1, 1, 0.1, 2, 1, 1, 1, 1, 1, 2, 0.5, 0.5, 1, 1, 0.5, 1, 1, 1}, //ELECTRIC
			{1, 1, 0.5, 2, 0.5, 0.5, 2, 1, 0.5, 0.5, 2, 1, 0.5, 1, 1, 0.5, 1, 1, 1}, //GRASS
			{1, 1, 1, 2, 2, 1, 1, 1, 0.5, 0.5, 0.5, 1, 2, 0.5, 1, 2, 1, 1, 1}, //ICE
			{1, 2, 2, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 1, 0.5, 1, 0.1, 1, 1}, //PSYCHIC
			{1, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 1, 1, 2, 1, 0.1, 1}, //DRAGON
			{1, 0.5, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 0.5, 0.5, 1}, //DARK
			{1, 2, 0.5, 1, 1, 1, 1, 1, 0.5, 0.5, 1, 1, 1, 1, 1, 2, 2, 1, 1}, //FAIRY
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, //NULL
	};
	
	public double attack(Pokemon attacking, Pokemon defending) {
		damage = 0;
		multiply = 1;
		//Set damage to attacker's base atk
		damage = attacking.getAttack();
		
		//Capitalize Types in enemy.getType array
		String[] defendType = defending.getType();
		String[] attackType = attacking.getType();
		
		
		for (int i = 0; i < defendType.length; i++) {
			if (defendType[i] == null) {
				defendType[i] = "NULL";
			}
			defendType[i] = defendType[i].toUpperCase();
		}
		//Capitalize Attackeer's 1st type 
		attackType[0] = attackType[0].toUpperCase();
		
		Type pokemonType = Type.valueOf(attackType[0]);
		
		//Multiply Damage
		for (String types : defendType) {
			Type enemyType = Type.valueOf(types);
			multiply = multiply * effectivenessChart[pokemonType.ordinal()][enemyType.ordinal()];
		}
		
		double dmgReduction = ( 100 - defending.getDefense() );
        damage = damage * multiply * dmgReduction / 100;

        double missOrhit = rand.nextDouble();

        if (missOrhit < 0.25) {
            System.out.print("\nMISS!");
            damage = damage * 0;
        }
        else if (missOrhit >= 0.25 && missOrhit < 0.5) {
            System.out.print("\nCRITICAL HIT!");
            damage = damage * 2.5;
        }
        
        if ((multiply == 2 || multiply == 4) && missOrhit >= 0.25) {
			System.out.print("\nSUPER EFFECTIVE!");
		}
		else if ((multiply == 0.1 || multiply == 0.2) && missOrhit >= 0.25) {
			System.out.print("\nNot very effective...");
		}

        return damage * 5;

        } 


}