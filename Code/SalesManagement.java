import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.UIManager;
import javax.swing.JTextArea;

public class SalesManagement {

	private JFrame frame;
	private JTextField candy;
	private JTextField soda;
	private JTextField chips;
	private JTextField bread;
	private JTextField cookies;
	private JTextField fountain;
	private JTextField marlboro;
	private JTextField camel;
	private JTextField newport;
	private JTextField pallMall;
	private JTextField winston;
	private JTextField lm;
	private JTextField budweiser;
	private JTextField corona;
	private JTextField budlight;
	private JTextField heineken;
	private JTextField skol;
	private JTextField coorsLight;
	private JTextField txtgroceryTotal;
	private JTextField txtcigarettesTotal;
	private JTextField txtalcoholTotal;
	private JTextField overallTax;
	private JTextField subTotal;
	private JTextField Ttotal;
	private JTextField Tcash;
	private JTextField Tchange;
	private JTextArea txtReciept;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesManagement window = new SalesManagement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SalesManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("Sales Manager");
		frame.setResizable(false);
		frame.getContentPane().setForeground(SystemColor.text);
		frame.setBounds(100, 100, 1310, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		JPanel panelGrocery = new JPanel();
		panelGrocery.setBackground(new Color(255, 255, 255));
		panelGrocery.setForeground(new Color(0, 0, 0));
		panelGrocery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelGrocery.setBounds(20, 117, 300, 287);
		frame.getContentPane().add(panelGrocery);
		panelGrocery.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Candy");
		lblNewLabel_1.setBackground(new Color(255, 255, 240));
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 22, 140, 32);
		panelGrocery.add(lblNewLabel_1);

		candy = new JTextField();
		candy.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		candy.setHorizontalAlignment(SwingConstants.CENTER);
		candy.setText("0");
		candy.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {

				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		candy.setBounds(160, 22, 112, 32);
		panelGrocery.add(candy);
		candy.setColumns(10);

		JLabel lblDrink = new JLabel("Soda");
		lblDrink.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDrink.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrink.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblDrink.setBounds(10, 65, 140, 32);
		panelGrocery.add(lblDrink);

		JLabel lblChips = new JLabel("Chips");
		lblChips.setHorizontalTextPosition(SwingConstants.CENTER);
		lblChips.setHorizontalAlignment(SwingConstants.CENTER);
		lblChips.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblChips.setBounds(10, 108, 140, 32);
		panelGrocery.add(lblChips);

		JLabel lblBread = new JLabel("Bread");
		lblBread.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBread.setHorizontalAlignment(SwingConstants.CENTER);
		lblBread.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblBread.setBounds(10, 151, 140, 32);
		panelGrocery.add(lblBread);

		JLabel lblEggs = new JLabel("Cookies");
		lblEggs.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEggs.setHorizontalAlignment(SwingConstants.CENTER);
		lblEggs.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblEggs.setBounds(10, 194, 140, 32);
		panelGrocery.add(lblEggs);

		JLabel lblFountainDrink = new JLabel("Fountain Drink");
		lblFountainDrink.setHorizontalTextPosition(SwingConstants.CENTER);
		lblFountainDrink.setHorizontalAlignment(SwingConstants.CENTER);
		lblFountainDrink.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblFountainDrink.setBounds(10, 237, 140, 32);
		panelGrocery.add(lblFountainDrink);

		soda = new JTextField();
		soda.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		soda.setHorizontalAlignment(SwingConstants.CENTER);
		soda.setText("0");
		soda.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		soda.setColumns(10);
		soda.setBounds(160, 65, 112, 32);
		panelGrocery.add(soda);

		chips = new JTextField();
		chips.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		chips.setHorizontalAlignment(SwingConstants.CENTER);
		chips.setText("0");
		chips.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		chips.setColumns(10);
		chips.setBounds(160, 108, 112, 32);
		panelGrocery.add(chips);

		bread = new JTextField();
		bread.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		bread.setHorizontalAlignment(SwingConstants.CENTER);
		bread.setText("0");
		bread.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		bread.setColumns(10);
		bread.setBounds(160, 151, 112, 32);
		panelGrocery.add(bread);

		cookies = new JTextField();
		cookies.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		cookies.setHorizontalAlignment(SwingConstants.CENTER);
		cookies.setText("0");
		cookies.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		cookies.setColumns(10);
		cookies.setBounds(160, 194, 112, 32);
		panelGrocery.add(cookies);

		fountain = new JTextField();
		fountain.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		fountain.setHorizontalAlignment(SwingConstants.CENTER);
		fountain.setText("0");
		fountain.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		fountain.setColumns(10);
		fountain.setBounds(160, 237, 112, 32);
		panelGrocery.add(fountain);

		JPanel panelGT = new JPanel();
		panelGT.setBackground(new Color(255, 255, 255));
		panelGT.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelGT.setBounds(20, 422, 300, 53);
		frame.getContentPane().add(panelGT);
		panelGT.setLayout(null);

		JLabel lblTotal = new JLabel("GROCERY TOTAL");
		lblTotal.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblTotal.setBounds(10, 11, 140, 32);
		panelGT.add(lblTotal);

		txtgroceryTotal = new JTextField();
		txtgroceryTotal.setText("0.00");
		txtgroceryTotal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		txtgroceryTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtgroceryTotal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		txtgroceryTotal.setColumns(10);
		txtgroceryTotal.setBounds(160, 11, 112, 32);
		panelGT.add(txtgroceryTotal);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_6.setBounds(20, 497, 1263, 100);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);

