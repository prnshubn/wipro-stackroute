import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobileStore
{
	List<Mobile> l=new ArrayList<Mobile>();
    public MobileStore()
    {

    }

    public List<Mobile> readMobileData(String fileName)
    {
		try
		{
			File file=new File(fileName);
			Scanner reader=new Scanner(file);
			reader.nextLine();
			while(reader.hasNextLine())
			{
				String[] line=reader.nextLine().split(",");
				l.add(new Mobile(line[0],line[1],Double.parseDouble(line[2]),line[3],line[4],line[5],Integer.parseInt(line[6])));
			}
		}
		catch(FileNotFoundException e)
		{
	
		}
		finally
		{
			return l;
		}
    }

    //Find phones of a particular brand.
    public List<Mobile> findPhoneByBrand(String brandName)
    {
		List<Mobile> list1=new ArrayList<Mobile>();
		for(Mobile m:l)
		{
			if(m.getBrandName().equals(brandName))
				list1.add(m);
		}
        return list1;
    }

    //Find the phones whose cost is $500 and above.
    public List<Mobile> findPhoneCostMoreThan500$()
    {
		List<Mobile> list2=new ArrayList<Mobile>();
		for(Mobile m:l)
		{
			if(m.getCost()>500)
				list2.add(m);
		}
        return list2;
    }

    //Enlist the phones which have camera specification as 12 MP and more
    public List<Mobile> findPhonePixelMoreThan12MP()
    {
		List<Mobile> list3=new ArrayList<Mobile>();
		for(Mobile m:l)
		{
			if(m.getCameraPixels()>12)
				list3.add(m);
		}
        return list3;
    }
}