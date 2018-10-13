
public class ClassOne {
	
	public String greet(String name){
		return "Hello " + name;
	}
	
	/**
	 * This is the main method. It runs with command "Java ClassOne".
	 * @param bbb the name of the person to greet
	 */
	public static void main(String[] bbb) {
		int[] a = new int[]{10, 20, 30, 40};
		
		//TODO: make this loop smaller
		for (int i = 0 ; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Hello");
	}
}
