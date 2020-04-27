package Function;

import java.awt.TextArea;

public class Scroll_TextFunction {
	private int text = 1;
	String FinishTextline = "";
	
	public void main(TextArea scrollBar , int A , int B , int Enter_a_value01 , int Enter_a_value02 , int Enter_a_value03 , int Enter_a_value04){
			
		if(text == 1){
			FinishTextline = "0" + text + ". " + Enter_a_value01 + Enter_a_value02 + Enter_a_value03 + Enter_a_value04 + "  " + A + "A" + B + "B";
		}else if(text >= 2 && text <10){
			FinishTextline = FinishTextline + "\n" + "0" + text + ". " + Enter_a_value01 + Enter_a_value02 + Enter_a_value03 + Enter_a_value04 + "  " + A + "A" + B + "B";
		}else{
			FinishTextline = FinishTextline + "\n" + text + ". " + Enter_a_value01 + Enter_a_value02 + Enter_a_value03 + Enter_a_value04 + "  " + A + "A" + B + "B";
		}
		scrollBar.setText(FinishTextline);
		text++;
	}
	
	public void mainReturn(TextArea scrollBar){
		FinishTextline = "";
		text = 1;
		scrollBar.setText(FinishTextline);
	}
	
	public int getText(){
		return text;
	}
	
}
