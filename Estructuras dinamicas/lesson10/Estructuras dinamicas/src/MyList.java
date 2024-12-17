public class MyList<T> {

    private int size;
    private Node<T> head;

    public MyList() {
        size = 0;
        head = null;
    }

    public void addHead(T element) {
        Node<T> aux = new Node<>(element);
        aux.setNext(head);
        head = aux;
        size++;
    }

    public void addTail(T element) {
        // (1)
        if (head == null)
            addHead(element);
        else {
            // (2)
            Node<T> aux = head;
            while (aux.getNext() != null)
                aux = aux.getNext();

            // (3)
            aux.setNext(new Node<T>(element));
            size++;
        }
    }

    public T remove(int index) {
        // (1)
        if (index >= size || index < 0)
            return null;
        // (2)
        if (index == 0) {
            T info = head.info;
            head = head.getNext();
            size--;
            return info;
        }
        // (3)
        Node<T> aux = head;
        while (--index > 0)
            aux = aux.getNext();

        T info = aux.getNext().info;

        aux.setNext(aux.getNext().getNext());
        size--;
        return info;
    }

    public String toString() {
        return "size: " + size + "\n" + ((head==null)?"[]":"["+head);
    }

    private class Node<T> {

        private T info;
        private Node<T> next;

        Node(T info){
            this.info = info;
            this.next = null;
        }
        Node<T> getNext(){
            return next;
        }
        void setNext(Node<T> node){
            this.next = node;
        }
        public String toString(){
            return info + ((next!=null)? " " + next : "]");
        }
    }
}