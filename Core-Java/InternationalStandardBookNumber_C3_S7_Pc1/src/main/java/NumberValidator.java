public class NumberValidator
{
    //validation rules to be written
	public int validateNumber(String input)throws NumberFormatException
    {
    	if(input=="" || input.length()==0)
    		return -1;
    	int sum=0,j=10;
    	for(int i=0;i<input.length();i++)
    	{
    		String s="";
    		char c=input.charAt(i);
			if(!Character.isDigit(c))
				throw new NumberFormatException();
    		s=""+c;
    		int num=Integer.parseInt(s);
    		sum+=num*j--;
    	}
    	if(sum%11==0)
    		return 1;
    	else
    		return 0;
    }
}
