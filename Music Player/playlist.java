import java.security.Timestamp;

public class playlist {
	private String Id;
	private String name;
	private String title;
	private String Ownername;
	private String OwnerID;
	private String OwnerPicture;
	private String coverArt;
	private String coverArtImage;
	private int PlaylistCount;
	private int count;
	private int following;
	private String Public;
	private Timestamp addedon;
	private String nofollow;

	public playlist(String id, String name, String title, String ownername, String ownerID, String ownerPicture,
			String coverArt, String coverArtImage, int playlistCount, int count, int following, String public1,
			Timestamp addedon, String nofollow) {
		super();
		Id = id;
		this.name = name;
		this.title = title;
		Ownername = ownername;
		OwnerID = ownerID;
		OwnerPicture = ownerPicture;
		this.coverArt = coverArt;
		this.coverArtImage = coverArtImage;
		PlaylistCount = playlistCount;
		this.count = count;
		this.following = following;
		Public = public1;
		this.addedon = addedon;
		this.nofollow = nofollow;
	}

	public playlist() {
		super();
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOwnername() {
		return Ownername;
	}

	public void setOwnername(String ownername) {
		Ownername = ownername;
	}

	public String getOwnerID() {
		return OwnerID;
	}

	public void setOwnerID(String ownerID) {
		OwnerID = ownerID;
	}

	public String getOwnerPicture() {
		return OwnerPicture;
	}

	public void setOwnerPicture(String ownerPicture) {
		OwnerPicture = ownerPicture;
	}

	public String getCoverArt() {
		return coverArt;
	}

	public void setCoverArt(String coverArt) {
		this.coverArt = coverArt;
	}

	public String getCoverArtImage() {
		return coverArtImage;
	}

	public void setCoverArtImage(String coverArtImage) {
		this.coverArtImage = coverArtImage;
	}

	public int getPlaylistCount() {
		return PlaylistCount;
	}

	public void setPlaylistCount(int playlistCount) {
		PlaylistCount = playlistCount;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}

	public String getPublic() {
		return Public;
	}

	public void setPublic(String public1) {
		Public = public1;
	}

	public Timestamp getAddedon() {
		return addedon;
	}

	public void setAddedon(Timestamp addedon) {
		this.addedon = addedon;
	}

	public String getNofollow() {
		return nofollow;
	}

	public void setNofollow(String nofollow) {
		this.nofollow = nofollow;
	}

}
