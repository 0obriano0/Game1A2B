package Function;

import java.util.Random;

public class GarbledFuntion {

	private int Num_01_Finish, Num_02_Finish, Num_03_Finish, Num_04_Finish;
	private int NumFinish;

	public void GarbledMain() {
		int Num_01, Num_02, Num_03, Num_04, NumFinish_Main;

		Num_01 = GrabledCheckNum_01NotFor_0();
		setNum_01_Finish(Num_01);
		System.out.println("Num_01 = " + Num_01);

		Num_02 = GrabledCheck_01(Num_01);
		setNum_02_Finish(Num_02);
		System.out.println("Num_02 = " + Num_02);

		Num_03 = GrabledCheck_02(Num_01, Num_02);
		setNum_03_Finish(Num_03);
		System.out.println("Num_03 = " + Num_03);

		Num_04 = GrabledCheck_03(Num_01, Num_02, Num_03);
		setNum_04_Finish(Num_04);
		System.out.println("Num_04 = " + Num_04);

		NumFinish_Main = (Num_01 * 1000) + (Num_02 * 100) + (Num_03 * 10)
				+ Num_04;
		System.out.println("NumFinish_Main = " + NumFinish_Main);
		setNumFinish(NumFinish_Main);
		
		Check1A2BFunction C1A2BF = new Check1A2BFunction();
		
		System.out.println("Num_01_Finish = " + Num_01_Finish);
		C1A2BF.setDetermineNum(Num_01_Finish, Num_02_Finish, Num_03_Finish, Num_04_Finish);
	}

	/*
	 * 產生一個0~9的整數
	 */
	private int GrabledCreate() {
		int Create = 0;
		Random r = new Random();
		Create = r.nextInt(9);
		System.out.println("Create = " + Create);
		return Create;
	}

	/*
	 * 為了不讓第一個數字不為0
	 */
	private int GrabledCheckNum_01NotFor_0() {
		int Num_01 = 0;
		for (int i = 0; i == 0;) {
			System.out.print("New_Num_01");
			Num_01 = GrabledCreate();
			if (Num_01 != 0) {
				i = 1;
			}
		}
		return Num_01;
	}

	/*
	 * 第一次點查
	 */
	private int GrabledCheck_01(int a) {
		int Num_02 = 0;
		for (int i = 0; i == 0;) {
			System.out.print("New_Num_02");
			Num_02 = GrabledCreate();
			if (Num_02 != a) {
				i = 1;
			}
		}
		return Num_02;
	}

	/*
	 * 第二次點查
	 */
	private int GrabledCheck_02(int a, int b) {
		int Num_03 = 0;
		for (int i = 0; i == 0;) {
			System.out.print("New_Num_03");
			Num_03 = GrabledCreate();
			if (Num_03 != a) {
				if (Num_03 != b) {
					i = 1;
				}
			}
		}
		return Num_03;
	}

	/*
	 * 第三次點查
	 */
	private int GrabledCheck_03(int a, int b, int c) {
		int Num_04 = 0;
		for (int i = 0; i == 0;) {
			System.out.print("New_Num_04");
			Num_04 = GrabledCreate();
			if (Num_04 != a) {
				if (Num_04 != b) {
					if (Num_04 != c) {
						i = 1;
					}
				}
			}
		}
		return Num_04;
	}

	/**
	 * @return numFinish
	 */
	public int getNumFinish() {
		return NumFinish;
	}

	/**
	 * @param numFinish
	 *            要設定的 numFinish
	 */
	public void setNumFinish(int numFinish) {
		NumFinish = numFinish;
	}

	/**
	 * @return num_01_Finish
	 */
	public int getNum_01_Finish() {
		return Num_01_Finish;
	}

	/**
	 * @param num_01_Finish
	 *            要設定的 num_01_Finish
	 */
	public void setNum_01_Finish(int num_01_Finish) {
		Num_01_Finish = num_01_Finish;
	}

	/**
	 * @return num_02_Finish
	 */
	public int getNum_02_Finish() {
		return Num_02_Finish;
	}

	/**
	 * @param num_02_Finish
	 *            要設定的 num_02_Finish
	 */
	public void setNum_02_Finish(int num_02_Finish) {
		Num_02_Finish = num_02_Finish;
	}

	/**
	 * @return num_03_Finish
	 */
	public int getNum_03_Finish() {
		return Num_03_Finish;
	}

	/**
	 * @param num_03_Finish
	 *            要設定的 num_03_Finish
	 */
	public void setNum_03_Finish(int num_03_Finish) {
		Num_03_Finish = num_03_Finish;
	}

	/**
	 * @return num_04_Finish
	 */
	public int getNum_04_Finish() {
		return Num_04_Finish;
	}

	/**
	 * @param num_04_Finish
	 *            要設定的 num_04_Finish
	 */
	public void setNum_04_Finish(int num_04_Finish) {
		Num_04_Finish = num_04_Finish;
	}

}