		JLabel lblOverallTax = new JLabel("OVERALL TAX");
		lblOverallTax.setHorizontalTextPosition(SwingConstants.CENTER);
		lblOverallTax.setHorizontalAlignment(SwingConstants.CENTER);
		lblOverallTax.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblOverallTax.setBounds(10, 11, 140, 32);
		panel_6.add(lblOverallTax);

		overallTax = new JTextField();
		overallTax.setText("0.00");
		overallTax.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		overallTax.setHorizontalAlignment(SwingConstants.CENTER);
		overallTax.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		overallTax.setColumns(10);
		overallTax.setBounds(160, 11, 112, 32);
		panel_6.add(overallTax);

		JLabel lblSubtotal = new JLabel("SUBTOTAL");
		lblSubtotal.setBackground(new Color(255, 215, 0));
		lblSubtotal.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSubtotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubtotal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblSubtotal.setBounds(10, 54, 140, 32);
		panel_6.add(lblSubtotal);

		subTotal = new JTextField();
		subTotal.setText("0.00");
		subTotal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		subTotal.setHorizontalAlignment(SwingConstants.CENTER);
		subTotal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		subTotal.setColumns(10);
		subTotal.setBounds(160, 54, 112, 32);
		panel_6.add(subTotal);

		JLabel label_4 = new JLabel("TOTAL");
		label_4.setHorizontalTextPosition(SwingConstants.CENTER);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		label_4.setBounds(333, 11, 140, 32);
		panel_6.add(label_4);

