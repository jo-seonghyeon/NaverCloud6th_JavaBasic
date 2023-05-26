package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _11721 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			bw.write(str.charAt(i));
			if(i % 10 == 9) {
				bw.write("\n");
			}
		}
        
		br.close();
		bw.flush();
		bw.close();
		
	}
}
