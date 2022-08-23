package My_Basic_programs;

public class Series_APGP {

	public static void main(String[] args) {
		Series_APGP obj = new Series_APGP();
		//obj.Series_1();//Find the next term in the series : 6, 7, 9, 13, 21,_(1,2,4,8,16
		//obj.Series_2();//Find the next term in the series :1,2,4,7,11,16,22,_(1,2,3,4,5,
		//obj.Series_3();////Find the next term in the series :1,2,5,10,17,26,37(1,3,5,7,9,
	    //obj.Series_4();//Find the next term in the series :46,37,29,22,16,11,7,4,2,1(reverse of series_3)
		//obj.Series_5();//Find the next term in the series :1,3,7,13,21,31,_(2,4,6,8,10,12
		
		
	}

	private void Series_5() {
		//Find the next term in the series :1,3,7,13,21,31,_(2,4,6,8,10,12	
		int first=1;
		int second = 3;
		int sum=0;
		for (int i=1;i<=10;i++) {
			System.out.print(first+" ");
			sum=second-first;
			first =  second ;
			second = (sum+2) + second;			
		}
	}

	private void Series_4() {
		//Find the next term in the series :46,37,29,22,16,11,7,4,2,1
		int first = 46;
		int second = 37;
		int sum=0;
		for (int i=1;i<=10;i++) {
			System.out.print(first+" ");
			sum=first-second;
			first =  second ;
			second =  second-(sum-1) ;			
		}
		
		
	}

	private void Series_3() {
		//Find the next term in the series :1,2,5,10,17,26,37
				int first=1;
				int second = 2;
				int sum=0;
				for (int i=1;i<=10;i++) {
					System.out.print(first+" ");
					sum=second-first;
					first =  second ;
					second = (sum+2) + second;			
				}
	}

	private void Series_2() {
		//Find the next term in the series :1,2,4,7,11,16,22
		int first=1;
		int second = 2;
		int sum=0;
		for (int i=1;i<=10;i++) {
			System.out.print(first+" ");
			sum=second-first;
			first =  second ;
			second = (sum+1) + second;			
		}
	}	
		
		
		
			

	private void Series_1() {
		//Find the next term in the series : 6, 7, 9, 13, 21,_
		int first=6;
		int second = 7;
		int sum=0;
		for (int i=1;i<=6;i++) {
			System.out.print(first+" ");
			sum=second-first;
			first =  second ;
			second = sum*2 + second;			
		}
			
	}
	
	
	
	

}
