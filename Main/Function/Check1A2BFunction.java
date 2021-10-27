package Function;

public class Check1A2BFunction {
	static int DetermineNum01 , DetermineNum02 , DetermineNum03 , DetermineNum04;
	static int UserNum01 , UserNum02 , UserNum03 , UserNum04;
	static String Num01 , Num02 , Num03 , Num04;
	private int A , B;
	
	public void setDetermineNum(int determineNum01 , int determineNum02 , int determineNum03 , int determineNum04) {
		
		DetermineNum01 = determineNum01;
		System.out.println("DetermineNum01 = " + DetermineNum01);
		DetermineNum02 = determineNum02;
		DetermineNum03 = determineNum03;
		DetermineNum04 = determineNum04;
	}
	
	public void CheckNum01ForAorB(int usernum01){
		System.out.println("DetermineNum01 = " + DetermineNum01);
		if(usernum01 == DetermineNum01){
			Num01 = "A";
			A += 1;
			System.out.println("檢查之後 第一個數字 是 A 所以A+1 目前A = " + A);
		}else if(usernum01 == DetermineNum02){
			Num02 = "B";
			B += 1;
			System.out.println("檢查之後 第一個數字 是 B 所以B+1 目前B = " + B);
		}else if(usernum01 == DetermineNum03){
			Num02 = "B";
			B += 1;
			System.out.println("檢查之後 第一個數字 是 B 所以B+1 目前B = " + B);
		}else if(usernum01 == DetermineNum04){
			Num02 = "B";
			B += 1;
			System.out.println("檢查之後 第一個數字 是 B 所以B+1 目前B = " + B);
		}else{
			System.out.println("檢查之後發現第一個數什麼都不是");
		}
	}
	public void CheckNum02ForAorB(int usernum02){
		
		if(usernum02 == DetermineNum02){
			Num01 = "A";
			A += 1;
			System.out.println("檢查之後 第二個數字 是 A 所以A+1 目前A = " + A);
		}else if(usernum02 == DetermineNum01){
			Num02 = "B";
			B += 1;
			System.out.println("檢查之後 第二個數字 是 B 所以B+1 目前B = " + B);
		}else if(usernum02 == DetermineNum03){
			Num02 = "B";
			B += 1;
			System.out.println("檢查之後 第二個數字 是 B 所以B+1 目前B = " + B);
		}else if(usernum02 == DetermineNum04){
			Num02 = "B";
			B += 1;
			System.out.println("檢查之後 第二個數字 是 B 所以B+1 目前B = " + B);
		}else{
			System.out.println("檢查之後發現第二個數什麼都不是");
		}
	}
	public void CheckNum03ForAorB(int usernum03){
		
		if(usernum03 == DetermineNum03){
			Num01 = "A";
			A += 1;
			System.out.println("檢查之後 第三個數字 是 A 所以A+1 目前A = " + A);
		}else if(usernum03 == DetermineNum02){
			Num02 = "B";
			B += 1;
			System.out.println("檢查之後 第三個數字 是 B 所以B+1 目前B = " + B);
		}else if(usernum03 == DetermineNum01){
			Num02 = "B";
			B += 1;
			System.out.println("檢查之後 第三個數字 是 B 所以B+1 目前B = " + B);
		}else if(usernum03 == DetermineNum04){
			Num02 = "B";
			B += 1;
			System.out.println("檢查之後 第三個數字 是 B 所以B+1 目前B = " + B);
		}else{
			System.out.println("檢查之後發現第三個數什麼都不是");
		}
	}
	public void CheckNum04ForAorB(int usernum04){
		
		if(usernum04 == DetermineNum04){
			Num01 = "A";
			A += 1;
			System.out.println("檢查之後 第四個數字 是 A 所以A+1 目前A = " + A);
		}else if(usernum04 == DetermineNum02){
			Num02 = "B";
			B += 1;
			System.out.println("檢查之後 第四個數字 是 B 所以B+1 目前B = " + B);
		}else if(usernum04 == DetermineNum03){
			Num02 = "B";
			B += 1;
			System.out.println("檢查之後 第四個數字 是 B 所以B+1 目前B = " + B);
		}else if(usernum04 == DetermineNum01){
			Num02 = "B";
			B += 1;
			System.out.println("檢查之後 第四個數字 是 B 所以B+1 目前B = " + B);
		}else{
			System.out.println("檢查之後發現第四個數什麼都不是");
		}
	}
	
	public void SetA(int A){
		this.A = A;
	}
	public void SetB(int B){
		this.B = B;
	}
	public int GetA(){
		return A;
	}
	public int GetB(){
		return B;
	}
}
