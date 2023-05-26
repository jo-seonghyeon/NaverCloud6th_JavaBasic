package bronze;

import java.util.Scanner;

public class _5543 {	// 상근날드

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Bg_min = 2000; // 모든 가격 2000원 이하
		int Dr_min = 2000; // 모든 가격 2000원 이하
		
		for(int i=0; i<3;i++){
			int Bgs = sc.nextInt();
			if(Bg_min > Bgs){
				Bg_min = Bgs;
			}
		}
		
		for(int i=0; i<2;i++){
			int Drs = sc.nextInt();
			if(Dr_min > Drs){
				Dr_min = Drs;
			}
		}
		
		System.out.println(Bg_min + Dr_min - 50);
		sc.close();
	}

}
