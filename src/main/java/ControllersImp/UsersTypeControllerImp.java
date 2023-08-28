package ControllersImp;

import Controllers.UsersTypeController;

public class UsersTypeControllerImp implements UsersTypeController {

	@Override
	public int ValidateUserType(String option) throws Exception {
		try {
			int opt = Integer.parseInt(option);

			if (opt != 1 && opt != 2) {
				throw new Exception("\nSelecciona una opción válida");
			}
			return opt;
		} catch (NumberFormatException e) {
			throw new Exception("\nSelecciona una opción válida Manucita");
		}

	}

}
