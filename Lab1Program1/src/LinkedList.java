public class LinkedList <Type>{
	Node<Type> head= new Node<Type>();
	Node<Type> tail=new Node<Type>();
	public LinkedList()
	{
		head=null;
		tail=null;
	}
	public void insert(Type data)
	{
	Node<Type> newNode=new Node<Type>(data);
	if(head==null)
	{
		head=newNode;
		tail=newNode;
		newNode.setNextNode(null);
		newNode.setPrevNode(null);
	}
	else{/*insert at the end*/	
		newNode.setNextNode(null);
		newNode.setPrevNode(tail);
		tail.setNextNode(newNode);
		tail=newNode;		
	}
	}
/*	public void insertAfter(Node<Type> x,Node<Type> A){
		x.setNextNode(A.getNextNode());
		x.setPrevNode(A);
		(A.getNextNode()).setPrevNode(x);
		A.setNextNode(x);
	}
*/	
	public Node<Type> search(Type data)
	{
		Node<Type> temp=new Node<Type>();
		temp=head;
		while(temp!=null && temp.getData()!=data)
		{
			temp=temp.getNextNode();
		}
		return temp;
	}
	public Node<Type> delete(Type data)
	{
		Node<Type> temp=new Node<Type>();
		temp=this.search(data);
		if(temp==null)	return null;
		if(temp.getNextNode()==null)
		{
			tail=temp.getPrevNode();
			temp.getPrevNode().setNextNode(null);
			
		}
		else if(temp.getPrevNode()==null)
		{
			head=temp.getNextNode();
			head.getNextNode().setPrevNode(null);
		}
		else if(temp.getNextNode()==null && temp.getPrevNode()==null)
		{
			head=null;
			tail=null;
		}
		else
		{
			temp.getNextNode().setPrevNode(temp.getPrevNode());
			temp.getPrevNode().setNextNode(temp.getNextNode());
		}
		return temp;
	}
	
	public void display()
	{
		Node<Type> temp1=new Node<Type>();
		temp1=head;
		while(temp1!=null)
		{
			System.out.print(temp1.getData() +" ");
			temp1=temp1.getNextNode();
		}
	}

	void revSublist(Type key1,Type key2){		
		Node<Type> start=new Node<Type>();
		Node<Type> stop=new Node<Type>();
		
		Node<Type> prev=new Node<Type>();
		Node<Type> current=new Node<Type>();
		Node<Type> next=new Node<Type>();
		
		start=(this.search(key1)).getPrevNode();
		stop =(this.search(key2)).getNextNode();
		
		prev=start;
		current=start.getNextNode();
		next=current.getNextNode();		
		stop.setPrevNode(current);
		current.setNextNode(stop);
		while(current!=stop){
			current.setNextNode(prev);
			current.setPrevNode(next);
			prev=current;
			current=next;
			next=next.getNextNode();
		}
		start.setNextNode(prev);

		
	}
	
	
	/*
	public LinkedList<Type> revsublist(int a,int b)
	{
		Node<Type> temp=new Node<Type>();
		temp=head;
		int count=1;
		Node<Type> temp1=new Node<Type>();
		Node<Type> temp2=new Node<Type>();
		LinkedList<Type> list =new LinkedList<Type>();
		while(count!=a)
		{
		//	System.out.println("in print..+2");
			count++;
			temp=temp.getNextNode();
		}
		temp2=temp;
		while(count!=b)
		{
		//	System.out.println("in print..+3");
			count++;
			temp=temp.getNextNode();
		}
		temp1=temp;
		temp=temp2.getNextNode();
		temp.setPrevNode(temp2.getPrevNode());
		temp2.getPrevNode().setNextNode(temp2.getNextNode());
		//temp2.setNextNode(temp1.getNextNode());
		//temp2.setPrevNode(temp1);
		this.insertat(temp2,temp1,temp1.getNextNode());
		temp2=temp;
		temp=temp.getNextNode();
		while(temp1!=temp2)
		{
			//System.out.println("in print..+4");
			temp.setPrevNode(temp2.getPrevNode());
			temp2.getPrevNode().setNextNode(temp2.getNextNode());
			this.insertat(temp2,temp1,temp1.getNextNode());
			//temp2.setNextNode(temp1.getNextNode());
			//temp2.setPrevNode(temp1);
			temp2=temp;
			temp=temp.getNextNode();
		}
		System.out.println(head.getData());
		Node<Type> temp4=new Node<Type>();
		temp4=head;
		while(temp4!=null)
		{
			System.out.println(temp4.getData());
			temp4=temp4.getNextNode();
		}
		return list;
	}
	//public LinkedList revsubli(int a,int b)
	//{
		
	//}
	public LinkedList revsubseq()
	{
		
		//LinkedList<Type> list =new LinkedList<Type>();
		LinkedList<Type> templist =new LinkedList<Type>();
		Node<Type> temp=new Node<Type>();
		Node<Type> temp1=new Node<Type>();
		temp=head;
		System.out.println("Old list head "+temp.getData());
		
		int flag = 0;
		while(temp!=null)
		{
			if(flag!=0)
			{
				templist.insert(temp.getData());
				flag = 0;
			}
			else
			{
				flag = 1;
			}
			temp=temp.getNextNode();
		}
		temp1=templist.head;
		while(temp1!=null)
		{
			System.out.println(temp1.getData());
			temp1=temp1.getNextNode();
		}
		return null;
	}
*/	
}
