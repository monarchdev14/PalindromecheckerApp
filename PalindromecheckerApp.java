public class PalindromecheckerApp {

    public static boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters for a robust check
        String cleanS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr = cleanS.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        String testString1 = "Madam, in Eden, I'm Adam";
        String testString2 = "hello";

        System.out.println("\"" + testString1 + "\" is a palindrome: " + isPalindrome(testString1));
        System.out.println("\"" + testString2 + "\" is a palindrome: " + isPalindrome(testString2));
    }
}
