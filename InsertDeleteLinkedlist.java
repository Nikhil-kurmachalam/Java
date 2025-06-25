// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) 
    {
      LinkedList list = new LinkedList();
      list.insertFirst(19);
      list.insertFirst(20);
      list.insertFirst(345);
      list.insertLast(564);
      list.insertAnywhere(2,5);
      list.DeleteTail();
      list.Deletehead();
      list.DisplayLinkedList();
    }
}

class Node
{
    int val;
    Node next;
    
    
    Node(int val)
    {
        this.val = val;
        
    }
    Node(int val, Node next)
    {
        this.val = val;
        this.next = null;
    }
    
}

class LinkedList
{
    
    private Node head;
    private Node tail;
    
    
    LinkedList()
    {
        this.head=null;
        this.tail=null;
    }
    
    public void insertFirst(int val)
    {
        Node node = new Node(val)  ;
       
        node.next = head;
        head= node;
        if(tail==null)
        {
            tail=head;
        }
    }
    
    public void DisplayLinkedList()
    {
        Node current = head;
        
        while(current!=null)
        {
            System.out.print(current.val+"-->");
            current = current.next;
        }
        System.out.println("End");
    }
    public void insertLast(int val)
    {
        Node node = new Node(val);
       
        
    if( tail == null)
    {
        insertFirst(val);
        return;
    }
    tail.next = node;
    node.next = null;
    tail=node;
    }
    
    public void insertAnywhere(int index, int val)
    {
        Node node = new Node(val);
        Node current = head;
    for(int i =0;i<index-1;i++)
    {
        current = current.next;
    }
    Node temp = current.next;
    current.next = node;
    node.next = temp;
    }
    
    public void DeleteTail()
    {
        Node current = head;
         //Node tailbefore;

        while(current.next!=tail)
        {
            //tailbefore = current;
            current = current.next;
        }
        current.next = null;
        tail = current;
    }
    
    public void Deletehead()
    {
        Node current = head.next;
        head = current;
        
        
        
    }
    
}











