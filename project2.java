
package corejava;

import java.util.*;

class Books {
	String bookname;
	int cost;
	
	String Author;
	static int count = 0;

	Books() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Author name:");
		Author = sc.nextLine();
	}

	public void display() {
		System.out.println("Book Name:" + bookname + "\nCost:" + cost + "\nAuthor name:" + Author);
	}
	

	
}

class Comic extends Books {
	public Comic () {
		cost = 1000;
		bookname = "watchman";
	}



}

class Novel extends Books {
	public Novel() {
		cost = 500;
		bookname = "Daytripper";
	}


}

class Fiction extends Books {
	public Fiction() {
		cost = 300;
		bookname = "Maus";
	}

}

public class project2{

	public static void main(String[] args) {
		int n1 = 0, n2 = 0;
		ArrayList<Books> list = new ArrayList<Books>();
		do {
			System.out.println("*****************************");
			System.out.println("1.Create ");
			System.out.println("2.Display ");
			System.out.println("3.Exit");
			System.out.println("*********************************");
			System.out.println("Enter choice:");
			Scanner sc1 = new Scanner(System.in);
			n1 = sc1.nextInt();
			if (n1 == 1) {
				do {
					System.out.println("*****************************");
					System.out.println("1.Comic");
					System.out.println("2.Novel");
					System.out.println("3.Fiction");
					System.out.println("4.Exit");
					System.out.println("*********************************");
					System.out.println("Enter choice:");
					Scanner sc2 = new Scanner(System.in);
					n2 = sc2.nextInt();
					switch (n2) {
					case 1:
						list.add(new Comic());
						break;
					case 2:
						list.add(new Novel());
						break;
					case 3:
						list.add(new Fiction());
						break;
					}
				} while (n2 != 4);

			}
			if (n1 == 2) {
				Iterator i = list.iterator();
				while (i.hasNext()) {
					Books b = (Books) i.next();
					b.display();
				}
			}
		
		} while (n1==3);
		System.out.println("thank you");

	}

}