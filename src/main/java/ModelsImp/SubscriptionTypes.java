package ModelsImp;

import java.util.UUID;

public class SubscriptionTypes {

	public SubscriptionTypes(String subscriptionType) {
		this.subscriptionTypeId = UUID.randomUUID();
		this.subscriptionType = subscriptionType;
	}
	
	private UUID subscriptionTypeId;
	private String subscriptionType;
	
	public UUID getSubscriptionTypeId() {
		return subscriptionTypeId;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	
}
