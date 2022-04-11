public class OakBridgeSchool
{
    // This function takes as input the marks of all subjects and returns a total marks of each of the students
    public int[] calculateTotalMarks(int [] math,int science[], int[] english, int[] language,int[] social)
    {
		int n=math.length;
		int[] totalMarks=new int[n];
		for(int i=0;i<n;i++)
		{
			totalMarks[i]=math[i]+science[i]+english[i]+language[i]+social[i];
		}
        return totalMarks;
    }
    // This function takes as input the total marks of each student and return
    // the average total marks of each student
    public int[] calculateAverageTotalMarks(int[] totalMarks)
    {
		int n=totalMarks.length;
		int[] averageTotalMarks=new int[n];
        for(int i=0;i<n;i++)
		{
			averageTotalMarks[i]=totalMarks[i]/5;
		}
		return averageTotalMarks;
    }
    // This function takes as input the math marks and returns the average score by all students
    public int calculateAverageMathMarks (int[] math)
    {
		int n=math.length,sum=0;
		for(int i=0;i<n;i++)
			sum+=math[i];
		return sum/n;
    }
    // This function takes as input the science marks and returns the average score by all students
    public int calculateAverageScienceMarks (int[] science)
    {
		int n=science.length,sum=0;
		for(int i=0;i<n;i++)
			sum+=science[i];
		return sum/n;
	}
    // This function takes as input the social marks and returns the average score by all students
    public int calculateAverageSocialMarks (int[] social)
    {
        int n=social.length,sum=0;
		for(int i=0;i<n;i++)
			sum+=social[i];
		return sum/n;
    }
    // This function takes as input the language marks and returns the average score by all students
    public int calculateAverageLanguageMarks (int[] language)
    {
        int n=language.length,sum=0;
		for(int i=0;i<n;i++)
			sum+=language[i];
		return sum/n;
    }
    // This function takes as input the english marks and returns the average score by all students
    public int calculateAverageEnglishMarks (int[] english)
    {
       int n=english.length,sum=0;
		for(int i=0;i<n;i++)
			sum+=english[i];
		return sum/n;
    }
    // This function takes as input the total marks of each student and the student names
    // and returns the name os the top scorer
    public String findTopScorer(int[] totalMarks,String [] studentNames)
    {
        //return the name of  the top scorer , extract the name from the studentNames array
        int max = -1;
		for(int i:totalMarks)
		{
			if(i>max)
				max=i;
		}
		for(int i=0;i<totalMarks.length;i++)
		{
			if(max==totalMarks[i])
				return studentNames[i];
		}
		return "";
    }
    // This function takes as input all the marks in subjects and returns
    // as an array of 1 and 0 the passed and failed student status
    // 1 - pass
    // 0 - fail
    public int[] isPassed(int [] math,int science[], int[] social, int[] language,int[] english)
    {
        int n=math.length;
		int[] pass=new int[n];
		for(int i=0;i<n;i++)
		{
			if(math[i]>=35 && science[i]>=35 && social[i]>=35 && language[i]>=35 && english[i]>=35)
				pass[i]=1;
			else
				pass[i]=0;
		}
		return pass;
    }
    // This function takes as input the pass fail status array and student names
    // and returns the names of failed students who need to re appear for the exam
    public String[] listOfStudentsToReAppearForExam(int [] passFailStatus,String studentNames[])
    {
		int count=0;
		for(int i:passFailStatus)
		{
			if(i==0)
				count++;
		}
		String[] reappear=new String[count];
		for(int i=passFailStatus.length-1;i>=0 && count>=1;i--)
		{
			if(passFailStatus[i]==0)
				reappear[--count]=studentNames[i];
		}
		return reappear;
    }
    // This function takes as input the pass fail status array and student names
    // and returns the names of passed students

    public String[] listOfStudentsPassedTheExam(int [] studentIndex,String studentNames[])
    {
        int count=0;
		for(int i:studentIndex)
		{
			if(i==1)
				count++;
		}
		String[] passed=new String[count];
		for(int i=studentIndex.length-1;i>=0 && count>=1;i--)
		{
			if(studentIndex[i]==1)
				passed[--count]=studentNames[i];
		}
		return passed;
    }
    // This function takes as input the average total marks of students
    // and returns the grade accordingly

    public char[] generateGrades(int [] averageTotalMarks)
    {
		int n=averageTotalMarks.length;
        char[] grades=new char[n];
		for(int i=0;i<n;i++)
		{
			if(averageTotalMarks[i]>=90)
				grades[i]='A';
			else if(averageTotalMarks[i]>=80 && averageTotalMarks[i]<=89)
				grades[i]='B';
			else if(averageTotalMarks[i]>=70 && averageTotalMarks[i]<=79)
				grades[i]='C';
			else if(averageTotalMarks[i]>=60 && averageTotalMarks[i]<=69)
				grades[i]='D';
			else if(averageTotalMarks[i]>=50 && averageTotalMarks[i]<=59)
				grades[i]='E';
			else if(averageTotalMarks[i]<50)
				grades[i]='F';
		}
		return grades;
	}

    //This function takes the total marks of students and roll numbers and returns the roll nos
    // in sorted order of total marks from smallest score to highest score

    public int[] sortByTotalMarks(int[] totalMarks,int [] rollNos)
    {
        int n=totalMarks.length;
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<i-1;j++)
			{
				if(totalMarks[j]>totalMarks[j+1])
				{
					int temp1=totalMarks[j];
					totalMarks[j]=totalMarks[j+1];
					totalMarks[j+1]=temp1;

					int temp2=rollNos[j];
					rollNos[j]=rollNos[j+1];
					rollNos[j+1]=temp2;
				}
			}
		}
		return rollNos;
    }
}