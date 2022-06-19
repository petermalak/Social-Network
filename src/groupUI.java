import java.util.Vector;

public class groupUI {
	public static boolean createGroup( Group object ) {
		return true;
	}
	
	public static boolean deleteGroup( String groupName ) {
		return true;
	}
	
	public static Group getGroupInfo( String groupName ) {
		return null;
	}
	
	public static boolean editGroup( Group object ) {
		return true;
	}
	
	public static boolean sendJoinRequest( String groupName , String userName ) {
		return true;
	}
	
	public static Vector<String> getAllRequests( String groupName ){
		return null;
	}
	
	public static boolean AcceptRequest( String adminUserName , String groupName ) {
		return true;
	}
	
	public static boolean disjoinGroup( String groupName , String userName ) {
		return true;
	}
	
	public static boolean addAdmin( String groupName , String userName ) {
		return true;
	}
	
	public static boolean deleteAdmin( String userName , String groupName ) {
		return true;
	}
	
	public static Group searchAboutGroup( String groupName ) {
		return null;
	}

	public static boolean sendNotification( String groupName , String userName ) {
		return true;
	}
}
