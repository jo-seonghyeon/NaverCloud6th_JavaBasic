package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Integer[] A = new Integer[9]; 
		int max = 0;
		int count = 0;
        
		for(int i = 0; i < 9; i++) {
			A[i] = Integer.parseInt(br.readLine());
			if(max < A[i]) {
				max = A[i];
				count = i+1;
			}
		}
		bw.write(max + "\n");
		bw.write(count + "\n");
        
		br.close();
		bw.flush();
		bw.close();
	}
}
