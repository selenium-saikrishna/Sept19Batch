package day8;

public class SoftQ {

	String course;
	int fee;
	public  void courseDetails(String course,int fee)
	{
		this.course=course;
		this.fee=fee;
	}
	public static void main(String[] args) {
		SoftQ s=new SoftQ();
		s.courseDetails("Selenium",5000);
		System.out.println(s.course+"---"+s.fee);

	}

}
