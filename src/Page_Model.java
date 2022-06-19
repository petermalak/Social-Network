
public class Page_Model {
	boolean isPageExist (String pageName) {return true;}
	boolean addPage (String Page_name , String Page_Creator) {return true;}
	void getListOfFollowers(String pageName) {}
	boolean deletePage(String pageName) {return true;}
	void getPageInfo(String pageName) {}
	boolean editPage(String Page_name) {return true;}
	boolean isAdmin(String userName , String pageName) {return true;}
	boolean isFollower(String pageName , String userName) {return true;}
	void deleteFollower(String pageName , String userName) {}
	boolean addAdmin(String pageName , String userName) {return true;}
	void deleteAdmin(String userName , String pageName) {}
	String getPageCreator (String pageName) {return null;}
}
