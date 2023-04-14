
public class ForStarQuiz3 {

	public static void main(String[] args) {
//		      *
//		     **
//		    ***
//		   ****
//		  *****
		
//		for(int i = 1; i <= 6; i++) { 		// i: 1 2 3 4 5 6
//			for(int j = 5; j >= 0; j--) {	// j: 5 4 3 2 1 0
//				if(i>j)
//					System.out.print("*");
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		for(int i = 1; i <= 6; i++) {
			for(int j = 5; j >= 1; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
