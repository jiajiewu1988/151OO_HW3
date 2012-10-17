package ex5_12;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class DecoratorTester {
	public static void main(String args[]) throws IOException {
		char[] charArray = {'J', 'I', 'A', 'J', 'I', 'E', ' ', 'W', 'U'};
		System.out.print("The original Char Array is: ");
		System.out.println(charArray);
		CharArrayWriter charWriter = new CharArrayWriter();
		EncryptingWriter writer = new EncryptingWriter(charWriter);
		
		System.out.print("Encrypted Array is: ");
		writer.write(charArray);
		System.out.println(charWriter.toCharArray());
		
		CharArrayReader charReader = new CharArrayReader(charWriter.toCharArray());
		DecryptingReader reader = new DecryptingReader(charReader);
		char[] result = new char[9];
		reader.read(result);
		System.out.print("The Decrypted Array is: ");
		System.out.println(result);
		
		writer.flush();
		writer.close();
		reader.close();
	}
}
