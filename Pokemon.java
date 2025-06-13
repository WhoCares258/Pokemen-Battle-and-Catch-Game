package game;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String species;
    private String type1;
    private String type2;
    private double hp;
    private double battleHp;
    private int attack;
    private String attName;
    private int defense;
    private int speed;
    String rarity;
    private static List<String> pokemonNames = new ArrayList<>();
    private static String result;
    private static List<Pokemon> pokemonDatabase = new ArrayList<>();

    public Pokemon(String species, String type1, String type2, double hp, int attack,String attName, int defense, int speed) {
        this.species = species;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = hp;
        battleHp = hp;
        this.attack = attack;
        this.attName = attName;
        this.defense = defense;
        this.speed = speed;
    	pokemonNames.add(species);
    	pokemonDatabase.add(this);
    }

    public Pokemon() {
    	
	}

	// Getters and setters for each attribute as needed
    public String getSpecies() {
        return species;
    }

    public String getType1() {
        return type1;
    }
    
    public String getType2() {
        return type2;
    }
    
    public String[] getType() {
        return new String[] { type1, type2 };
    }
    
    public double getHp() {
        return hp;
    }
    
    public double getBattleHp() {
    	return Math.round(battleHp * 10) / 10;
    }
    
    public void deductHp(double damage) {
    	battleHp -= damage;
    }
    
    public void resetBattleHp() {
    	battleHp = hp;
    }
    
    public int getAttack() {
        return attack;
    }
    
    public String getAttName() {
    	return attName;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }
    
    public String getRarity() {
		return rarity;
	}
    
    public static List<String> getListOfPokemon() {
        return pokemonNames;
    }
    
    public static String GetPokemonOption(int a) {
        result = pokemonNames.get(a);
        pokemonNames.remove(a);
        return result;
    }
    
    public static Pokemon findPokemonBySpecies(String species){
    	for (Pokemon pokemon : pokemonDatabase) {
    		if (pokemon.getSpecies().equalsIgnoreCase(species)) {
    			return pokemon;
    		}
    	}
    	return null;
    }
    
    @Override
    public String toString() {
        return "\nSpecies: " + species + ", " +
               "\nType: " + type1 + (type2 != null && !type2.isEmpty() ? "/" + type2 : "") + ", " +
               "\nHP: " + hp + ", " +
               "\nAttack: " + attack +
               "\nDefense: " + defense + ", " +
               "\nSpeed: " + speed;
    }
}
