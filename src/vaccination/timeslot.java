package vaccination;

import java.util.Scanner;

public class timeslot {
	private static String[][] timeslot;
	private String slotStart;
	private String slotEnd;
	private String slotDate;
	private int slotScheduled;

	public static boolean insertValues() {
		Scanner sc = new Scanner(System.in);

		try {
		
		System.out.println("Geben Sie den Start des Termins ein: ");
		String slotStart = sc.nextLine();
		
		System.out.println("Geben Sie das Ende des Termins ein: ");
		String slotEnd = sc.nextLine();
		
		System.out.println("Geben Sie das Datum des Termins ein: ");
		String slotDate = sc.nextLine();
		
		System.out.println("Geben Sie ein ob der Termin belegt ist oder nicht: ");
		int slotScheduled = Integer.parseInt(sc.nextLine());
	
		addunscheduledSlot(slotStart,slotEnd,slotDate,slotScheduled);
		addScheduledSlot(slotStart,slotEnd,slotDate,slotScheduled);
		return true;
		}
		catch(Exception ex) {
			System.out.println("Unerwarteter Fehler");
			return false;
		}
	}

	public static int addunscheduledSlot(String slotStart,String slotEnd,String slotDate,int slotScheduled) {

		if (timeslot == null) {
			timeslot = new String[1][9];
			timeslot[0][0] = slotStart + "";
			timeslot[0][1] = slotEnd + "";
			timeslot[0][2] = slotDate + "";

			return 0;
		} else {

			String[][] temp = timeslot;
			timeslot = null;
			timeslot = new String[temp.length + 1][9];
			for (int i = 0; i < temp.length; i++) {
				timeslot[i] = temp[i];
			}

			timeslot[temp.length][0] = slotStart + "";
			timeslot[temp.length][1] = slotEnd + "";
			timeslot[temp.length][2] = slotDate + "";
		
			

			return timeslot.length - 1;
		}
	}

	public static boolean deleteUnscheduledSlot(int slotId) {

		if (timeslot[slotId][3] == null) {
			if (timeslot.length > slotId && slotId >= 0) {
				if (slotId == 0) {
					if (slotId == timeslot.length - 1) {
						timeslot = null;
					} else {
						String[][] temp = timeslot;
						timeslot = null;
						timeslot = new String[temp.length - 1][9];
						for (int i = 1; i < temp.length - 1; i++) {
							timeslot[i] = temp[i];
						}
					}
				} else if (slotId == timeslot.length - 1) {
					String[][] temp = timeslot;
					timeslot = null;
					String[][] person = new String[temp.length - 1][9];
					for (int i = 0; i < temp.length - 1; i++) {
						person[i] = temp[i];
					}
				} else {
					String[][] temp = new String[slotId + 1][9];
					for (int i = 0; i < slotId; i++) {
						temp[i] = timeslot[i];
					}
					String[][] temp2 = new String[timeslot.length - 1 - slotId][9];
					for (int i = slotId + 1; i < timeslot.length; i++) {
						temp2[i - slotId - 1] = timeslot[i];
					}
					timeslot = null;
					timeslot = new String[temp.length - 1 + temp2.length][9];
					for (int i = 0; i < (temp.length); i++) {
						timeslot[i] = temp[i];
					}
					for (int i = slotId; i < timeslot.length; i++) {
						timeslot[i] = temp2[i - slotId];
					}
				}
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public static int addScheduledSlot(String slotStart,String slotEnd,String slotDate,int slotScheduled) {

			if (timeslot == null) {
				timeslot = new String[1][9];
				timeslot[0][0] = slotStart + "";
				timeslot[0][1] = slotEnd + "";
				timeslot[0][2] = slotDate + "";
				timeslot[0][3] = slotScheduled + "";
				return 0;
			} else {

				String[][] temp = timeslot;
				timeslot = null;
				timeslot = new String[temp.length + 1][9];
				for (int i = 0; i < temp.length; i++) {
					timeslot[i] = temp[i];
				}

				timeslot[temp.length][0] = slotStart + "";
				timeslot[temp.length][1] = slotEnd + "";
				timeslot[temp.length][2] = slotDate + "";
				timeslot[temp.length][3] = slotScheduled + "";
				

				return timeslot.length - 1;
			}
		}

	public static boolean deleteScheduledSlotforPerson(int slotId) {

		if (timeslot[slotId][3] != null) {
			if (timeslot.length > slotId && slotId >= 0) {
				if (slotId == 0) {
					if (slotId == timeslot.length - 1) {
						timeslot = null;
					} else {
						String[][] temp = timeslot;
						timeslot = null;
						timeslot = new String[temp.length - 1][9];
						for (int i = 1; i < temp.length - 1; i++) {
							timeslot[i] = temp[i];
						}
					}
				} else if (slotId == timeslot.length - 1) {
					String[][] temp = timeslot;
					timeslot = null;
					String[][] person = new String[temp.length - 1][9];
					for (int i = 0; i < temp.length - 1; i++) {
						person[i] = temp[i];
					}
				} else {
					String[][] temp = new String[slotId + 1][9];
					for (int i = 0; i < slotId; i++) {
						temp[i] = timeslot[i];
					}
					String[][] temp2 = new String[timeslot.length - 1 - slotId][9];
					for (int i = slotId + 1; i < timeslot.length; i++) {
						temp2[i - slotId - 1] = timeslot[i];
					}
					timeslot = null;
					timeslot = new String[temp.length - 1 + temp2.length][9];
					for (int i = 0; i < (temp.length); i++) {
						timeslot[i] = temp[i];
					}
					for (int i = slotId; i < timeslot.length; i++) {
						timeslot[i] = temp2[i - slotId];
					}
				}
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public static int getAllUnscheduledSlotsForStation(int stationId) {
		for (int i = 0; i < timeslot.length; i++) {
			if (timeslot[stationId][3] == null) {
				System.out.println(timeslot[stationId][0]);
				System.out.println(timeslot[stationId][1]);
				System.out.println(timeslot[stationId][2]);
				System.out.println(timeslot[stationId][3]);
			}
		

		return 0;
	}
		return 0;

		
	}

	// Alle UNschedules Slots
	public static int getAllUnscheduledSlotsForDate(String slotDate, int slotId) {
		for (int i = 0; i < timeslot.length; i++) {
			if (timeslot[slotId][i] == slotDate) {
					if (timeslot[slotId][3] == null) {
				System.out.println(timeslot[slotId][0]);
				System.out.println(timeslot[slotId][1]);
				System.out.println(timeslot[slotId][2]);
				System.out.println(timeslot[slotId][3]);
					}
			} else {
				return 0;
			}
		}

		return 0;
	}
}
