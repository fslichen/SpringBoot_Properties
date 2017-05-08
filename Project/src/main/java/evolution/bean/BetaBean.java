package evolution.bean;

public class BetaBean {
	private String eyeColor;
	private String skinColor;

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	@Override
	public String toString() {
		return "BetaBean [eyeColor=" + eyeColor + ", skinColor=" + skinColor + "]";
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
}
