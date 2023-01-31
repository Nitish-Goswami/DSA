public class SinglyLinkedList <E>{
    // Nested Class
    private static class Node<E> {
        
        private E element;
        private Node<E> next;
       
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() { return element; }
        public Node<E> getNext() { return next; } 
        public void setNext(Node<E> n) { next = n; }

    }

    // Instances Variable of Singly Linked List
        private Node<E> head = null;
        private Node<E> tail = null;
        private int size = 0;

        public SinglyLinkedList() {};

    // Access Method
        public int getSize() { return size; }

        public boolean isEmpty() { return size == 0; }

        public E first(){ 
            if(isEmpty()) return null;
            return head.getElement();
        }

        public E last(){ 
            if(isEmpty()) return null;
            return tail.getElement();
        }


     // Update Method
        // Add First element
        public void addFirst(E e){
            head = new Node<>(e,head);
            if(isEmpty()) 
                tail = head;
            size++;
        }

        // Add last element
        public void addLast(E e){
            Node<E> newNode = new Node<>(e,head);
            if(isEmpty()) 
                head = newNode;
            else
                tail.setNext(newNode);
            tail = newNode;
            size++;
        }

        public E removeFirst(){
            if(isEmpty()) return null;
            E answer = head.getElement();
            head = head.next;
            size--;

            if(size == 0) tail = null;
            return answer;
        }

        
        public static void main(String[] args){
            SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
            ll.addFirst(10);
            ll.addFirst(20);
            ll.addFirst(30);
            ll.addLast(5);
          
            int size = ll.getSize();

            for(int i=0;i<size;i++){
            int removedItem = ll.removeFirst();
            System.out.println(removedItem);
        }


        }

        

}