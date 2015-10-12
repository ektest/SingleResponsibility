package domain;

public class Nurse extends Employee {

	public Nurse(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse");
	}

	// Nurses
	private void checkVitalSings() {
		System.out.println("checkVitalSings");
	}

	private void drawBlood() {
		System.out.println("drawBlood");
	}

	private void cleanPatientArea() {
		System.out.println("cleanPatientArea");
	}

	@Override
	public void performDuties() {
		checkVitalSings();
		drawBlood();
		cleanPatientArea();
		
	}

}
