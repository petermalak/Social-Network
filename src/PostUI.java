
public class PostUI {
	
	public boolean CreatePost ( String Data , String Type , String[] Hashtags ) {
		return true;
	}
	
	public boolean EditPost ( int PostID ) {
		return true;
	}

	public boolean DeletePost ( int PostID ) {
		return true;
	}
	
	public boolean LikePost ( int PostID , user object ) {
		return true;
	}
	
	public boolean SharePost ( int PostID , user object ) {
		return true;
	}
	
	public void CreatePostInAGroup ( int PostID , String GroupName ) {}
	
	public void CreatePostInAPage ( int PostID ,  String PageName ) {}
	
	public Post[] PublicHashtagSearch ( String SearchHashtag ) {
		return null;
	}
	
	public Post[] GroupHashtagSearch ( String GroupName , String SearchHashtag ) {
		return null;
	}
	
	public Post[] PageHashtagSearch ( String PageName , String SearchHashtag ) {
		return null;
	}
	
	public void GetPageStatics ( int PostID ) {}
	
}
