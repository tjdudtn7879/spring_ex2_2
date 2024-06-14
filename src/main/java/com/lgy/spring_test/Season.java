package com.lgy.spring_test;

public class Season {
	int month;
	
	public void season() {
		if (month>=3 && month<=5) {
			System.out.println("봄");
		}else if(month>5 && month<9) {
			System.out.println("여름");
		}else if(month>8 && month<12) {
			System.out.println("가을");
		}else{
			System.out.println("겨울");
		}
	}
/*public void season(){
 * 	switch (month){
 * 	case 3: case 4: case 5: syso 봄; break;
 * 	case 6: case 7: case 8: syso 여름; break;
 * 	case 9: case 10: case 11: syso 가을; break;
 * 	case 12: case 1: case 2: syso 겨울; break;
*   deault: break;
*   }
* }
 * */

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
}
