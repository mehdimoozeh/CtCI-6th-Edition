package Library;

import java.util.HashSet;

public class LinkedList {
    Library.LinkedList.Node head;

    public class Node {
        String data;
        Library.LinkedList.Node next;

        Node(String d) {
            data = d;
            next = null;
        }
    }

    public LinkedList removeDup1(LinkedList list) {
        HashSet<String> items = new HashSet<>();
        LinkedList.Node node = list.head;
        LinkedList.Node previous = null;

        while (node != null) {
            if (items.contains(node.data)) {
                previous.next = node.next;
            } else {
                items.add(node.data);
                previous = node;
            }
            node = node.next;
        }
        return list;
    }


    public LinkedList removeDup2(LinkedList list) {
        LinkedList.Node current = list.head;
        while (current != null) {
            LinkedList.Node pointer = current;

            while (pointer.next != null) {
                if (pointer.next.data == current.data) {
                    pointer.next = pointer.next.next;
                } else {
                    pointer = pointer.next;
                }
            }
            current = current.next;
        }
        return list;
    }

    public String KthTOLast(LinkedList list, int kthToLast) {
        LinkedList.Node node = list.head;
        LinkedList.Node pointer = list.head;
        while (pointer != null) {
            if (kthToLast < 0) {
                node = node.next;
            }
            kthToLast--;
            pointer = pointer.next;
        }
        return node.data;
    }

    public void deleteMiddleNode(LinkedList.Node node) {
        while (node.next != null) {
            node.data = node.next.data;
            if (node.next.next == null) {
                node.next = null;
            } else {
                node = node.next;
            }
        }
    }

    public void partition(LinkedList list, int partition) {
        LinkedList.Node previous = null;
        LinkedList.Node pointer = list.head;
        LinkedList partitionedList = new LinkedList();
        while (pointer != null) {
            int data = Integer.parseInt(pointer.data);
            if (data >= partition) {
                partitionedList.insert(partitionedList, Integer.toString(data));
                if (pointer.equals(list.head)) {
                    list.head = pointer.next;
                } else if (pointer.next != null) {
                    previous.next = pointer.next;
                } else if (pointer.next == null ) { // end of list
                    pointer.next = partitionedList.head;
                }
            } else {
                previous = pointer;
            }
            pointer = pointer.next;
        }
        list.print(list);
        partitionedList.print(partitionedList);
    }

    public LinkedList.Node insert(LinkedList list, String data) {
        LinkedList.Node new_node = new LinkedList.Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        } else {
            LinkedList.Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return new_node;
    }

    public void print(LinkedList list) {
        LinkedList.Node currNode = list.head;
        System.out.println("Linked List: ");

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }
}
