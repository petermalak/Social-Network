
public class PostModel {
	
	public void AddPost ( Post Object ) {}
	
	public boolean IncreaseNumberOfLikes ( Post Object ) {
		return true;
	}
	
	public boolean IncreaseNumberOfShares ( Post Object ) {
		return true;
	}
	
	public boolean DeletePost ( Post Object ) {
		return true;
	}
	
	public boolean EditPost ( Post Object ) {
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
