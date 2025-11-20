public class PalindromeChecker {

    public static boolean isPalindrome(String wordToBeChecked){
        char[] word = wordToBeChecked.toLowerCase().toCharArray();
        boolean result = false;

        if (compare(word, mirrorArray(word))){
            result = true;
        }
        return result;
    }

    private static boolean compare(char[] source, char[] target) {
        boolean result = false;
        for (int i = 0; i < source.length; i++) {
            if (source[i] != target[i]) {
                result = false;
                break;
            } else if (source[i] == target[i]) {
                result = true;
            }
        }
        return result;
    }

    static char[] mirrorArray(char[] charArray) {
        char[] resultArray =  new char[charArray.length];
        int lastIndex = charArray.length-1;
        for (int i = 0; i < charArray.length; i++) {
            resultArray[lastIndex--] = charArray[i];
        }
        return resultArray;
    }
}
