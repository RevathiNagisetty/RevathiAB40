package javaassignments;

public class Arrays_PrintTable_Assignment22 
{
	public static void main(String[] args) 
	{
		int[] rollno_array = new int[5];		
		rollno_array[0] = 1;
		rollno_array[1] = 2;
		rollno_array[2] = 3;
		rollno_array[3] = 4;
		rollno_array[4] = 5;
		
		String[] studentName_Array = new String[5];		
		studentName_Array[0] = "Kushal";
		studentName_Array[1] = "KushalP";
		studentName_Array[2] = "Vishal Prasad";
		studentName_Array[3] = "Monica Rawat";
		studentName_Array[4] = "Kushanga Varma";
		
		char[] gender_Array = new char[5];
		gender_Array[0] = 'M';
		gender_Array[1] = 'M';
		gender_Array[2] = 'M';
		gender_Array[3] = 'F';
		gender_Array[4] = 'M';
		
		int[] MobileNumber_Array = new int[5];
		MobileNumber_Array[0] = 968574;
		MobileNumber_Array[1] = 857412;
		MobileNumber_Array[2] = 857421;
		MobileNumber_Array[3] = 968521;
		MobileNumber_Array[4] = 967452;
		
		System.out.println("Roll no " + "StudentName " + " Gender " + " Mobile Number ");
		/*for(int i = 0; i< rollno_array.length; i++)
		{
			System.out.println( rollno_array[i] + "\t" + studentName_Array[i] + "\t\t" + gender_Array[i] + "\t" + MobileNumber_Array[i]);
			
		}*/
		System.out.println( rollno_array[0] + "\t" + studentName_Array[0] + "\t\t" + gender_Array[0] + "\t" + MobileNumber_Array[0]);
		System.out.println( rollno_array[1] + "\t" + studentName_Array[1] + "\t\t" + gender_Array[1] + "\t" + MobileNumber_Array[1]);
		System.out.println( rollno_array[2] + "\t" + studentName_Array[2] + "\t" + gender_Array[2] + "\t" + MobileNumber_Array[2]);
		System.out.println( rollno_array[3] + "\t" + studentName_Array[3] + "\t" + gender_Array[3] + "\t" + MobileNumber_Array[3]);
		System.out.println( rollno_array[4] + "\t" + studentName_Array[4] + "\t" + gender_Array[4] + "\t" + MobileNumber_Array[4]);
	}
}
