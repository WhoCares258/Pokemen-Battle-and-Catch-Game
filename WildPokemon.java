package game;

public class WildPokemon extends Pokemon{
	
	String rarity;
	
	WildPokemon(String species, String type1, String type2, int hp, int attack, String attName, int defense, int speed, String rarity) {
        super(species, type1, type2, hp, attack, attName, defense, speed);
        this.rarity = rarity;
    }
	
	public String getRarity() {
		return rarity;
	}
	
	@Override
    public String toString() {
        return super.toString() + "\nRarity: " + rarity;
    }
	
}
