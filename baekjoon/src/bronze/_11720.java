package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int result = 0;
		
		for (int i = 0; i < T; i++) {
			result += str.charAt(i) - 48;
		}
		bw.write(result + "\n");
        
		br.close();
		bw.flush();
		bw.close();
	}
}
