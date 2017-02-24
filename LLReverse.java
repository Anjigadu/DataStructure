//MyClass
public class LLReverse {

	public static void main(String...args){
		Node head = new Node(1, new Node(2,new Node(3,new Node(4,null))));
		
		Node current,previous,next;
		current=head;
		previous=null;
		next=null;
		while(current != null){
			next = current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		head=previous;
		Node temp=head;
		while(true){
			System.out.println(temp.data);
			if(temp.next==null) break;
			else temp = temp.next;
		}
		System.out.println(" Done printing.");
		
	}
}
class Node{
	int data;
	Node next;
	Node(int data,Node next){
		this.data=data;
		this.next=next;
	}
}
