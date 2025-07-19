public class MyLinkedList<E> {
    private Node first;

    void addData(E input) {
        Node add = new Node(input);
        if (first == null) {
            first = add;
        } else {
            Node temp = first;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(add);
            add.setPrev(temp);
        }
    }

    void printElements() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    void removeData(E data) {
        if (first.getData().equals(data)) {
            first = first.getNext();
            return;
        }
        Node temp = first;
        while (temp.getNext() != null) {
            if (temp.getNext().getData().equals(data)) {
                temp.setNext(temp.getNext().getNext());
                return;
            }
            temp = temp.getNext();
        }
    }
}
