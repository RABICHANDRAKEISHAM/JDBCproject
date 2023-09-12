import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class trial extends JFrame {

	private JPanel contentPane;
	private JTextField tfFirstname;
	private JTextField tfLastname;
	private JLabel lbWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trial frame = new trial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public trial() {
		setTitle("Main Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name :");
		lblNewLabel.setBounds(26, 10, 109, 48);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		tfFirstname = new JTextField();
		tfFirstname.setBounds(145, 27, 353, 19);
		contentPane.add(tfFirstname);
		tfFirstname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name :");
		lblNewLabel_1.setBounds(26, 49, 109, 39);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		tfLastname = new JTextField();
		tfLastname.setBounds(145, 56, 353, 19);
		contentPane.add(tfLastname);
		tfLastname.setColumns(10);
		
	    lbWelcome = new JLabel("");
		lbWelcome.setBounds(26, 172, 486, 69);
		contentPane.add(lbWelcome);
		
		JLabel lblNewLabel_3 = new JLabel("You can see your text  here....");
		lblNewLabel_3.setBounds(196, 144, 172, 33);
		contentPane.add(lblNewLabel_3);
		
		JButton btOk = new JButton("OK");
		btOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = tfFirstname.getText();
				String lastName = tfLastname.getText();
				lbWelcome.setText(" " + firstName + " " + lastName);
			}
		});
		btOk.setBounds(109, 264, 82, 21);
		btOk.setFont(new Font("Arial Black", Font.BOLD, 14));
		contentPane.add(btOk);
		
		JButton btClear = new JButton("CLEAR");
		btClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfFirstname.setText("");
				tfLastname.setText("");
				lbWelcome.setText("");
				
			}
		});
		btClear.setBounds(303, 263, 92, 22);
		btClear.setFont(new Font("Arial Black", Font.BOLD, 14));
		contentPane.add(btClear);
	}
}
