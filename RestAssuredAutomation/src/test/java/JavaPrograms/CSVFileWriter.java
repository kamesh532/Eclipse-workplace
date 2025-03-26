package JavaPrograms;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFileWriter {

	public static void main(String[] args) throws IOException {
		String File=System.getProperty("user.dir")+"//file.csv";
		FileWriter write=new FileWriter(File);
		write.append("Name,Age,email \n");
		write.append("Kamesh,30,kamesh@gmail.com \n");
		write.append("Ramesh,29,ramesh@gmail.com \n");
		System.out.println("CSV file created "+write);
	
		write.close();
		

	}

}
