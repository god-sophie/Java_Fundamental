package java_20200527;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) 
			throws IOException {
		URL url = new URL("http://gdimg.gmarket.co.kr/1803177701/still/300");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String reference = url.getRef();
		
		System.out.println("protocol : "+protocol);
		System.out.println("host : "+host);
		System.out.println("port : "+port);
		System.out.println("path : "+path);
		System.out.println("query : "+query);
		System.out.println("reference : "+reference);
		
		/*
		InputStream in = url.openStream();//html 정보
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
		
		in.close();
		isr.close();
		br.close();
		*/
		
		InputStream in = url.openStream();//이미지 정보
		FileOutputStream fis = new FileOutputStream(
			"c:\\dev\\300.jpg");
		
		byte[] readBytes = new byte[1024*8];
		int readByteCount = 0;
		while((readByteCount = in.read(readBytes)) != -1) {
			fis.write(readBytes,0,readByteCount);
		}
		
		in.close();
		fis.close();
		
		
	}
}
