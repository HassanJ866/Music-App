
public class song {
	private String Id;
	private String title;
	private String Album;
	private String AlbumID;
	private String artist;
	private String artistId;
	private String track;
	private String year;
	private String duration;
	private String coverArt;
	private String ArtistArt;
	private String genre;
	private String AlbumArt;
	private String[] keywords;
	private int languageid;
	private String bitrates;
	private String hexcolor;
	private String size;
	private String explicit;
	private String single;
	private int is_podcast;
	private int is_original;
	private int religious;

	public song() {
		super();
	}

	public song(String id, String title, String album, String albumID, String artist, String artistId, String track,
			String year, String duration, String coverArt, String artistArt, String genre, String albumArt,
			String[] keywords, int languageid, String bitrates, String hexcolor, String size, String explicit,
			String single, int is_podcast, int is_original, int religious) {
		super();
		Id = id;
		this.title = title;
		Album = album;
		AlbumID = albumID;
		this.artist = artist;
		this.artistId = artistId;
		this.track = track;
		this.year = year;
		this.duration = duration;
		this.coverArt = coverArt;
		ArtistArt = artistArt;
		this.genre = genre;
		AlbumArt = albumArt;
		this.keywords = keywords;
		this.languageid = languageid;
		this.bitrates = bitrates;
		this.hexcolor = hexcolor;
		this.size = size;
		this.explicit = explicit;
		this.single = single;
		this.is_podcast = is_podcast;
		this.is_original = is_original;
		this.religious = religious;
	}

	public String getId() {
		return Id;
	}

	public String getTitle() {
		return title;
	}

	public String getAlbum() {
		return Album;
	}

	public String getAlbumID() {
		return AlbumID;
	}

	public String getArtist() {
		return artist;
	}

	public String getArtistId() {
		return artistId;
	}

	public String getTrack() {
		return track;
	}

	public String getYear() {
		return year;
	}

	public String getDuration() {
		return duration;
	}

	public String getCoverArt() {
		return coverArt;
	}

	public String getArtistArt() {
		return ArtistArt;
	}

	public String getGenre() {
		return genre;
	}

	public String getAlbumArt() {
		return AlbumArt;
	}

	public String[] getKeywords() {
		return keywords;
	}

	public int getLanguageid() {
		return languageid;
	}

	public String getBitrates() {
		return bitrates;
	}

	public String getHexcolor() {
		return hexcolor;
	}

	public String getSize() {
		return size;
	}

	public String getExplicit() {
		return explicit;
	}

	public String getSingle() {
		return single;
	}

	public int getIs_podcast() {
		return is_podcast;
	}

	public int getIs_original() {
		return is_original;
	}

	public int getReligious() {
		return religious;
	}

	public void setId(String id) {
		Id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAlbum(String album) {
		Album = album;
	}

	public void setAlbumID(String albumID) {
		AlbumID = albumID;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setCoverArt(String coverArt) {
		this.coverArt = coverArt;
	}

	public void setArtistArt(String artistArt) {
		ArtistArt = artistArt;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setAlbumArt(String albumArt) {
		AlbumArt = albumArt;
	}

	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}

	public void setLanguageid(int languageid) {
		this.languageid = languageid;
	}

	public void setBitrates(String bitrates) {
		this.bitrates = bitrates;
	}

	public void setHexcolor(String hexcolor) {
		this.hexcolor = hexcolor;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setExplicit(String explicit) {
		this.explicit = explicit;
	}

	public void setSingle(String single) {
		this.single = single;
	}

	public void setIs_podcast(int is_podcast) {
		this.is_podcast = is_podcast;
	}

	public void setIs_original(int is_original) {
		this.is_original = is_original;
	}

	public void setReligious(int religious) {
		this.religious = religious;
	}

	
}
