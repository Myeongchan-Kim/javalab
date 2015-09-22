package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos =new FileOutputStream(args[1]);
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		/* if made by socket
		Socket socket = new Socket();
		
		BufferedReader  br = 
				new BufferedReader( 
						new InputStreamReader( socket.getInputStream()));
		
		*/
		
		int i;
		int len = 0;
		long psecond = System.currentTimeMillis();
		while(( i = bis.read()) >=0){
			bos.write(i);
			len++;
		}
		
		psecond = System.currentTimeMillis() - psecond;
		
		System.out.println("len = " + len + "bytes, " + psecond + " seconds" );
		bis.close();
		bos.close();
	}

}
