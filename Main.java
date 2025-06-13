package game;

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	Random random = new Random();
    	
        Region kanto = new Region("Kanto");
        Region johto = new Region("Johto");
        Region hoenn = new Region("Hoenn");
        Region sinnoh = new Region("Sinnoh");
        Region unova = new Region("Unova");
        
        ScoreManager scoreManager = new ScoreManager();
        
        System.out.print("Welcome to Pokemon Battle and Catch game");
        System.out.print("\nFirst of all. What is your name? ");
        String name = scanner.nextLine();
        
        Player player = new Player(name, scoreManager);
        Attack attack = new Attack();
        
        boolean end = false;
        int battleNum = 0;
        
        while (end == false) {
        
	        System.out.print("\nHi " + name + ". We have 5 regions: " + Region.getRegions() + ".\nPlease select one of the regions: ");     
	        boolean validChoice = false;
	        String region = "";
	        String choice = "";
	
	        while (!validChoice) {  
	            region = scanner.nextLine();
	
	            switch (region.toLowerCase().trim()) {
	                case "kanto":
	                	 kanto.addPokemon(new Pokemon("Pidgey", "flying", null, 60, 15, "gust", 30, 2));
	                     kanto.addPokemon(new Pokemon("Rattata", "normal", null, 55, 12, "tackle", 30, 2));
	                     kanto.addPokemon(new Pokemon("Nidoran", "poison", null, 70, 20, "poison sting", 32, 3));
	                     kanto.addPokemon(new Pokemon("Machop", "fighting", null, 75, 22, "karate chop", 33, 3));
	                     kanto.addPokemon(new Pokemon("Growlithe", "fire", null, 80, 25, "flame wheel", 35, 4));
	                     kanto.addPokemon(new Pokemon("Haunter", "ghost", null, 85, 27, "shadow punch", 38, 4));
	                     kanto.addPokemon(new Pokemon("Dragonair", "dragon", null, 90, 30, "dragon tail", 45, 5));
	                     kanto.addPokemon(new Pokemon("Tyranitar", "rock", "dark", 95, 32, "crunch", 48, 5));
	                     kanto.addPokemon(new Pokemon("Mewtwo", "psychic", null, 120, 50, "psystrike", 60, 6));
	                     
	                     kanto.addPokemon(new WildPokemon("Caterpie", "bug", null, 50, 10, "string shot", 30, 2, "common"));
	                     kanto.addPokemon(new WildPokemon("Weedle", "bug", "poison", 55, 12, "poison sting", 35, 2, "common"));
	                     kanto.addPokemon(new WildPokemon("Geodude", "rock", "ground", 70, 20, "rock throw", 40, 3, "uncommon"));
	                     kanto.addPokemon(new WildPokemon("Ekans", "poison", null, 75, 22, "bite", 28, 4, "uncommon"));
	                     kanto.addPokemon(new WildPokemon("Jynx", "ice", "psychic", 80, 25, "ice punch", 45, 4, "rare"));
	                     kanto.addPokemon(new WildPokemon("Gengar", "ghost", "poison", 85, 27, "shadow ball", 45, 4, "rare"));
	                     kanto.addPokemon(new WildPokemon("Gyarados", "water", "flying", 90, 30, "hydro pump", 45, 5, "very rare"));
	                     kanto.addPokemon(new WildPokemon("Metagross", "steel", "psychic", 95, 32, "meteor mash", 48, 5, "very rare"));
	                     kanto.addPokemon(new WildPokemon("Rayquaza", "dragon", "flying", 120, 40, "dragon ascent", 60, 6, "legendary"));
	                     kanto.addPokemon(new WildPokemon("Articuno", "ice", "flying", 90, 75, "blizzard", 60, 8, "legendary"));
	                    validChoice = true;
	                    break;
	                case "johto":
	                	johto.addPokemon(new Pokemon("Sentret", "normal", null, 60, 15, "scratch", 30, 2));
	                	johto.addPokemon(new Pokemon("Hoothoot", "flying", null, 65, 18, "peck", 30, 2));
	                	johto.addPokemon(new Pokemon("Mareep", "electric", null, 70, 20, "thundershock", 32, 3));
	                	johto.addPokemon(new Pokemon("Spinarak", "bug", "poison", 75, 22, "poison sting", 33, 3));
	                	johto.addPokemon(new Pokemon("Quilava", "fire", null, 80, 25, "flame wheel", 35, 4));
	                	johto.addPokemon(new Pokemon("Misdreavus", "ghost", null, 85, 27, "shadow ball", 38, 4));
	                	johto.addPokemon(new Pokemon("Donphan", "ground", null, 90, 30, "earthquake", 45, 5));
	                	johto.addPokemon(new Pokemon("Scizor", "bug", "steel", 95, 32, "iron head", 48, 5));
	                	johto.addPokemon(new Pokemon("Lugia", "psychic", "flying", 120, 40, "aeroblast", 60, 6));
	
	                	johto.addPokemon(new WildPokemon("Ledyba", "bug", "flying", 50, 10, "tackle", 25, 2, "common"));
	                	johto.addPokemon(new WildPokemon("Hoppip", "grass", "flying", 55, 12, "splash", 30, 2, "common"));
	                	johto.addPokemon(new WildPokemon("Teddiursa", "normal", null, 70, 20, "lick", 30, 3, "uncommon"));
	                	johto.addPokemon(new WildPokemon("Slugma", "fire", null, 75, 22, "ember", 35, 3, "uncommon"));
	                	johto.addPokemon(new WildPokemon("Skarmory", "steel", "flying", 80, 25, "steel wing", 40, 4, "rare"));
	                	johto.addPokemon(new WildPokemon("Mantine", "water", "flying", 85, 27, "water pulse", 40, 4, "rare"));
	                	johto.addPokemon(new WildPokemon("Heracross", "bug", "fighting", 90, 30, "megahorn", 45, 5, "very rare"));
	                	johto.addPokemon(new WildPokemon("Tyranitar", "rock", "dark", 95, 32, "crunch", 48, 5, "very rare"));
	                	johto.addPokemon(new WildPokemon("Ho-Oh", "fire", "flying", 120, 40, "sacred fire", 60, 6, "legendary"));
	                	johto.addPokemon(new WildPokemon("Lugia", "psychic", "flying", 106, 80, "aeroblast", 60, 8, "legendary"));
	                    validChoice = true;
	                    break;
	                case "hoenn":
	                	hoenn.addPokemon(new Pokemon("Zigzagoon", "normal", null, 60, 15, "tackle", 30, 2));
	                	hoenn.addPokemon(new Pokemon("Wurmple", "bug", null, 65, 18, "poison sting", 30, 2));
	                	hoenn.addPokemon(new Pokemon("Electrike", "electric", null, 70, 20, "spark", 35, 3));
	                	hoenn.addPokemon(new Pokemon("Lotad", "water", "grass", 75, 22, "absorb", 35, 3));
	                	hoenn.addPokemon(new Pokemon("Combusken", "fire", "fighting", 80, 25, "double kick", 40, 4));
	                	hoenn.addPokemon(new Pokemon("Shuppet", "ghost", null, 85, 27, "shadow sneak", 40, 4));
	                	hoenn.addPokemon(new Pokemon("Aggron", "steel", "rock", 90, 30, "iron tail", 45, 5));
	                	hoenn.addPokemon(new Pokemon("Flygon", "ground", "dragon", 95, 32, "dragon claw", 48, 5));
	                	hoenn.addPokemon(new Pokemon("Rayquaza", "dragon", "flying", 120, 40, "dragon ascent", 60, 6));
	
	                	hoenn.addPokemon(new WildPokemon("Seedot", "grass", null, 50, 10, "bide", 15, 2, "common"));
	                	hoenn.addPokemon(new WildPokemon("Ralts", "psychic", "fairy", 55, 12, "confusion", 18, 2, "common"));
	                	hoenn.addPokemon(new WildPokemon("Numel", "fire", "ground", 70, 20, "ember", 25, 3, "uncommon"));
	                	hoenn.addPokemon(new WildPokemon("Carvanha", "water", "dark", 75, 22, "bite", 30, 3, "uncommon"));
	                	hoenn.addPokemon(new WildPokemon("Absol", "dark", null, 80, 25, "night slash", 40, 4, "rare"));
	                	hoenn.addPokemon(new WildPokemon("Milotic", "water", null, 85, 27, "aqua tail", 40, 4, "rare"));
	                	hoenn.addPokemon(new WildPokemon("Salamence", "dragon", "flying", 90, 30, "dragon claw", 45, 5, "very rare"));
	                	hoenn.addPokemon(new WildPokemon("Metagross", "steel", "psychic", 95, 32, "meteor mash", 48, 5, "very rare"));
	                	hoenn.addPokemon(new WildPokemon("Kyogre", "water", null, 120, 40, "hydro pump", 60, 6, "legendary"));
	                	hoenn.addPokemon(new WildPokemon("Rayquaza", "dragon", "flying", 105, 80, "dragonAscent", 60, 8, "legendary"));
	                    validChoice = true;
	                    break;
	                case "sinnoh":
	                	sinnoh.addPokemon(new Pokemon("Bidoof", "normal", null, 60, 15, "tackle", 30, 2));
	                	sinnoh.addPokemon(new Pokemon("Starly", "flying", null, 65, 18, "wing attack", 30, 2));
	                	sinnoh.addPokemon(new Pokemon("Shinx", "electric", null, 70, 20, "spark", 35, 3));
	                	sinnoh.addPokemon(new Pokemon("Budew", "grass", "poison", 75, 22, "absorb", 35, 3));
	                	sinnoh.addPokemon(new Pokemon("Monferno", "fire", "fighting", 80, 25, "flame wheel", 40, 4));
	                	sinnoh.addPokemon(new Pokemon("Drifloon", "ghost", "flying", 85, 27, "hex", 40, 4));
	                	sinnoh.addPokemon(new Pokemon("Gabite", "dragon", "ground", 90, 30, "dragon claw", 45, 5));
	                	sinnoh.addPokemon(new Pokemon("Lucario", "fighting", "steel", 95, 32, "aura sphere", 48, 5));
	                	sinnoh.addPokemon(new Pokemon("Giratina", "ghost", "dragon", 120, 40, "shadow force", 60, 6));
	
	                	sinnoh.addPokemon(new WildPokemon("Buneary", "normal", null, 50, 10, "pound", 30, 2, "common"));
	                	sinnoh.addPokemon(new WildPokemon("Combee", "bug", "flying", 55, 12, "gust", 30, 2, "common"));
	                	sinnoh.addPokemon(new WildPokemon("Cranidos", "rock", null, 70, 20, "headbutt", 35, 3, "uncommon"));
	                	sinnoh.addPokemon(new WildPokemon("Shieldon", "rock", "steel", 75, 22, "tackle", 35, 3, "uncommon"));
	                	sinnoh.addPokemon(new WildPokemon("Froslass", "ice", "ghost", 80, 25, "ice beam", 40, 4, "rare"));
	                	sinnoh.addPokemon(new WildPokemon("Spiritomb", "ghost", "dark", 85, 27, "dark pulse", 40, 4, "rare"));
	                	sinnoh.addPokemon(new WildPokemon("Garchomp", "dragon", "ground", 90, 30, "dragon rush", 45, 5, "very rare"));
	                	sinnoh.addPokemon(new WildPokemon("Magnezone", "electric", "steel", 95, 32, "flash cannon", 48, 5, "very rare"));
	                	sinnoh.addPokemon(new WildPokemon("Dialga", "steel", "dragon", 120, 40, "roar of time", 60, 6, "legendary"));
	                	sinnoh.addPokemon(new WildPokemon("Giratina", "ghost", "dragon", 150, 80, "shadowForce", 60, 8, "legendary"));
	                    validChoice = true;
	                    break;
	                case "unova":
	                	unova.addPokemon(new Pokemon("Patrat", "normal", null, 60, 15, "tackle", 30, 2));
	                	unova.addPokemon(new Pokemon("Pidove", "flying", null, 65, 18, "gust", 30, 2));
	                	unova.addPokemon(new Pokemon("Blitzle", "electric", null, 70, 20, "spark", 35, 3));
	                	unova.addPokemon(new Pokemon("Sewaddle", "bug", "grass", 75, 22, "razor leaf", 35, 3));
	                	unova.addPokemon(new Pokemon("Pignite", "fire", "fighting", 80, 25, "flame charge", 38, 4));
	                	unova.addPokemon(new Pokemon("Yamask", "ghost", null, 85, 27, "shadow ball", 38, 4));
	                	unova.addPokemon(new Pokemon("Excadrill", "ground", "steel", 90, 30, "drill run", 45, 5));
	                	unova.addPokemon(new Pokemon("Haxorus", "dragon", null, 95, 32, "dragon claw", 48, 5));
	                	unova.addPokemon(new Pokemon("Zekrom", "dragon", "electric", 120, 40, "fusion bolt", 60, 6));
	
	                	unova.addPokemon(new WildPokemon("Lillipup", "normal", null, 50, 10, "bite", 30, 2, "common"));
	                	unova.addPokemon(new WildPokemon("Purrloin", "dark", null, 55, 12, "scratch", 30, 2, "common"));
	                	unova.addPokemon(new WildPokemon("Roggenrola", "rock", null, 70, 20, "rock blast", 35, 3, "uncommon"));
	                	unova.addPokemon(new WildPokemon("Tympole", "water", null, 75, 22, "bubble", 35, 3, "uncommon"));
	                	unova.addPokemon(new WildPokemon("Zoroark", "dark", null, 80, 25, "night slash", 38, 4, "rare"));
	                	unova.addPokemon(new WildPokemon("Galvantula", "bug", "electric", 85, 27, "electroweb", 40, 4, "rare"));
	                	unova.addPokemon(new WildPokemon("Krookodile", "ground", "dark", 90, 30, "earthquake", 45, 5, "very rare"));
	                	unova.addPokemon(new WildPokemon("Chandelure", "ghost", "fire", 95, 32, "flamethrower", 48, 5, "very rare"));
	                	unova.addPokemon(new WildPokemon("Reshiram", "dragon", "fire", 120, 40, "blue flare", 60, 6, "legendary"));
	                	unova.addPokemon(new WildPokemon("Reshiram", "dragon", "fire", 100, 80, "blueFlare", 60, 8, "legendary")); 
	                    validChoice = true;
	                    break;
	                default:
	                    System.out.print(choice + " does not exist. Please try again.\n");
	                    System.out.print("The 5 region options are: Kanto, Johto, Hoenn, Sinnoh, Unova\n");
	                    System.out.print("Please select one of them only");
	                    break;
	            }
	        }
	        System.out.print("\nLet's begin your journey in " + region.toLowerCase().trim());
	        
	        if (battleNum <= 5) {
		        System.out.println("\n" + region.toLowerCase().trim() + " has 9 starter pokemons you may choose from.");
		        System.out.print("\nHowever you may only select 1 pokemon from the 3 pokemon displayed.");
		        System.out.print("\nThis will occur 3 seperate times.");
		        System.out.print("\nYour game will begin now! \nGood luck and choose wisely :)\n");
		        
		        List<String> pokemonList = new ArrayList<>();
		        for (int i=8;i>=0;i-=3) {
		        	for (int j=0; j<3; j+=1) {
		        		int index = random.nextInt((i-j)+1);
		        		pokemonList.add(Pokemon.GetPokemonOption(index));
		        	}
		        	System.out.println("\nYour options are: " + pokemonList.get(0) + ", " + pokemonList.get(1) + " and " + pokemonList.get(2));
		        	System.out.print("What is your selection? ");
		        	String selection = scanner.nextLine();
		        	while (selection.isEmpty()) {
		        		System.out.print("\nYour input is empty. Please try again");
		        		System.out.println("\nYour options are: " + pokemonList.get(0) + ", " + pokemonList.get(1) + " and " + pokemonList.get(2));
		            	System.out.print("What is your selection? ");
		            	selection = scanner.nextLine();
		        	}
		        	while (!pokemonList.contains(selection.substring(0, 1).toUpperCase() + selection.substring(1))) {
		        		System.out.print("\n" + selection + " does not exist. Please try again");
		        		System.out.println("\nYour options are: " + pokemonList.get(0) + ", " + pokemonList.get(1) + " and " + pokemonList.get(2));
		            	System.out.print("What is your selection? ");
		            	selection = scanner.nextLine();
		        	}
		        	player.addPlayerPokemonInventory(selection.substring(0, 1).toUpperCase() + selection.substring(1));
		    		pokemonList.removeAll(pokemonList);
		        }
		        
		        System.out.print("\nCongratualtions you are now ready for Battle.");
		        System.out.print("\nThere will be 5 Rounds. See you at the top!");
		        System.out.print("\nBefore we begin! Let me tell you about our point system.");
		        System.out.print("\nEach damage to a friendly Pokemon has dealt to a WildPokemon will get you a point");
		        System.out.print("\nDestroying a WildPokemon gives you 100 point but also allows you to catch them a the end of the battle.");
		        System.out.print("\nEvery player starts with 4 Pokeballs: 1 Pokeball, 1 Greatball, 1 Ultraball and 1 Masterball.");
		        System.out.print("\nMore of that later. Time to begin the fun! Good luck!");
	        }
		        
	        String secondChoice = null;
	        double damage;
	        boolean battleFinished;
	        boolean gameOver = false;
	        
	        Pokemon wildPokemon1 = Pokemon.findPokemonBySpecies(Pokemon.GetPokemonOption(0));
			Pokemon wildPokemon2 = Pokemon.findPokemonBySpecies(Pokemon.GetPokemonOption(0));
	        Pokemon pokemon1 = Pokemon.findPokemonBySpecies(player.getPlayerPokemonInventory(0));
	        Pokemon pokemon2 = Pokemon.findPokemonBySpecies(player.getPlayerPokemonInventory(1)); 
	        Pokemon pokemon3 = Pokemon.findPokemonBySpecies(player.getPlayerPokemonInventory(2)); 
	        
	        while(gameOver == false) {
	        	
	        	battleNum += 1;
	        	battleFinished = false;
	        	
	        	if (battleNum==6 ) {
	        		System.out.print("\n\nCongratulation! You beat " + region);
	    	        System.out.print("\nYour final score is " + player.getScore());
	    	        scoreManager.displayTopScores();
	        		System.out.print("\nWould you like to continue towards the next region");
	        		System.out.print("\nEnd or Continue: ");
	        		choice = scanner.nextLine();
	        		while (!choice.equalsIgnoreCase("end") && !choice.equalsIgnoreCase("continue")) {
	        			System.out.print("\n" + choice + "does not exist");
	        			System.out.print("\nWould you like to continue towards the next region");
	            		System.out.print("\nEnd or Restart: ");
	            		choice = scanner.nextLine();
	        		}
	        		if (choice.equalsIgnoreCase("end")){
	        			end = true;
	        		}
	        		else {
	        			end = false;
	        		}
	        	}
	        	
	        	if (battleNum>=2) {
	        		wildPokemon1 = Pokemon.findPokemonBySpecies(Pokemon.GetPokemonOption(0));
	    			wildPokemon2 = Pokemon.findPokemonBySpecies(Pokemon.GetPokemonOption(0));
	    			pokemon1 = Pokemon.findPokemonBySpecies(player.getPlayerPokemonInventory(0));
	    			if (player.getPlayerPokemonInventory().size() > 1){
	    				pokemon2 = Pokemon.findPokemonBySpecies(player.getPlayerPokemonInventory(1));
	    				if (player.getPlayerPokemonInventory().size() > 2){
	    					pokemon3 = Pokemon.findPokemonBySpecies(player.getPlayerPokemonInventory(2));
	    				}
	    			}
	        	}
	        
				
				
				System.out.print("\n\nBattle " + battleNum + ":");
				System.out.print("\n\nYou are up against:\n " + wildPokemon1 + "\n" + wildPokemon2 + "\n");
				System.out.print("\nYou have:\n " + pokemon1 + "\n" + pokemon2 + " and\n " + pokemon3);
				
				System.out.print("\n\nPlease select your first Pokemon going into Battle: ");
				choice = scanner.nextLine();
				
				while (!player.getPlayerPokemonInventory().contains(choice.substring(0, 1).toUpperCase() + choice.substring(1))) {
					System.out.print(choice + " does not exist. Please try again");
					System.out.print("\nSelect your first Pokemon going into Battle: ");
					choice = scanner.nextLine();
				}
				
			    if (player.getPlayerPokemonInventory().size()>1) {
					System.out.print("Please select your second Pokemon going into Battle: ");
					secondChoice = scanner.nextLine();
					
					while ((choice.substring(0, 1).toUpperCase() + choice.substring(1)) == secondChoice.substring(0, 1).toUpperCase() + secondChoice.substring(1)) {
						System.out.print("Your second Pokemon is the same as your first one. Please try again");
						System.out.print("\nSelect your second Pokemon going into Battle: ");
						secondChoice = scanner.nextLine();
					}
					
				        while (!player.getPlayerPokemonInventory().contains(secondChoice.substring(0, 1).toUpperCase() + secondChoice.substring(1))) {
							System.out.print(secondChoice + " does not exist. Please try again");
							System.out.print("\nSelect your second Pokemon going into Battle: ");
							secondChoice = scanner.nextLine();
					    }
				}
				
				Pokemon optimizer1;
				Pokemon optimizer2;
				
		        if        (!pokemon1.getSpecies().equals(choice.substring(0, 1).toUpperCase() + choice.substring(1)) 
		        		&& !pokemon1.getSpecies().equals(secondChoice.substring(0, 1).toUpperCase() + secondChoice.substring(1))) {
		            optimizer1 = pokemon3;
		        	pokemon3 = pokemon1;
		        	pokemon1 = optimizer1;
		        } else if (!pokemon2.getSpecies().equals(choice.substring(0, 1).toUpperCase() + choice.substring(1)) 
		        		&& !pokemon2.getSpecies().equals(secondChoice.substring(0, 1).toUpperCase() + secondChoice.substring(1))) {
		            optimizer1 = pokemon3;
		        	pokemon3 = pokemon2;
		        	pokemon2 = optimizer1;
		        }
		        
				ArrayList<Pokemon> friendlyPokemons = new ArrayList<>();
				friendlyPokemons.add(pokemon1);
				friendlyPokemons.add(pokemon2);
				ArrayList<Pokemon> enemyPokemons = new ArrayList<>();
		        enemyPokemons.add(wildPokemon1);
		        enemyPokemons.add(wildPokemon2);
		        ArrayList<Pokemon> catchablePokemons = new ArrayList<>();
		        
		        if (pokemon2.getSpeed() >= pokemon1.getSpeed()) {
		        	optimizer1 = pokemon1;
		            pokemon1 = pokemon2;
		            pokemon2 = optimizer1;
		        }
		        if (wildPokemon2.getSpeed() >= wildPokemon1.getSpeed()) {
		        	optimizer2 = wildPokemon1;
		            wildPokemon1 = wildPokemon2;
		            wildPokemon2 = optimizer2;
		        }
		        
		        ArrayList<Pokemon> speedAdjustedPokemons = new ArrayList<>(); 
		        if (pokemon1.getSpeed() >= wildPokemon1.getSpeed()) {
		        	speedAdjustedPokemons.add(pokemon1);
		        	if (pokemon2.getSpeed() >= wildPokemon1.getSpeed()) {
		            	speedAdjustedPokemons.add(pokemon2);
		            	speedAdjustedPokemons.add(wildPokemon1);
		            	speedAdjustedPokemons.add(wildPokemon2);
		            }
		        	else {
		        		speedAdjustedPokemons.add(wildPokemon1);
		        		if (pokemon2.getSpeed() >= wildPokemon2.getSpeed()) {
		                	speedAdjustedPokemons.add(pokemon2);
		                	speedAdjustedPokemons.add(wildPokemon2);
		                }
		        		else {
		        			speedAdjustedPokemons.add(wildPokemon2);
		                	speedAdjustedPokemons.add(pokemon2);
		        		}
		        	}
		        }
		        else {
		        	speedAdjustedPokemons.add(wildPokemon1);
		        	if (pokemon1.getSpeed() >= wildPokemon2.getSpeed()) {
		            	speedAdjustedPokemons.add(pokemon1);
		            	if (pokemon2.getSpeed() >= wildPokemon2.getSpeed()) {
		            		speedAdjustedPokemons.add(pokemon2);
		                	speedAdjustedPokemons.add(wildPokemon2);
		            	}
		            	else {
		            		speedAdjustedPokemons.add(wildPokemon2);
		                	speedAdjustedPokemons.add(pokemon2);
		            	}
		            }
		        	else {
		        		speedAdjustedPokemons.add(wildPokemon2);
		            	speedAdjustedPokemons.add(pokemon1);
		            	speedAdjustedPokemons.add(pokemon2);
		        	}
		        }
		        
		        pokemon1.resetBattleHp();
		        if (pokemon2 != null) {
		        	pokemon2.resetBattleHp();
		        	if (pokemon3 != null) {
		        		pokemon3.resetBattleHp();
		        	}
		        }
		        
		        Pokemon wild = null;
		        Pokemon defender = null;
		        
		        while(battleFinished == false) {
			        for (int i=0; i<(speedAdjustedPokemons.size()); i+=1) {
			        	if (enemyPokemons.isEmpty()) {
			        		i += 4;
			        		battleFinished = true;
			        		break;
			        	}
			        	if (friendlyPokemons.isEmpty()){
			        		battleFinished = true;
			        		gameOver = true;
			        		end = true;
			        		i+=4;
			        		break;
			        	}
			        	Pokemon turn = speedAdjustedPokemons.get(i);
			        	if (friendlyPokemons.contains(turn)){
			        		System.out.print("\n" + turn.getSpecies() + " is attacking now.");
			        		System.out.print(" Which Wild Pokemon would you like to attack? ");
			        		String defending = scanner.nextLine();
							boolean charge = false;
			    			while (!charge==true) {
			    				for (int j=0; j<(enemyPokemons.size()); j +=1) {
			    					wild = enemyPokemons.get(j);
			        				if (wild.getSpecies().equalsIgnoreCase(defending)) {
			        					System.out.print("\n" + turn.getAttName().toUpperCase() + "!");
			        					damage = (attack.attack(turn, wild));
			        					wild.deductHp(damage);
			        					player.addScore(damage);
			        					System.out.print("\n" + turn.getSpecies() + " has inflicted " + damage + " damage to " + wild.getSpecies());
			        					System.out.print("\n" + wild.getSpecies() + " has " + wild.getBattleHp() + " hp left.\n");
			        					if (wild.getBattleHp()<=0) {
			        						speedAdjustedPokemons.remove(wild);
			        						enemyPokemons.remove(wild);
			        						catchablePokemons.add(wild);
			        						player.addScore(100);
			        						j+=2;
			        						System.out.print(wild.getSpecies() + " has died\n");
			        						if (enemyPokemons.isEmpty()) {
			        							battleFinished = true;
			        						}
			        					}
			        					charge = true;
			        				}
			        			}
			    				if (charge==false) {
			    					System.out.print(defending + " does not exist. Please try again!");
			    				
			    					System.out.print(" Which Wild Pokemon would you like to attack? ");
			    	        		defending = scanner.nextLine();
			    				}
			        		}	
			        	}
			        	else {
			        		int a = random.nextInt(2);
			        		if (friendlyPokemons.size() > 1){
			        			defender = friendlyPokemons.get(a);
			        		}
			        		else {
			        			defender = friendlyPokemons.get(0);
			        		}
			        		System.out.print("\n" + turn.getSpecies() + " is attacking " + defender.getSpecies() + " now");
			        		System.out.print("\n" + turn.getAttName().toUpperCase() + "!");
			        		damage = (attack.attack(turn, defender));
							defender.deductHp(damage);
							System.out.print("\n" + turn.getSpecies() + " has inflicted " + damage + " damage to " + defender.getSpecies());
							System.out.print("\n" + defender.getSpecies() + " has " + defender.getBattleHp() + " hp left.\n");
							if (defender.getBattleHp()<=0) {
								speedAdjustedPokemons.remove(defender);
								friendlyPokemons.remove(defender);
								player.removePlayerPokemonInventory(defender.getSpecies());
								System.out.print(defender.getSpecies() + " has died\n");
								if (!friendlyPokemons.isEmpty() && pokemon3 != null) {
									if (defender == pokemon1) {
										pokemon1 = pokemon3;
										pokemon3 = null;
										friendlyPokemons.add(pokemon1);
										speedAdjustedPokemons.add(pokemon1);
									}
									else {
										pokemon2 = pokemon3;
										pokemon3 = null;
										friendlyPokemons.add(pokemon2);
										speedAdjustedPokemons.add(pokemon2);
									}
								}
								else if(!friendlyPokemons.isEmpty() & pokemon3 == null){
									if (defender == pokemon1) {
										friendlyPokemons.remove(pokemon2);
										speedAdjustedPokemons.remove(pokemon2);
										pokemon1 = pokemon2;
										pokemon2 = null;
										friendlyPokemons.add(pokemon1);
										speedAdjustedPokemons.add(pokemon1);
									}
									else {
										pokemon2 = null;
									} 
								}
								if (friendlyPokemons.isEmpty()) {
									battleFinished = true;
									gameOver = true;
									end = true;
								}
							}
			        	}
			        }   
		        }
		        
		        boolean success;
		        
		        if (gameOver == false && (player.getPlayerPokeballInventory().size() > 0)){
		        	if (pokemon2 != null & pokemon3 != null) {
		        		System.out.print("\n\nYour Pokemon inventory is full since you still have 3 Pokemons. ");
		        	    System.out.print("\nWould you like to continue to the next Round or catch one of the WildPokemons you have beaten? [to catch enter \"catch\"]");
		        		choice = scanner.nextLine();
		        		if (choice.equalsIgnoreCase("catch")) {
			        		System.out.print("\nwhich of your current Pokemons would you like to replace? "+pokemon1.getSpecies()+" "+pokemon2.getSpecies()+" "+pokemon3.getSpecies()+":");
			    			String toReplace = scanner.nextLine();
			    			while (!pokemon1.getSpecies().equalsIgnoreCase(toReplace) &&
			    					!pokemon2.getSpecies().equalsIgnoreCase(toReplace) &&
			    					!pokemon3.getSpecies().equalsIgnoreCase(toReplace)) {
			    				System.out.print(toReplace + "does not exist in your inventory. Please try Again.");
			    				System.out.print("\nwhich of your current Pokemons would you like to replace? "+pokemon1.getSpecies()+" "+pokemon2.getSpecies()+" "+pokemon3.getSpecies()+":");
			        			toReplace = scanner.nextLine();
			    			}
			        		System.out.print("\nWhich Pokemon would you like to catch? " + wildPokemon1.getSpecies() + " or " + wildPokemon2.getSpecies());
			        		String toAdd = scanner.nextLine();
			        		while (!wildPokemon1.getSpecies().equalsIgnoreCase(toAdd) & !wildPokemon2.getSpecies().equalsIgnoreCase(toAdd)) {
			        			System.out.print("\n" + toAdd + " does not exist. Please try Again");
			        			System.out.print("\nWhich Pokemon would you like to catch? " + wildPokemon1.getSpecies() + " or " + wildPokemon2.getSpecies());
			            		toAdd = scanner.nextLine();
			        		}
		            		wild = WildPokemon.findPokemonBySpecies(toAdd);
		            		System.out.print("Which pokeball would you like to use: " + player.getPlayerPokeballInventory());
			        		choice = scanner.nextLine();
			        		if (player.getPlayerPokeballInventory().contains(choice)) {
			        			player.useAPokeball(choice.toLowerCase());
			        			Catch catch1 = new Catch();
								success = catch1.CatchPhase(wild, choice);
								if (success == true) {
									player.removePlayerPokemonInventory(toReplace.substring(0, 1).toUpperCase() + toReplace.substring(1));
									player.addPlayerPokemonInventory(toAdd.substring(0, 1).toUpperCase() + toAdd.substring(1));
									pokemon1.resetBattleHp();
							        pokemon2.resetBattleHp();
							        pokemon3.resetBattleHp();
			        			}
			        		}
			        	}
		        	}
		        	else if (pokemon2 != null & pokemon3 == null) {
		        		System.out.print("\n\nYou have 2 Pokemons"
		        				+ "\nWould you like to continue to the next Round or fill up your inventory with one of the WildPokemons you have beaten? [to catch enter \"catch\"]");
		        		choice = scanner.nextLine();
		        		if (choice.equalsIgnoreCase("catch")) {
		        			System.out.print("Which Pokemon would you like to catch? " + wildPokemon1.getSpecies() + " or " + wildPokemon2.getSpecies());
		        			String toAdd = scanner.nextLine();
		        			while (!wildPokemon1.getSpecies().equalsIgnoreCase(toAdd) & !wildPokemon2.getSpecies().equalsIgnoreCase(toAdd)) {
		        				System.out.print(toAdd + " does not exist. Please try Again");
		        				System.out.print("\nWhich Pokemon would you like to catch? " + wildPokemon1.getSpecies() + " or " + wildPokemon2.getSpecies());
		            			toAdd = scanner.nextLine();
		        			}
		        			wild = WildPokemon.findPokemonBySpecies(toAdd);
		        			System.out.print("\nWhich pokeball would you like to use: " + player.getPlayerPokeballInventory());
		        			choice = scanner.nextLine();
		        			if (player.getPlayerPokeballInventory().contains(choice)) {
		        				player.useAPokeball(choice.toLowerCase());
		        				Catch catch1 = new Catch();
								success = catch1.CatchPhase(wild, choice);
								if (success == true) {
									player.addPlayerPokemonInventory(toAdd.substring(0, 1).toUpperCase() + toAdd.substring(1));
								}
		        			}
		        		}
		        	}
		        	else if (pokemon2 == null & pokemon3 == null) {
		        		System.out.print("\n\nYou only have 1 Pokemon"
		        				+ "\nWould you like to continue to the next Round with 1 Pokemon only and take a risk "
		        				+ "\n or attempt to catch a WildPokemons you have beaten? [to catch enter \"catch\"]");
		        		choice = scanner.nextLine();
		        		if (choice.equalsIgnoreCase("catch")) {
		        			System.out.print("\nWhich Pokemon would you like to catch? " + wildPokemon1.getSpecies() + " or " + wildPokemon2.getSpecies());
		        			String toAdd = scanner.nextLine();
		        			while (!wildPokemon1.getSpecies().equalsIgnoreCase(toAdd) & !wildPokemon2.getSpecies().equalsIgnoreCase(toAdd)) {
		        				System.out.print("\n" + toAdd + " does not exist. Please try Again");
		        				System.out.print("\nWhich Pokemon would you like to catch? " + wildPokemon1.getSpecies() + " or " + wildPokemon2.getSpecies());
		            			toAdd = scanner.nextLine();
		        			}
		        			wild = WildPokemon.findPokemonBySpecies(toAdd);
		        			System.out.print("\nWhich pokeball would you like to use: " + player.getPlayerPokeballInventory());
		        			choice = scanner.nextLine();
		        			System.out.print(choice);
		        			if (player.getPlayerPokeballInventory().contains(choice)) {
		        				player.useAPokeball(choice.toLowerCase());
		        				Catch catch1 = new Catch();
								success = catch1.CatchPhase(wild, choice);
								if (success == true) {
									player.addPlayerPokemonInventory(toAdd.substring(0, 1).toUpperCase() + toAdd.substring(1));
								}
		        			}
		        		}
		        	}
		        }
	        }
	        System.out.print("\n\nGame Over");
	        System.out.print("\nYour final score is " + Math.round(player.getScore()));
	        scoreManager.displayTopScores();
        }
    	scanner.close();
    }
}
