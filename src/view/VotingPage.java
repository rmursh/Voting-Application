package view;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class VotingPage extends JFrame{

	JTextField partyNameTextField;
	JLabel errorMessage;
	JLabel partyNameLabel;
	JLabel partySelectLabel;
	JButton addParty;
	JButton voteFor;
	JComboBox<String> partyList;
	public VotingPage(){
		initComponents();
	}
	
	private void initComponents(){
		errorMessage = new JLabel();
		errorMessage.setForeground(Color.RED);
		partyNameTextField = new JTextField();
		partyNameLabel = new JLabel();
		partySelectLabel = new JLabel();
		addParty = new JButton();
		voteFor = new JButton();
		partyList = new JComboBox<String>();
		
		partyNameLabel.setText("Name of party : ");
		addParty.setText("Add Party");
		partySelectLabel.setText("Select Party to Vote for");
		voteFor.setText("VOTE");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Voting System");
		
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(
				layout.createParallelGroup()
				.addComponent(errorMessage)
				.addComponent(partyNameLabel)
				.addComponent(partyNameTextField, 200, 200, 400)
				.addComponent(partySelectLabel)
				.addComponent(partyList)
				.addComponent(addParty)
				.addComponent(voteFor)
				);
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(errorMessage))
				.addGroup(layout.createParallelGroup()
						.addComponent(partyNameLabel))
				.addGroup(layout.createParallelGroup()
						.addComponent(partyNameTextField))
				.addGroup(layout.createParallelGroup()
						.addComponent(addParty))
				.addGroup(layout.createParallelGroup()
						.addComponent(partySelectLabel))
				.addGroup(layout.createParallelGroup()
						.addComponent(partyList))
				.addGroup(layout.createParallelGroup()
						.addComponent(voteFor))
				);
		
		pack();
	}
}
