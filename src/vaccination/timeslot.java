package vaccination;

public class timeslot {
	private static String[][] timeslot;
	private int slotStart;
	private int slotEnd;
	private String slotDate;
	private boolean slotScheduled;

	public static int addSlot(int slotStart, int slotEnd, String slotDate, boolean slotScheduled) {

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

	public static int deleteUnscheduledSlot() {
		String[][] temp = timeslot;
		
		if(timeslot[temp.length][3].equalsIgnoreCase("false")) {
			timeslot[temp.length][0] = null;
			timeslot[temp.length][1] = null;
			timeslot[temp.length][2] = null;
			timeslot[temp.length][3] = null;
			
		}else {
			return 1;
		}
		return 0;
	}

	public static int addScheduledSlotforPerson() {

		return 0;
	}

	public static int deleteScheduledSlotforPerson() {

		return 0;
	}

	public static int getAllUnscheduledSlotsForStation() {

		return 0;
	}

	public static int getAllUnscheduledSlotsForDate() {

		return 0;
	}
}
