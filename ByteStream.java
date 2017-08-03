import java.io.*;

public class ByteStream{
	public static void main(String[] args) throws IOException  {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");

			int c;
			while ((c = in.read()) != -1) {
				System.out.print(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
