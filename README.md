# First
package first;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		Scanner scn  =  new Scanner(System.in);
		
		System.out.println("Введите первое число");
		double x = scn.nextDouble();
		
		System.out.println("Введите второе число");
		double y = scn.nextDouble();
		
		if(x<10){
			if(y<10){
				if(x>y){
					System.out.println(x);	
				}else {
					System.out.println(y);	
				} 
				}else{
					x = 10-x;
					y = y-10;
					if(x<y){
						System.out.println(x+10);
					}else{
						System.out.println(y+10);
					}
				}
		}else{
			if(y<10){
			x = x-10;
			y = 10-y;
			if(y<x){
				System.out.println(y+10);
			}else{
				System.out.println(x+10);
			}
			}else{
				if(x>y){
					System.out.println(y);
				}else{
					System.out.println(x);
				}
			}
			}
		

}
}
	
