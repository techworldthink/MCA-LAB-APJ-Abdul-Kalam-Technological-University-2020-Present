import java.util.*;

class Sorting {
    String str;

    public void get_string() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        this.str = sc.nextLine();
    }

    public void sort_print() {
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }

    public static void main(String[] args) {
        Sorting data = new Sorting();
        data.get_string();
        data.sort_print();
    }

}
