package ModelsImp;

import java.util.UUID;

public class UserTypes {

	public UserTypes(String userType) {
		this.userTypeId = UUID.randomUUID();
		this.userType = userType;
	}
	
	private UUID userTypeId;
	private String userType;
	
	public UUID getUserTypeId() {
		return userTypeId;
	}

	public String getUserType() {
		return userType;
	}
	
}
