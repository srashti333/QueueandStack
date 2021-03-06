import java.util.Scanner;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
public class StackBySinglyLL
{
    Node top;

    public boolean isEmpty()
    {
        if(top==null)               //return top==null;
        {
            return true;
        }
        return false;
    }

   /* public void push(Node newnode)
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
        Node newnode=new Node(data);
        if(top==null)
        {
            top=newnode;
            return ;
        }
        newnode.next=top;
        top=newnode;
    }

  /*  public void push(int data)
    {
        Node newnode=new Node(data);
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
        Node temp=top;
        while(temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }
}
class Test1
{
    public static void main(String[] args)
    {
        char ch='y';
        Scanner sc=new Scanner(System.in);
        StackBySinglyLL obj=new StackBySinglyLL();
        System.out.println("""
                press <1> for push
                press <2> for pop
                press <3> for peek
                press <4> print\n""");
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
                default:
                    System.out.println("invalid input");
            }
            System.out.println("y/n");
            ch=sc.next().charAt(0);
        }
    }

}
