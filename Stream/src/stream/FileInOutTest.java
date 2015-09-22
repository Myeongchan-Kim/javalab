package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class FileInOutTest {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		FileWriter fw = null;
		
		OutputStreamWriter ow = null;
		
		try {
			fos = new FileOutputStream("./out.txt", true);
			ow = new OutputStreamWriter(fos);
			
			fos.write(101);
			fos.write(102);
			fos.write(103);	
			ow.write("¸Þ·Õ~");
			
			
			fw = new FileWriter("write.txt", true);
			fw.write("¾È³çÇÏ¼¼¿ä\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try{
				//fos.close();
				fw.close();
				ow.close();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		
		FileInputStream fis = null;
		FileReader fr = null;
		InputStreamReader isr = null;
		int i;
		
		try {
			fis  = new FileInputStream("out.txt");
			fr = new FileReader("write.txt");
			isr = new InputStreamReader(fis);
		
			while( (i = isr.read()) >=0 ){
				System.out.print((char)i);
			}
			
			while( (i = fr.read()) >= 0){
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try{
				isr.close();
				fr.close();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		
	}

}
