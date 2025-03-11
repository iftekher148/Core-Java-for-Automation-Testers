package Day17;

public class StaticStudentMain {

	public static void main(String[] args) {
		//What happend if the main method have different class?? 
		System.out.println(StaticStudent.city); // need to specify the class name 
		StaticStudent.display1();
		
		StaticStudent st =new StaticStudent();
		System.out.println(st.roll);// need to create object
		//System.out.println(st.city); // we can access statice varible using obj

	}

}
