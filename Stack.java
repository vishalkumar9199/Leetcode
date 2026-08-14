public class Stack {
    Node top;
    int height;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }
    Stack(int value){
        Node newNode = new Node(value);
        top=newNode;
        height=1;
    }
    //push
    public void push(int value){
        Node newNode = new Node(value);
        if(height==0){
            top=newNode;
        }else{
            newNode.next=top;
            top=newNode;
        }
        height++;
    }
    //pop
    public Node pop(){
        if(height==0) return null;
        Node temp=top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }
    //print
    public void print(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
        
    }
    public static void main(String[] args) {
        Stack stack = new Stack(0);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.print();
    }
    
}
