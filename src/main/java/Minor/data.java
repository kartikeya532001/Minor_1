package Minor;



public class data {
	int sum(int a, int b) {
		return (a + b);
	}

	int diff(int a, int b) {
		return (a - b);
	}

	int pro(int a, int b) {
		return (a * b);
	}

	int divide(int a, int b) {
		return (a % b);
	}
	public static void main(String[] args) {
		data obj = new data();
		System.out.println("Sum: " + obj.sum(5, 3));
		System.out.println("Diff: " + obj.diff(5, 3));
		System.out.println("Diff: " + obj.pro(5, 3));
		System.out.println("Diff: " + obj.divide(5, 3));

	}

}
