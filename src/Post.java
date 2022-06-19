
public class Post {
	private int PostId;
	private String Data;
	private int NumberOfLikes;
	private int NumberOfShares;
	private String Type;
	private String[] Hashtags;
	
	public void SetPostID ( int ID ) { 
		this.PostId = ID;
	}
	
	public void SetData ( String D ) {
		this.Data = D;
	}
	
	public void SetNumberOfLikes ( int likes ) {
		this.NumberOfLikes = likes;
	}
	
	public void SetNumberOfShare ( int shares ) {
		this.NumberOfShares = shares;
	}
	
	public void SetType ( String T ) {
		this.Type = T;
	}
	
	public void SetHashtags ( String [] tags ) {
		this.Hashtags = tags;
	}
	
	public int GetPostId () {
		return this.PostId;
	}
	
	public String GetData () {
		return this.Data;
	}
	
	public int GetNumberOfLikes () {
		return this.NumberOfLikes;
	}
	
	public int GetNumberOfShares () {
		return this.NumberOfShares;
	}
	
	public String GetType () {
		return this.Type;
	}
	
	public String[] GetHashtags() {
		return this.Hashtags;
	}
}
