package Day25;

class TestDemo<T1, T2>{
	T1 id;
	T2 name;
}

public class GenericDemo2 {

	public static void main(String[] args) {
		TestDemo <Integer,String>test = new TestDemo<>(); 
		test.id=1000;
		System.out.println(test.id);
		test.name="Rocktim";
		System.out.println(test.name);

	}

}
