import java.util.Scanner;

public class main_class {


	public static void main(String args[]) {
		linkedlist lobj=new linkedlist();
		linkedlist nlobj=new linkedlist();
		Node newnode=new Node();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			lobj.insert(sc.nextInt());
		}
		//lobj.print();
	//	newnode=lobj.search(3);
		//System.out.println(newnode.getData());
		//lobj.print();
		//nlobj=lobj.revsublist(2, 10);
		lobj.revsubseq();
		//nlobj.print();
		sc.close();
	}

}
