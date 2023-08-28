package ModelsImp;

import java.util.ArrayList;

public class SocialClub {

	private ArrayList<DocumentTypes> documentTypesList;
	private ArrayList<SubscriptionTypes> subscriptionTypesList;
	private ArrayList<UserTypes> userTypesList;
	private ArrayList<Users> usersList;
	
	public SocialClub() {
		documentTypesList = new ArrayList<>();
		documentTypesList.add(new DocumentTypes("Cédula"));
		documentTypesList.add(new DocumentTypes("Pasaporte"));
		documentTypesList.add(new DocumentTypes("Tarjeta de identidad"));
        
		subscriptionTypesList = new ArrayList<>();
		subscriptionTypesList.add(new SubscriptionTypes("Socio Regular"));
		subscriptionTypesList.add(new SubscriptionTypes("Socio VIP"));

		userTypesList = new ArrayList<>();
		userTypesList.add(new UserTypes("Socio"));
		userTypesList.add(new UserTypes("Autorizado"));
		
		usersList = new ArrayList<>();
	}

	public ArrayList<DocumentTypes> getDocumentTypesList() {
		return documentTypesList;
	}

	public ArrayList<SubscriptionTypes> getSubscriptionTypesList() {
		return subscriptionTypesList;
	}

	public ArrayList<UserTypes> getUserTypesList() {
		return userTypesList;
	}
	
	public ArrayList<Users> getUserList() {
		return usersList;
	} 
	
}
