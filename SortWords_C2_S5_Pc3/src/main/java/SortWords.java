public class SortWords
{
    public static void main(String[] args)
    {
        String[] words = {};

        SortWords sortWords = new SortWords();
        // Call method to sort words alphabetically
        String[] sortedWords = sortWords.sort(words);

        // Display the words after sorting alphabetically
    }

    // Function to sort words in an array in alphabetical order
    public String[] sort(String[] words)
	{
		for(int i = 0; i<words.length; i++)   
		{  
			for (int j = i+1; j<words.length; j++)   
			{
				String itemp=words[i].toLowerCase();
				String jtemp=words[j].toLowerCase();   
				if(itemp.compareTo(jtemp)>0)   
				{  
					String temp = words[i];  
					words[i] = words[j];  
					words[j] = temp;  
				}  
			}  
		}  
        return words;
    }
}