package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10039 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int[] arr = new int[5];
		int result = 0;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] < 40) {
				result += 40;
			} else {
				result += arr[i];
			}
		}

		result = result / 5;
		
		bw.write(result + "\n");
        
		br.close();
		bw.flush();
		bw.close();
	}
}
