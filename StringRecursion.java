/*
 * StringRecursion.java
 *
 * Problem 6: Recursion and strings
 * 
 * completed by: Mohamed Althehli althehli@bu.edu
 */

public class StringRecursion {
    /*
     * This method must use recursion to print every other character in the string
     * str.
     */
    public static void printEveryOther(String str) {
        if (str == null || str.equals("")) {
            System.out.println();
        } else {
            System.out.print(str.charAt(0));
            if (str.length() >= 2) {
                printEveryOther(str.substring(2, str.length()));
            } else {
                printEveryOther("");
            }

        }
    }

    /*
     * This method must use recursion to determine if the string specified by the
     * parameter str contains at least one occurrence of the character specified by
     * the parameter ch, returning true if it does and false otherwise.
     */

    public static boolean contains(String str, char ch) {
        if (str == null || str.equals("")) {
            return false;
        } else {
            return (str.charAt(0) == ch || contains(str.substring(1), ch));
        }
    }

    /*
     * use recursion to find and return the index of the last occurrence of the
     * character ch in the string str, or -1 if ch does not occur in str
     */
    public static int lastIndexOf(char ch, String str) {
        if (str == null || str.equals("")) {
            return -1;
        } else {
            if (str.charAt(str.length() - 1) == ch) {
                return str.length() - 1;
            } else {
                int rest = lastIndexOf(ch, str.substring(0, str.length() - 1));
                return rest;
            }
        }
    }

    /*
     * This method should take a string str and use recursion to return a string in
     * which any leading and/or trailing spaces in the original string are removed.
     */
    public static String trim(String str){
        if (str==null){
            return null;
        }
        else if (str.equals("")){
            return "";
        }
        else if (str.charAt(0)!=' ' && str.charAt(str.length()-1)!=' '){
            return str;
        }
        else{
            if (str.charAt(0)==' '){
              return trim(str.substring(1));  
            }
            else {
                return trim(str.substring(0,str.length()-1));
            } 
        }
    }

}