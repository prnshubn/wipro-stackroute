public class ArrayPairSum
{
    public static void main(String[] args)
	{
        //Declare and initialize integer array in the variable numberArray
        int[] numberArray=null;
        ArrayPairSum arrayPairSum = new ArrayPairSum();
        int sumArray[] = arrayPairSum.sumOfArrayPair(numberArray);
        //write forEach loop to iterate through the 'sumArray' to print the output
    }

    public int[] sumOfArrayPair(int numberArray[])
	{
		int n=numberArray.length;
        if(n%2==0)
		{
			int j=0;
			int[] res1=new int[n/2];
			for(int i=0;i<n;i=i+2)
				res1[j++]=numberArray[i];
			j=0;
			for(int i=1;i<n;i=i+2)
				res1[j++]+=numberArray[i];
			return res1;
		}
		else
		{
			int k=0;
			int[] res2=new int[n/2+1];
			for(int i=0;i<=n-1;i=i+2)
				res2[k++]=numberArray[i];
			k=0;
			for(int i=1;i<=n-2;i=i+2)
				res2[k++]+=numberArray[i];
			res2[n/2]=numberArray[n-1];
			return res2;
		}
    }
}