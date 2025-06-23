// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        LinkedList list  = new LinkedList();
        list.InsertFirst(10);
        list.InsertFirst(11);
        list.InsertFirst(26);
        list.InsertLast(999);
        list.DisplayList();
        list.specificInsert(6,2);
        list.DisplayList();
    }
}

class Node
{
    int val;
    Node next;
    
    Node(int val)
    {
     this.val = val;
     this.next = null;
    }
    
}

class LinkedList
{
    private Node head;
    private Node tail;
    private int size;
    
    LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    

public void InsertFirst(int val)
{
   Node node = new Node(val);
   node.next = head;
   
   head = node;
   
   if(tail==null)
   {
       tail = head;
   }
}
public void InsertLast(int val)
{
if(tail == null)
{
    InsertFirst(val);
    return;
}
Node node = new Node( val);
tail.next = node;
tail = node;
size++;
}

public void specificInsert(int val, int index)
{
    if(index==0)
    {
        InsertFirst( val);
        return;
    }
    if(index ==size)
    {
    InsertLast(val);
    return;
    }
    Node current = head;
    Node node = new Node( val);
    for(int i =1;i<index;i++)
    {
        current=current.next;
    }
    System.out.println(current.val+" and "+current.next.val);
    Node temp = current.next;
    
    current.next = node;
    node.next = temp;
}


public void DisplayList()
{
    Node current = head;
    
    while(current!= null)
    {
        System.out.print(current.val+"-->");
         current =current.next;
         size++;
        
    }
   
    System.out.println("null");
}


}





