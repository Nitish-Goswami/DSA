private static Node<E> {
    private <E> element;
    private Node<E> next;

    public Node<E>(E element, Node<E> next){
        this.element = element;
        this.next = next;
    }

    public E getElement()   { return this.element; }
    public NOde<E> getNxt()   { return this.next; }
    public void setNext(Node<E> next) { this.next = next; }
}
