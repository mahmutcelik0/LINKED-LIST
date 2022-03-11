/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CIRCULARSINGLYLINKEDLIST;

/**
 *
 * @author mahmu
 */
public class CircularSinglyLinkedList {
    Node head = null;
    Node tail = null;
    int size =0;
    
    public CircularSinglyLinkedList(){
        size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public void insert(int valueToInsert , int location){
        Node nodeToInsert = new Node(valueToInsert);
        if(head == null){
            head = nodeToInsert;
            tail = nodeToInsert;
            nodeToInsert.setNextNode(head);
        }
        else if(location ==0){
            nodeToInsert.setNextNode(head);
            head = nodeToInsert;
            tail.setNextNode(head);
        }
        else if(location >= size){
            nodeToInsert.setNextNode(head);
            tail.setNextNode(nodeToInsert);
            tail = nodeToInsert;
        }
        
        else{
            Node current = head;
            for(int a = 0 ; a< location-1; a++){
                current = current.getNextNode();
            }
            nodeToInsert.setNextNode(current.getNextNode());
            current.setNextNode(nodeToInsert);
        }
        size++;
    }
    
    public void print(){
        Node current = head;
        
        if(head ==null){
            System.out.println("THERE IS NO CSSL");
        }
        else if(size ==1){
            System.out.println(current);
        }
        else {
            
            do{
                System.out.print(current.getData()+" ");
                current = current.getNextNode();
            }while(current != tail.getNextNode());
            System.out.println("");
            
        }
        
        
        
    }
    
    public boolean search(int valueToSearch){
        Node current = head;
        if(head == null){
            System.out.println("THE CSLL IS NOT EXIST!");
            return false;
        }
        else{
            do{
                if(current.getData() == valueToSearch){
                    return true;
                } 
                else{
                    current = current.getNextNode();
                }

            }while(current != tail.getNextNode());

            return false;
        }
    }
    
    
    public void deleteFromHead(){
        Node current = head;
        if(current == null){
            System.out.println("THERE IS NO CIRCULAR SINGLY LINKED LIST");
        }
        else if(current.getNextNode() ==current){
            head = null;
            tail = null;
            current.setNextNode(null);
            size--;
        }
        else{
            head = current.getNextNode();
            tail.setNextNode(head);
            size--;
        }
    }
    
    public void deleteFromTail(){
        Node current = head;
        if(current == null){
            System.out.println("THERE IS NO CIRCULAR SINGLY LINKED LIST");
        }
        else if(current.getNextNode() == current ){
            head = null;
            tail = null;
            current.setNextNode(null);
            size--;
        }
        else{
            while(current.getNextNode() != tail){
                current = current.getNextNode();
            }
            current.setNextNode(tail.getNextNode());
            tail = current;
            size--;
        }
    }
    
    public void delete(int valueToDelete){
        Node current = head;
        Node previous = head;
        
        while(current.getData() !=valueToDelete ){
            if(current != tail){
                previous = current;
                current = current.getNextNode();
            }
            else if(tail.getData() == valueToDelete){
                previous = current;
                current = tail;
            }
            else{
                System.out.println(valueToDelete+" IS NOT IN THE LINKED LIST");
                return;
                
            }
        }

        if(current == head){
            deleteFromHead();
        }
        else if(current == tail){
            deleteFromTail();
        }
        else{
            previous.setNextNode(current.getNextNode());
        }
    }
    
    //head == null kontrolu ile linked list olup olmadıgını kontrol etmek gerekli
    public void deleteEntireCircularSinglyLinkedList(){
        if(head == null){
            System.out.println("THE CLL DOES NOT EXIST!");
        }
        else{
            head = null;
            tail.setNextNode(null);     //WE HAVE TO DELETE IF WE DON'T MAKE IT NULL GARBAGE COLLECTER WON'T DELETE THEM FROM MEMORY
            tail = null;
        }
    }    
}
