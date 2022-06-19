

public class NormalUserUI extends userUI {
	
	public static boolean upgradeAccount( String userName ) {
		return userController.upgradeUserAccount(userName);
	}
}
