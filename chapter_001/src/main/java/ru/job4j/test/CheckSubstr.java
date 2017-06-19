package ru.job4j.test;
/**
* Package for check for substacting.
*
* @author Aleks Sidorenko (mailto:alek.sidorenko1979@gmail.com)
* @version $Id$
* @since 0.1
*/
public class CheckSubstr {
	/**
	 *CheckSubstr - test exercise.
	 *@param origin - String origin.
	 *@param sub - String sub.
	 *@return - boolean.
	 */
    public boolean contains(String origin, String sub) {
        char[] originArray = origin.toCharArray();
        char[] subArray = sub.toCharArray();
        int originLength = originArray.length;
        int subLength = subArray.length;
        boolean found = false;
        if (subLength <= originLength) {
            for (int i = 0; !found && i < originLength - subLength + 1; i++) {
                int j = 0;
                while (j < subLength && originArray[i + j] == subArray[j]) {
                    j++;
				}
                found = j == subLength;
            }
        }
        return found;
    }
}