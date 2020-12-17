import java.util.ArrayList;

public class album {
	private String Id;
	private String title;
	private String artistname;
	private String artistId;
	private String coverArt;
	private String artist;
	private String year;
	private int religious;
	private String nbrsongs;
	private String[] keywords;
	private String releasedate;
	private boolean is_podcast;
	private ArrayList<song> songs;

	public album(String id, String title, String artistname, String artistId, String coverArt, String artist,
			String year, int religious, String nbrsongs, String[] keywords, String releasedate, String is_original,
			boolean is_podcast, ArrayList<song> songs) {
		super();
		Id = id;
		this.title = title;
		this.artistname = artistname;
		this.artistId = artistId;
		this.coverArt = coverArt;
		this.artist = artist;
		this.year = year;
		this.religious = religious;
		this.nbrsongs = nbrsongs;
		this.keywords = keywords;
		this.releasedate = releasedate;
		this.is_podcast = is_podcast;
		this.songs = songs;
	}

	public album() {
		super();
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtistname() {
		return artistname;
	}

	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}

	public String getArtistId() {
		return artistId;
	}

	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}

	public String getCoverArt() {
		return coverArt;
	}

	public void setCoverArt(String coverArt) {
		this.coverArt = coverArt;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getReligious() {
		return religious;
	}

	public void setReligious(int religious) {
		this.religious = religious;
	}

	public String getNbrsongs() {
		return nbrsongs;
	}

	public void setNbrsongs(String nbrsongs) {
		this.nbrsongs = nbrsongs;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	public String getReleasedate() {
		return releasedate;
	}

	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}

	public boolean isIs_podcast() {
		return is_podcast;
	}

	public void setIs_podcast(boolean is_podcast) {
		this.is_podcast = is_podcast;
	}

	public ArrayList<song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<song> songs) {
		this.songs = songs;
	}

}
