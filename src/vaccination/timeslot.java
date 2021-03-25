package vaccination;

public class timeslot {
	private static String[][] timeslot;
	private int slotStart;
	private int slotEnd;
	private String slotDate;
	private boolean slotScheduled;

	public static int addSlot(int slotStart, int slotEnd, String slotDate) {

		if (timeslot == null) {
			timeslot = new String[1][10];
			timeslot[0][0] = slotStart + "";
			timeslot[0][1] = slotEnd + "";
			timeslot[0][2] = slotDate + "";
		}

		String[][] temp = timeslot;
		timeslot = null;

		timeslot = new String[temp.length + 1][10];
		for (int i = 0; i < temp.length; i++) {
			timeslot[i] = temp[i];
		}

		timeslot[temp.length][0] = slotStart + "";
		timeslot[temp.length][1] = slotEnd + "";
		timeslot[temp.length][2] = slotDate + "";

		return timeslot.length - 1;
	}

	public static boolean deleteUnscheduledSlot(int slotId) {
	
	if(timeslot[slotId][3] == null) {
		if (timeslot.length > slotId && slotId >= 0) {
			if (slotId == 0) {
				if (slotId == timeslot.length - 1) {
					timeslot = null;
				}else {
					String[][] temp = timeslot;
					timeslot = null;
					timeslot = new String[temp.length - 1][9];
					for (int i = 1; i < temp.length - 1;i ++) {
						timeslot[i] = temp[i];
					}
				}
			}else if(slotId == timeslot.length - 1) {
				String[][] temp = timeslot;
				timeslot = null;
				String[][] person = new String[temp.length - 1][9];
				for (int i = 0; i < temp.length - 1; i ++) {
					person[i] = temp[i];
				}
			}else {
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
				for(int i = 0; i < (temp.length); i++) {
					timeslot[i] = temp[i];
				}
				for(int i = slotId; i < timeslot.length; i++) {
					timeslot[i] = temp2[i - slotId];
				}
			}
			return true;
		}else {
			return false;
		}
	}
	return false;
	}

	public static int addScheduledSlotforPerson(int slotStart, int slotEnd, String slotDate, boolean slotScheduled) {
		if (timeslot == null) {
			timeslot = new String[1][10];
			timeslot[0][0] = slotStart + "";
			timeslot[0][1] = slotEnd + "";
			timeslot[0][2] = slotDate + "";
			timeslot[0][3] = slotScheduled + "";
		}

		String[][] temp = timeslot;
		timeslot = null;

		timeslot = new String[temp.length + 1][10];
		for (int i = 0; i < temp.length; i++) {
			timeslot[i] = temp[i];
		}

		timeslot[temp.length][0] = slotStart + "";
		timeslot[temp.length][1] = slotEnd + "";
		timeslot[temp.length][2] = slotDate + "";
		timeslot[temp.length][3] = slotScheduled + "";

		return timeslot.length - 1;
	}

	public static boolean deleteScheduledSlotforPerson(int slotId) {
		
		if(timeslot[slotId][3] != null) {
			if (timeslot.length > slotId && slotId >= 0) {
				if (slotId == 0) {
					if (slotId == timeslot.length - 1) {
						timeslot = null;
					}else {
						String[][] temp = timeslot;
						timeslot = null;
						timeslot = new String[temp.length - 1][9];
						for (int i = 1; i < temp.length - 1;i ++) {
							timeslot[i] = temp[i];
						}
					}
				}else if(slotId == timeslot.length - 1) {
					String[][] temp = timeslot;
					timeslot = null;
					String[][] person = new String[temp.length - 1][9];
					for (int i = 0; i < temp.length - 1; i ++) {
						person[i] = temp[i];
					}
				}else {
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
					for(int i = 0; i < (temp.length); i++) {
						timeslot[i] = temp[i];
					}
					for(int i = slotId; i < timeslot.length; i++) {
						timeslot[i] = temp2[i - slotId];
					}
				}
				return true;
			}else {
				return false;
			}
		}
		return false;
		}
	public static int getAllUnscheduledSlotsForStation(int stationId) {
		for(stationId = 0; stationId < timeslot.length; stationId++) {
			if(timeslot[stationId][3] != null) {
				System.out.println(timeslot[stationId][0]);
				System.out.println(timeslot[stationId][1]);
				System.out.println(timeslot[stationId][2]);
				System.out.println(timeslot[stationId][3]);

			}
		}
			
			return 0;
}
	

	public static int getAllUnscheduledSlotsForDate(int slotDate) {
		for(slotDate = 0; slotDate < timeslot.length; slotDate++) {
			if(timeslot[slotDate][3] != null) {
				System.out.println(timeslot[slotDate][0]);
				System.out.println(timeslot[slotDate][1]);
				System.out.println(timeslot[slotDate][2]);
				System.out.println(timeslot[slotDate][3]);

			}
		}
			
			return 0;
}
}
