package ControllersImp;

import Controllers.SubscriptionTypesController;

public class SubscriptionTypesControllerImp implements SubscriptionTypesController {

	@Override
	public int ValidateSubscriptionType(String option) throws Exception {
		try {
			int opt = Integer.parseInt(option);

			if (opt != 1 && opt != 2) {
				throw new Exception("\nSelecciona una opción");
			}
			return opt;
		} catch (NumberFormatException e) {
			throw new Exception("\nSelecciona una opción válida");
		}
	}

}
