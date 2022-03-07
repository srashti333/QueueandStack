import java.util.Scanner;

public class QueueWithArray
{
    int arr[];
    int front,rear;
    QueueWithArray(int size)
    {
        arr =new int[size];
        front=rear=-1;
    }

    public void enqueue(int data)
    {
        if(rear==arr.length-1)
        {
            System.out.println("overflow");
            return;
        }
        if(rear==-1)
        {
            front=0;
            rear++;
            arr[rear]=data;
            return;
        }
        rear++;
        arr[rear]=data;
    }

    public void dequeue()
    {
        if(rear==-1)
        {
            System.out.println("empty");
            return;
        }
        System.out.println(arr[front]);
        if(front==rear)
        {
            front=rear=-1;
            return;
        }
        front++;
    }

    public void display()
    {
        if(rear==-1)
        {
            System.out.println("empty");
            return;
        }
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
class Test3
{
    public static void main(String[] args) {
        char ch='y';
        Scanner sc=new Scanner(System.in);
        QueueWithArray obj=new QueueWithArray(sc.nextInt());
        System.out.println("""
                press <1> for enqueue
                press <2> for dequeue
                press <3> for display\n""");
        while(ch=='y'||ch=='Y')
        {
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    obj.enqueue(sc.nextInt());
                    obj.display();
                    break;
                case 2:
                    obj.dequeue();
                    obj.display();
                    break;
                case 3:
                    obj.display();
                    break;
                default:
                    System.out.println("invalid input");
            }
            System.out.println("\ny/n");
            ch=sc.next().charAt(0);
        }
    }
}