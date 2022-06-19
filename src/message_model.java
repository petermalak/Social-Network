import java.util.List;

public class message_model {
	boolean isConversationExist (String conversationName) {return true;}
	boolean addConversation (String ConversationName , List<user> memberList ) {return true;}
	boolean deleteConversation(String ConversationName) {return true;}
	boolean editConversation(String ConversationName) {return true;}
	boolean isMessage(String conversationName , String message) {return true;}
	boolean deleteMessage(String conversationName , String message){return true;}
	boolean AddMessage (String conversationName , String message){return true;}
	boolean isMember(String userName , String conversationName){return true;}
	boolean addMember(String conversationName ,String userName){return true;}
	boolean deleteMember(String userName , String conversationName) {return true;}
	void getListOfmembers(String conversationName) {}
	void getListOfmessage(String conversationName) {}
}
