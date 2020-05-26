package java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		PrintStream monitor = System.out;
		monitor.println("Hello World");
		System.err.println("Hello");	// err메세지는 catch 블록에 쓰세요 일반출력은 out으로 합니당
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			fis = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\dev\\Git4.exe");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos,true);	// true => autoFlush
			
			int readByte = 0;
			while((readByte = bis.read()) != -1) {
				// ps.print(readByte_;	// buffer 기능이 없음.
				ps.write(readByte);	// buffer 기능을 갖고 있음
			}
			// flush() 안해도 됨	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(ps != null) ps.close();
			
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
				if(bis != null) bis.close();
				if(bos != null) bos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
