package Clients;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;
import domain.Doctor;
import domain.Employee;
import domain.dao.EmployeeDAO;


public class ClientModule {
	
	public static void main(String args[]) {
		
		Employee peggy = new Doctor(1, "peggy","accounting", true);
		ClientModule.hireNewEmployee(peggy);
		printEmployeeReport(peggy, FormatType.CSV);
		peggy.performDuties();
		
	}
	
	public static void hireNewEmployee(Employee employee){
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.saveEmployee(employee);		
	}
	
	public static void terminateEmployee(Employee employee){
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.removeEmployee(employee);
	}
	
	public static void printEmployeeReport(Employee employee, FormatType formatType){
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(formatter.getFormattedEmployee());
		
	}

}
