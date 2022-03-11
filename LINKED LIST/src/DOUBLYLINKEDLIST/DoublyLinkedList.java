
package DOUBLYLINKEDLIST;


public class DoublyLinkedList {
    Node head = null;
    Node tail = null;
    
    int size =0;
    
    public DoublyLinkedList(){
        this.head =null;
        this.tail = null;
        this.size = 0;
    }
    
    public void insert(int valueToInsert , int location){
        Node nodeToInsert = new Node(valueToInsert);
        
        if(head ==null){
            head = nodeToInsert;
            tail = nodeToInsert;
        }
        else if(location == 0){
            nodeToInsert.setNextNode(head);
            head.setPreviousNode(nodeToInsert);
            head = nodeToInsert;
        }
        else if(location >= size){
            nodeToInsert.setPreviousNode(tail);
            tail.setNextNode(nodeToInsert);
            tail = nodeToInsert;
        }
        else{
            Node current = head;
            for(int a = 0 ; a< location-1 ; a++){
                current = current.getNextNode();
            }
            
            nodeToInsert.setNextNode(current.getNextNode());
            nodeToInsert.setPreviousNode(current);
            current.setNextNode(nodeToInsert);
            nodeToInsert.getNextNode().setPreviousNode(nodeToInsert);

            
        }
        size++;
        
    }
    
    public void print(){
        Node current = head;
        
        if(current ==null){
            System.out.println("THE DOUBLY LINKED LIST IS NOT EXIST!");
        }
        else{
            while(current != null){
            System.out.print(current.toString() + " ");
            current = current.getNextNode();
            }
            System.out.println("");
            
        }
    }
    
    public void printFromEnd(){
        Node current = tail;
        
        if(tail == null){
            System.out.println("THE DOUBLY LINKED LIST IS NOT EXIST!");
        }
        else{
            while(current != null){
                System.out.print(current.getData() + " ");
                current = current.getPreviousNode();
            }
            System.out.println("");
        }
    }
    
    public boolean search(int valueToSearch){
        Node current = head;
        
        if(head ==null){
            System.out.println("THE DOUBLY LINKED LIST IS NOT EXIST!");
            return false;
        }
        else{
            while(current != null){
                if(current.getData() == valueToSearch){
                    return true;
                }
                else{
                    current = current.getNextNode();
                }
            }
            return false;
        }
    }
    
    public void deleteFromHead(){
        Node current = head;
        
        if(current == null){
            System.out.println("THE DLL IS NOT EXIST!");
        }
        else if(current.getNextNode() == null){
            head = null;
            tail = null;
        }
        else{
            current.getNextNode().setPreviousNode(null);
            head = current.getNextNode();
            current.setNextNode(null);
        }
    }
    
    public void deleteFromTail(){
        Node current = tail;
        
        if(tail ==null){
            System.out.println("THE DLL IS NOT EXIST!");
        }
        else if(tail.getPreviousNode() ==null){
            head = null;
            tail =null; 
        }
        else{
            current.getPreviousNode().setNextNode(null);
            tail = current.getPreviousNode();
            current.setPreviousNode(null);
        }
    }
    
    
    public void delete(int valueToDelete){
        Node current = head;
        
        while(current != null && current.getData() != valueToDelete){
            current = current.getNextNode();
        }
        
        if(current ==null){
            System.out.println(valueToDelete + " IS NOT IN THE DOUBLY LINKED LIST");
        }
        else if(current == head){
            deleteFromHead();
        }
        else if(current == tail){
            deleteFromTail();
        }
        else{
            current.getPreviousNode().setNextNode(current.getNextNode());
            current.getNextNode().setPreviousNode(current.getPreviousNode());
            current.setNextNode(null);
            current.setPreviousNode(null);
        }

    }
    
    public void deleteEntireLinkedList(){
        Node current = head;
        
        while(current != null){
            current.setPreviousNode(null);
            current = current.getNextNode();
        }
        
        head = null;
        tail = null;       
    }
    
    
    
    //GARBAGE COLLECTOR IN TOPLAMASI ICIN NODE UN DIGER HICNIR NODE TARAFINDAN REFERANS EDILMEMESI YANI ULASILMAMASI GEREKIR (TOPLANACAK NODE DAN BASKA NODE A CIKAN YOLLAR OLSA DA GELEN YOL OLMAYINCA TOPLANIR)
    
    
}
