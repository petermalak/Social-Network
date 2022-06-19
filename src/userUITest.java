import org.testng.Assert;
import org.testng.annotations.Test;

public class userUITest {

	@Test
  public void signUpTest() {
	  boolean returnValue;
	  
	  /**
	   * 	New User register in system with unique userName;
	   */
	  returnValue = userUI.signUp("firstName1", "lastName1", "userName1", "123", "mail1@yahoo.com", "male", "1-1-2001", "egypt", false);
	  Assert.assertEquals(returnValue, true);
	  
	  returnValue = userUI.signUp("firstName2", "lastName2", "userName2", "123", "mail2@yahoo.com", "male", "1-1-2001", "egypt", false);
	  Assert.assertEquals(returnValue, true);
	  
	  /**
	   * 	New User register in system with repeated user Name;
	   */
	  
	  returnValue = userUI.signUp("firstName2", "lastName2", "userName1", "123", "mail2@yahoo.com", "male", "1-1-2001", "egypt", false);
	  Assert.assertEquals(returnValue, false);
  }

  @Test
  public void sendFriendRequestTest() {
	  userUI.signUp("firstName3", "lastName3", "userName3", "123", "mail3@yahoo.com", "male", "1-1-2001", "egypt", true);
	  userUI.signUp("firstName4", "lastName4", "userName4", "123", "mail4@yahoo.com", "male", "1-1-2001", "egypt", true);
	  String returnValue ;
	  
	  /// userName 3 send request to userName 4
	  returnValue = userUI.sendFriendRequest("userName3", "userName4");
	  Assert.assertEquals(returnValue, null);
	  
	  /// userName 3 send another try to send another friend request to userName 4 while the first one is pending
	  returnValue = userUI.sendFriendRequest("userName3", "userName4");
	  Assert.assertEquals(returnValue, "You Already Sent Friend Request Before");
	  
	  /// userName 4 Accept request of userName 3
	  userUI.AcceptRequest("userName4", "userName3");
	  
	  /// userName 3 send request to userName 4, but both are friends
	  returnValue = userUI.sendFriendRequest("userName3", "userName4");
	  Assert.assertEquals(returnValue, "You are friend to (userName4)");
	  
	  /// userName 4 send request to userName 3, but both are friends
	  returnValue = userUI.sendFriendRequest("userName3", "userName4");
	  Assert.assertEquals(returnValue, "You are friend to (userName4)");
  }

  @Test
  public void AcceptRequestTest() {
	  userUI.signUp("firstName5", "lastName5", "userName5", "123", "mail5@yahoo.com", "male", "1-1-2001", "egypt", true);
	  userUI.signUp("firstName6", "lastName6", "userName6", "123", "mail6@yahoo.com", "male", "1-1-2001", "egypt", true);
	  userUI.signUp("firstName7", "lastName7", "userName7", "123", "mail7@yahoo.com", "male", "1-1-2001", "egypt", true);
	  userUI.signUp("firstName8", "lastName8", "userName8", "123", "mail8@yahoo.com", "male", "1-1-2001", "egypt", true);
	  String returnValue ;
	  
	  /// userName 5 send request to userName 6
	  returnValue = userUI.sendFriendRequest("userName5", "userName6");
	  Assert.assertEquals(returnValue, null);
	  
	  /// userName 6 Accept request of userName 5
	  Assert.assertEquals(userUI.AcceptRequest("userName6", "userName5") , true);
	  
	  /// userName 6 try to Accept request of userName 5 twice
	  Assert.assertEquals(userUI.AcceptRequest("userName6", "userName5") , false);
	  
	  /// userName 7 try to Accept request of userName 8 twice, but no friend request is sent before
	  Assert.assertEquals(userUI.AcceptRequest("userName6", "userName5") , false);
  }

 
}
