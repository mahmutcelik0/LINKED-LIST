
package LINKEDLIST;

public class Node { 
    //NODE CLASSINA AIT PRIVATE OZELLIKLER
    private int data;
    private Node nextNode;
    
    public Node(int data){  //CONSTRUCTOR
        this.data = data;
        nextNode = null;
    }

    //PRIVATE OLARAK OLUSTURULAN OZELLIKLERE ERISEBILMEK
    //ICIN GETTER VE SETTER
    
    public int getData() {  
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    
    //NODE ICINDEKI DATAYI DONDUREN TOSTRING METODU
    @Override
    public String toString(){
        return Integer.toString(data);
    }
    
    
    
}


