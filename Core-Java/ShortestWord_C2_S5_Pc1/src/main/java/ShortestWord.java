public class ShortestWord
{
    public static void main(String[] args)
    {
        // Input number of words in array using scanner
        int numberOfWords = 0;

        // Input array of words to be compared using scanner
        String[] words = new String[]{};

        ShortestWord shortestWord = new ShortestWord();
        // Call the method and display shortest word in array of words
        System.out.println("Shortest word is " + shortestWord.findShortestWord(words));
    }

    // Function to find shortest word in array of words
    public String findShortestWord(String[] words)
	{
        int n=words.length;
		if(n==0)
			return "Cannot find shortest word as array is empty";
		int[] size=new int[n];
		for(int i=0;i<n;i++)
			size[i]=words[i].length();
		int idx=0;
		int shortest=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(size[i]<shortest)
			{
				shortest=size[i];
				idx=i;
			}
		}
		return words[idx];
    }
}