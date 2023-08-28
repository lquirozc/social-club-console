package ModelsImp;

import java.util.ArrayList;
import java.util.UUID;

public class Users {

	public Users() {
		this.userId = UUID.randomUUID();
	}
	
	private UUID userId;
	private String name;
	private String document;
	private double moneyBalance;
	private DocumentTypes documentTypes;
	private SubscriptionTypes subscriptionTypes;
	private UserTypes userTypes;
	private ArrayList<Users> authUsers;
	
	public UUID getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public double getMoneyBalance() {
		return moneyBalance;
	}
	public void setMoneyBalance(double moneyBalance) {
		this.moneyBalance = moneyBalance;
	}
	public DocumentTypes getDocumentTypes() {
		return documentTypes;
	}
	public void setDocumentTypes(DocumentTypes documentTypes) {
		this.documentTypes = documentTypes;
	}
	public SubscriptionTypes getSubscriptionTypes() {
		return subscriptionTypes;
	}
	public void setSubscriptionTypes(SubscriptionTypes subscriptionTypes) {
		this.subscriptionTypes = subscriptionTypes;
	}
	public UserTypes getUserTypes() {
		return userTypes;
	}
	public void setUserTypes(UserTypes userTypes) {
		this.userTypes = userTypes;
	}
	public ArrayList<Users> getAuthUsers() {
		return authUsers;
	}
	public void setAuthUsers(ArrayList<Users> authUsers) {
		this.authUsers = authUsers;
	}
	
	
}
