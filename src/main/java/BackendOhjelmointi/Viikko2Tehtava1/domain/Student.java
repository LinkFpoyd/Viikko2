package BackendOhjelmointi.Viikko2Tehtava1.domain;

public class Student {
	
	private String firstName, lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "students [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
