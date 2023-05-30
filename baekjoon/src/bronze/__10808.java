package bronze;

import java.util.Scanner;

public class __10808 {
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] d = new int[26];
        
        for(int i =0 ; i<S.length(); i++) {
            int a = S.charAt(i)-97;	// 아스키코드 a = 97
            System.out.println(a);
            d[a]++; // 배열 해당 자리에 저장하고 배열 값을 더해준다.
        }
        
        for(int i =0 ; i<26; i++) {
            System.out.print(d[i]+" ");    
        }
        sc.close();
		
	}
	
}
