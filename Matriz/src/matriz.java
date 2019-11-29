
public class matriz {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 0 || i == 7|| j == 0 || j == 5) {
					System.out.print("*");

				}
				System.out.print("\t");
			}
			System.out.print("\n");
			
		}
		

	}

}
