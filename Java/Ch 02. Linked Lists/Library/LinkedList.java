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
                } else if (pointer.next == null) { // end of list
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

    public LinkedList sumLists(LinkedList list1, LinkedList list2) {
        LinkedList.Node head1 = list1.head;
        LinkedList.Node head2 = list2.head;

        LinkedList result = new LinkedList();

        int overflow = 0;
        int sum = 0;

        while (head1 != null || head2 != null) {
            int digit1 = 0, digit2 = 0;
            if (head1 != null) {
                digit1 = Integer.parseInt(head1.data);
                head1 = head1.next;
            }
            if (head2 != null) {
                digit2 = Integer.parseInt(head2.data);
                head2 = head2.next;
            }

            sum = (digit1 + digit2 + overflow);
            overflow = sum / 10;
            result.insert(result, Integer.toString(sum % 10));
        }
        if (overflow != 0) {
            result.insert(result, Integer.toString(overflow));
        }
        return result;
    }

    private void addPadding(LinkedList list1, LinkedList list2) {
        LinkedList.Node pointer1 = list1.head;
        LinkedList.Node pointer2 = list2.head;

        while (pointer1 != null || pointer2 != null) {
            if (pointer1 == null) {
                LinkedList.Node zeroNode = new LinkedList.Node("0");
                zeroNode.next = list1.head;
                list1.head = zeroNode;
            } else {
                pointer1 = pointer1.next;
            }

            if (pointer2 == null) {
                LinkedList.Node zeroNode = new LinkedList.Node("0");
                zeroNode.next = list2.head;
                list2.head = zeroNode;
            } else {
                pointer2 = pointer2.next;
            }
        }
    }

    private int sumNodes(LinkedList.Node n1, LinkedList.Node n2, LinkedList sum) {
        int d1 = Integer.parseInt(n1.data);
        int d2 = Integer.parseInt(n2.data);
        int summation = 0;

        if (n1.next != null) {
            summation = sumNodes(n1.next, n2.next, sum);
        }
        int number = (d1 + d2 + summation);
        LinkedList.Node digit = new LinkedList.Node(Integer.toString(number % 10));
        digit.next = sum.head;
        sum.head = digit;
        return number / 10;
    }

    public void sumListsForward(LinkedList list1, LinkedList list2) {
        addPadding(list1, list2);
        LinkedList.Node firstDigit1 = list1.head;
        LinkedList.Node firstDigit2 = list2.head;

        LinkedList result = new LinkedList();
        int lastDigit = sumNodes(firstDigit1, firstDigit2, result);
        if (lastDigit > 0) {
            LinkedList.Node digit = new LinkedList.Node(Integer.toString(lastDigit));
            digit.next = result.head;
            result.head = digit;
        }

        result.print(result);
    }

    private LinkedList reverseList(LinkedList list) {
        LinkedList.Node pointer = list.head;
        LinkedList reversedList = new LinkedList();
        while (pointer != null) {
            LinkedList.Node node = new LinkedList.Node(pointer.data);
            node.next = reversedList.head;
            reversedList.head = node;
            pointer = pointer.next;
        }
        print(reversedList);
        return reversedList;
    }

    private boolean compareLists(LinkedList list1, LinkedList list2) {
        LinkedList.Node pointer1 = list1.head;
        LinkedList.Node pointer2 = list2.head;
        while (pointer1 != null && pointer2 != null) {
            if (pointer1.data != pointer2.data) {
                return false;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return true;
    }

    public boolean isPalindrome(LinkedList originalList) {
        LinkedList reversedList = reverseList(originalList);
        return compareLists(originalList, reversedList);
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
