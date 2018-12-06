package com.in28minutes.students;

public class StudentPortServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentPortService port = new StudentPortService();
		GetStudentDetailsRequest getStudentDetailsRequest = new GetStudentDetailsRequest();
		getStudentDetailsRequest.setId(1);
		GetStudentDetailsResponse studentDetailsResponse = port.getStudentPortSoap11().getStudentDetails(getStudentDetailsRequest );
		System.out.println(studentDetailsResponse.getStudentDetails().getPassportNumber());
	}

}
