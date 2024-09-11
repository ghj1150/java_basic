package lesson11_exception;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionEx08 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("1.txt");
			byte[] bs = { 'A', 'B', 'C', 'D', 'E' , 234-256, 176-256, 128-256};
			fos.write(bs);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
