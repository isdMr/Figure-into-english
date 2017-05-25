package IntToEngT;

import java.util.Scanner;


public class IntToEng {


// メインメソッド

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    System.out.println(translateEng(input));
	}

	  // 数値を英訳する変換するメソッド
	static String translateEng(int n) {
		String s="";
		int t;
		int u;
		if(String.valueOf(n).length()==4||String.valueOf(n).length()==3
		||String.valueOf(n).length()==2||String.valueOf(n).length()==1){
			 if(String.valueOf(n).length()==4){
				  int x=n/1000;
				  n=n-x*1000;
				  switch(x) {
				  case 0 : s+=""; break;
				  case 1 : s+="one thousand "; break;
				  case 2 : s+="two thousand "; break;
				  case 3 : s+="three thousand "; break;
				  case 4 : s+="four thousand "; break;
				  case 5 : s+="five thousand "; break;
				  case 6 : s+="six thousand "; break;
				  case 7 : s+="seven thousand "; break;
				  case 8 : s+="eight thousand "; break;
				  case 9 : s+="nine thousand "; break;
				  }
			 }
			 if(String.valueOf(n).length()==3) {
			  int x=n/100;
			  n=n-(x*100);
				  switch(x) {
				  case 0 : s=s+""; break;
				  case 1 : s=s+"one hundred "; break;
				  case 2 : s=s+"two hundred "; break;
				  case 3 : s=s+"three hundred "; break;
				  case 4 : s=s+"four hundred "; break;
				  case 5 : s=s+"five hundred "; break;
				  case 6 : s=s+"six hundred "; break;
				  case 7 : s=s+"seven hundred "; break;
				  case 8 : s=s+"eight hundred "; break;
				  case 9 : s=s+"nine hundred "; break;
				  }
			 }
			 if(n/10!=1&&String.valueOf(n).length()!=1){
			  t=n/10;
				  switch(t) {
				  case 2 : s+="twenty "; break;
				  case 3 : s+="thirty "; break;
				  case 4 : s+="forty "; break;
				  case 5 : s+="fifty "; break;
				  case 6 : s+="sixty "; break;
				  case 7 : s+="seventy "; break;
				  case 8 : s+="eighty "; break;
				  case 9 : s+="ninty "; break;
				  }
			 }
			 u=n%10;
			 switch(u) {
			 case 1 : s+="one"; break;
			 case 2 : s+="two"; break;
			 case 3 : s+="three"; break;
			 case 4 : s+="four"; break;
			 case 5 : s+="five"; break;
			 case 6 : s+="six"; break;
			 case 7 : s+="seven"; break;
			 case 8 : s+="eight"; break;
			 case 9 : s+="nine"; break;
			 }

			 if(n/10==1){
				  switch(n) {
				  case 10 : s="ten"; break;
				  case 11 : s="eleven"; break;
				  case 12 : s="twenteen"; break;
				  case 13 : s="thirteen"; break;
				  case 15 : s="fifteen"; break;
				  case 19 : s="ninteen"; break;
				  default: s+="teen";
				  }
			 }
		}
		 return s;
	 }
}