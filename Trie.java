import java.util.*;

class Node {
    Node[] child = new Node[26];
    boolean end;
}

public class Main {

    static Node root = new Node();

    static void insert(String s) {
        Node temp = root;

        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';

            if (temp.child[x] == null)
                temp.child[x] = new Node();

            temp = temp.child[x];
        }

        temp.end = true;
    }

    static boolean search(String s) {
        Node temp = root;

        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';

            if (temp.child[x] == null)
                return false;

            temp = temp.child[x];
        }

        return temp.end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        String[] words = s.split(",");

        for (String word : words)
            insert(word);

        String search = sc.next();

        if (search(search))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
