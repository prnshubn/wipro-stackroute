import java.io.*;
import java.util.*;

public class ReadWriteFile
{
    public static void main(String[] args)
	{
   		ReadWriteFile readWriteFile = new ReadWriteFile();
        try
		{
            readWriteFile.readDataFromFile();
        }
		catch (IOException e)
		{
            e.printStackTrace();
        }
    }
    //create object of Readers and writers
    public void readDataFromFile() throws IOException
	{
		FileInputStream fis = new FileInputStream("input.txt");
    	Scanner sc = new Scanner(fis);
		FileOutputStream fos= new FileOutputStream("output.txt");
		String sb="";
    	while(sc.hasNextLine())
		{
			sb=sb.concat(sc.nextLine());
		}
      	String[] ar=sb.split(",");
		for(int i=0;i<ar.length-1;i++)
		{
			String s=ar[i];
			s=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
			s=s+",";
			byte b[]=s.getBytes(); 
            fos.write(b);
		}
		String s=ar[ar.length-1];
		s=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
		byte b[]=s.getBytes(); 
        fos.write(b);
    }
}