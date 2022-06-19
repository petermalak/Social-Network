import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GUI {
	public static final userUI UI = new userUI();

	private static JFrame frmFcisocialnetwork;
	private static JPanel welcomePanel;
	private static JTextArea welcomeMessage;
	private static JPanel loginP;
	private static JPanel signupP;
	private static JTextField fname;
	private static JTextField lname;
	private static JLabel lblUsername;
	private static JTextField uname;
	private static JPasswordField password;
	private static JLabel lblPassword;
	private static JLabel lblEmail;
	private static JTextField email;
	private static JTextField country;
	private static JLabel lblCountry;
	private static JLabel lblConfirmPassword;
	private static JPasswordField cpassword;
	private static JTextField bdate;
	private static JLabel lblBirthDate;
	private static JLabel lblUserName;
	private static JTextField loginuname;
	private static JLabel lblPassword_1;
	private static JPasswordField loginpassword;
	private static JButton btnNewButton;
	private static JButton btnNewButton_1;
	private static JButton signup;
	private static JPanel userP;
	private static JPanel notificationListP;
	private static JPanel requestP;
	private static JPanel payP;
	private static JLabel lblSearchForUser;
	private static JTextField searchTxt;
	private static JButton search;
	private static JPanel no;
	private static JPanel yes;
	private static JLabel noMessage;
	private static JButton btnNewButton_3;
	private static JButton showRequests;
	private static JButton btnLogout;
	private static JButton btnShowNotifications;
	private static JButton upgrade;
	private static JComboBox gender , requestBox , type;
	
	private String currentUserName = "" , searchUserName = "";
	private JButton backR;
	private JTable requestTable;
	private JScrollPane scrollPane;
	private JTable notificationTable;
	private JButton backSignUp;
	private JButton btnBack;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmFcisocialnetwork.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUI() {
		initialize();
	}
	
	public static void finish() {
		loginP.setVisible(false);
		signupP.setVisible(false);
		welcomePanel.setVisible(true);
		payP.setVisible(false);
		requestP.setVisible(false);
		notificationListP.setVisible(false);
		yes.setVisible(false);
		no.setVisible(false);
		userP.setVisible(false);
	}
	
	private void initialize() {
		frmFcisocialnetwork = new JFrame();
		frmFcisocialnetwork.setTitle("FCI-Social-Network");
		frmFcisocialnetwork.setResizable(false);
		frmFcisocialnetwork.setBounds(100, 100, 520, 396);
		frmFcisocialnetwork.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginpassword.setText("");
				loginuname.setText("");
				login.setEnabled(false);
				signup.setEnabled(false);
				welcomePanel.setVisible(false);
				signupP.setVisible(false);
				loginP.setVisible(true);
			}
		});
		login.setBounds(10, 320, 245, 38);
		login.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		signup = new JButton("Sign up");
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show( false , true , false, false, false, false, false, false, false);
				login.setEnabled(false);
				signup.setEnabled(false);
			}
		});
		signup.setBounds(261, 320, 245, 38);
		signup.setFont(new Font("Tahoma", Font.PLAIN, 17));
		frmFcisocialnetwork.getContentPane().setLayout(null);
		
		welcomePanel = new JPanel();
		welcomePanel.setBounds(10, 11, 494, 298);
		
		welcomeMessage = new JTextArea();
		welcomeMessage.setMargin(new Insets(0, 0, 0, 0));
		welcomeMessage.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		welcomeMessage.setFont(new Font("Monospaced", Font.PLAIN, 20));
		welcomeMessage.setText( " Welcome in FCI Social Network\n\n" );
		welcomeMessage.append(" Student-1: Ehab  Fawzy   20170072 \n" );
		welcomeMessage.append(" Student-2: Peter Malak   20170072 \n" );
		welcomeMessage.append(" Student-3: Mina  Botros  20170072 \n" );
		
		signupP = new JPanel();
		signupP.setBounds(10, 11, 494, 298);
		frmFcisocialnetwork.getContentPane().add(signupP);
		
		JLabel fnameL = new JLabel("First Name");
		fnameL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fnameL.setBounds(10, 14, 71, 14);
		
		fname = new JTextField();
		fname.setBounds(91, 11, 135, 20);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setBounds(342, 11, 135, 20);
		lname.setColumns(10);
		
		JLabel snameL = new JLabel("Last Name");
		snameL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		snameL.setBounds(263, 15, 76, 14);
		signupP.setLayout(null);
		signupP.add(fnameL);
		signupP.add(fname);
		signupP.add(snameL);
		signupP.add(lname);
		
		lblUsername = new JLabel("userName");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(10, 52, 71, 14);
		signupP.add(lblUsername);
		
		uname = new JTextField();
		uname.setColumns(10);
		uname.setBounds(91, 49, 386, 20);
		signupP.add(uname);
		
		password = new JPasswordField();
		
				password.setColumns(10);
				password.setBounds(91, 125, 386, 20);
				signupP.add(password);
				
				lblPassword = new JLabel("Password");
				lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblPassword.setBounds(10, 128, 71, 14);
				signupP.add(lblPassword);
				
				lblEmail = new JLabel("Email");
				lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblEmail.setBounds(10, 90, 71, 14);
				signupP.add(lblEmail);
				
				email = new JTextField();
				email.setColumns(10);
				email.setBounds(91, 87, 386, 20);
				signupP.add(email);
				
				country = new JTextField();
				country.setColumns(10);
				country.setBounds(91, 200, 386, 20);
				signupP.add(country);
				
				lblCountry = new JLabel("Country");
				lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblCountry.setBounds(10, 203, 71, 14);
				signupP.add(lblCountry);
				
				lblConfirmPassword = new JLabel("confirm P");
				lblConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblConfirmPassword.setBounds(10, 165, 71, 14);
				signupP.add(lblConfirmPassword);
				
				cpassword = new JPasswordField();
				cpassword.setColumns(10);
				cpassword.setBounds(91, 162, 386, 20);
				signupP.add(cpassword);
				
				bdate = new JTextField();
				bdate.setColumns(10);
				bdate.setBounds(91, 233, 386, 20);
				signupP.add(bdate);
				
				lblBirthDate = new JLabel("Birth date");
				lblBirthDate.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblBirthDate.setBounds(10, 236, 71, 14);
				signupP.add(lblBirthDate);
				
				btnNewButton_1 = new JButton("signUp");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String firstName 	= fname.getText();
						String lastName  	= lname.getText();
						String userName  	= uname.getText();
						String passwordS 	= password.getText();
						String cpasswordS 	= cpassword.getText();
						
						if ( passwordS.compareTo(cpasswordS) != 0 ) {
							showError( "Confirm password not equal to password" );
							return;
						}
						
						String emailS 		= email.getText();
						String genders		= gender.getSelectedItem().toString();
						String dataS		= bdate.getText();
						String countryS		= country.getText();
						
						Boolean ret;
						if ( type.getSelectedIndex() == 0 ) {
							ret = NormalUserUI.signUp(firstName, lastName, userName, passwordS, emailS, genders, dataS, countryS,false);
						}
						else {
							ret = PremiumUserUI.signUp(firstName, lastName, userName, passwordS, emailS, genders, dataS, countryS,false);
							NormalUserUI.upgradeAccount(userName);
						}
						
						if ( ret ) {
							GUI.showMessage( "signed up successfully" , "info");
							show(false, false, true, false, false, false, false, false, false);
							signup.setEnabled(true); login.setEnabled(true);
							
							fname.setText("");
							lname.setText("");
							uname.setText("");
							password.setText("");
							cpassword.setText("");
							email.setText("");
							gender.setSelectedIndex(0);
							bdate.setText("");
							country.setText("");
						}
						else {
							GUI.showError("Connect create user (Another User with same userName)");
						}
					}
				});
				btnNewButton_1.setBounds(240, 264, 122, 23);
				signupP.add(btnNewButton_1);
				
				gender = new JComboBox();
				gender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
				gender.setBounds(10, 265, 105, 22);
				signupP.add(gender);
				
				backSignUp = new JButton("Back");
				backSignUp.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						show(false, false, true, false, false, false, false, false, false);
						signup.setEnabled(true); login.setEnabled(true);
					}
				});
				backSignUp.setBounds(372, 264, 105, 23);
				signupP.add(backSignUp);
				
				type = new JComboBox();
				type.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Premium"}));
				type.setBounds(125, 264, 105, 22);
				signupP.add(type);
		
		loginP = new JPanel();
		loginP.setBounds(10, 11, 494, 298);
		frmFcisocialnetwork.getContentPane().add(loginP);
		
		lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		loginuname = new JTextField();
		loginuname.setColumns(10);
		
		lblPassword_1 = new JLabel("Password");
		lblPassword_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		loginpassword = new JPasswordField();
		loginpassword.setColumns(10);
		
		btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userName = loginuname.getText();
				String password = loginpassword.getText();
				String ret = UI.login(userName, password);
				
				if ( ret == null ) {
					showMessage( "Login Successfully" , "info");
					
					show(false, false, false, false, false, false, false, false, true);
					loginpassword.setText("");
					loginuname.setText("");
					
					currentUserName = userName;
					if ( UI.isPremuim(userName) == true ) {
						upgrade.setEnabled(false);
					}
					else {
						upgrade.setEnabled(true);
					}
				}
				else {
					showError(ret);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(false, false, true, false, false, false, false, false, false);
				signup.setEnabled(true); login.setEnabled(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_loginP = new GroupLayout(loginP);
		gl_loginP.setHorizontalGroup(
			gl_loginP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginP.createSequentialGroup()
					.addGap(43)
					.addGroup(gl_loginP.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_loginP.createSequentialGroup()
							.addComponent(lblPassword_1, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(loginpassword, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
						.addGroup(gl_loginP.createSequentialGroup()
							.addComponent(lblUserName, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(loginuname, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)))
					.addGap(32))
				.addGroup(gl_loginP.createSequentialGroup()
					.addGap(42)
					.addGroup(gl_loginP.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_loginP.createSequentialGroup()
							.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_loginP.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
							.addGap(33))))
		);
		gl_loginP.setVerticalGroup(
			gl_loginP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginP.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_loginP.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserName)
						.addComponent(loginuname, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addGroup(gl_loginP.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblPassword_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(loginpassword, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		loginP.setLayout(gl_loginP);
		
		userP = new JPanel();
		userP.setBounds(10, 11, 493, 298);
		frmFcisocialnetwork.getContentPane().add(userP);
		userP.setLayout(null);
		
		lblSearchForUser = new JLabel("Search for User");
		lblSearchForUser.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSearchForUser.setBounds(10, 11, 110, 29);
		userP.add(lblSearchForUser);
		
		searchTxt = new JTextField();
		searchTxt.setBounds(130, 16, 240, 20);
		userP.add(searchTxt);
		searchTxt.setColumns(10);
		
		search = new JButton("Search");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = searchTxt.getText();
				String ret = UI.searchAboutUser(userName);
				
				if ( ret == null && userName.compareTo(currentUserName) != 0 ) {
					searchUserName = userName;
					show(false, false, false, false, false, false, true, false, true);
				}
				else if ( userName.compareTo(currentUserName) == 0 ) {
					noMessage.setText("               You Search About Your Account!");
					show(false, false, false, false, false, false, false, true, true);
					searchUserName = "";
				}
				else {
					noMessage.setText(ret);
					show(false, false, false, false, false, false, false, true, true);
					searchUserName = "";
				}
				
				if ( userName.length() == 0 ) {
					show(false, false, false, false, false, false, false, false, true);
					searchUserName = "";
				}
			}
		});
		search.setBounds(380, 15, 103, 23);
		userP.add(search);
		
		yes = new JPanel();
		yes.setBounds(10, 50, 473, 62);
		userP.add(yes);
		
		btnNewButton_3 = new JButton("Send Friend Request");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ret = UI.sendFriendRequest(currentUserName, searchUserName);
				if ( ret == null ) {
					showMessage( "Friend Request is Sent Successfully" , "info");
					searchTxt.setText("");
				}
				else {
					showMessage(ret, "info");
				}
				
				yes.setVisible(false);
				no.setVisible(false);
			}
		});
		GroupLayout gl_yes = new GroupLayout(yes);
		gl_yes.setHorizontalGroup(
			gl_yes.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_yes.createSequentialGroup()
					.addContainerGap(146, Short.MAX_VALUE)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
					.addGap(142))
		);
		gl_yes.setVerticalGroup(
			gl_yes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_yes.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		yes.setLayout(gl_yes);
		
		no = new JPanel();
		no.setBounds(10, 50, 473, 62);
		userP.add(no);
		
		noMessage = new JLabel("User Not Founded");
		noMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_no = new GroupLayout(no);
		gl_no.setHorizontalGroup(
			gl_no.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_no.createSequentialGroup()
					.addContainerGap(158, Short.MAX_VALUE)
					.addComponent(noMessage)
					.addGap(156))
		);
		gl_no.setVerticalGroup(
			gl_no.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_no.createSequentialGroup()
					.addGap(23)
					.addComponent(noMessage)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		no.setLayout(gl_no);
		
		showRequests = new JButton("Show Requests");
		showRequests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(false, false, false, false, true , false, false, false, false);
				searchTxt.setText("");
				
				Vector<String> all = UI.getAllRequests(currentUserName);
				int size = all.size();
				
				String[][] ref = new String[size][2];
				String[] combo = new String[size];
				for ( int i = 0; i < size; ++i ) {
					ref[i][0] = String.valueOf(i+1);
					ref[i][1] = all.elementAt(i);
					combo[i]  = all.elementAt(i);
				}
		
				requestBox.setModel(new DefaultComboBoxModel(combo));
				
				requestTable.setModel(new DefaultTableModel(
						ref, 
						new String[] {
							"Request Number", "UserName",
						}
					) {
						private static final long serialVersionUID = 1L;
						boolean[] columnEditables = new boolean[] {
							false,false
						};
						public boolean isCellEditable(int row, int column) {
							return columnEditables[column];
						}
					});
				
				DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
				centerRenderer.setHorizontalAlignment(JLabel.CENTER);
				for ( int i = 0; i < 2; ++i ) {
					requestTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);	
				}
				
				
			}
		});
		showRequests.setBounds(10, 213, 146, 29);
		userP.add(showRequests);
		
		btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				searchTxt.setText("");
				UI.logOut(currentUserName);
				show(false, false, true, false, false , false, false, false, false);
				login.setEnabled(true); signup.setEnabled(true);
			}
		});
		btnLogout.setBounds(168, 213, 159, 29);
		userP.add(btnLogout);
		
		btnShowNotifications = new JButton("Show Notifications");
		btnShowNotifications.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(false, false, false, false, false, true, false, false, false);
				searchTxt.setText("");
				
				Vector<String> all = UI.getAllNotification(currentUserName);
				int size = all.size();
				
				String[][] ref = new String[size][1];
				for ( int i = size-1; i >= 0; --i ) {
					ref[i][0] = all.get(i);
				}
				
				notificationTable.setModel(new DefaultTableModel(
						ref, 
						new String[] {
							"Notification"
						}
					) {
						private static final long serialVersionUID = 1L;
						boolean[] columnEditables = new boolean[] {
							false
						};
						public boolean isCellEditable(int row, int column) {
							return columnEditables[column];
						}
					});
				
				DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
				centerRenderer.setHorizontalAlignment(JLabel.CENTER);
				for ( int i = 0; i < 1; ++i ) {
					notificationTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);	
				}
			}
		});
		btnShowNotifications.setBounds(337, 213, 146, 29);
		userP.add(btnShowNotifications);
		
		upgrade = new JButton("ugrade to premium");
		upgrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean ret = NormalUserUI.upgradeAccount(currentUserName);
				if ( ret ) {
					showMessage("Account upgraded successfully", "info");
					upgrade.setEnabled(false);
				}
			}
		});
		upgrade.setBounds(10, 253, 473, 29);
		userP.add(upgrade);
		
		notificationListP = new JPanel();
		notificationListP.setBounds(10, 11, 493, 298);
		frmFcisocialnetwork.getContentPane().add(notificationListP);
		
		JButton backN = new JButton("Back");
		backN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(false, false, false, false, false, false, false, false, true);
			}
		});
		backN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		scrollPane = new JScrollPane();
		GroupLayout gl_notificationListP = new GroupLayout(notificationListP);
		gl_notificationListP.setHorizontalGroup(
			gl_notificationListP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_notificationListP.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_notificationListP.createParallelGroup(Alignment.LEADING)
						.addComponent(backN, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addGroup(gl_notificationListP.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
							.addGap(3)))
					.addContainerGap())
		);
		gl_notificationListP.setVerticalGroup(
			gl_notificationListP.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_notificationListP.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
					.addGap(14)
					.addComponent(backN, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		notificationTable = new JTable();
		scrollPane.setViewportView(notificationTable);
		notificationListP.setLayout(gl_notificationListP);
		
		requestP = new JPanel();
		requestP.setBounds(10, 11, 493, 298);
		frmFcisocialnetwork.getContentPane().add(requestP);
		
		backR = new JButton("Back");
		backR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show(false, false, false, false, false, false, false, false, true);
			}
		});
		backR.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JScrollPane notificationPane = new JScrollPane();
		
		requestBox = new JComboBox();
		
		JButton Accept = new JButton("Accept");
		Accept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ( requestBox.getSelectedItem() != null ) {
					UI.AcceptRequest(currentUserName, requestBox.getSelectedItem().toString());
					showRequests.doClick();
				}
				else {
					showMessage( "No request is selected to Accept" , "info");
				}
				
			}
		});
		
		JButton Delete = new JButton("Delete");
		Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ( requestBox.getSelectedItem() != null ) {
					UI.DeleteRequest(currentUserName, requestBox.getSelectedItem().toString());
					showRequests.doClick();
				}
				else {
					showMessage( "No request is selected to Delete" , "info");
				}
				
			}
		});
		GroupLayout gl_requestP = new GroupLayout(requestP);
		gl_requestP.setHorizontalGroup(
			gl_requestP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_requestP.createSequentialGroup()
					.addGroup(gl_requestP.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_requestP.createSequentialGroup()
							.addContainerGap()
							.addComponent(notificationPane, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_requestP.createParallelGroup(Alignment.LEADING)
								.addComponent(Delete, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
								.addComponent(Accept, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
								.addComponent(requestBox, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.TRAILING, gl_requestP.createSequentialGroup()
							.addGap(9)
							.addComponent(backR, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_requestP.setVerticalGroup(
			gl_requestP.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_requestP.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_requestP.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_requestP.createSequentialGroup()
							.addComponent(requestBox, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(Accept, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Delete, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addComponent(notificationPane, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(backR, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		
		requestTable = new JTable();
		notificationPane.setViewportView(requestTable);
		requestP.setLayout(gl_requestP);
		
		payP = new JPanel();
		payP.setBounds(10, 11, 493, 298);
		frmFcisocialnetwork.getContentPane().add(payP);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PayPal", "Credit Card"}));
		
		JButton btnNewButton_5 = new JButton("Pay");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_payP = new GroupLayout(payP);
		gl_payP.setHorizontalGroup(
			gl_payP.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_payP.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_payP.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
						.addComponent(comboBox, Alignment.LEADING, 0, 473, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_payP.setVerticalGroup(
			gl_payP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_payP.createSequentialGroup()
					.addGap(50)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(86, Short.MAX_VALUE))
		);
		payP.setLayout(gl_payP);
		welcomeMessage.setEditable(false);
		welcomeMessage.setBackground(SystemColor.menu);
		frmFcisocialnetwork.getContentPane().add(welcomePanel);
		GroupLayout gl_welcomePanel = new GroupLayout(welcomePanel);
		gl_welcomePanel.setHorizontalGroup(
			gl_welcomePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_welcomePanel.createSequentialGroup()
					.addComponent(welcomeMessage, GroupLayout.PREFERRED_SIZE, 495, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_welcomePanel.setVerticalGroup(
			gl_welcomePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_welcomePanel.createSequentialGroup()
					.addComponent(welcomeMessage, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		welcomePanel.setLayout(gl_welcomePanel);
		frmFcisocialnetwork.getContentPane().add(login);
		frmFcisocialnetwork.getContentPane().add(signup);
		
		finish();
	}
	
	public static void showError( String _error ) {
		final JPanel panel = new JPanel();
	    JOptionPane.showMessageDialog(panel, _error, "Error", JOptionPane.ERROR_MESSAGE);   
	}
	
	public static void showMessage( String _message , String title ) {
		final JPanel panel = new JPanel();
	    JOptionPane.showMessageDialog(panel, _message, title, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void show( boolean login , boolean signUp , boolean welcomeP , boolean pay , boolean request , boolean notiP , boolean y , boolean n , boolean user ) {
		loginP.setVisible(login);
		signupP.setVisible(signUp);
		welcomePanel.setVisible(welcomeP);
		payP.setVisible(pay);
		requestP.setVisible(request);
		notificationListP.setVisible(notiP);
		yes.setVisible(y);
		no.setVisible(n);
		userP.setVisible(user);
	}
}

