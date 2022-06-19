import java.util.Vector;

public class groupModel {
	public static boolean isGroupExist( String groupName ) {
		return true;
	}
	public static boolean AddGroup( Group object ) {
		return true;
	}
	
	public static Vector<user> getListOfMemebers( String groupName ){
		return null;
	}
	
	public static boolean deleteGroup( String groupName ) {
		return true;
	}
	
	public static Group grtGroupInfo(String groupName) {
		return null;
	}
	
	public static boolean editGroup( Group object ) {
		return true;
	}
	
	public static boolean isPrivateGroup( String groupName ) {
		return true;
	}
	
	public static boolean sendJoinRequest( String groupName , String userName ) {
		return true;
	}
	
	public static boolean isAdmin( String userName , String groupName ) {
		return true;
	}
	
	public static Vector<String> getAllRequests( String groupName ){
		return null;
	}
	
	public static boolean AcceptRequest( String adminUserName , String groupName ) {
		return true;
	}
	
	public static boolean isMemeber( String userName , String groupName ) {
		return true;
	}
	
	public static boolean deleteMemeber( String groupName , String userName ) {
		return true;
	}
	
	public static boolean addMemberToNotificationList( String groupName , String userName ) {
		return true;
	}
	
	public static boolean addAdmin( String groupName , String userName ) {
		return true;
	}
	
	public static boolean deleteAdmin( String userName , String groupName ) {
		return true;
	}
	
	public static String getGroupCreator( String groupName ) {
		return null;
	}
}	
