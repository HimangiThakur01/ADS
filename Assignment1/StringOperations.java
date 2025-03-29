import java.util.*;
class StringOperations {
public static void main(String[] args)
    {
	String str1 = "listen", str2 = "silent";
	String sentence = "Practice makes a man perfect";
	
	//Check for anagram
	System.out.println("String 1 = " + str1 + " and String 2 = " + str2 + " are anagrams? " + isAnagram(str1, str2));
	
	// Find longest word
	String[] words = sentence.split(" ");
	String longest = Arrays.stream(words).max(Comparator.comparingInt(String :: length)).orElse("");
	System.out.println("Longest word: " + longest);
	
	//count vowels and consonants
	long vowels = sentence.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
	long consonants = sentence.toLowerCase().chars().filter(c -> Character.isLetter(c) && "aeiou".indexOf(c) == -1).count();
	System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
	static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
		char[] a = s1.toCharArray(), b = s2.toCharArray();
		Arrays.sort(a);Arrays.sort(b);
		return Arrays.equals(a, b);
	}
}
