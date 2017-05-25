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
if(String.valueOf(n).length()==3||String.valueOf(n).length()==2||String.valueOf(n).length()==1){
	if(String.valueOf(n).length()==3) {
		int x=n/100;
		n=n-x*100
				;
		switch(x) {
		case 1 : s="one hundred "; break;
		case 2 : s="two hundred "; break;
		case 3 : s="three hundred "; break;
		case 4 : s="four hundred "; break;
		case 5 : s="five hundred "; break;
		case 6 : s="six hundred "; break;
		case 7 : s="seven hundred "; break;
		case 8 : s="eight hundred "; break;
		case 9 : s="nine hundred "; break;
		}
	}
	if(n/10!=1&&String.valueOf(n).length()!=1){
		t=n/10;
		if(t==2)s="twenty ";
		else if(t==3)s+="thirty ";
		else if(t==4)s+="forty ";
		else if(t==5)s+="fifty ";
		else if(t==6)s+="sixty ";
		else if(t==7)s+="seventy ";
		else if(t==8)s+="eighty ";
		else if(t==9)s+="ninty ";
	}

	u=n%10;
	if(u==1) s=s+"one";
	else if(u==2) s=s+"two";
	else if(u==3) s=s+"three";
	else if(u==4) s=s+"four";
	else if(u==5) s=s+"five";
	else if(u==6) s=s+"six";
	else if(u==7) s=s+"seven";
	else if(u==8) s=s+"eight";
	else if(u==9) s=s+"nine";
	if(n/10==1){
		if(n==11)s="eleven";
		else if(n==12)s="twenteen";
		else if(n==13)s="thirteen";
		else if(n==15)s="fifteen";
		else if(n==19)s="ninteen";
		else if(n==10)s="ten";
		else s=s+"teen";
	}
}
return s;

}

}