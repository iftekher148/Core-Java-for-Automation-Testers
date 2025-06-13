package Day23;

public class CheckedException {

	public static void main(String[] args) {
		System.out.println("Start code");
		System.out.println("Statement 1");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of code");
	}

}
