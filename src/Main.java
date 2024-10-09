public class Main {
    public static void main(String[] args) {

        Single_linklist sll = new Single_linklist();

        sll.Add_node(1);
        sll.Add_node(2);
        sll.Add_node(3);
        sll.Add_node(5);
        sll.Add_node(7);
        sll.Add_node(9);


       Single_linklist sll2 = new Single_linklist();
       sll2.Add_node(6);
       sll2.Add_node(5);
       sll2.Add_node(4);
       sll2.Add_node(3);
       sll2.Add_node(2);
       sll2.Add_node(1);


          //INSERTION


//  sll.Insert(3,9);
// sll.Print();


            // DELETING

//        int delete = sll.Delete(4);
//        if (delete != 0) {
//
//            System.out.println("\nNode deleted.New Node is:");
//            sll.Print();
//        } else {
//
//            System.out.println("Node Not Found");
//        }



        //SEARCHING

//        sll.Search(3);


        //MAX NUMBERS

//         int max = sll.Max_num();
//        System.out.println("\nMax Number is:"+max);


        //MIN NUMBERS

//        int min = sll.Min_num();
//        System.out.println("\nMinimum Number is:"+min);


        //COMMON NUMBER
//    sll.Common_Elements(sll2);





       //PRODUCT OF ELEMENT
//    int product = sll.Product();
//        System.out.println("\nProduct Of Elements is:"+product);



        //AVERAGE OF LIST
//        double average = sll.Average();
//        System.out.println("The Average is:"+average);



         // REVERSE OF LIST
//        sll.Reverse();


        //DISTINCT NUMBER

//        System.out.println("Distinct Numbers Are:");
//        sll.Distinct_num();




        //REPLACING OR UPDATING AN ELEMENT
//        sll.Replace(10,5);


        // EVEN NUMBERS
//        System.out.println("Even Numbers are:");
//        sll.Even();


             //ODD NUMBERS
//        System.out.println("Odd Numbers Are:");
//        sll.Odd();


        //PRIME NUMBERS
//        System.out.println("Prime Numbers are:");
//        sll.Prime();

    }
}


