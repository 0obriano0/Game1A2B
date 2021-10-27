package Function;

import javax.swing.JButton;

public class buttonFunction {
	public int CheckButton(JButton button_Num_00 , JButton button_Num_01 , JButton button_Num_02 , JButton button_Num_03
			               ,JButton button_Num_04 , JButton button_Num_05 , JButton button_Num_06 , JButton button_Num_07
			               ,JButton button_Num_08 , JButton button_Num_09 , JButton button_Finsh , int NumButton){
		
		if(NumButton == 1){
			button_Num_00.setEnabled(true);
		}
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
			return 0;
		}else{
			return 1;
		}
	}
	
	public void ReturnNumButton(JButton button_Num_00 , JButton button_Num_01 , JButton button_Num_02 , JButton button_Num_03
            				   ,JButton button_Num_04 , JButton button_Num_05 , JButton button_Num_06 , JButton button_Num_07
            				   ,JButton button_Num_08 , JButton button_Num_09 , JButton button_Finsh){
		button_Num_00.setEnabled(false);
		button_Num_01.setEnabled(true);
		button_Num_02.setEnabled(true);
		button_Num_03.setEnabled(true);
		button_Num_04.setEnabled(true);
		button_Num_05.setEnabled(true);
		button_Num_06.setEnabled(true);
		button_Num_07.setEnabled(true);
		button_Num_08.setEnabled(true);
		button_Num_09.setEnabled(true);
		button_Finsh.setEnabled(false);
	}
}
