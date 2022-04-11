public class UniqueArrays
{
    public static void main(String[] aa)
	{
        //declare and initialize integer Array in numberArray Variable
        int [] numberArray = null;
        UniqueArrays uniqueArrayDemo = new UniqueArrays();
        boolean result = uniqueArrayDemo.getUniqueArrayElement(numberArray);
        System.out.println(result);
    }

    public boolean getUniqueArrayElement(int numberArray[])
	{
		int n=numberArray.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    continue;
                else
                {
                    if(numberArray[i]==numberArray[j])
                        return false;
                }
            }
        }
        return true;
    }
}