package ControllersImp;

import Controllers.DocumentTypesController;
import ModelsImp.SocialClub;
import ModelsImp.Users;

public class DocumentTypesControllerImp implements DocumentTypesController {

	private SocialClub socialClub;
	
	@Override
	public int ValidateDocumentType(String option) throws Exception {
		try {
			int opt = Integer.parseInt(option);

			if (opt < 1 || opt > 3) {
				throw new Exception("\nSelecciona una opción válida");
			}
			return opt;
		} catch (NumberFormatException e) {
			throw new Exception("\nSelecciona una opción válida");
		}
	}

	@Override
	public String ValidateDocumentExists(String document) throws Exception {
		
		for(Users user: socialClub.getUserList()) {
			if(user.getDocument().equals(document)) {
				throw new Exception("El documento ingresado ya existe");
			}
		}
		
		return document;
	}
	
	
	public void setSocialClub(SocialClub socialClub) {
		this.socialClub = socialClub;
	}

}
