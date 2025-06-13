package game;

import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;
    private int score;
    private List<String> playerPokemonInventory = new ArrayList<>();
    private List<String> playerPokeballInventory = new ArrayList<>();
    private ScoreManager scoreManager;
    

    public Player(String name, ScoreManager scoreManager) {
        this.name = name;
        this.scoreManager = scoreManager;
        playerPokeballInventory.add("pokeball");
        playerPokeballInventory.add("greatball");
        playerPokeballInventory.add("ultraball");
        playerPokeballInventory.add("masterball");
    }

    public String getName() {
        return name;
    }
    
    public int getScore() {
    	return score;
    }
    
    public void addScore(double damage) {
    	score += Math.round(damage);
    	scoreManager.addScore(name, Math.round(score));
    }
 
    public List<String> getPlayerPokemonInventory(){
    	return playerPokemonInventory;
    }
    
    public String getPlayerPokemonInventory(int index){
    	return playerPokemonInventory.get(index);
    }
    
    public void addPlayerPokemonInventory(String species){
    	playerPokemonInventory.add(species);
    }
    
    public void removePlayerPokemonInventory(String species){
    	playerPokemonInventory.remove(species);
    }
    
    public List<String> getPlayerPokeballInventory(){
    	return playerPokeballInventory;
    }
    
    public void useAPokeball(String pokeball){
    	playerPokeballInventory.remove(pokeball);
    }
}