package Task1;
import java.util.Scanner;
import java.io.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1
		Scanner userInputScanner = new Scanner(System.in);
		System.out.print("What's your name? ");
		String userInputName = userInputScanner.nextLine();
		userInputScanner.close();

		System.out.println("Hello "+userInputName+"!");
	  }
		}

//2
		/*for (int i = 0; i < args.length; i++){
	         System.out.println("args[" + i +"] = " + args[i] ); 
		 }
		
		System.out.println();
		
		 for (int i = args.length -1; i >= 0; i--) {
	         System.out.println("args[" + i +"] = " + args[i]); 
		 }
	  }
		}*/
		 
//3
      /* int[] Mas = new int[5];
        for(int i=0;i<Mas.length;i++){
            Mas[i]=1+(int)(Math.random() * ((10 - 1) + 1));
           }
        //С помощью цикла выведем значения массива на экран
        for(int i=0;i<Mas.length;i++){
            System.out.print(Mas[i]+" ");
        }
        for(int i=0;i<Mas.length;i++){
            System.out.println(Mas[i]+" ");
        }
      }
	}*/
		
//4
		/*System.out.print("Enter your password: ");
		Scanner scan = new Scanner(System.in);
		String pass = scan.next();
		scan.close();
		if(pass.equals("Admin")){
		System.out.println("Password: " + pass);	
		}
		else
		{
		System.out.println("Error: Wrong Password!");	
		}
		}
	}*/
		
//5
		/*int s=1, p=2; 
		 for(int i=0; i<args.length; i++)
		 {
		 int a=Integer.parseInt(args[i]);
		 s=s + a;
		 p=p * a;
		 }
		 System.out.println("SUUMA = " + s);
		 System.out.println("PROIZVEDENIE = "+ p);
		 }
		 }*/
		