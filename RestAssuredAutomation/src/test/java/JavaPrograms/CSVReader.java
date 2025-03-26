package JavaPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CSVReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader read=new FileReader("file.csv");
		Scanner sc=new Scanner(read);
		
		sc.useDelimiter(",");
		while(sc.hasNext())
		{
			System.out.print(sc.next()+"\t");
		}

	}

}
