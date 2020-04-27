package Main_1A2B;

import Function.Check1A2BFunction;
import Function.GarbledFuntion;
import Function.LableFunction;
import Function.PictureFunction;
import Function.Scroll_TextFunction;
import Function.buttonFunction;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.TextArea;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Windows {
	
	Scroll_TextFunction STF = new Scroll_TextFunction();
	Check1A2BFunction C1A2BF = new Check1A2BFunction();
	PictureFunction PF = new PictureFunction();
	buttonFunction BF = new buttonFunction();
	LableFunction LF = new LableFunction();
	private JFrame frmab;
	static boolean lable_01Check;
	static boolean lable_02Check;
	static boolean lable_03Check;
	static boolean lable_04Check;
	static int Enter_a_value01 , Enter_a_value02 , Enter_a_value03 , Enter_a_value04;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				
				lable_01Check = false; lable_02Check = false; lable_03Check = false; lable_04Check = false;
				Enter_a_value01 = 0; Enter_a_value02 = 0; Enter_a_value03 = 0; Enter_a_value04 = 0;
				
				NumButton = 1;
				try {
					Windows window = new Windows();
					window.frmab.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	static int NumButton;
	public Windows() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmab = new JFrame();
		frmab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmab.setIconImage(Toolkit.getDefaultToolkit().getImage(Windows.class.getResource("/pictures/1A2B.png")));
		frmab.setTitle("1A2B");
		frmab.setBounds(100, 100, 634, 413);
		
		/*
		 * 此為關閉最大化!!!
		 */
		frmab.setResizable(false);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frmab.getContentPane().add(panel, BorderLayout.CENTER);

		final JButton GameStrat = new JButton("");
		GameStrat
				.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-\u904A\u6232\u958B\u59CB.jpg")));
		GameStrat.setFont(new Font("微軟正黑體", Font.BOLD, 15));
		GameStrat.setForeground(Color.ORANGE);

		final JButton ReturnNum = new JButton("");
		ReturnNum.setEnabled(false);
		ReturnNum.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-\u91CD\u65B0\u958B\u59CB.jpg")));

		final JButton Exit = new JButton("");
		Exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Exit.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-\u96E2\u958B.jpg")));

		final JButton button_Finsh = new JButton("");
		button_Finsh.setEnabled(false);
		button_Finsh
				.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-\u8F38\u5165\u5B8C\u6210.jpg")));
		button_Finsh.setForeground(Color.ORANGE);
		button_Finsh.setFont(new Font("微軟正黑體", Font.BOLD, 15));

		final JButton button_Num_00 = new JButton("");
		button_Num_00.setEnabled(false);
		button_Num_00
				.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-00.jpg")));

		final JButton button_WriteAgain = new JButton("");
		button_WriteAgain.setEnabled(false);
		button_WriteAgain
				.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-\u91CD\u65B0\u8F38\u5165.jpg")));

		final JButton button_Num_07 = new JButton("");
		button_Num_07.setEnabled(false);
		button_Num_07
				.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-07.jpg")));
		button_Num_07.setForeground(Color.ORANGE);
		button_Num_07.setFont(new Font("微軟正黑體", Font.BOLD, 15));

		final JButton button_Num_08 = new JButton("");
		button_Num_08.setEnabled(false);
		button_Num_08
				.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-08.jpg")));

		final JButton button_Num_09 = new JButton("");
		button_Num_09.setEnabled(false);
		button_Num_09
				.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-09.jpg")));

		final JButton button_Num_04 = new JButton("");
		button_Num_04.setEnabled(false);
		button_Num_04
				.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-04.jpg")));
		button_Num_04.setForeground(Color.ORANGE);
		button_Num_04.setFont(new Font("微軟正黑體", Font.BOLD, 15));

		final JButton button_Num_05 = new JButton("");
		button_Num_05.setEnabled(false);
		button_Num_05
				.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-05.jpg")));

		final JButton button_Num_06 = new JButton("");
		button_Num_06.setEnabled(false);
		button_Num_06
				.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-06.jpg")));

		final JButton button_Num_01 = new JButton("");
		button_Num_01.setEnabled(false);
		button_Num_01.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-01.jpg")));
		button_Num_01.setForeground(Color.ORANGE);
		button_Num_01.setFont(new Font("微軟正黑體", Font.BOLD, 15));

		final JButton button_Num_02 = new JButton("");
		button_Num_02.setEnabled(false);
		button_Num_02
				.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-02.jpg")));

		final JButton button_Num_03 = new JButton("");
		button_Num_03.setEnabled(false);
		button_Num_03
				.setIcon(new ImageIcon(Windows.class.getResource("/pictures/\u6309\u9215-03.jpg")));
		
		JLabel lblA = new JLabel("A");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Arial", Font.PLAIN, 18));
		
		final JLabel lblBNum = new JLabel("");
		lblBNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblBNum.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel lblB = new JLabel("B");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setFont(new Font("Arial", Font.PLAIN, 18));
		
		final JLabel lblANum = new JLabel("");
		lblANum.setHorizontalAlignment(SwingConstants.CENTER);
		lblANum.setFont(new Font("Arial", Font.PLAIN, 18));
		
		final JLabel lblNum_01 = new JLabel("");
		lblNum_01.setFont(new Font("新細明體", Font.PLAIN, 59));
		
		final JLabel lblNum_02 = new JLabel("");
		lblNum_02.setFont(new Font("新細明體", Font.PLAIN, 59));
		
		final JLabel lblNum_03 = new JLabel("");
		lblNum_03.setFont(new Font("新細明體", Font.PLAIN, 59));
		
		final JLabel lblNum_04 = new JLabel("");
		lblNum_04.setFont(new Font("新細明體", Font.PLAIN, 59));
		
		
		JLabel label = new JLabel("\u4EE5\u4E0B\u662F\u4F60\u4E4B\u524D\u8F38\u5165\u7684\u6578\u5B57");
		label.setBackground(Color.RED);
		
		final TextArea scrollBar = new TextArea();
		scrollBar.setForeground(new Color(255, 255, 0));
		scrollBar.setBackground(Color.GRAY);
		scrollBar.setFont(new Font("Arial", Font.BOLD, 21));
		scrollBar.setEditable(false);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(button_Finsh, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(button_Num_00, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(button_WriteAgain, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(GameStrat, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(ReturnNum, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(Exit, 0, 0, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(button_Num_07, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(button_Num_08, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(button_Num_09, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(button_Num_04, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(button_Num_05, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(button_Num_06, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(button_Num_01, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(button_Num_02, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(43)
									.addComponent(lblNum_01)
									.addGap(18)
									.addComponent(lblNum_02, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblNum_03, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblNum_04, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblANum, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblA, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblBNum, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblB, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
								.addComponent(button_Num_03, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNum_01, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNum_02, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNum_03, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNum_04, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(lblB, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblBNum, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblA, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblANum, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
							.addGap(42)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(button_Num_01, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_Num_02, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_Num_03, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(button_Num_04, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_Num_05, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_Num_06, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(button_Num_07, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_Num_08, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_Num_09, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(button_Finsh, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_Num_00, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(button_WriteAgain, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(ReturnNum, GroupLayout.PREFERRED_SIZE, 39, Short.MAX_VALUE)
									.addComponent(Exit, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
								.addComponent(GameStrat, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollBar, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)))
					.addGap(23))
		);
		panel.setLayout(gl_panel);
		
		JMenuBar menuBar = new JMenuBar();
		frmab.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u8A2D\u5B9A");
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("\u6309\u9215");
		menu.add(menu_1);
		
		final JCheckBoxMenuItem ForDefault = new JCheckBoxMenuItem("\u9810\u8A2D");
		ForDefault.setSelected(true);
		menu_1.add(ForDefault);
		
		final JCheckBoxMenuItem Forwater = new JCheckBoxMenuItem("\u6C34\u8CEA");
		menu_1.add(Forwater);
		
		final JCheckBoxMenuItem ForGreen = new JCheckBoxMenuItem("\u7DA0\u8272");
		menu_1.add(ForGreen);
		/*
		 * 修改成預設值
		 */
		ForDefault.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ForDefault.setSelected(true);
				Forwater.setSelected(false);
				ForGreen.setSelected(false);
				
				PF.Picture(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04, button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09, GameStrat, ReturnNum, Exit, button_Finsh, button_WriteAgain
							,"/pictures/", "");
			}
		});
		/*
		 * 修改成水質
		 */
		Forwater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ForDefault.setSelected(false);
				Forwater.setSelected(true);
				ForGreen.setSelected(false);
				
				PF.Picture(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04, button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09, GameStrat, ReturnNum, Exit, button_Finsh, button_WriteAgain
						,"/water/", "-\u6c34");
			}
		});
		
		ForGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ForDefault.setSelected(false);
				Forwater.setSelected(false);
				ForGreen.setSelected(true);
				
				PF.Picture(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04, button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09, GameStrat, ReturnNum, Exit, button_Finsh, button_WriteAgain
						,"/green/", "-\u7da0\u8272");
			}
		});
		
		button_WriteAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NumButton = 1;
				System.out.println("NumButton = " + NumButton);
				button_WriteAgain.setEnabled(false);
				
				lblANum.setText("");
				lblBNum.setText("");
				C1A2BF.SetA(0);
				C1A2BF.SetB(0);
				
				
				LF.ReturnLable(lblNum_01, lblNum_02, lblNum_03, lblNum_04);
				
				lable_01Check = false;
				lable_02Check = false;
				lable_03Check = false;
				lable_04Check = false;
				
				Enter_a_value01 = 0;
				Enter_a_value02 = 0;
				Enter_a_value03 = 0;
				Enter_a_value04 = 0;
				
				BF.ReturnNumButton(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04, button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh);
			}
		});
		
		button_Num_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("NumButton = " + NumButton);
				
				CheckEnter_a_value(lblNum_01 , lblNum_02 , lblNum_03 , lblNum_04 , 0 , "0");
				
				button_Num_00.setEnabled(false);
				
				if(NumButton == 4){
					System.out.println("以輸入四個按鈕，所以將其他數字按鈕鎖定");
					button_Num_00.setEnabled(false);
					button_Num_01.setEnabled(false);
					button_Num_02.setEnabled(false);
					button_Num_03.setEnabled(false);
					button_Num_04.setEnabled(false);
					button_Num_05.setEnabled(false);
					button_Num_06.setEnabled(false);
					button_Num_07.setEnabled(false);
					button_Num_08.setEnabled(false);
					button_Num_09.setEnabled(false);
					button_Finsh.setEnabled(true);
				}else{
					NumButton += 1;
					System.out.println("NumButton = " + NumButton);
				}
			}
		});
		button_Num_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ButtonFuntion(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04 
						 	 ,button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh
						 	 ,lblNum_01 , lblNum_02 , lblNum_03 , lblNum_04 , 1 , "1" 
						 	 ,button_Num_01);
			}
		});
		button_Num_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ButtonFuntion(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04 
							 ,button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh
							 ,lblNum_01 , lblNum_02 , lblNum_03 , lblNum_04 , 2 , "2" 
							 ,button_Num_02);
			}
		});
		button_Num_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ButtonFuntion(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04 
							 ,button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh
							 ,lblNum_01 , lblNum_02 , lblNum_03 , lblNum_04 , 3 , "3" 
							 ,button_Num_03);
			}
		});
		button_Num_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ButtonFuntion(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04 
						 	 ,button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh
						 	 ,lblNum_01 , lblNum_02 , lblNum_03 , lblNum_04 , 4 , "4" 
						 	 ,button_Num_04);
			}
		});
		button_Num_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ButtonFuntion(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04 
						 	 ,button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh
						 	 ,lblNum_01 , lblNum_02 , lblNum_03 , lblNum_04 , 5 , "5" 
						 	 ,button_Num_05);
			}
		});
		button_Num_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonFuntion(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04 
						 	 ,button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh
						 	 ,lblNum_01 , lblNum_02 , lblNum_03 , lblNum_04 , 6 , "6" 
						 	 ,button_Num_06);
			}
		});
		button_Num_07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ButtonFuntion(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04 
						 	 ,button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh
						 	 ,lblNum_01 , lblNum_02 , lblNum_03 , lblNum_04 , 7 , "7" 
						 	 ,button_Num_07);
			}
		});
		button_Num_08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ButtonFuntion(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04 
						 	 ,button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh
						 	 ,lblNum_01 , lblNum_02 , lblNum_03 , lblNum_04 , 8 , "8" 
						 	 ,button_Num_08);
			}
		});
		button_Num_09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ButtonFuntion(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04 
							 ,button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh
							 ,lblNum_01 , lblNum_02 , lblNum_03 , lblNum_04 , 9 , "9" 
							 ,button_Num_09);
			}
		});
		
		GameStrat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				GarbledFuntion G = new GarbledFuntion();
				G.GarbledMain();
				GameStrat.setEnabled(false);
				ReturnNum.setEnabled(true);
				
				STF.mainReturn(scrollBar);
				
				BF.ReturnNumButton(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04, button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh);
			}
		});
		ReturnNum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GarbledFuntion G = new GarbledFuntion();
				G.GarbledMain();
				
				NumButton = 1;
				System.out.println("NumButton = " + NumButton);
				
				lblANum.setText("");
				lblBNum.setText("");
				C1A2BF.SetA(0);
				C1A2BF.SetB(0);
				
				LF.ReturnLable(lblNum_01, lblNum_02, lblNum_03, lblNum_04);
				
				lable_01Check = false;
				lable_02Check = false;
				lable_03Check = false;
				lable_04Check = false;
				
				Enter_a_value01 = 0;
				Enter_a_value02 = 0;
				Enter_a_value03 = 0;
				Enter_a_value04 = 0;
				
				STF.mainReturn(scrollBar);
				
				BF.ReturnNumButton(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04, button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh);
			}
		});
		
		button_Finsh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Enter_a_value01 = " + Enter_a_value01);
				System.out.println("Enter_a_value02 = " + Enter_a_value02);
				System.out.println("Enter_a_value03 = " + Enter_a_value03);
				System.out.println("Enter_a_value04 = " + Enter_a_value04);
				
				C1A2BF.CheckNum01ForAorB(Enter_a_value01);
				C1A2BF.CheckNum02ForAorB(Enter_a_value02);
				C1A2BF.CheckNum03ForAorB(Enter_a_value03);
				C1A2BF.CheckNum04ForAorB(Enter_a_value04);
				
				button_WriteAgain.setEnabled(true);
				button_Finsh.setEnabled(false);
				
				lblANum.setText("" + C1A2BF.GetA());
				lblBNum.setText("" + C1A2BF.GetB());
				
				if(C1A2BF.GetA() == 4){
					if(STF.getText() >= 1 && STF.getText() < 10){
						scrollBar.setText("\n" + "\n\n" + "\n\n" +"恭喜你答對了!!" + "\n\n" + " 總共猜了" + "0" + STF.getText() + "次");
					}else{
						scrollBar.setText("\n" + "\n\n" + "\n\n" +"恭喜你答對了!!" + "\n\n" + " 總共猜了" + STF.getText() + "次");
					}
					
					button_WriteAgain.setEnabled(false);
				}else{
					STF.main(scrollBar, C1A2BF.GetA(), C1A2BF.GetB() , Enter_a_value01, Enter_a_value02, Enter_a_value03, Enter_a_value04);
				}
				
			}
		});
	}
	
	public void CheckEnter_a_value(JLabel lblNum_01 , JLabel lblNum_02 , JLabel lblNum_03 , JLabel lblNum_04 , int Num , String NumForString){
		if(lable_01Check == true){
			if(lable_02Check == true){
				if(lable_03Check == true){
					if(lable_04Check == true){
					}else{
						lblNum_04.setText(NumForString);
						lable_04Check = true;
						Enter_a_value04 = Num;
					}
				}else{
					lblNum_03.setText(NumForString);
					lable_03Check = true;
					Enter_a_value03 = Num;
				}
			}else{
				lblNum_02.setText(NumForString);
				lable_02Check = true;
				Enter_a_value02 = Num;
			}
		}else{
			lblNum_01.setText(NumForString);
			lable_01Check = true;
			Enter_a_value01 = Num;
		}
	}
	
	public void ButtonFuntion(JButton button_Num_00 , JButton button_Num_01 , JButton button_Num_02 , JButton button_Num_03
            				 ,JButton button_Num_04 , JButton button_Num_05 , JButton button_Num_06 , JButton button_Num_07
            				 ,JButton button_Num_08 , JButton button_Num_09 , JButton button_Finsh , JLabel lblNum_01 , JLabel lblNum_02 , JLabel lblNum_03 
            				 ,JLabel lblNum_04 , int Num , String NumForString , JButton button_Num_ForClose){
		
		System.out.println("NumButton = " + NumButton);
		CheckEnter_a_value(lblNum_01 , lblNum_02 , lblNum_03 , lblNum_04 , Num , NumForString);
		button_Num_ForClose.setEnabled(false);
		NumButton = NumButton + BF.CheckButton(button_Num_00, button_Num_01, button_Num_02, button_Num_03, button_Num_04, button_Num_05, button_Num_06, button_Num_07, button_Num_08, button_Num_09 , button_Finsh , NumButton);
		System.out.println("CheckButton 完成之後 NumButton = " + NumButton);
	}
}
