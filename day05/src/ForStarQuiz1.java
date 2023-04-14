
public class ForStarQuiz1 {

//	*
//	**
//	***
//	****
//	*****
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {	// 1
			for(int j = 4; j >= 0; j--) {	// 4 3 2 1 0
				if(i>j)
					System.out.print("*");
				else {
					System.out.print("");
				}
			}
			System.out.println();					
		}
			

	}

}
