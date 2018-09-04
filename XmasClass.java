package xmaspackage;
//Connor Jackson's wicked awesome song singer 3000!
/* 
 * I'll use switches for both the day and the lyrics being output. Everything will be controlled by day int
 * one part of will be its own method to avoid complications with repeating
 */
import java.util.Scanner;

public class XmasClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
int day;

System.out.println("What day of Xmas is it?");
day= input.nextInt();

	while (day>12||day<1){
		System.out.println("Hey! Thats not a part of the song!");
		day= input.nextInt();
	}//end filter while
		
		switch(day){
		case 1:
			System.out.println("On the 1st day of Christmas my true love gave to me... ");
		case 2: 
			System.out.println("On the 2nd day of Christmas my true love gave to me... ");
		case 3:
			System.out.println("On the 3rd day of Christmas my true love gave to me... ");
		default:
			System.out.printf("On the %dth day of Christmas my true love gave to me...\n",day);
	}//end day switch
		lyrics(day);
	}//end main method
	static void lyrics(int day){
	while (day>0){
		
		switch(day){
		case 1:
			System.out.println("A partridge in a pear tree!");
			day--;
			break;
		case 2:
			System.out.println("Two turtle doves, and");
			day--;
			break;
		case 3:
			System.out.println("Three French Hens,");
			day--;
			break;
		case 4:
			System.out.println("Four Calling Birds,");
			day--;
			break;
		case 5:
			System.out.println("Five Golden Rings,");
			day--;
			break;
		case 6:
			System.out.println("Six Geese a Laying,");
			day--;
			break;
		case 7:
			System.out.println("Seven Swans a Swimming,");
			day--;
			break;
		case 8:
			System.out.println("Eight Maids a Milking,");
			day--;
			break;
		case 9:
			System.out.println("Nine Ladies Dancing,");
			day--;
			break;
		case 10:
			System.out.println("Ten Lords a Leaping,");
			day--;
			break;
		case 11:
			System.out.println("Eleven Pipers Piping,");
			day--;
			break;
		default:
			System.out.println("12 Drummers Drumming,");
			day--;
			break;
		}//end song switch
	}//end lyrics while
	}//end lyrics method

}
