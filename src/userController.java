 

import java.util.Vector;

public class userController {
	public static final userModel model = new userModel();
	 
	public static boolean signUp( user object ) {
		
		if ( model.isUserNameExist( object.getUserName() ) == true ) {
			return false;
		}
		else {
			model.addUser(object);
		}
		return true;
	}
	
	public static boolean isValidUser( user object ) {
		return true;
	}
	
	public static boolean DeleteUser( String userName ) { 
		return true;
	}
	
	public static boolean EditAccount( String userName ) { 
		return true;
	}
	
	public static Vector<String> getUserInfo( String userName ){
		return null;
	}
	
	public static String Login( String userName , String password ) {
		
		if ( model.isUserNameExist(userName) ) {
			user object = model.getUserInfo(userName);
			if ( object.getPassword().compareTo(password) == 0 ) {
				model.changeStatue(userName);
				return null;
			}
			else {
				return "password invalid";
			}
		}
		else {
			return "UserName invalid";
		}
	}
	
	public static void logOut( String userName ) {
		model.changeStatue(userName);
	}
	
	public static boolean isPremuim( String userName ) {
		return model.isPremiumUser(userName);
	}
	
	public static boolean upgradeUserAccount( String userName ) {
		if ( model.isPremiumUser(userName) == false ) {
			user object = model.getUserInfo(userName);
			object.setIsPremiumAccount(true);
			model.updateUser(object);
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String searchAboutUser( String userName ) {
		if ( model.isUserNameExist(userName) == true ) {
			return null;
		}
		else {
			return "User not founded";
		}
	}
	
	public static String sendFriendRequest( String unFrom , String unTo ) {
		String ret = null;
		
		if ( model.isUserNameExist(unTo) == true ) {
			Vector<user> allFriends = model.getFriendlist( unFrom );
			for ( int i = 0; i < allFriends.size(); ++i ) {
				if ( allFriends.elementAt(i).getUserName().compareTo(unTo) == 0 ) {
					ret = "You are friend to (" + unTo + ")"; return ret;
				}
			}
			
			Vector<user> allRequest = model.getFriendrequest( unTo );
			for ( int i = 0; i < allRequest.size(); ++i ) {
				if ( allRequest.elementAt(i).getUserName().compareTo(unFrom) == 0) {
					ret = "You Already Sent Friend Request Before"; return ret;
				}
			}
			model.AddRequest(unFrom, unTo);
		}
		return ret;
	}
	
	public static void SendNotification( String userName , String message ) {
		model.sendNotification(userName, message);
	}
	
	public static Vector<String> getAllNotification( String userName ){
		if ( model.isUserNameExist(userName) == true ) {
			return model.getAllNotification(userName);
		}
		else {
			return null;
		}
	}
	
	public static Vector<user> getAllFriendRequest( String userName ) {
		if ( model.isUserNameExist(userName)  == true ) {
			return model.getFriendrequest(userName);
		}
		return null;
	}
	
	public static boolean AcceptRequest( String unFrom , String unTo) {
		model.addToFriendList(unFrom, unTo);
		model.addToFriendList(unTo, unFrom);
		model.sendNotification(unTo, unFrom + " Accepte the Friend Request");
		return model.deleteFriendRequest(unFrom, unTo);
	}
	
	public static boolean DeleteRequest( String unFrom , String unTo ) {
		model.sendNotification(unTo, unFrom + " Delete the Friend Request");
		return model.deleteFriendRequest(unFrom, unTo);
	}
	
	public static boolean yearPay( String userName ) {
		return true;
	}
	
	public static boolean create_AD( String header , String headLines , String Descriptions , String userName ) {
		return true;
	}
	
	public static boolean create_AD_Validation( String header , String headLines , String Descriptions , String userName ) {
		return true;
	}
	
}
