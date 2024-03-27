import java.time.*;

public class Student 
{  
	public static void main(String[] args)
	{ 
        String stud_name = "Vineeta";

		LocalDate pdt = LocalDate.of(2004,03,23);
		LocalDate tdt = LocalDate.now();
		Period diff = Period.between(pdt, tdt);
        System.out.println("Name:" +stud_name);
		System.out.println("Date of Birth : "+pdt);
		System.out.println("Age : "+diff.getYears());
		
	}
}