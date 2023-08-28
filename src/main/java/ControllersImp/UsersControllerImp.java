package ControllersImp;

import Controllers.UsersController;

public class UsersControllerImp implements UsersController {

	@Override
	public double ValidateMoneyBalance(String value, int optSubscriptionType) throws Exception {
		try {
			
			double val = Double.parseDouble(value);
			
			//Socio Regular
			if(optSubscriptionType == 1) {
				if(val < 50000 || val > 1000000) {
					throw new Exception("El valor debe estar entre 50 mil y un millón de pesos");
				}
			}else{
				if(val < 400000 || val > 5000000) {
					throw new Exception("El valor debe estar entre 100 mil y 5 millones de pesos");
				}
			}
			
			return val;
		}catch(NumberFormatException e) {
			throw new Exception("El valor ingresado no es válido");
		}
		
	}

}
