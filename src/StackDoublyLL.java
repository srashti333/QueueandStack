import java.util.Scanner;

class Node1
{
    int data;
    Node1 next;
    Node1 previous;
    public Node1(int data)
    {
        this.data=data;
    }
}
public class StackDoublyLL
{
    Node1 top;

    public boolean isEmpty()
    {
        if(top==null)               //return top==null;
        {
            return true;
        }
        return false;
    }

   /* public void push(Node1 newnode)
    {
        if(isEmpty())
        {
            top=newnode;
            return;;
        }
        newnode.next=top;
        top=newnode;
    }*/

    public void push(int data)
    {
        Node1 newnode=new Node1(data);
        if(top==null)
        {
            top=newnode;
            return ;
        }
        newnode.next=top;
        top.previous=newnode;
        top=newnode;
    }

  /*  public void push(int data)
    {
        Node1 newnode=new Node1(data);
        newnode.next=top;
        top=newnode;
    }*/

    public void pop()
    {
        if(top==null)
        {
            System.out.println("empty");
            return;
        }
        System.out.println(top.data);
        top=top.next;
        top.previous=null;
    }

    public void peek()
    {
        if(top==null)
        {
            System.out.println("empty");
            return;
        }
        System.out.println(top.data);
    }

    public void display()
    {
        if(top==null)
        {
            System.out.println("empty");
            return;
        }
        Node1 temp=top;
        while(temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }

    public void reverse()
    {
        if(top==null)
        {
            System.out.println("empty");
            return;
        }
        Node1 temp=top;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.previous;
        }
    }
}
class Test2
{
    public static void main(String[] args)
    {
        char ch='y';
        Scanner sc=new Scanner(System.in);
        StackDoublyLL obj= new StackDoublyLL();
        System.out.println("""
                press <1> for push
                press <2> for pop
                press <3> for peek
                press <4> print
                press <5> for displaying in reverse\n""");
        while(ch=='y'||ch=='Y')
        {
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    obj.push(sc.nextInt());
                    obj.display();
                    break;
                case 2:
                    obj.pop();
                    obj.display();
                    break;
                case 3:
                    obj.peek();
                    obj.display();
                    break;
                case 4:
                    obj.display();
                    break;
                case 5:
                    obj.reverse();
                    break;
                default:
                    System.out.println("invalid input");
            }
            System.out.println("y/n");
            ch=sc.next().charAt(0);
        }
    }

}
