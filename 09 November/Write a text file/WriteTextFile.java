package Task;

import java.io.FileOutputStream;

public class WriteTextFile {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\FileHandling\\Tasksample1.txt");
			String text = "Good evening";
			byte[] fileData = text.getBytes();
			fout.write(fileData);
			System.out.println("File has been written successfully");
			fout.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
