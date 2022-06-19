

import java.util.Vector;

public class userUI {
	public static boolean signUp( String firstName , String lastName , String userName , String password , String email , String gender , String date , String country , Boolean isPremium ) {
		
		user object;
		
		if ( isPremium ) {
			object = new PremiumUser();
		}
		else {
			object = new NormalUser();
		}
		
		object.setFirstName(firstName);
		object.setLastName(lastName);
		object.setUserName(userName);
		object.setPassword(password);
		object.setEmail(email);
		object.setGender(gender);
		object.setDate(date);
		object.setCountry(country);

		return userController.signUp(object);
	}
	
	public static boolean DeleteUser( String userName ) { 
		return true;
	}
	
	public static boolean EditAccount( String userName ) { 
		return true;
	}
	
	public static String login( String userName , String Password ) {
		String ret = userController.Login(userName, Password);
		return ret;
	}
	
	public static Vector<String> getUserInfo( String userName ){
		return null;
	}
	
	public static void logOut( String userName ) {
		userController.logOut(userName);
	}
	
	public static boolean isPremuim( String userName ) {
		return userController.isPremuim( userName );
	}
	
	public static String searchAboutUser( String userName ) {
		return userController.searchAboutUser(userName);
	}
	
	public static String sendFriendRequest( String unFrom , String unTo ) {
		return userController.sendFriendRequest(unFrom, unTo);
	}
	
	public static Vector<String> getAllNotification( String userName ){
		return userController.getAllNotification(userName);
	}
	
	public static Vector<String> getAllRequests( String userName ){
		Vector<user> friendRequests = userController.getAllFriendRequest(userName);
		Vector<String> ret = new Vector<String>();
		
		if ( friendRequests != null ) {
			for ( int i = 0; i < friendRequests.size(); ++i ) {
				ret.add( friendRequests.get(i).getUserName() );
			}
		}
		
		return ret;
	}
	
	public static boolean AcceptRequest( String unFrom , String unTo ) {
		return userController.AcceptRequest(unFrom, unTo);
	}
	
	public static boolean DeleteRequest( String unFrom , String unTo ) {
		return userController.DeleteRequest(unFrom, unTo);
	}
}
