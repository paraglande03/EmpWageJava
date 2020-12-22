public class EmpWage
{
 	public static void main(String[] args)
	{
	 	int fullTime=1;
		int partTime=2;
	 	int empHr=0;
	 	int empRatePerHr=20;
		int salary=0;
		int Result=(int)(Math.random()*10)%3;
	
	
		if(Result == fullTime)
		{
			empHr=8;	
	        }
		else if(Result == partTime)
		{
			empHr=4;
		}

	 	else 
		{
			salary=0;
			System.out.println("Employee is Absent");
		}           
		salary=(empHr*empRatePerHr);
		
		System.out.println("Salary is "+salary);

	}
}
