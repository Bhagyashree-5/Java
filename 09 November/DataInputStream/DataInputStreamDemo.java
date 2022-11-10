package Task;

import java.io.*;

public class DataInputStreamDemo {
	static void writeFileData() throws Exception {
		// This method input all datatypes using DataOutputStream
		try {
			FileOutputStream outputFile = new FileOutputStream("D:\\FileHandling\\Tasksample2.txt");  
	        DataOutputStream data = new DataOutputStream(outputFile); 
	        data.writeInt(18110701);
	        data.writeUTF("Bhagyashree");
	        data.writeBoolean(true);
	        data.writeDouble(679237.76289);
	        data.writeFloat(3547.987F);
	        data.writeLong(9136389230L);
	        data.writeByte(121);
	        data.writeShort(8764);
	        data.flush();
	        data.close();
	        outputFile.close();
	        System.out.println("Writing Process completed."); 
	        System.out.println();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	static void readFileData() throws Exception {
		FileInputStream fInput = new FileInputStream("D:\\FileHandling\\Tasksample2.txt");
		DataInputStream data = new DataInputStream(fInput);
		System.out.println("Integer data: " + data.readInt());
		System.out.println("String data: " + data.readUTF());
		System.out.println("Boolean data: " + data.readBoolean());
		System.out.println("Double data: " + data.readDouble());
		System.out.println("Float value: " + data.readFloat());
		System.out.println("Long value: " + data.readLong());
		System.out.println("Byte value: " + data.readByte());
		System.out.println("Short Value: " + data.readShort());
		fInput.close();
		data.close();
	}

	public static void main(String[] args) throws Exception {
		writeFileData();
		System.out.println("Content of file: ");
		readFileData();
	}

}


