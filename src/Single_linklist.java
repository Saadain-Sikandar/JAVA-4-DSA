import java.security.PublicKey;

public class Single_linklist {

private  Node head;

Single_linklist(){

    this.head = null;
}

    //ADD NODE AT THE BEGINNING
    public void Add_node(int data){

    Node newNode = new Node(data);
    newNode.data = data;
    newNode.next = head;
    head = newNode;

    }

    // INSERT AT SPECIFIC POINT
    public void Insert ( int position , int value){

        if(position<0){

            System.out.println("Invalid position!");
        }
        if(position == 1){
            Add_node(value);
        }


        Node Newnode = new Node(value);
        Node current = head;
        int count = 1;

        while( current.next!=null &&  count < position -1){
            current = current.next;
            count++;
        }
        if(current == null){

            System.out.println("Out of Bound:");
        }
        else {

             Newnode.next = current.next;
            current.next = Newnode;
        }

    }
    //ADD NODE AT THE END

    public void  Add_end (int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }


    //REMOVE AN NODE
    public int Delete (int value){

        if(head == null){

            System.out.println("List is empty");
        }

        Node current = head;
        while(current.next!=null){
           if(current.next.data == value){
               current.next = current.next.next;  //Escape that value
               return 1;
           }
           current = current.next;
        }

        return 0;

    }


   // SEARCHING

   public void Search(int value){

    boolean found = false;
    int position = 1;

    if(head == null){

        System.out.println("list is Empty");
    }

    Node current = head;
    while(current.next!=null){
      if(current.data == value){
          found = true;
          break;
      }
      current = current.next;
      position++;

    }
    if(found){
        System.out.println("\nValue Found at index:"+(position-1));

    }
    else {
        System.out.println("\nValue Not Found!");
    }

   }

            //MAX NUMBER
    public int  Max_num(){

    if(head == null){

        System.out.println("List is Empty:");

    }

    int max = head.data;
    Node current = head.next;
    while (current !=null){
        if(current.data>max){
            max = current.data;
        }
        current = current.next;
    }


    return max;
    }

    //MINIMUM NUMBER
public int Min_num(){

    if(head == null){

        System.out.println("List is Empty.");
    }

    int min = head.data;
    Node current = head.next;
    while (current!=null){
        if(current.data<min){
            min = current.data;
        }
        current = current.next;
    }

    return min;

}

    //COMMON NUMBERS

    public void Common_Elements(Single_linklist list2){

    System.out.println("Common Numbers Are:");

    if(head==null){
        System.out.println("List is Empty");
        return;
    }

    Node current1 = head;
    while(current1!=null){

        Node current2 = list2.head;
        while (current2!=null){

            if(current1.data == current2.data){
                System.out.println(" "+current1.data);
                break;                          // break to avoid printing same numbers.
            }
        current2 = current2.next;
        }
        current1 = current1.next;
    }

    }

    //PRODUCT OF ELEMENTS

    public int Product(){

    if(head == null){

        System.out.println("List is Empty");
    }

    int product = 1;
     Node current = head;
    while(current!=null){
        product *= current.data;
        current = current.next;

    }

    return product;
    }



    //AVERAGE OF LIST

    public double Average(){

    if(head==null){

        System.out.println("List is Empty.");
    }

    int sum = 0;
    int count = 0;


    Node current = head;
    while(current.next!=null){
        sum+=current.data;
        count++;
        current = current.next;
    }
        int average = sum/count;

    return average;

    }


    //REVERSE OF LIST
    public void Reverse(){

    if(head == null){
        System.out.println("List is Empty.");
    }

    Node previous = null;
    Node current = head;
    Node next = null;

    while(current!=null){

        next = current.next;
        current.next = previous;
        previous =  current;
        current = next;

    }
    head = previous;

        System.out.println("New reversed List is:");
        Print();
    }


    //DISTINCT NUMBERS

    public  void Distinct_num(){

    if(head == null){
        System.out.println("List is Empty.");
        return;
    }
    Node current1 = head;
    boolean isdistinct =false;
    while(current1 != null){
        isdistinct =true;        //Making current number distinct

        Node current2 =  head;
        while (current2 != current1){
        if(current1.data == current2.data){
            isdistinct = false;
            break;
        }
        current2 = current2.next;
        }

        if(isdistinct){

            System.out.println(current1.data);
        }

        current1 = current1.next;
    }

}


    //REPLACING OR UPDATING AN ELEMENT

    public void Replace(int new_val,int old_val){

    boolean found = false;

    if(head==null){

        System.out.println("List is Empty.");

    }
    Node current = head;
    while(current!=null){
        if(current.data == old_val){
            current.data = new_val;
            found = true;
            break;

        }
        current = current.next;

    }
    if(found){
        System.out.println("\nValue update Successfully. New List is:");
        Print();
    }

    else{
        System.out.println("\nValue Not Found!");

    }

    }

    // EVEN NUMBERS

    public void Even(){

    if(head == null){

        System.out.println("LIst is Empty.");
    }

    Node current = head;
    while(current!=null){
       if(current.data % 2 == 0){

           System.out.println(" "+current.data);
       }
       current = current.next;

    }

    }

    //ODD NUMBERS

    public void Odd (){

    if(head == null){

        System.out.println("List is Empty.");
    }

    Node current = head;
    while(current!=null){
        if(current.data %2 != 0){
            System.out.println(" "+current.data);

        }
        current = current.next;
    }


    }



    //PRIME NUMBERS

    public void Prime(){

    if(head == null){
        System.out.println("List is Empty.");

    }

    Node current = head;
    while(current!=null){
        Math.sqrt(current.data);
        if(current.data%2!=0){
            System.out.println(" "+current.data);
        }
        current = current.next;
    }

    }


    public void Print (){

        Node trace = head;
        while(trace.next !=null){

            System.out.println(" "+ trace.data);
            trace = trace.next;
        }

        System.out.println(" " + trace.data);

    }

    // PLACING EVEN ODD IN SAME ORDER
    public void EvenOdd(Single_linklist l1) {

        if (head == null) {
            System.out.println("List is Empty:");
        }

        Node current1 = l1.head;
        Node current2 = l1.head;

        while (current1 != null) {

            if (current1.data % 2 == 0) {

                System.out.println(current1.data + " ");

            }
            current1 = current1.next;
        }

        while (current2 != null) {

            if (current2.data % 2 != 0) {

                System.out.println(current2.data + " ");

            }
            current2 = current2.next;

        }

    }


// FINDING VALUE BY INDEX NUMBER
    public void GetNth(int index) {

        int count = 1;

        if (head == null) {

            System.out.println("list is Empty");
        }

        Node current = head;
        while (current != null ) {
            if(index == count-1) {

                System.out.println("\nThe Value at index " + index +" is:" + current.data);
                break;

            }
            current = current.next;
            count++;

        }


    }





}

