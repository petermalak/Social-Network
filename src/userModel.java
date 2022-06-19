
import java.util.HashMap;
import java.util.Vector;

public class userModel {
	private static final HashMap< String  , user> userDataBase = new HashMap<String, user>();
	private static final HashMap< String , Vector<user>> friendRequest = new HashMap<String, Vector<user>>();
	private static final HashMap< String , Vector<String>> notifications = new HashMap<String, Vector<String>>();
	private static final HashMap< String , Vector<user>> friendList = new HashMap<String, Vector<user>>();
	

	public Vector<String> getAllNotification( String userName ){
		return notifications.get(userName);
	}
	
	public Vector<user> getFriendrequest( String userName ) {
		return friendRequest.get(userName);
	}
	
	public Vector<user> getFriendlist( String userName ) {
		return friendList.get(userName);
 	}
	
	public void addUser( user object ) {
		userDataBase.put(object.getUserName(), object);
		friendList.put( object.getUserName() , new Vector<user>());
		friendRequest.put( object.getUserName() , new Vector<user>());
		notifications.put( object.getUserName() , new Vector<String>());
	}
	
	public boolean isUserNameExist( String userName ) {
		return userDataBase.containsKey( userName );
	}
	
	public boolean changeStatue( String userName ) {
		boolean statue = userDataBase.get(userName).getLogged_in(); 
		statue = (statue == true ? false : true);
		userDataBase.get(userName).setLogged_in(statue);
		return true;
	}
	
	public boolean deleteUser( String userName ) {
		return true;
	}
	
	public user getUserInfo( String userName ) {
		return userDataBase.get(userName);
	}
	
	public boolean updateUser( user object ) {
		userDataBase.replace( object.getUserName() , object);
		return true;
	}
	
	public void AddRequest( String unFrom , String unTo ) {
		friendRequest.get(unTo).add( getUserInfo(unFrom) );
	}
	
	public void addToFriendList( String unFrom , String unTo ) {
		friendList.get(unFrom).add( getUserInfo(unTo) );
	}
	
	public void sendNotification( String userName , String message ) {
		notifications.get(userName).add(message);
	}
	
	public boolean isPremiumUser( String userName ) {
		return userDataBase.get( userName ).getIsPremiumAccount();
	}
	
	public boolean create_AD( ad object , String userName ) {
		return true;
	}
	
	public boolean deleteFriendRequest( String unFrom , String requestUN ) {
		int index = -1;
		Vector<user> requests = friendRequest.get(unFrom);
		for ( int i = 0; i < requests.size(); ++i ) {
			if ( requests.elementAt(i).getUserName().compareTo(requestUN) == 0 ) {
				index = i; break;
			}
		}
		
		if ( index > -1 ) {
			friendRequest.get(unFrom).remove(index);
			return true;
		}
		return false;
	}

	
	
}
