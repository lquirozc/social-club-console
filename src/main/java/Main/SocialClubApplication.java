package Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Controllers.DocumentTypesController;
import Controllers.SubscriptionTypesController;
import Controllers.UsersController;
import Controllers.UsersTypeController;

import ModelsImp.DocumentTypes;
import ModelsImp.SubscriptionTypes;
import ModelsImp.UserTypes;
import ModelsImp.Users;
import ModelsImp.SocialClub;
import java.util.ArrayList;
import java.util.Scanner;

public class SocialClubApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		Scanner reader = new Scanner(System.in);

		SocialClub socialClub = context.getBean("SocialClub", SocialClub.class);

		boolean active = true;
		while (active) {
			try {

				ShowMenu();

				int option = Integer.parseInt(reader.nextLine());

				switch (option) {
				case 0:
					active = false;
					reader.close();
					context.close();
					break;

				case 1:

					System.out.println("\n¿Qué tipo de usuario deseas crear?");
					System.out.println("");

					ArrayList<UserTypes> userTypesList = socialClub.getUserTypesList();
					for (int i = 0; i < userTypesList.size(); i++) {
						System.out.println((i + 1) + " - " + userTypesList.get(i).getUserType());
					}

					UsersTypeController userController = context.getBean("UsersTypeController",
							UsersTypeController.class);

					int optUserType = userController.ValidateUserType(reader.nextLine());

					System.out.println("\nSelecciona un tipo de documento");
					System.out.println("");

					ArrayList<DocumentTypes> documentTypesList = socialClub.getDocumentTypesList();
					for (int i = 0; i < documentTypesList.size(); i++) {
						System.out.println((i + 1) + " - " + documentTypesList.get(i).getDocumentType());
					}

					DocumentTypesController documentTypesController = context.getBean("DocumentTypesController",
							DocumentTypesController.class);
					int optDocumentType = documentTypesController.ValidateDocumentType(reader.nextLine());

					System.out.println("\nIngresa el número de documento");
					System.out.println("");

					String document = documentTypesController.ValidateDocumentExists(reader.nextLine());

					System.out.println("\nIngresa el nombre");
					System.out.println("");

					String name = reader.nextLine();

					int optSubscriptionType = 0;
					double moneyBalance = 0;
					ArrayList<SubscriptionTypes> subscriptionTypesList = socialClub.getSubscriptionTypesList();
					// Si es Socio
					if (optUserType == 1) {

						System.out.println("\nSelecciona un tipo de suscripción");
						System.out.println("");

						
						for (int i = 0; i < subscriptionTypesList.size(); i++) {
							System.out.println((i + 1) + " - " + subscriptionTypesList.get(i).getSubscriptionType());
						}

						SubscriptionTypesController subscriptionTypesController = context
								.getBean("SubscriptionTypesController", SubscriptionTypesController.class);
						optSubscriptionType = subscriptionTypesController.ValidateSubscriptionType(reader.nextLine());

						System.out.println("\nIngresa el monto inicial para tu balance de cuenta");
						System.out.println("");

						UsersController usersController = context.getBean("UsersController", UsersController.class);
						moneyBalance = usersController.ValidateMoneyBalance(reader.nextLine(), optSubscriptionType);

					} else {
						// Pedir cédula de socio - ac+a creamos el Autorizado
					}
					
					Users user = context.getBean("Users", Users.class);
					user.setDocument(document);
					user.setDocumentTypes(documentTypesList.get(optDocumentType - 1));
					user.setMoneyBalance(moneyBalance);
					user.setName(name);
					user.setSubscriptionTypes(subscriptionTypesList.get(optSubscriptionType - 1));
					user.setUserTypes(userTypesList.get(optUserType - 1));

					socialClub.getUserList().add(user);
					break;
				case 2:
					for(Users userx: socialClub.getUserList()) {
						System.out.println("\nNombre: " + userx.getName());
						System.out.println("Tipo de documento: " + userx.getDocumentTypes().getDocumentType());
						System.out.println("# Documento: " + userx.getDocument());
						System.out.println("Balance: " + userx.getMoneyBalance());
						System.out.println("Tipo de suscripción: " + userx.getSubscriptionTypes().getSubscriptionType());
						System.out.println("Tipo de usuario: " + userx.getUserTypes().getUserType() + "\n");
					}
					break;
				
				default:
					System.out.println("Opción no valida \n");
					break;
				}

			} catch (Exception e) {

				System.out.println(e.getMessage() + "\n");
			}
		}

//		ArrayList<DocumentTypes> documentTypesList = socialClub.getDocumentTypesList();

//		for (int i = 0; i < documentTypesList.size(); i++) {
//            System.out.println((i + 1) + " - " + documentTypesList.get(i).getDocumentType());
//        }
	}

	private static void ShowMenu() {
		/* Menu */
		System.out.println("1 - Crear Usuario");
		System.out.println("2 - Listar Usuarios");
		System.out.println("0 - Salir");
	}

}
