
public class ForStarQuiz3_2 {

	public static void main(String[] args) {
		//     *
		//    **
		//   ***
		//  ****
		// *****
		for(int i = 1; i <= 6; i++) { 		// i: 1 2 3 4 5 6 ("*")
			for(int j = 5; j >= 0; j--) {	// j: 5 4 3 2 1 0 (" ")
				if(i>j)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();					
		}
	}

}
