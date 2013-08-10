import java.util.Scanner;

public class MainClass {


	public static void main(String args[]) {
		LinkedList listObj=new LinkedList();
//		LinkedList nlobj=new LinkedList();
		Node newnode=new Node();
		Scanner sc=new Scanner(System.in);		
		
		{	// add elements
			System.out.println("Enter the number of elements that you want to add:");

			int n=sc.nextInt();
			System.out.println("Enter " +n +" the elements:");
			for(int i=0;i<n;i++){
				listObj.insert(sc.nextInt());
			}		
			System.out.println("The list is:");
			listObj.display();
		}
/*		
		{	// search element
			System.out.println("\nEnter the element you want to search:");
			int key=sc.nextInt();
			if(listObj.search(key)==null)
				System.out.println("The element is not present!");
			else
				System.out.println("The element is present!");
		}
		
		
		{	//delete element
			System.out.println("Enter the element you want to delete:");
			int key=sc.nextInt();
			
			if(listObj.delete(key)==null)
				System.out.println("\nInvalid delete operation. No such elemnet found.");
			else 
				System.out.println("\nDelete operation Successfull.");						
			System.out.println("The updated list is:");
			listObj.display();
		}
*/		
		
		
		listObj.revSublist(2, 4);
		listObj.display();
		//	newnode=lobj.search(3);
		//System.out.println(newnode.getData());
		//lobj.print();
		//nlobj=lobj.revsublist(2, 10);
//		lobj.revsubseq();
		//nlobj.print();
		sc.close();
	}

}
