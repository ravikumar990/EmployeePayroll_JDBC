package com.employeepayroll;

public class EmployeePayrollService {
	EmployeeDBConnection employeePayrollDBService = new EmployeeDBConnection();

	public enum IOService {
		DB_IO
	}

	private List<EmployeePayrollData> employeePayrollList;

	public List<EmployeePayrollData> readEmployeePayrollData(IOService ioService) {
		if (ioService.equals(IOService.DB_IO)) {
			this.employeePayrollList = employeePayrollDBService.readData();
		}
		return this.employeePayrollList;
	}
}
© 2021 GitHub, Inc.