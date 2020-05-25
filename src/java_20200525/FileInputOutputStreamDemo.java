package java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {

	public FileInputOutputStreamDemo() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
			fos = new FileOutputStream("c:\\dev\\jdk.exe");
			
			int readByte = 0;
			while((readByte = fis.read()) != -1 ) {
				fos.write(readByte);
			}
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try{
				if(fis != null) fis.close();
				if(fos != null) fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
