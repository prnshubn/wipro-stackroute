

import java.text.ParseException;
import java.io.File;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
This class performs the file reading and stores the data in SalesRecord array
 */
public class SalesAnalysis {
    // This method reads a file and returns the count of lines in the file
    // omit any headers present in the file
     public int countOfSalesRecords(String fileName){

		
		 
         int recordCount = 0;
    	 	
    	 Scanner sc;
		try {
			Path file = Paths.get(fileName);

		      // read all lines of the file
		     recordCount = (int) Files.lines(file).count();
		      
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return recordCount-1;


  

    }

    // This method reads a file and adds each line of the file into the corresponding SalesRecord object
    public SalesRecord[] readRecords(String fileName,int recordCount) throws ParseException ,NumberFormatException{
        SalesRecord[] salesData =  new  SalesRecord[recordCount];
        int r=0;
     
        try {
        	   File f=new File(fileName);
			Scanner sc=new Scanner(f);
			Boolean flag=true;
			
			while(sc.hasNext())
			{
				String s[]=sc.nextLine().split(",");
				
				if(flag)
				{
					flag=false;
					continue;
				}
				
				//System.out.println(  Arrays.toString(s) );
				
	           SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yy");
				  
				 
				 
				 int c=Integer.parseInt(s[1]);
				 int pc=Integer.parseInt(s[2]);
				 
				 String pm=s[3];
				 double amt=Double.parseDouble(s[4]);
				 double tos=Double.parseDouble(s[5]);
				 
				 
				 int cis=Integer.parseInt(s[6]);
				 
				 SalesRecord sr=new SalesRecord(formatter.parse(s[0]),c,pc,pm,amt,tos,cis);
				 
				 salesData[r]=sr;
				 
				 r++;
				
			
				
				 
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
        
        
        return salesData;
     }

    public static void main(String[] args) throws ParseException {
        SalesAnalysis salesAnalysis = new SalesAnalysis();
        // read the file purchase_details.csv
        String fileName = "src/main/resources/purchase_details.csv";
        // the count of lines in the file
        int count = 0;
        //array to hold the sales records
        SalesRecord[] salesRecords = null;

       // display the records that have been read from the file
    }
}