		Ttotal = new JTextField();
		Ttotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ttotal.getText();
			}
		});
		Ttotal.setText("0.00");
		Ttotal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		Ttotal.setHorizontalAlignment(SwingConstants.CENTER);
		Ttotal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		Ttotal.setColumns(10);
		Ttotal.setBounds(483, 11, 112, 32);
		panel_6.add(Ttotal);

		JButton totalButton = new JButton("TOTAL");
		totalButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		totalButton.setForeground(new Color(255, 255, 255));
		totalButton.setBackground(new Color(255, 215, 0));
		totalButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		totalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ProductSales ps = new ProductSales();
				SalesTax tax = new SalesTax();

				double itemTax, itemSubtotal, itemTotal;

				ps.candy = ps.pcandy * Double.parseDouble(candy.getText());
				ps.soda = ps.psoda * Double.parseDouble(soda.getText());
				ps.chips = ps.pchips * Double.parseDouble(chips.getText());
				ps.cookies = ps.pcookies * Double.parseDouble(cookies.getText());
				ps.fountain = ps.pfountain * Double.parseDouble(fountain.getText());
				ps.bread = ps.pbread * Double.parseDouble(bread.getText());
				ps.marlboro = ps.pmarlboro * Double.parseDouble(marlboro.getText());
				ps.camel = ps.pcamel * Double.parseDouble(camel.getText());
				ps.newport = ps.pnewport * Double.parseDouble(newport.getText());
				ps.pallmall = ps.ppallmall * Double.parseDouble(pallMall.getText());
				ps.winston = ps.pwinston * Double.parseDouble(winston.getText());
				ps.lm = ps.plm * Double.parseDouble(lm.getText());
				ps.budweiser = ps.pbudweiser * Double.parseDouble(budweiser.getText());
				ps.corona = ps.pcorona * Double.parseDouble(corona.getText());
				ps.budlight = ps.pbudlight * Double.parseDouble(budlight.getText());
				ps.heineken = ps.pheineken * Double.parseDouble(heineken.getText());
				ps.skol = ps.pskol * Double.parseDouble(skol.getText());
				ps.coorsLight = ps.pcoorsLight * Double.parseDouble(coorsLight.getText());

				itemSubtotal = ps.getTotal();
				itemTax = tax.stax(itemSubtotal);
				itemTotal = itemSubtotal + itemTax;

				String taxTotal = String.format("$%.2f", itemTax);
				overallTax.setText(taxTotal);

				String subTotalCost = String.format("$%.2f", itemSubtotal);
				subTotal.setText(subTotalCost);

				String totalCost = String.format("%.2f", itemTotal);
				Ttotal.setText(totalCost);
				//Ttotal.setText(itemTotal + "");
				
				String GrocerytotalCost = String.format("$%.2f", ps.groceryTotal);
				txtgroceryTotal.setText(GrocerytotalCost);

				String CigarettetotalCost = String.format("$%.2f", ps.cigaretteTotal);
				txtcigarettesTotal.setText(CigarettetotalCost);

				String AlcoholtotalCost = String.format("$%.2f", ps.alcoholTotal);
				txtalcoholTotal.setText(AlcoholtotalCost);

			}
		});
		totalButton.setBounds(636, 54, 101, 33);
		panel_6.add(totalButton);

		JButton resetButton = new JButton("RESET");
		resetButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		resetButton.setBackground(new Color(199, 21, 133));
		resetButton.setForeground(new Color(255, 255, 255));
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// DELETES ALL TEXT FROM JTEXTFIELD

				/**
				 * JTextField clearText = null; for(Component c:
				 * panelGrocery.getComponents()){
				 * if(c.getClass().toString().contains("JTextField")){
				 * //"javax.swing.JTextField"
				 * 
				 * clearText = (JTextField)c; clearText.setText("0");
				 * clearText.setEnabled(false); } }
				 */

				candy.setText("0");
				soda.setText("0");
				chips.setText("0");
				bread.setText("0");
				cookies.setText("0");
				fountain.setText("0");

				txtgroceryTotal.setText("0");
				txtcigarettesTotal.setText("0");
				txtalcoholTotal.setText("0");
				overallTax.setText("0");
				subTotal.setText("0");
				Ttotal.setText("0");

				marlboro.setText("0");
				camel.setText("0");
				newport.setText("0");
				pallMall.setText("0");
				winston.setText("0");
				lm.setText("0");
				budweiser.setText("0");
				corona.setText("0");
				budlight.setText("0");
				heineken.setText("0");
				skol.setText("0");
				coorsLight.setText("0");
				Tcash.setText("");
				Tchange.setText("0.0");
				txtReciept.setText(" ");

				
				/**
				 * for(Component c: panelCigarette.getComponents()){
				 * if(c.getClass().toString().contains("JTextField")){
				 * //"javax.swing.JTextField"
				 * 
				 * clearText = (JTextField)c; clearText.setText("");
				 * clearText.setEnabled(false); } }
				 * 
				 * for(Component c: panelAlcohol.getComponents()){
				 * if(c.getClass().toString().contains("JTextField")){
				 * //"javax.swing.JTextField"
				 * 
				 * clearText = (JTextField)c; clearText.setText("");
				 * clearText.setEnabled(false); } }
				 */

			}
		});
		resetButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		resetButton.setBounds(999, 34, 101, 33);
		panel_6.add(resetButton);

		JButton exitButton = new JButton("EXIT");
		exitButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		exitButton.setBackground(new Color(95, 158, 160));
		exitButton.setForeground(new Color(255, 255, 255));
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ExitSales es = new ExitSales();
				es.exit();

			}
		});
		exitButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		exitButton.setBounds(1123, 34, 101, 33);
		panel_6.add(exitButton);

		JButton btnCash = new JButton("CASH");
		btnCash.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	Ttotal.getText();
			//	Tcash.getText();
				
				double costs = Double.parseDouble(Ttotal.getText());
				double customers = Double.parseDouble(Tcash.getText());
				double changes = costs - customers;

				if (changes <= 0) {
					String Fchange = String.format("%.2f", changes);
					Tchange.setText("$" + Fchange.substring(1, Fchange.length()));
				} else {
					JOptionPane.showMessageDialog(frame,"Check the cash amount");
					Tchange.setText("");
				}

			}
		});
		btnCash.setForeground(Color.WHITE);
		btnCash.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnCash.setBackground(new Color(50, 205, 50));
		btnCash.setBounds(747, 54, 101, 33);
		panel_6.add(btnCash);

		JLabel lblCash = new JLabel("CASH");
		lblCash.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCash.setHorizontalAlignment(SwingConstants.CENTER);
		lblCash.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblCash.setBounds(333, 54, 140, 32);
		panel_6.add(lblCash);

		Tcash = new JTextField();
		
		Tcash.setHorizontalAlignment(SwingConstants.CENTER);
		Tcash.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		Tcash.setColumns(10);
		Tcash.setBounds(483, 54, 112, 32);
		panel_6.add(Tcash);

		JLabel lblChange = new JLabel("CHANGE");
		lblChange.setHorizontalTextPosition(SwingConstants.CENTER);
		lblChange.setHorizontalAlignment(SwingConstants.CENTER);
		lblChange.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblChange.setBounds(663, 11, 112, 32);
		panel_6.add(lblChange);

		Tchange = new JTextField();
		Tchange.setBackground(SystemColor.text);
		Tchange.setEditable(false);
		Tchange.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		Tchange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Tchange.getText();
			}
		});
		Tchange.setHorizontalAlignment(SwingConstants.CENTER);
		Tchange.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		Tchange.setColumns(10);
		Tchange.setBounds(801, 11, 112, 32);
		panel_6.add(Tchange);
		
		JButton lblreciept = new JButton("RECIEPT");
		lblreciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int ref = 100 + (int) Math.random() * 2344;
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate = new SimpleDateFormat("MM:dd:yyyy");
				tDate.format(timer.getTime());
				txtReciept.append("\n\tSales Manager        \n" + "  *********************************************\n");
				txtReciept.append("   REFERENCE #" + ref + "\n");
				txtReciept.append("  *********************************************\n");
				txtReciept.append("  " + tDate.format(timer.getTime()) + "                                   " + tTime.format(timer.getTime()) + "\n");
				txtReciept.append("  *********************************************\n");
				txtReciept.append("   Tax:" + "                                               " + overallTax.getText() + "\n");
				txtReciept.append("   SubTotal:" + "                                      " + subTotal.getText() + "\n");
				txtReciept.append("   Total:" + "                                            $" + Ttotal.getText() + "\n");
				txtReciept.append("   Cash:" + "                                             $" + Tcash.getText() + "\n");
				txtReciept.append("   Change:" + "                                         " + Tchange.getText() + "\n");
				txtReciept.append("  *********************************************\n");
				txtReciept.append("\t  Thank You\n");
				txtReciept.append("  *********************************************\n");
				
			}
		});
		lblreciept.setForeground(Color.WHITE);
		lblreciept.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblreciept.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblreciept.setBackground(new Color(138, 43, 226));
		lblreciept.setBounds(858, 54, 101, 33);
		panel_6.add(lblreciept);

		JLabel lblNewLabel = new JLabel("GROCERY");
		lblNewLabel.setForeground(new Color(50, 205, 50));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(103, 89, 126, 28);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblCiggerates = new JLabel("CIGARETTES");
		lblCiggerates.setHorizontalAlignment(SwingConstants.CENTER);
		lblCiggerates.setForeground(new Color(255, 69, 0));
		lblCiggerates.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblCiggerates.setBounds(423, 89, 126, 28);
		frame.getContentPane().add(lblCiggerates);

		JLabel lblAlcohol = new JLabel("ALCOHOL");
		lblAlcohol.setBackground(new Color(30, 144, 255));
		lblAlcohol.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlcohol.setForeground(new Color(153, 50, 204));
		lblAlcohol.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblAlcohol.setBounds(752, 89, 126, 28);
		frame.getContentPane().add(lblAlcohol);

		JPanel panelCigarette = new JPanel();
		panelCigarette.setBackground(new Color(255, 255, 255));
		panelCigarette.setLayout(null);
		panelCigarette.setForeground(Color.BLACK);
		panelCigarette.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCigarette.setBounds(342, 117, 300, 287);
		frame.getContentPane().add(panelCigarette);

		JLabel lblMarlboro = new JLabel("Marlboro");
		lblMarlboro.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMarlboro.setHorizontalAlignment(SwingConstants.CENTER);
		lblMarlboro.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblMarlboro.setBounds(10, 22, 140, 32);
		panelCigarette.add(lblMarlboro);

		marlboro = new JTextField();
		marlboro.setText("0");
		marlboro.setHorizontalAlignment(SwingConstants.CENTER);
		marlboro.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		marlboro.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		marlboro.setColumns(10);
		marlboro.setBounds(160, 22, 112, 32);
		panelCigarette.add(marlboro);

		JLabel lblCamel = new JLabel("Camel");
		lblCamel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCamel.setHorizontalAlignment(SwingConstants.CENTER);
		lblCamel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblCamel.setBounds(10, 65, 140, 32);
		panelCigarette.add(lblCamel);

		JLabel lblNewport = new JLabel("Newport");
		lblNewport.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewport.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewport.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewport.setBounds(10, 108, 140, 32);
		panelCigarette.add(lblNewport);

		JLabel lblPallMall = new JLabel("Pall Mall");
		lblPallMall.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPallMall.setHorizontalAlignment(SwingConstants.CENTER);
		lblPallMall.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblPallMall.setBounds(10, 151, 140, 32);
		panelCigarette.add(lblPallMall);

		JLabel lblWintson = new JLabel("Wintson");
		lblWintson.setHorizontalTextPosition(SwingConstants.CENTER);
		lblWintson.setHorizontalAlignment(SwingConstants.CENTER);
		lblWintson.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblWintson.setBounds(10, 194, 140, 32);
		panelCigarette.add(lblWintson);

		JLabel lblLM = new JLabel("L & M");
		lblLM.setHorizontalTextPosition(SwingConstants.CENTER);
		lblLM.setHorizontalAlignment(SwingConstants.CENTER);
		lblLM.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblLM.setBounds(10, 237, 140, 32);
		panelCigarette.add(lblLM);

		camel = new JTextField();
		camel.setText("0");
		camel.setHorizontalAlignment(SwingConstants.CENTER);
		camel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		camel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		camel.setColumns(10);
		camel.setBounds(160, 65, 112, 32);
		panelCigarette.add(camel);

		newport = new JTextField();
		newport.setText("0");
		newport.setHorizontalAlignment(SwingConstants.CENTER);
		newport.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		newport.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		newport.setColumns(10);
		newport.setBounds(160, 108, 112, 32);
		panelCigarette.add(newport);

		pallMall = new JTextField();
		pallMall.setText("0");
		pallMall.setHorizontalAlignment(SwingConstants.CENTER);
		pallMall.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		pallMall.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		pallMall.setColumns(10);
		pallMall.setBounds(160, 151, 112, 32);
		panelCigarette.add(pallMall);

		winston = new JTextField();
		winston.setText("0");
		winston.setHorizontalAlignment(SwingConstants.CENTER);
		winston.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		winston.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		winston.setColumns(10);
		winston.setBounds(160, 194, 112, 32);
		panelCigarette.add(winston);

		lm = new JTextField();
		lm.setText("0");
		lm.setHorizontalAlignment(SwingConstants.CENTER);
		lm.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lm.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		lm.setColumns(10);
		lm.setBounds(160, 237, 112, 32);
		panelCigarette.add(lm);

		JPanel panelAlcohol = new JPanel();
		panelAlcohol.setBackground(new Color(255, 255, 255));
		panelAlcohol.setLayout(null);
		panelAlcohol.setForeground(Color.BLACK);
		panelAlcohol.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelAlcohol.setBounds(662, 117, 300, 287);
		frame.getContentPane().add(panelAlcohol);

		JLabel lblBudweiser = new JLabel("Budweiser");
		lblBudweiser.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBudweiser.setHorizontalAlignment(SwingConstants.CENTER);
		lblBudweiser.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblBudweiser.setBounds(10, 22, 140, 32);
		panelAlcohol.add(lblBudweiser);

		budweiser = new JTextField();
		budweiser.setHorizontalAlignment(SwingConstants.CENTER);
		budweiser.setText("0");
		budweiser.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		budweiser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		budweiser.setColumns(10);
		budweiser.setBounds(160, 22, 112, 32);
		panelAlcohol.add(budweiser);

		JLabel lblCorona = new JLabel("Corona");
		lblCorona.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCorona.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorona.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblCorona.setBounds(10, 65, 140, 32);
		panelAlcohol.add(lblCorona);

		JLabel lblSmirmoff = new JLabel("Bud Light");
		lblSmirmoff.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSmirmoff.setHorizontalAlignment(SwingConstants.CENTER);
		lblSmirmoff.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblSmirmoff.setBounds(10, 108, 140, 32);
		panelAlcohol.add(lblSmirmoff);

		JLabel lblSmirnoff = new JLabel("Heineken");
		lblSmirnoff.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSmirnoff.setHorizontalAlignment(SwingConstants.CENTER);
		lblSmirnoff.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblSmirnoff.setBounds(10, 151, 140, 32);
		panelAlcohol.add(lblSmirnoff);

		JLabel lblSkol = new JLabel("Skol");
		lblSkol.setHorizontalTextPosition(SwingConstants.CENTER);
		lblSkol.setHorizontalAlignment(SwingConstants.CENTER);
		lblSkol.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblSkol.setBounds(10, 194, 140, 32);
		panelAlcohol.add(lblSkol);

		JLabel lblCoorsLight = new JLabel("Coors Light");
		lblCoorsLight.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCoorsLight.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoorsLight.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblCoorsLight.setBounds(10, 237, 140, 32);
		panelAlcohol.add(lblCoorsLight);

		corona = new JTextField();
		corona.setHorizontalAlignment(SwingConstants.CENTER);
		corona.setText("0");
		corona.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		corona.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		corona.setColumns(10);
		corona.setBounds(160, 65, 112, 32);
		panelAlcohol.add(corona);

		budlight = new JTextField();
		budlight.setHorizontalAlignment(SwingConstants.CENTER);
		budlight.setText("0");
		budlight.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		budlight.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		budlight.setColumns(10);
		budlight.setBounds(160, 108, 112, 32);
		panelAlcohol.add(budlight);

		heineken = new JTextField();
		heineken.setHorizontalAlignment(SwingConstants.CENTER);
		heineken.setText("0");
		heineken.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		heineken.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		heineken.setColumns(10);
		heineken.setBounds(160, 151, 112, 32);
		panelAlcohol.add(heineken);

		skol = new JTextField();
		skol.setHorizontalAlignment(SwingConstants.CENTER);
		skol.setText("0");
		skol.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		skol.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		skol.setColumns(10);
		skol.setBounds(160, 194, 112, 32);
		panelAlcohol.add(skol);

		coorsLight = new JTextField();
		coorsLight.setHorizontalAlignment(SwingConstants.CENTER);
		coorsLight.setText("0");
		coorsLight.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		coorsLight.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		coorsLight.setColumns(10);
		coorsLight.setBounds(160, 237, 112, 32);
		panelAlcohol.add(coorsLight);

		JPanel panelCT = new JPanel();
		panelCT.setBackground(new Color(255, 255, 255));
		panelCT.setLayout(null);
		panelCT.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCT.setBounds(342, 422, 300, 53);
		frame.getContentPane().add(panelCT);

		JLabel lblCigarettesTotal = new JLabel("CIGARETTES TOTAL");
		lblCigarettesTotal.setBackground(new Color(255, 255, 255));
		lblCigarettesTotal.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCigarettesTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCigarettesTotal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblCigarettesTotal.setBounds(10, 11, 140, 32);
		panelCT.add(lblCigarettesTotal);

		txtcigarettesTotal = new JTextField();
		txtcigarettesTotal.setText("0.00");
		txtcigarettesTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtcigarettesTotal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		txtcigarettesTotal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		txtcigarettesTotal.setColumns(10);
		txtcigarettesTotal.setBounds(160, 11, 112, 32);
		panelCT.add(txtcigarettesTotal);

		JPanel panelAT = new JPanel();
		panelAT.setBackground(new Color(255, 255, 255));
		panelAT.setLayout(null);
		panelAT.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelAT.setBounds(662, 422, 300, 53);
		frame.getContentPane().add(panelAT);

		JLabel lblAlcoholTotal = new JLabel("ALCOHOL TOTAL");
		lblAlcoholTotal.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAlcoholTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlcoholTotal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblAlcoholTotal.setBounds(10, 11, 140, 32);
		panelAT.add(lblAlcoholTotal);

		txtalcoholTotal = new JTextField();
		txtalcoholTotal.setText("0.00");
		txtalcoholTotal.setHorizontalAlignment(SwingConstants.CENTER);
		txtalcoholTotal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		txtalcoholTotal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				SalesTax st = new SalesTax();
				st.checkInput(e);
			}
		});
		txtalcoholTotal.setColumns(10);
		txtalcoholTotal.setBounds(160, 11, 112, 32);
		panelAT.add(txtalcoholTotal);

		JPanel TitlPane = new JPanel();
		TitlPane.setBackground(new Color(220, 20, 60));
		TitlPane.setForeground(new Color(255, 255, 255));
		TitlPane.setBounds(20, 25, 1263, 53);
		TitlPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(TitlPane);
		TitlPane.setLayout(null);

		JLabel SalesImage1 = new JLabel("\r\n");
		SalesImage1.setBounds(10, 0, 60, 53);
		TitlPane.add(SalesImage1);
		SalesImage1.setIcon(
				new ImageIcon(new ImageIcon("C:\\Users\\Vinit Shah\\OneDrive\\Desktop\\home-increase-sales.png")
						.getImage().getScaledInstance(60, 53, Image.SCALE_DEFAULT)));

		JLabel SalesImage2 = new JLabel("\r\n");
		SalesImage2.setBounds(872, 0, 60, 53);
		TitlPane.add(SalesImage2);
		SalesImage2.setIcon(
				new ImageIcon(new ImageIcon("C:\\Users\\Vinit Shah\\OneDrive\\Desktop\\home-increase-sales.png")
						.getImage().getScaledInstance(60, 53, Image.SCALE_DEFAULT)));

		JLabel SalesManagerTitle = new JLabel("SALES MANAGER");
		SalesManagerTitle.setBounds(379, 0, 528, 53);
		TitlPane.add(SalesManagerTitle);
		SalesManagerTitle.setForeground(new Color(255, 255, 255));
		SalesManagerTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		SalesManagerTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
	

		JLabel lblReciept = new JLabel("RECIEPT");
		lblReciept.setHorizontalAlignment(SwingConstants.CENTER);
		lblReciept.setForeground(new Color(0, 0, 0));
		lblReciept.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblReciept.setBounds(1073, 89, 126, 28);
		frame.getContentPane().add(lblReciept);

		
		txtReciept = new JTextArea();
		txtReciept.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtReciept.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtReciept.setBounds(983, 117, 300, 358);
		txtReciept.setEnabled(true);
		frame.getContentPane().add(txtReciept);

		


	}
	
	
}
