public class Palindrome
{
    public static void main(String[] args)
	{
        String[] words = {};
        Palindrome palindrome = new Palindrome();

        // Call method to find palindromes in array of words
        System.out.println("Total number of palindromes: " + palindrome.findPalindromeWords(words));
    }

    // Function to find palindromes in an array of words
    public int findPalindromeWords(String[] words)
	{
		int count=0;
		for(String word:words)
		{
			StringBuilder sb=new StringBuilder(word);  
    		sb.reverse();  
    		String rev=sb.toString();  
    		if(word.equals(rev))
				count++; 
		}
		return count;
    }
}