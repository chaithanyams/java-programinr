package ms.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputfromuser_bufferreader {
	public static void main(String args[]) throws IOException {
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("string :");
		String i=br.readLine();
		System.out.println("intvalue :");
		int j=Integer.parseInt(br.readLine());
		System.out.println("string :");
		String k=br.readLine();
	
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
	}

}
