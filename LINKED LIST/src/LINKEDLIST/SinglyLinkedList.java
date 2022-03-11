
package LINKEDLIST;


public class SinglyLinkedList {
    
    //SINGLY LINKED LIST E AIT OZELLIKLER
    private Node head ;
    private Node tail ;
    private int size ;

    //CONSTRUCTOR
    public SinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    
    //LINKED LIST E ELEMAN EKLEMEYI SAGLAYAN METOD
    //LOCATION SAYESINDE ISTENILEN INDEXE ELEMAN EKLENIR
    public void insert(int valueToInsert ,int location){
        //EKLENECEK DEGER NODE CLASSI KULLANILARAK NODE OLUSTURULUR
        Node nodeToInsert = new Node(valueToInsert);    
        
        //LINKED LIST BOS OLDUGUNDA CALISACAK BLOK
        if(head ==null){    
            head = nodeToInsert;
            tail = nodeToInsert;
        }
        //ELEMAN 0.INDEXE YANI EN BASA EKLENECEKSE CALISACAK BLOK
        else if(location ==0){
            nodeToInsert.setNextNode(head);
            head = nodeToInsert;
        }
        //ELEMAN LINKED LISTIN SONUNA EKLENECEKSE CALISACAK BLOK
        else if(location >= size){
            tail.setNextNode(nodeToInsert);
            tail = tail.getNextNode();
        }
        //DIGER DURUMDA YANI ARALARA EKLEME YAPILACAKSA CALISACAK BLOK
        else{
            //ELEMAN EKLEME YAPILMASI GEREKILDIGINDE ONCEKI DEGERI TUTMAK
            //ICIN 2 TANE DEGISKEN OLUSTURULUR
            Node current = head;
            Node previous =head;    
            
            //EKLENECEK YERE FOR DONGUSUYLE ERISILIR
            for(int a = 0 ; a<location ; a++){
                previous = current;
                current = current.getNextNode();
            }
            //ELEMAN EKLENIR
            previous.setNextNode(nodeToInsert);
            nodeToInsert.setNextNode(current);
        }
        size++; //SIZE ELEMAN EKLENDIKCE 1 ARTTIRILIR
    }
    
    
    
    //LINKED LIST PRINT METODU
    public void print(){
        //HEAD NULL OLDUGUNDA LINKED LIST E ELEMAN EKLENMEMISTIR
        if(head == null){
            System.out.println("SINGLY LINKED LIST DOES NOT EXIST");
        }
        //HEADDEN BASLANARAK WHILE DONGUSU ILE TUM ELEMANLAR DOLASILIR
        else{
            Node current = head;
            while(current !=null){
                System.out.print(current.toString() + " ");
                current = current.getNextNode();
            }
            System.out.println("");
        }
    }
    
    //LINKED LIST SEARCH METODU
    public boolean search(int valueToSearch){
        Node current = head;
        //WHILE DONGUSU ILE LINKED LIST DOLASILIR 
        while(current != null){
            //NODE UN DEGERI ARANAN DEGERE ESITSE RETURN TRUE ILE DONGUDEN CIKILIR
            if(current.getData() == valueToSearch){
                return true;
            }
            //NODE UN DEGERI ARANAN DEGERE ESIT DEGILSE SONRAKI DUGUME GECILIR
            else{
                current = current.getNextNode();
            }
            //TUM DUGUMLER DOLASILDIGINDA HALA BLOKTAN CIKILMAMISSA
            //CURRENT NULL OLACAGINDAN DONGU BITER
        }
        //BU KISMA GELINMISSE ELEMAN LINKED LISTTE OLMAYACAGINDAN RETURN FALSE OLUR
        return false;

    }
    
    //LINKED LIST IN EN BASINDAKI ELEMANI SILER VE SONRAKI ELEMANI YENI HEAD YAPAR
    public void deleteFromHead(){
        Node current = head;
        
        if(current.getNextNode() == null){
            head = null;
            tail = null;
        }
        else{
            head = current.getNextNode();
        }
    }
    
    //LINKED LIST IN EN SONUNDAKI ELEMANI SILER VE ONCEKI ELEMANI YENI TAIL YAPAR
    public void deleteFromTail(){
        Node current = head;
        
        if(current.getNextNode() ==null){
            head = null;
            tail = null;
        }
        
        else{
            Node previous = head;
            while(current.getNextNode() !=null){
                previous = current;
                current = current.getNextNode();
            }
            previous.setNextNode(null);
            tail = previous;
        }
    }
    
    //SILINMESI ISTENEN DEGER LINKED LISTTE VARSA SILEN METOD
    public void deleteUsingValue(int valueToDelete){
        Node current = head;
        Node previous = head;
        
        //HEAD NULL OLMADIGINDA CALISACAK BLOK HEAD NULL ISE LINKED LIST BOSTUR
        if(head !=null){
            
            //SILINMESI ISTENEN ELEMAN VARSA YERI BULUNUR 
            while(current !=null){
                if(current.getData() == valueToDelete){
                    break;
                }
                else{
                    previous = current;
                    current = current.getNextNode();
                }
            }
            //BULUNAN YER HEAD ISE deleteFromHead METODU KULLANILARAK ELEMAN SILINIR
            if(current ==head){
                deleteFromHead();
            }
            //BULUNAN YER TAIL ISE deleteFromTail METODU KULLANILARAK ELEMAN SILINIR
            else if(current ==tail){
                deleteFromTail();
            }
            //LINKED LISTIN SONUNA GIDILDIGINDE ELEMAN BULUNAMAMISTIR
            else if(current ==null){
                System.out.println("NOT IN THE LINKED LIST");
            }
            //SILINECEK ELEMAN ARALARDA ISE KENNDINEN ONCEKI ELEMAN
            //KENDINDEN SONRAKI ELEMANA BAGLANIR
            else{
                previous.setNextNode(current.getNextNode());
            }
        }
        //LINKED LIST OLMADIGINDA CALISIR
        else{
            System.out.println("THE SINGLY LINKED LIST IS NOT EXIST!");
        }
        
    }
    
    //LINKED LIST IN TAMAMINI SILER
    public void deleteEntireLinkedList(){
        head = null;
        tail = null;
    }
    
    
}
