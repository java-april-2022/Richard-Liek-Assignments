package employeePackage;

public class Developer extends Employee{

	private String project;

	public Developer(String email, float pay, String project) {
		super(email, pay);
		this.setProject(project);
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public void devDetails() {
		super.empDetails();
		System.out.println("Dev's Project" + this.project);
	}
}
