/* Convert a lowercase character to uppercase. */

public class Solution {
    /**
     * @param character: a character
     * @return: a character
     */
    public char lowercaseToUppercase(char character) {
        // write your code here
        return (char) (character - 'a'+'A');
        // return character.toUpperCase();
    }
}