/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOUBLYLINKEDLIST;

/**
 *
 * @author mahmu
 */
public class MAINCLASS {
    public static void main(String[] args){
        DoublyLinkedList DLL = new DoublyLinkedList();
        
        //DLL.print();
        
        //System.out.println(DLL.search(0));
        
        DLL.insert(0, 0);
        //DLL.print();
        DLL.insert(5, 8);
        //DLL.print();
        DLL.insert(7, 2);
        //DLL.print();
        DLL.insert(6, 1);
        
        DLL.print();
        
        //DLL.printFromEnd();
        
        /*
        System.out.println(DLL.search(0));
        System.out.println(DLL.search(5));
        System.out.println(DLL.search(7));
        System.out.println(DLL.search(6));
        System.out.println(DLL.search(30));
        System.out.println(DLL.search(-13));
        */
        
        /*
        DLL.deleteFromHead();
        DLL.print();
        DLL.deleteFromHead();
        DLL.print();
        DLL.deleteFromHead();
        DLL.print();
        DLL.deleteFromHead();
        DLL.print();
        */
        
        /*
        DLL.deleteFromTail();
        DLL.print();
        DLL.deleteFromTail();
        DLL.print();
        DLL.deleteFromTail();
        DLL.print();
        DLL.deleteFromTail();
        DLL.print();
        */
        
        /*
        DLL.delete(5);
        DLL.print();
        DLL.delete(6);
        DLL.print();
        DLL.delete(0);
        DLL.print();
        DLL.delete(7);

        DLL.delete(5);
        
        DLL.print();
        */
        
        /*
        DLL.deleteEntireLinkedList();
        DLL.print();
        */
    }
}
