// finding middle elemement in the signle linked list 

class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Try programiz.pro");
        LinkedList list = new LinkedList();
        list.InsertFirst(14);
                list.InsertFirst(234);
                               list.InsertFirst(876);

        list.InsertFirst(554);
        list.InsertFirst(6789);

        list.InsertFirst(53);
        list.DisplayData();
        int a = list.FindMiddle();
        System.out.println(a);
    }
}

class ListNode
{
    int value;
    ListNode next;
    
    
    ListNode(int value)
    {
        this.value= value;
        this.next = null;
    }
}

class LinkedList
{
    private ListNode head;
    private ListNode tail;
    private int size;
    
    
    LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
        
    }
    
    
    public void InsertFirst(int val)
    {
        ListNode node = new ListNode(val);
        node.next = head;
        head=node;
        
        if( tail==null)
        {
            tail = head;
        }
    }
    public void DisplayData()
    {
        ListNode current = head;
        
        while(current!=null)
        {
            System.out.print(current.value+"-->");
            current = current.next;
        }
        System.out.print("end");
    }
    public int FindMiddle()
    {
        ListNode oneStep = head;
        ListNode twoStep = head;
        
        while (twoStep != null && twoStep.next != null) {
        oneStep = oneStep.next;
        twoStep = twoStep.next.next;
    }

    // If twoStep is null or twoStep.next is null, we are at the middle node
    return oneStep.value;
        
        
    }
}

    
