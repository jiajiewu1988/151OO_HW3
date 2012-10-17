package ex5_12;

import java.io.*;

public class DecryptingReader extends Reader {
	
	private Reader reader;
	
	public DecryptingReader(Reader r) {
		reader = r;
	}
	
	@Override
	public void close() throws IOException {
		reader.close();
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return reader.read(cbuf, off, len);
	}
	
	@Override
	public int read(char[] cbuf) throws IOException {
		int count = 0;
		int ch = 0;
		while (ch != -1 && count < cbuf.length) {
			ch = reader.read();
			if (ch >= (int) 'A' && ch <= (int) 'Z') {
				ch = (ch - (int) 'A' - 3) % 26 + (int) 'A';
			}
			cbuf[count++] = (char) ch;
		}
		
		if (count != cbuf.length) count = -1;
		
		return count;
	}

}
