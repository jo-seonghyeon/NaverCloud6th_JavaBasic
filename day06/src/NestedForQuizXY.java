
public class NestedForQuizXY {

	public static void main(String[] args) {
		// 4x + 5y = 60
		for(int i = 1; i<15; i++) {
			for(int j = 1; j<12; j++) {
				int x = i;
				int y = j;
				if((4*x)+(5*y)==60)
					System.out.println(x+", "+ y);
			}
		}

	}

}
