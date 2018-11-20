/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author mvoctavianojr
 */
public class RegExParsingTemplateSoln {

    /**
     * Basic encryption algorithm
     *
     * @param character the character to be encrypted
     *
     * @return encrypted character
     */
    public char encrypt(char character) {
        char encryptedChar;
        if (Character.isUpperCase(character)) {
            encryptedChar = (char) (((int) character
                    + 13 - 65) % 26 + 65);
        } else {
            encryptedChar = (char) (((int) character
                    + 13 - 97) % 26 + 97);
        }

        return encryptedChar;
    }

    /**
     * Method for getting user input from user.
     *
     * @return input of user.
     */
    public String getUserInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("Get user input: ");
        String inp = input.nextLine();

        return inp;
    }

    /**
     * Pokemon dialog once upon a time.
     *
     * @return collection of string that will be used as data.
     */
    public String[] getAllDialog() {
        String[] pokemonDialog = {"pikachu: Five more days until y1ou can bring Pokémon that you’ve caught in #PokemonGO over to #PokemonLetsGo! Which Pokémon will you transfer over? http://bit.ly/2RK0ABe",
            "charmander: H1ope you don’t scare easily, Trainers—facing off against Agatha means battling her powerful Ghost-type Pokémon!",
            "bulbasaur: T3he first Pokém4on species in Nintendo and Game Freak's Pokémon franchise.",
            "psyduck: qua4ck123 quack456",
            "pidgeot: Mark your calendars for #PokemonGOCommunityDay this Saturday, Trainers.  For three hours, Cyndaquil will appear more frequently in the wild, and as a bonus, you’ll also earn double XP and Stardust for any Pokémon you catch during"};

        return pokemonDialog;
    }

    /**
     * TO-DO implement the logic here that encrypt the text.
     *
     * @param plainText the sentence that will be encrypted.
     *
     * @return encrypted sentence.
     */
    public String getEncryption(String plainText) {
        StringBuilder encrpytedString = new StringBuilder();
        for (int counter = 0; counter < plainText.length(); counter++) {
            encrpytedString.append(encrypt(plainText.charAt(counter)));
        }
        return encrpytedString.toString();
    }

    /**
     * TO-DO implement here the logic that returns the UNCLEANED line of a
     * pokemon.
     *
     * @param name the pokemon actor.
     *
     * @return the line of the pokemon.
     */
    public String getDialogLine(String name) {
        String[] temp = getAllDialog();
        for (String sentence : temp) {
            if (sentence.split(":")[0].equalsIgnoreCase(name)) {
                //trim is used to remove leading spaces.
                return sentence.split(":")[1].trim();
            }
        }
        return "Not part of the story";
    }

    /**
     * TO-DO implement here the logic that returns the CLEANED line of a
     * specific pokemon. The idea is to remove the following: links, numbers and
     * words that contains '@' and '#'
     *
     * HINT: use getDialogLine()
     *
     * @param name the pokemon actor.
     *
     * @return CLEANED line of the pokemon.
     */
    public String getCleanDialogLineOfSpecificPokemon(String name) {
        String text = getDialogLine(name);
        String[] patterns = {"([0-9])",
            "(https?:\\S+ ?)",
            "@\\S+ ?",
            "#\\S+ ?"};

        if (!"Not part of the story".equals(text)) {
            for (String pattern : patterns) {
                text = text.replaceAll(pattern, "");
            }
            return text;
        }
        return text;

    }

    /**
     * TO-DO implement here the logic that returns the number of vowels in a
     * CLEANED line of a specific pokemon.
     *
     * HINT: use getCleanDialogLineOfSpecificPokemon()
     *
     * @param name the pokemon actor.
     *
     * @return vowel count of the CLEANED line of the pokemon.
     */
    public int getVowelCountInLine(String name) {
        String cleanedLine = getCleanDialogLineOfSpecificPokemon(name);
        if (!"Not part of the story".equals(cleanedLine)) {
            //lowercase all and then, remove all not vowels.
            return cleanedLine.toLowerCase().replaceAll("[^aeiou]", "").length();
        }
        return 0;

    }

    /**
     * TO-DO implement here the logic that returns the sum of all numbers in an
     * UNCLEANED line of a specific pokemon.
     *
     * Note: "123" should be parsed as 1 + 2 + 3
     *
     * HINT: use getCleanDialogLineOfSpecificPokemon()
     *
     *
     * HINT: use getDialogLine()
     *
     * @param name the pokemon actor.
     *
     * @return the sum of numbers in the line.
     */
    public int getSumOfNumbersInLine(String name) {
        String plainText = getDialogLine(name);
        int total = 0;
        try {
            if (!"Not part of the story".equals(plainText)) {

                plainText = plainText.replaceAll("\\D", "");

                String[] arr = plainText.split("");

                for (String x : arr) {
                    total += Integer.parseInt(x);
                }
                return total;
            }
        } catch (Exception e) {
            return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        RegExParsingTemplateSoln template = new RegExParsingTemplateSoln();

        System.out.println(template.getEncryption("qua4ck123 quack456"));
        System.out.println(template.getDialogLine("psyduck"));
        System.out.println(template.getCleanDialogLineOfSpecificPokemon("psyduck"));
        System.out.println(template.getVowelCountInLine("psyduck"));
        System.out.println(template.getSumOfNumbersInLine("psyduck"));

    }
}
