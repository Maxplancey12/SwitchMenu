import java.util.Scanner;

public class SwitchOperatedTextMenu(){
      public static void main(String[] args){
                Scanner in = new Scanner(System.in);
		for (int i = 1; i<=2; i++){
			System.out.println(i + ". Menu item #" + i);
		System.out.println("you chose option 0. Quit");
		boolean quit = false;
		int menuItem;
		do {
			System.out.println("Choose menu item:");
			menuItem = in.nextInt();
			switch (menuItem){
			case 1:
				System.out.println("youve chose 1");
				break;
			case 2:
				System.out.println("youve chose 2");
				break;
			case 0:
				quit = true;
				break;
			default:
				System.out.println("thats not a valid choice");
			}
		} while (!quit);
		System.out.println("see you after bro");
	}
}

