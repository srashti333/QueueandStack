import java.util.Scanner;

public class StackbyArray {
    int arr[];
    int top;
    public StackbyArray(int size)               //this creates an empty stack with size
    {
        arr=new int[size];
        top=-1;
    }

    public boolean isFull()
    {
        if(top==arr.length-1)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }

    public void push(int value)
    {
        if(isFull())
        {
            System.out.println("stack full/overflow");
            return;
        }
        top++;
        arr[top]=value;
        System.out.println("value inserted successfully");
    }

    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("stack underflow");
            return;
        }
        System.out.println(arr[top]);
        arr[top]=0;
        top--;
    }

    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("stack empty nothing to peek");
            return;
        }
        System.out.println(arr[top]);
    }

    public void display()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    public void deleteStack()
    {int i=0;
        while(i<arr.length)
        {
            arr[i]=0;
            i++;
        }
    }

}
class Test
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StackbyArray obj= new StackbyArray(s.nextInt());
        System.out.println("""
                press <1> for push
                press <2> for pop
                press <3> for peek
                press <4> print
                press <5> to delete complete stack\n""");
        char ch='y';
        while(ch=='y'||ch=='Y')
        {
            int n=s.nextInt();
            switch(n)
            {
                case 1:
                    obj.push(s.nextInt());
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
                    obj.deleteStack();
                    obj.display();
                    break;
                default:
                    System.out.println("invalid input");
            }
            System.out.println("\nwant to perform any other operation y/n");
            ch=s.next().charAt(0);
        }
    }
}
