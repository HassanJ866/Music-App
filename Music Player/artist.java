
public class artist {
	private String Id;
	private String name;
	private String namear;

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

	public String getNamear() {
		return namear;
	}

	public void setNamear(String namear) {
		this.namear = namear;
	}

	public String getCoverArt() {
		return coverArt;
	}

	public void setCoverArt(String coverArt) {
		this.coverArt = coverArt;
	}

	private String coverArt;

	public artist(String id, String name, String namear, String coverArt) {
		super();
		Id = id;
		this.name = name;
		this.namear = namear;
		this.coverArt = coverArt;
	}

}
