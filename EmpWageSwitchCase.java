public class EmpWageSwitchCase
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int EMP_RATE_PER_HR=20;

 	public static void main(String[] args)
	{
	 	int empHr=0;
		int salary=0;
		int Result=(int)(Math.random()*10)%3;
		switch(Result)
		{
			case FULL_TIME:
				empHr=8;
				break;
			case PART_TIME:
				empHr=4;
				break;
			default:
				empHr=0;
		}

		salary=(empHr*EMP_RATE_PER_HR);

		System.out.println("Salary is :"+salary);

	}
}
