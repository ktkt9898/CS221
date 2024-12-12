# Which of the following statements is false
The runtime order of removeLast() method is the same for double and single linked lists,
not true for single list since removeLast() is the greatest burden

# Complete the following method for a list that uses a single-linked list implementation and contains instance variables Node‹T› head and tail, and int size.
public void addAfter(T target, T element) {
    //find insertion point
    Node‹T› targetNode = head;
    while (targetNode != null && !targetNode.getElement().equals(target)) {
        targetNode = targetNode.getNext();
    }
    if (targetNode == null) {
        throw new NoSuchElementException("LinkedList");
    }
    //add new node

    //YOUR CODE INSERTED HERE

    //increment size
    size++;
}

Already found the target node, and if we didn't we already throw an exception

Recall this is a single link, do not bother with backward link consideration

1. Connect the node to the existing list, have t

2. Update the target node to point to the newly created node

Node<T> newNode = new Node<T>(element);
newNode.setNextNode(targetNode.getNextNode());
targetNode.setNextNode(newNode);

// If the next node is null, or at the end of the list, set this to the tail
if (newNode.getNextNode() == null) {
    tail = newNode;
}

size++;
versionNumber++;