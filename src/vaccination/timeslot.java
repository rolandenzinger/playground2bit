package vaccination;

public class timeslot {
	private int[] slotId;
	private int[] slotStart;
	private int[] slotEnd;
	private String[] slotDate;
	private int[] slotScheduled;
	
	public timeslot (int[] slotId,int[] slotStart,int[] slotEnd,String[] slotDate, int[] slotScheduled) {
		this.slotId = slotId;
		this.slotStart = slotStart;
		this.slotEnd = slotEnd;
		this.slotDate = slotDate;
		this.slotScheduled = slotScheduled;
		
	}
	
	
	public static int addSlot() {
	return 0;
	}
	public static int deleteUnscheduledSlot() {
		
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
