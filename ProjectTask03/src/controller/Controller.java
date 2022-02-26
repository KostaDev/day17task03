package controller;
import crud.Crud;
import util.OperationUtil;
public class Controller {
	private static Controller instance;
	
	private Controller() {
		
	}

	public static Controller getInstance() {
		if(instance == null) {
			instance = new Controller();
		}
		
		return instance;
	}
	
	public void chooseOperation(int num) {
		switch(num) {
		case OperationUtil.CREATE_NEW_USER : 
			Crud.createNewUser();
			break;
		case OperationUtil.SHOW_ALL_USERS :
			Crud.showAll();
			break;
		case OperationUtil.SHOW_USER : 
			Crud.showUser();
			break;
		case OperationUtil.EDIT_USER : 
			Crud.editUser();
			break;
			
		case OperationUtil.DELETE_USER : 
			Crud.deleteUser();
			break;
		case 0 : System.out.println("Goodbye!");
			break;
		default: System.out.println("Choose correct number!");;
			break;
		}
	}
	
	
}
