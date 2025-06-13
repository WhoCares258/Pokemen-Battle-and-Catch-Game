package game;

import java.util.Random;

public class Catch {
    private final Random random = new Random();

    public boolean CatchPhase(Pokemon pokemon, String pokeball) {
        String rarity = pokemon.getRarity();
        double chance = 0.0;
        boolean caught = false;

        // Determine chance based on rarity and pokeball
        switch (rarity.toUpperCase()) {
            case "COMMON":
                chance = commonChance(pokeball);
                break;
            case "UNCOMMON":
                chance = uncommonChance(pokeball);
                break;
            case "RARE":
                chance = rareChance(pokeball);
                break;
            case "VERY RARE":
                chance = veryRareChance(pokeball);
                break;
            case "LEGENDARY":
                chance = legendaryChance(pokeball);
                break;
            default:
                System.out.println("Unknown rarity: " + rarity);
                return false;
        }

        // Generate a random number and compare with chance
        double number = random.nextDouble();
        if (number < chance) {
            System.out.println("\n\n" + pokeball + " has successfully caught " + pokemon.getSpecies());
            caught = true;
        } else {
            System.out.println("\n\n" + pokeball + " has failed to catch " + pokemon.getSpecies());
            caught = false;
        }
        return caught;
    }

    private double commonChance(String pokeball) {
        switch (pokeball.toUpperCase()) {
            case "POKEBALL":
                return 0.5;
            case "GREATBALL":
                return 0.6;
            case "ULTRABALL":
                return 0.8;
            case "MASTERBALL":
                return 1.0;
            default:
                return 0.0;
        }
    }

    private double uncommonChance(String pokeball) {
        switch (pokeball.toUpperCase()) {
            case "POKEBALL":
                return 0.4;
            case "GREATBALL":
                return 0.5;
            case "ULTRABALL":
                return 0.7;
            case "MASTERBALL":
                return 1.0;
            default:
                return 0.0;
        }
    }

    private double rareChance(String pokeball) {
        switch (pokeball.toUpperCase()) {
            case "POKEBALL":
                return 0.3;
            case "GREATBALL":
                return 0.5;
            case "ULTRABALL":
                return 0.7;
            case "MASTERBALL":
                return 1.0;
            default:
                return 0.0;
        }
    }

    private double veryRareChance(String pokeball) {
        switch (pokeball.toUpperCase()) {
            case "POKEBALL":
                return 0.2;
            case "GREATBALL":
                return 0.4;
            case "ULTRABALL":
                return 0.6;
            case "MASTERBALL":
                return 1.0;
            default:
                return 0.0;
        }
    }

    private double legendaryChance(String pokeball) {
        switch (pokeball.toUpperCase()) {
            case "POKEBALL":
                return 0.0;
            case "GREATBALL":
                return 0.0;
            case "ULTRABALL":
                return 0.3;
            case "MASTERBALL":
                return 0.5;
            default:
                return 0.0;
        }
    }
}
