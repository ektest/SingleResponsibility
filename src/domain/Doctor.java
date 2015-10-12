package domain;

public class Doctor extends Employee {

	public Doctor(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Doctor");
	}

	// Doctors
	private void prescribeMedicine() {
		System.out.println("prescribeMedicine");
	}

	private void diagnosePatients() {
		System.out.println("diagnosePatients");
	}

	@Override
	public void performDuties() {
		prescribeMedicine();
		diagnosePatients();
	}

}
