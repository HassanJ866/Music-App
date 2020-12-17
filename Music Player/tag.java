
public class tag {
	private String Id;
	private String name;
	private String title;
	private int radio;
	private String newtype;
	private String coverart;
	private String coverartID;
	private String language;

	public tag(String id, String name, String title, int radio, String newtype, String coverart, String coverartID,
			String language) {
		super();
		Id = id;
		this.name = name;
		this.title = title;
		this.radio = radio;
		this.newtype = newtype;
		this.coverart = coverart;
		this.coverartID = coverartID;
		this.language = language;
	}

	public tag() {
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

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public String getNewtype() {
		return newtype;
	}

	public void setNewtype(String newtype) {
		this.newtype = newtype;
	}

	public String getCoverart() {
		return coverart;
	}

	public void setCoverart(String coverart) {
		this.coverart = coverart;
	}

	public String getCoverartID() {
		return coverartID;
	}

	public void setCoverartID(String coverartID) {
		this.coverartID = coverartID;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
