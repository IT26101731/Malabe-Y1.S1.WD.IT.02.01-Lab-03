import java.util.Scanner;
public class IT26101731Lab3Q3{
    public static void main(String []args){
	    int Amount,Remainder,Quotient;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Amount:");
		Amount=input.nextInt();
		
		Quotient=Amount/5000;
		Remainder=Amount%5000;
		System.out.println("5000 Notes- "+Quotient);
		
		Quotient=Remainder/1000;
		Remainder=Remainder%1000;
		System.out.println("1000 Notes- "+Quotient);
		
		Quotient=Remainder/500;
		Remainder=Remainder%500;
		System.out.println("500 Notes- "+Quotient);
		
		Quotient=Remainder/200;
		Remainder=Remainder%200;
		System.out.println("200 Notes- "+Quotient);
		
		Quotient=Remainder/100;
		Remainder=Remainder%100;
		System.out.println("100 Notes- "+Quotient);
		
		Quotient=Remainder/50;
		Remainder=Remainder%50;
		System.out.println("50 Notes- "+Quotient);
		
		Quotient=Remainder/20;
		Remainder=Remainder%20;
		System.out.println("20 Notes- "+Quotient);
		
		Quotient=Remainder/10;
		Remainder=Remainder%10;
		System.out.println("10 Notes- "+Quotient);
		
		Quotient=Remainder/05;
		Remainder=Remainder%05;
		System.out.println("05 Notes- "+Quotient);
		
		Quotient=Remainder/02;
		Remainder=Remainder%02;
		System.out.println("02 Notes- "+Quotient);
		
		Quotient=Remainder/01;
		Remainder=Remainder%01;
		System.out.println("01 Notes- "+Quotient);
		}
    }