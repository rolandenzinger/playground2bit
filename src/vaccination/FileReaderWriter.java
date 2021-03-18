package vaccination;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public String writeEntry(int Key, int ID, String info1, String info2, String info3, String info4, String info5,
			String info6, String info7, String info8, String info9, String info10) {
		
		
		String data = info1 + info2 + info3 + info4 + info5 + info6 + info7 + info8 + info9 + info10;
	
		BufferedWriter bw;
		File file = new File("testDatei");
		
		try {
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(data);
			System.out.println("Data has bee saved");
		}catch(IOException e) {
			e.printStackTrace();
		}


		return null;
	}

	public String ReadEntry(int Key, int ID) {
		
		
		return null;
	}

	public boolean DeleteEntry(int Key, int ID) {

		return false;
	}

	public String ReadAllEntriesWithKey(int Key) {

		return null;
	}

	public String GetInfoFromBlock() {

		return null;
	}

}
