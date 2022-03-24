public class StudentMarks
{

    /* adding 4 integer values.*/


    public int calculateMarks(int physics, int chemistry, int maths)
	{
        return physics+chemistry+maths;
    }

    /* adding 3 integer values.*/
    public int calculateMarks(int physics, int chemistry, int maths, int bio)
	{
        return physics+chemistry+maths+bio;
    }

    /* adding 4 double values.*/
    public double calculateMarks(double physics, double chemistry, double maths, double bio)
	{
        return physics+chemistry+maths+bio;
    }

    /* static method adding 5 float values.*/
    public static float calculateMarks(float maths, float bio, float physics, float chemistry, float lang) {
        return maths+bio+physics+chemistry+lang;
    }


    /* adding 4 float values with order changed.*/
    public float calculateMarks(float maths, float bio, float physics, float chemistry)
	{
		return maths+bio+physics+chemistry;
    }
}