
package CIRCULARDOUBLYLINKEDLIST;

public class MAINCLASS {
    public static void main(String[] args){
        
        CircularDoublyLinkedList CDLL = new CircularDoublyLinkedList();
        
        CDLL.print();
        CDLL.search(0);
        
        CDLL.insert(0, 0);
        //CDLL.print();
        CDLL.insert(1, 5);
        //CDLL.print();
        CDLL.insert(2, 1);
        //CDLL.print();
        CDLL.insert(3, 1);
        //CDLL.print();
        CDLL.insert(4, 2);
        //CDLL.print();
        
        //CDLL.printFromEnd();
        
        CDLL.print();
        /*
        System.out.println(CDLL.search(0));
        System.out.println(CDLL.search(1));
        System.out.println(CDLL.search(2));
        System.out.println(CDLL.search(3));
        System.out.println(CDLL.search(4));
        System.out.println(CDLL.search(5));
        System.out.println(CDLL.search(10));
        System.out.println(CDLL.search(-30));
        */
        
        /*
        CDLL.deleteFromHead();
        CDLL.print();
        CDLL.deleteFromHead();
        CDLL.print();
        CDLL.deleteFromHead();
        CDLL.print();
        CDLL.deleteFromHead();
        CDLL.print();
        CDLL.deleteFromHead();
        CDLL.print();
        */
        
        /*
        CDLL.deleteFromTail();
        CDLL.print();
        CDLL.deleteFromTail();
        CDLL.print();
        CDLL.deleteFromTail();
        CDLL.print();
        CDLL.deleteFromTail();
        CDLL.print();
        CDLL.deleteFromTail();
        CDLL.print();
        */
        
        /*
        CDLL.delete(2);
        CDLL.print();
        CDLL.delete(3);
        CDLL.print();
        CDLL.delete(4);
        CDLL.print();
        CDLL.delete(1);
        CDLL.print();
        CDLL.delete(0);
        CDLL.print();
        */
        
    }
    
    
    
    
    
    
    
    
}
