package game;

import java.util.ArrayList;
import java.util.List;

class Region {
    private String name;
    private List<Pokemon> pokemons;
    private static List<Region> regions = new ArrayList<>();

    public Region(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        regions.add(this);
    }

    public String getName() {
        return name;
    }
    
    public void addPokemon(Pokemon pokemon) {
    	pokemons.add(pokemon);
    }

    @Override
    public String toString() {
        return name;
    }

    public static List<Region> getRegions() {
        return regions;
    }
}