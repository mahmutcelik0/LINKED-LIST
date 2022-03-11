
package CIRCULARDOUBLYLINKEDLIST;

public class CircularDoublyLinkedList {
    Node head = null;
    Node tail = null;
    int size =0;
    
    public CircularDoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void insert(int valueToInsert , int location){
        Node nodeToInsert = new Node(valueToInsert);
        
        
        if(head ==null){
            head = nodeToInsert;
            tail = nodeToInsert;
            nodeToInsert.setNextNode(nodeToInsert);
            nodeToInsert.setPreviousNode(nodeToInsert);
        }
        else if(location == 0){
            head.setPreviousNode(nodeToInsert);
            nodeToInsert.setNextNode(head);
            nodeToInsert.setPreviousNode(tail);
            tail.setNextNode(nodeToInsert);
            head = nodeToInsert;
        }
        
        else if(location >= size){
            tail.setNextNode(nodeToInsert);
            nodeToInsert.setPreviousNode(tail);
            nodeToInsert.setNextNode(head);
            head.setPreviousNode(nodeToInsert);
            tail = nodeToInsert;
        }
        
        else{
            Node current = head;
            
            for(int a = 0 ; a<location-1 ; a++){
                current = current.getNextNode();
            }
            
            current.getNextNode().setPreviousNode(nodeToInsert);
            nodeToInsert.setNextNode(current.getNextNode());
            
            current.setNextNode(nodeToInsert);
            nodeToInsert.setPreviousNode(current);
        }
        
        size++;       
    }
    
    public void print(){ //TRAVERSE CDLL
        Node current = head;
        
        if(head ==null){
            System.out.println("THE CDLL IS NOT EXIST!");
        }
        
        else{
            do{

                System.out.print(current.getData() + " ");

                current = current.getNextNode();
            }while(current !=head);
            System.out.println("");
        }
    }
    
    
    public void printFromEnd(){ //REVERSE TRAVERSE CDLL
        Node current = tail;
        
        if(tail == null){
            System.out.println("THE CDLL IS NOT EXIST!");
        }
        else{
            do{
            
                System.out.print(current.getData() + " ");
                
                current = current.getPreviousNode();
            }while(current != tail);
            System.out.println("");
        }
    }
    
    public boolean search(int valueToSearch){
        Node current = head;
        
        if(current == null){
            System.out.println("THE CDLL IS NOT EXIST!");
            return false;
          
        }
        else{
            while(current.getNextNode() != head){
                if(current.getData() == valueToSearch){
                    return true;
                }
                else{
                    current = current.getNextNode();
                }

            }
            
            return current.getData() == valueToSearch;
        }
    }
    
    public void deleteFromHead(){
        if(head ==null){
            System.out.println("THE CDLL IS NOT EXIST!");
        }
        else if(head.getNextNode() ==head){
            head =null;
            tail = null;
        }
        else{
            tail.setNextNode(head.getNextNode());
            head.getNextNode().setPreviousNode(tail);
            head = tail.getNextNode();
        }
    }
    
    public void deleteFromTail(){
        if(tail ==null){
            System.out.println("THE CDLL IS NOT EXIST!");
        }
        else if(tail.getNextNode() == tail){
            head = null;
            tail =null;
        }
        else{
            tail.getPreviousNode().setNextNode(head);
            head.setPreviousNode(tail.getPreviousNode());
            tail = head.getPreviousNode();
        }
    }
    
    public void delete(int valueToDelete){
        Node current = head;
        
        while(current.getData() != valueToDelete){

            if(current.getNextNode() !=head ){
                current = current.getNextNode();
            }
            else{
                System.out.println(valueToDelete+" IS NOT IN THE CDLL!");
                return;
            }
        }
        
        if(current ==head){
            deleteFromHead();
        }
        else if(current ==tail){
            deleteFromTail();
        }
        else{
            current.getNextNode().setPreviousNode(current.getPreviousNode());
            current.getPreviousNode().setNextNode(current.getNextNode());
        }
    }
    
    
    
    
}
