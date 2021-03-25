package vaccination;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWriter {

	public String writeEntry(String Key, String ID, String info1, String info2, String info3, String info4,
			String info5, String info6, String info7, String info8, String info9, String info10) {

		String data = Key + ";" + ID + ";" + info1 + ";" + info2 + ";" + info3 + ";" + info4 + ";" + info5 + ";" + info6
				+ ";" + info7 + ";" + info8 + ";" + info9 + ";" + info10 + ";";

		BufferedWriter bw;
		File file = new File("testDatei");

		try {
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(data);
			System.out.println("Data has bee saved");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public String ReadEntry(int Key, int ID, File file) {

		if (!file.exists()) {
			System.out.println("Die Datei wurde nicht gefunden.");

		}
		try {

			BufferedReader fileRead = new BufferedReader(new FileReader(file));
			String zeile = "";
			String data = null;
			while ((zeile = fileRead.readLine()) != null) {
				data += (zeile + "\n");
			}

			fileRead.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}


	public String ReadAllEntriesWithKey(String Key, String ID, String info1, String info2, String info3, String info4,
			String info5, String info6, String info7, String info8, String info9, String info10) {

		String data = Key + ";" + ID + ";" + info1 + ";" + info2 + ";" + info3 + ";" + info4 + ";" + info5 + ";" + info6
				+ ";" + info7 + ";" + info8 + ";" + info9 + ";" + info10 + ";";

		File personFile = new File(Key);
		File locationFile = new File(Key);
		File slotFile = new File(Key);
		File scheduleFile = new File (Key);

		if (Key.equalsIgnoreCase("person")) {

			BufferedWriter bw;

			try {
				bw = new BufferedWriter(new FileWriter(personFile));
				bw.write(data);
				System.out.println("Data has bee saved");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else if (Key.equalsIgnoreCase("location")) {
			BufferedWriter bw;

			try {
				bw = new BufferedWriter(new FileWriter(locationFile));
				bw.write(data);
				System.out.println("Data has bee saved");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else if (Key.equalsIgnoreCase("slot")) {
			BufferedWriter bw;

			try {
				bw = new BufferedWriter(new FileWriter(slotFile));
				bw.write(data);
				System.out.println("Data has bee saved");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else if (Key.equalsIgnoreCase("schedule")) {
			BufferedWriter bw;

			try {
				bw = new BufferedWriter(new FileWriter(scheduleFile));
				bw.write(data);
				System.out.println("Data has bee saved");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return null;
	}

	public String GetInfoFromBlock() {

		return null;
	}

}
