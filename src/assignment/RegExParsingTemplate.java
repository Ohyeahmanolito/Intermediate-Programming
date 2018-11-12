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
public class RegExParsingTemplate {

    /**
     * Note: All method implementation should be able to handle exceptions.
     */
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
            "charmander: H1ope you don’t scare easily, Tra195iners—facing off against Agatha means battling her powerful Ghost-type Pokémon!",
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
     * Hint: Use Stringbuilder
     *
     * @return encrypted sentence.
     */
    public String getEncryption(String plainText) {
        return "";
    }

    /**
     * TO-DO implement here the logic that returns the UNCLEANED line of a
     * pokemon. The name should also be removed.
     *
     * @param name the pokemon actor.
     *
     * @return the line of the pokemon without the name.
     */
    public String getDialogLine(String name) {

        return "";
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

        return "";
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
     * @param name the pokemon actor.
     *
     * @return the sum of numbers in the line.
     */
    public int getSumOfNumbersInLine(String name) {

        return 0;
    }

    public static void main(String[] args) {
        RegExParsingTemplate template = new RegExParsingTemplate();
        String[] temp = template.getAllDialog();
//        for (String sentence : temp) {
//            System.out.println(template.getEncryption(sentence));
//        }

        //System.out.println(template.getDialogLine("batman"));
    }
}
