import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Choice;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class MainScreen {

	private JFrame frmMathPractice;
	
	Random r = null;
	Scanner s = new Scanner(System.in);
	int min = 2;
	int max = 11;
	int userInput = 0;
	Integer problemNum = 1;
	Equation e = null;
	int numberOfProblems = 10;
	int correct = numberOfProblems;
	private JTextField txt_2;
	private JTextField txt_4;
	private JTextField txt_1;
	private JTextField txt_3;
	private JTextField textField;
	private JTextField txt_5;
	private JTextField txtCorrect;
	Choice choice = new Choice();
	String tryAgain = "Try Again";
	String goodLuck = "Good Luck!";
	String yes = "Yes!";
	String correctStr = "Correct!";
	String fantastic = "Fantastic!";
	String goodJob = "Good Job!";
	String sorry = "Sorry";
//	File f1 = new File("applause.wav");
//	File f2 = new File("chime.wav");
//	File f3 = new File("mathIsFun.wav");
//	File f4 = new File("whah_whah.wav");
//	File f5 = new File("yay.wav");
//	File f6 = new File("zag_x.wav");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frmMathPractice.setVisible(true);			
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}//end main()

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMathPractice = new JFrame();
		frmMathPractice.setBackground(Color.LIGHT_GRAY);
		frmMathPractice.setFont(new Font("Dialog", Font.BOLD, 12));
		frmMathPractice.setTitle("Math Practice");
		frmMathPractice.setBounds(100, 100, 380, 450);
		frmMathPractice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMathPractice.getContentPane().setLayout(null);
		
		
		choice.setFont(new Font("Dialog", Font.BOLD, 12));
		choice.setBounds(22, 22, 125, 23);
		choice.addItem("Addition");
		choice.addItem("Subtraction");
		choice.addItem("Multiplication");
		choice.addItem("Division");		
		frmMathPractice.getContentPane().add(choice);
		
		
		JButton btnNewButton = new JButton("PLAY !");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				startGame();
			}		
		});	
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(232, 21, 104, 23);
		frmMathPractice.getContentPane().add(btnNewButton);
		
		txt_2 = new JTextField();
		txt_2.setHorizontalAlignment(SwingConstants.CENTER);
		txt_2.setFont(new Font("Tahoma", Font.PLAIN, 65));
		txt_2.setEditable(false);
		txt_2.setBounds(134, 146, 112, 71);
		frmMathPractice.getContentPane().add(txt_2);
		txt_2.setColumns(10);
		txt_2.setBorder(null);
		
		txt_4 = new JTextField();
		txt_4.setFont(new Font("Tahoma", Font.PLAIN, 65));
		txt_4.setHorizontalAlignment(SwingConstants.CENTER);
		txt_4.setColumns(10);
		txt_4.setBounds(134, 239, 112, 71);
		frmMathPractice.getContentPane().add(txt_4);
		
		txt_1 = new JTextField();
		txt_1.setFont(new Font("Tahoma", Font.PLAIN, 65));
		txt_1.setHorizontalAlignment(SwingConstants.CENTER);
		txt_1.setEditable(false);
		txt_1.setColumns(10);
		txt_1.setBounds(134, 64, 112, 71);
		txt_1.setBorder(null);
		frmMathPractice.getContentPane().add(txt_1);
		
		txt_3 = new JTextField();
		txt_3.setHorizontalAlignment(SwingConstants.CENTER);
		txt_3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		txt_3.setEditable(false);
		txt_3.setColumns(10);
		txt_3.setBounds(68, 161, 56, 56);
		txt_3.setBorder(null);
		frmMathPractice.getContentPane().add(txt_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(SystemColor.windowText);
		textField.setBounds(68, 218, 178, 10);
		frmMathPractice.getContentPane().add(textField);
		textField.setColumns(10);
		
		txt_5 = new JTextField();
		txt_5.setHorizontalAlignment(SwingConstants.CENTER);
		txt_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		txt_5.setEditable(false);
		txt_5.setBounds(68, 64, 56, 40);
		frmMathPractice.getContentPane().add(txt_5);
		txt_5.setColumns(10);
		txt_5.setBorder(null);
		
		txtCorrect = new JTextField();
		txtCorrect.setFont(new Font("Tahoma", Font.PLAIN, 54));
		txtCorrect.setHorizontalAlignment(SwingConstants.CENTER);
		txtCorrect.setEditable(false);
		txtCorrect.setBounds(22, 321, 314, 71);
		frmMathPractice.getContentPane().add(txtCorrect);
		txtCorrect.setColumns(10);
		
		JButton btnCheck = new JButton("Answer");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nextProblem();
			}
		});
		btnCheck.setBounds(22, 287, 104, 23);
		btnCheck.setVisible(false);
		frmMathPractice.getRootPane().setDefaultButton(btnCheck);
		frmMathPractice.getContentPane().add(btnCheck);
		
		
	}//end initialize
	
	
	private void startGame() 
	{ 
		r = new Random();
		e = new Equation(r.nextInt(max)+min, r.nextInt(max)+min);
		txt_1.setText(e.getFirstNumStr());
		txt_2.setText(e.getsecondNumStr());
		txtCorrect.setText("Good Luck!");
		setProblemType();
		txt_5.setText(problemNum.toString()+".)");
		txt_4.requestFocusInWindow();
		problemNum++;
	}
	
	private void nextProblem() 
	{
		try
		{
			if(txt_4.getText().equals(e.getAnswerStr()))
			{
				txtCorrect.setBackground(Color.GREEN);
				displayEncouragement();
				txt_4.setText("");
				r = new Random();
				e = new Equation(r.nextInt(max)+min, r.nextInt(max)+min);
				txt_1.setText(e.getFirstNumStr());
				txt_2.setText(e.getsecondNumStr());
				setProblemType();
				txt_5.setText(problemNum.toString()+".)");
				txt_4.requestFocusInWindow();
				problemNum++;
			}
			else
			{
				txtCorrect.setBackground(Color.RED);
				//txtCorrect.setText(tryAgain);
								
				wrongAnswer();
				
				txt_4.setText("");
			}
		}
		catch(NullPointerException e){}
	}//end nextProblem

	
	
	private void setProblemType()
	{
		if(choice.getSelectedItem() == "Addition")
		{
			txt_3.setText("+");
			e.add();
		}
		if(choice.getSelectedItem() == "Subtraction")
		{
			txt_3.setText("-");
			e.subtract();
		}
		if(choice.getSelectedItem() == "Multiplication")
		{
			txt_3.setText("X");
			e.multiply();
		}
		if(choice.getSelectedItem() == "Division")
		{
			txt_3.setText(Character.toString((char)247));
			e.divide();
		}
	}//end setProblem
	
	private void displayEncouragement()
	{
		String t = txtCorrect.getText();
		if( t.equals(goodLuck) || t.equals(yes) ||t.equals(tryAgain)|| t.equals(sorry))
		{
			txtCorrect.setText(correctStr);
		}
		else if(t.equals(correctStr))
		{
			txtCorrect.setText(goodJob);
		}
		else if(t.equals(goodJob))
		{
			txtCorrect.setText(fantastic);
		}
		else if(t.equals(fantastic))
		{
			txtCorrect.setText(yes);
		}		
	}
	
	private void wrongAnswer() {
		String t = txtCorrect.getText();
		if( t.equals(sorry) || t.equals(goodLuck) || t.equals(yes) || t.equals(correctStr) || t.equals(fantastic) || t.equals(goodJob))
		{
			txtCorrect.setText(tryAgain);
		}
		else if(t.equals(tryAgain))
		{
			txtCorrect.setText(sorry);
		}
	}

	
}//end class
