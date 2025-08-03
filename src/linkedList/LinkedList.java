package linkedList;

public class LinkedList {

    private static int lengthOfLL (Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    private static int checkIfPresent(Node head, int val){
        Node temp = head;
        while (temp != null){
            if(temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }

    private static Node removesHead(Node head){
        if(head == null) return head;
        return head.next;
    }

    private static Node removesTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node removeK(Node head, int k){
        if(head == null) return head;
        if(k == 1) return head.next;
        int count = 0;
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            count++;
            if (count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node removeElement(Node head, int el){
        if(head == null) return head;
        if(head.data == el) return head.next;
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if (temp.data == el){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node insertHead(Node head, int val){
        return new Node(val, head);
    }

    private static Node insertTail(Node head, int val){
        if(head == null) return new Node(val);
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node(val);
        return head;
    }

    private static Node insertPosition(Node head, int val, int k){
        if(head == null) {
            if (k == 1) return new Node(val);
            else return head;
        }
        if (k ==1) return new Node(val, head);
        int count = 0;
        Node temp = head;
        while(temp != null){
            count ++;
            if(count == k-1){
                Node x = new Node(val, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node insertBeforeValue(Node head, int val, int b4){
        if(head == null) {
            return null;
        }
        if (head.data == b4) return new Node(val, head);
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == b4){
                Node x = new Node(val, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int [] arr = {2,4,3,5,9};
        Node y = new Node(arr[1]);
        System.out.println(y.data);
        Node head = convertToLinkedList(arr);
        System.out.println(head.data);
        printLL(head);
        System.out.println("length : "+lengthOfLL(head));
        System.out.println("Check data present : "+ checkIfPresent(head, 1));

        //removeHead
        Node newHead = removesHead(head);
        System.out.println("Head removal");
        printLL(newHead);

        //removeTail
        Node removedTail = removesTail(head);
        System.out.println("\nTail removal");
        printLL(removedTail);

        //remove Kth Position
        Node removedK = removeK(head, 1);
        System.out.println("\nRemove Kth Position");
        printLL(removedK);

        //remove data
        Node removeElement = removeElement(head, 4);
        System.out.println("\nRemove Element");
        printLL(removeElement);

        //Insert Head
        Node insertHead = insertHead(head, 12);
        System.out.println("\nInsert Head");
        printLL(insertHead);

        //Insert Tail
        Node insertTail = insertTail(head, 19);
        System.out.println("\ninsert Tail");
        printLL(insertTail);

        //Insert based on position
        Node insertPosition = insertPosition(head, 24, 1);
        System.out.println("\nInsert based on position");
        printLL(insertPosition);

        //Insert before value
        Node insertBeforeValue = insertBeforeValue(head, 25, 3);
        System.out.println("\nInsert before value");
        printLL(insertBeforeValue);
    }

    private static Node convertToLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void printLL(Node head) {
        //Traversal
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}