package Function;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import Main_1A2B.Windows;

public class PictureFunction {

	public void Picture(JButton button_Num_00 , JButton button_Num_01 , JButton button_Num_02 , JButton button_Num_03
            		   ,JButton button_Num_04 , JButton button_Num_05 , JButton button_Num_06 , JButton button_Num_07
            		   ,JButton button_Num_08 , JButton button_Num_09 , JButton GameStrat , JButton ReturnNum 
            		   ,JButton Exit , JButton button_Finsh , JButton button_WriteAgain
            		   ,String File , String Species) {
		
		
		button_Num_00
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-00.jpg")));
		button_Num_01
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-01.jpg")));
		button_Num_02
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-02.jpg")));
		button_Num_03
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-03.jpg")));
		button_Num_04
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-04.jpg")));
		button_Num_05
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-05.jpg")));
		button_Num_06
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-06.jpg")));
		button_Num_07
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-07.jpg")));
		button_Num_08
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-08.jpg")));
		button_Num_09
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-09.jpg")));
		
		GameStrat
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-\u904A\u6232\u958B\u59CB.jpg")));
		ReturnNum.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-\u91CD\u65B0\u958B\u59CB.jpg")));
		Exit.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-\u96E2\u958B.jpg")));
		button_Finsh
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-\u8F38\u5165\u5B8C\u6210.jpg")));
		button_WriteAgain
		.setIcon(new ImageIcon(Windows.class.getResource(File + "\u6309\u9215" + Species + "-\u91CD\u65B0\u8F38\u5165.jpg")));
		
	}
}
