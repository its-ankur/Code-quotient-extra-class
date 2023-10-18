package LinkedList;

import java.util.Scanner;
public class BasicLL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    int size=0;
    void insertAtHead(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        size++;
    }

    void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(tail==null){
            tail=newNode;
            head=newNode;
        }
        else{
            Node temp=tail;
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }

    void printList(){
        Node temp=head;
        System.out.print("LinkedList: ");
        while(temp.next!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    void delete(int data){
        if(head.data==data){
            head=head.next;
            return;
        }
        Node temp=head;
        boolean isFound=false;
        while(temp.next!=null){
            if(temp.next.data==data){
                temp.next=temp.next.next;
                isFound=true;
                size--;
                break;
            }
            temp=temp.next;
        }
        if(!isFound){
            System.out.println("Data Not Found");
        }
    }

    String tostring(){
        System.out.print("LinkedList in string form: ");
        StringBuilder str=new StringBuilder();
        Node temp=head;
        while(temp.next!=null){
            str.append(Integer.toString(temp.data));
            str.append(" -> ");
            temp=temp.next;
        }
        str.append(Integer.toString(temp.data));
        return str.toString();
    }

    void isEmpty(){
        if(head==null){
            System.out.println("The LinkedList is not empty");
        }
        else{
            System.out.println("The LinkedList is not empty");
        }
    }
    void alternate(){
        Node p1=head;
        Node p2=head.next;
        while(p1.next!=null){
            if(p2.next==null){
                int temp=p1.data;
                p1.data=p2.data;
                p2.data=temp;
                break;
            }
            int temp=p1.data;
            p1.data=p2.data;
            p2.data=temp;
            p1=p1.next.next;
            p2=p2.next.next;
        }
    }
    int findMiddle(){
        Node fast=head;
        Node slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    int getSize(){
        return size;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BasicLL obj=new BasicLL();
        System.out.println("press 1 for insert at beginning ");
        System.out.println("press 2 for insert at End ");
        System.out.println("press 3 for deleting a node ");
        System.out.println("press 4 for checking isEmpty ");
        System.out.println("press 5 for getting size ");
        System.out.println("press 6 for finding middle ");
        System.out.println("press 7 for toString() ");
        System.out.println("press 8 to print LinkedList ");
        System.out.println("press 9 to alternate swap the list");
        System.out.println("press -1 to exit ");
        System.out.println("-------------------------------------------------------------");
        System.out.println();
        boolean flag=true;
        while(flag){
            System.out.println("Enter a number to proceed: ");
            int num=sc.nextInt();

            switch(num){
                case 1:
                    System.out.print("Enter data to insert: ");
                    int data=sc.nextInt();
                    obj.insertAtHead(data);
                    System.out.println("-------------------------------------------------------------");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter data to insert: ");
                    int x=sc.nextInt();
                    obj.insertAtEnd(x);
                    System.out.println("-------------------------------------------------------------");
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter data to delete: ");
                    int y=sc.nextInt();
                    obj.delete(y);
                    System.out.println("-------------------------------------------------------------");
                    System.out.println();
                    break;

                case 4:
                    obj.isEmpty();
                    System.out.println("-------------------------------------------------------------");
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Size of LinkedList: ");
                    int a=obj.getSize();
                    System.out.println(a);
                    System.out.println("-------------------------------------------------------------");
                    System.out.println();
                    break;

                case 6:
                    System.out.println("The middle element is: "+obj.findMiddle());
                    System.out.println("-------------------------------------------------------------");
                    System.out.println();
                    break;

                case 7:
                    System.out.println(obj.tostring());
                    System.out.println("-------------------------------------------------------------");
                    System.out.println();
                    break;

                case 8:
                    obj.printList();
                    System.out.println("-------------------------------------------------------------");
                    System.out.println();
                    break;

                case 9:
                    obj.alternate();
                    obj.printList();
                    System.out.println("-------------------------------------------------------------");
                    System.out.println();
                    break;

                case -1: flag=false;
                    break;
            }
        }
    }
}