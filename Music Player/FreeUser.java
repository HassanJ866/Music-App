public class FreeUser extends User {

	private Advertisement ads; 

	public FreeUser(String name) {
		super(name);
	}

	public Advertisement getAds() {
		return ads;
	}

	public void setAds(Advertisement ads) {
		this.ads = ads;
	}

}
