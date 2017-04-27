package evolution.bean;

public class AnotherBean {
	private String birthday;

	@Override
	public String toString() {
		return "AnotherBean [birthday=" + birthday + "]";
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}	
