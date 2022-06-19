
public class PostControl {
	
	public boolean AddPost ( Post Object ) {
		return true;
	}
	
	public boolean CheckHashtags ( Post Object ) {
		return true;
	}
	
	public boolean LikePost ( Post Object ) {
		return true;
	}
	
	public boolean DeletePost ( Post Object ) {
		return true;
	}
	
	public boolean EditPost ( Post Object ) {
		return true;
	}
	
	public boolean SharePost ( user object , Post Object ) {
		return true;
	}
	
	public void AddPostInAGroup ( Group object , Post Object ) {}
	
	public void AddPostInAPage ( Page object , Post Object ) {}
	
	public Post[] PublicSearch ( String SearchHashtag ) {
		return null;
	}
	
	public Post[] GroupSearch ( Group Object , String SearchHashtag ) {
		return null;
	}
	
	public Post[] PageSearch ( Page Object , String SearchHashtag ) {
		return null;
	}
	
	public user[] PeopleWhoLikesThePost ( Post Object ) {
		return null;
	}
	
}
