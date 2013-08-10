
public class linkedlist <Type>
{
	Node<Type> head= new Node<Type>();
	Node<Type> tail=new Node<Type>();
	public linkedlist()
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
	else/*insert at the end*/
	{
		newNode.setNextNode(null);
		newNode.setPrevNode(tail);
		tail.setNextNode(newNode);
		tail=newNode;
		
	}
	}
	public void insertat(Node<Type> x,Node<Type> i,Node<Type> j)
	{
		x.setNextNode(j);
		x.setPrevNode(i);
		i.setNextNode(x);
		i.setPrevNode(x);
		
	}
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
	public linkedlist<Type> multiplesearch(Type data)
	{
		linkedlist<Type> list =new linkedlist<Type>();
		Node<Type> temp=new Node<Type>();
		temp=head;
		while(temp!=null)
		{
			if(temp.getData()==data)
			{
				list.insert(data);
			}
			temp=temp.getNextNode();
		}
		temp=head;
		while(temp!=null)
		{
			//System.out.println(temp.getData());
			temp=temp.getNextNode();
		}
		return list;
	}
	public Node<Type> delete(Type data)
	{
		Node<Type> temp=new Node<Type>();
		temp=this.search(data);
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
	public void print()
	{
		Node<Type> temp1=new Node<Type>();
		temp1=head;
		while(temp1!=null)
		{
			System.out.println(temp1.getData());
			temp1=temp1.getNextNode();
		}
		//System.out.println(head.getData());

	}
	public linkedlist<Type> revsublist(int a,int b)
	{
		Node<Type> temp=new Node<Type>();
		temp=head;
		int count=1;
		Node<Type> temp1=new Node<Type>();
		Node<Type> temp2=new Node<Type>();
		linkedlist<Type> list =new linkedlist<Type>();
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
	//public linkedlist revsubli(int a,int b)
	//{
		/* try by changing the pointers*/
	//}
	public linkedlist revsubseq()
	{
		
		//linkedlist<Type> list =new linkedlist<Type>();
		linkedlist<Type> templist =new linkedlist<Type>();
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
}
