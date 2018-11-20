/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author ITRO
 */
public class FileReadingTemplate {

    /**
     * This method prints a formatted two dimensional array.
     */
    public void printTwoDimArray(int[][] twoDimArray) {

        for (int[] row : twoDimArray) {
            for (int counter = 0; counter < row.length; counter++) {
                System.out.print(counter + " ");
            }
            System.out.println("");
        }
    }

    /**
     * TO-DO code here the logic that sum all the numbers in Test.txt.
     *
     * @param filePath Path of the file that will be read.
     *
     * @return total of all numbers in the file.
     */
    public int addNumberInFile(String filePath) {

        return 0;
    }

    /**
     * TO-DO code here the logic that total the sum of all vowel count in
     * TestTwo.txt.
     *
     * @param filePath Path of the file that will be read.
     *
     * @return total vowel counts in the file.
     */
    public int countOfAllVowels(String filePath) {

        return 0;
    }

    /**
     * TO-DO code here the logic that total the sum of all vowel count up to
     * specific line in TestTwo.txt.
     *
     * NOTE: This is an overloaded method.
     *
     * @param filePath Path of the file that will be read.
     * @param maxLine Max line of the file that will be read.
     *
     * @return total vowel counts in the file.
     */
    public int countOfAllVowels(String filePath, int maxLine) {

        return 0;
    }

    /**
     * TO-DO code here the logic that sum the result of countOfAllVowels() and
     * addNumberInFile()
     *
     *
     * @param filePathOne Path of Test.txt.
     * @param filePathTwo Path of TestTwo.txt.
     *
     * Hint: Use countOfAllVowels() and addNumberInFile()
     *
     * @return total vowel counts in the file.
     */
    public int getTotalOfTwoFiles(String filePathOne, String filePathTwo) {

        return 0;
    }

    /**
     * TO-DO code here the logic that returns a two dimensional array in
     * TextThree.txt. You only need to read the integer inside the file.
     *
     * The first line of the text is the dimension of the array, R and C. The
     * next R line is the number of rows of the array with C columns.
     *
     * @param filePathOne Path of the file that will be read.
     *
     * return two dimensional array.
     */
    public int[][] readEasyTwoDimARray(String path) {

        return new int[0][0];
    }

    /**
     * TO-DO code here the logic that prints the different two dimensional array
     * in TextFour.txt. You only need to read the integer inside the file.
     *
     * The first line of the input gives the number of test cases, T. The first
     * line of each T is the dimension of array, R and C. The next R line is the
     * number of rows of the array with C columns.
     *
     * Hint: Use printTwoDimArray()
     *
     * @param filePathOne Path of the file that will be read.
     *
     * return two dimensional array.
     */
    public void readAveTwoDimArray(String path) {

    }

    /**
     * TO-DO code here the logic that checks whether the result is correct or
     * not in a game of rock-paper-scissors in TestFive.txt.
     *
     * The first line of the input gives the number of test cases, T. Each T
     * contains three lines, A, B, and C. The first line, A defines the number
     * of players in second line, B (2 <= B <= 3). The third line, C defines the
     * result of the game.
     *
     * @param filePathOne Path of the file that will be read.
     *
     * @return The number of wrong result in the game.
     */
    public int getNumberOfWrongResults(String path) {

        return 0;
    }

    /**
     * TO-DO implement here the logic of rock-paper-scissors game.
     *
     * @param player1 The played shape of player1.
     * @param player2 The played shape of player2.
     *
     * @return The winner of the game.
     */
    public String getWinner(String player1, String player2) {

        return "";
    }

    /**
     * TO-DO implement here the logic of rock-paper-scissors game.
     *
     * @param player1 The played shape of player1.
     * @param player2 The played shape of player2.
     * @param player3 The played shape of player3.
     *
     * @return The winner of the game.
     */
    public String getWinner(String player1, String player2, String player3) {

        return "";
    }

    public static void main(String[] args) {

    }
}
