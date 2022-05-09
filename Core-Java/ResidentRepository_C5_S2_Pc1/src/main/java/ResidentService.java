import java.util.*;

public class ResidentService
{

    private static List<Resident> residentsRepository = new ArrayList<Resident>();

    public ResidentService()
	{

    }

    /**
     * create list of all the residents.
     */
    public boolean addResident(Resident resident)
	{
		if(residentsRepository.add(resident))
			return true;
        return false;
    }

   //Search for people with their social security number.

    public Resident searchResident(int socialSecurityNumber)
	{
		for(Resident r:residentsRepository)
		{
			if(r.getSocialSecurityNumber()==socialSecurityNumber)
				return r;
		}
       	return null;
    }

   // Sort the name of the residents in alphabetical order.

    public List getAllNamesSorted(List residentsRepository)
	{
		Collections.sort(residentsRepository,new LexicographicComparator());
        return residentsRepository;
    }

   // Fetch the list of residents based on their gender.
    public List<Resident> getAllResidentsByGender(char gender)
	{
		List<Resident> list=new ArrayList<Resident>();
		for(Resident r:residentsRepository)
		{
			if(r.getGender()==gender)
				list.add(r);
		}
       	return list;
    }
	class LexicographicComparator implements Comparator<Resident>
	{
		public int compare(Resident a, Resident b)
		{
        	return a.getFullName().compareToIgnoreCase(b.getFullName());
		}
	}
}
