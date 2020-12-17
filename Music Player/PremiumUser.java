import java.util.ArrayList;

public class PremiumUser extends User{

	private ArrayList<song> downloads;

	public PremiumUser(String name) {
		super(name);
	}

	public ArrayList<song> getDownloads() {
		return downloads;
	}

	public void setDownloads(ArrayList<song> downloads) {
		this.downloads = downloads;
	}

}
