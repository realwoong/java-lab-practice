
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.ArrayList; 


public class Revese {
	
	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream
				("input.txt");
		InputStreamReader isr = new InputStreamReader (fis);
		BufferedReader br = new BufferedReader(isr);
		String data;
		ArrayList<String> inputs = new ArrayList<>(); 
		// br.close(); isr.close(); fis.close();
		
		FileOutputStream fos = new FileOutputStream
				("output.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter (osw);
		
		
		int i = 0;
		//파일 읽기 + 줄 수 카운트
		while ((data = br.readLine()) != null) {	
			i++;
			inputs.add(data);
			}
		
		// 카운트 한 줄 수로 파일 쓰기
		for(int j = i; j>0 ; j--) {
			bw.write(inputs.get(j-1));
			bw.newLine();
		}
		
		br.close();
		bw.close();
		isr.close();
		fis.close();
	}
	
}

