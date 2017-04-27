package evolution.bean;

public class AnyBean {
	private String zipCode;
	private String apartment;

	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	@Override
	public String toString() {
		return "AnyBean [zipCode=" + zipCode + ", apartment=" + apartment + "]";
	}
}
