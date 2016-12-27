package application;
import view.VotingPage;
public class VotingSystem {

		public static void main(String[] args) {
			// load model
			// TODO
			//PersistenceBTMS.loadEventRegistrationModel();
			// start UI
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new VotingPage().setVisible(true);
	            }
	        });        
		}	
}
