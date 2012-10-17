package ex5_12;

import java.io.IOException;
import java.io.Writer;

public class EncryptingWriter extends Writer {
	Writer writer;
	
	public EncryptingWriter(Writer w) {
		writer = w;
	}
	
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		writer.close();
	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub
		writer.flush();
	}

	@Override
	public void write(char[] cbuf) throws IOException {
		for (char c : cbuf) {
			if ((int) c >= (int) 'A' && (int) c <= (int) 'Z') {
				int result = ((int) c - (int) 'A' + 3) % 26 + (int) 'A';
				writer.write(result);
			} else {
				writer.write((int) c);
			}
		}
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		writer.write(cbuf, off, len);
	}

}
