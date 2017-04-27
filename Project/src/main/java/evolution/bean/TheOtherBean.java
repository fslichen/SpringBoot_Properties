package evolution.bean;

public class TheOtherBean {
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "TheOtherBean [salary=" + salary + "]";
	}
}
