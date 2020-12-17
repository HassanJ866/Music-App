import java.util.ArrayList;

public abstract class User {
	private String Id;
	private String name;
	private String userpicture;
	private ArrayList<song> liked;
	
	public ArrayList<song> getLiked() {
		return liked;
	}

	public void setLiked(ArrayList<song> liked) {
		this.liked = liked;
	}

	public User(String name) {
		super();
		this.name = name;
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

	public String getUserpicture() {
		return userpicture;
	}

	public void setUserpicture(String userpicture) {
		this.userpicture = userpicture;
	}
	
	
}
