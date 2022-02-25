package controller;
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
			System.out.println("creating user...");
			break;
		case OperationUtil.SHOW_ALL_USERS :
			break;
		case OperationUtil.SHOW_USER : 
			break;
		case OperationUtil.EDIT_USER : 
			break;
		case OperationUtil.DELETE_USER : 
			break;
		default: System.out.println("Choose correct number!");;
		
		}
	}
	
	
}
