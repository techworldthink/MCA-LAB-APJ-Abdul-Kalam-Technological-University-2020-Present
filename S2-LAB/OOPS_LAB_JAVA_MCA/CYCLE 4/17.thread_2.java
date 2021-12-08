import java.util.*;

class fibonacci implements Runnable {
    int l;

    fibonacci(int n) {
        l = n;
    }

    public void run() {
        int c;
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 0; i <= l; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}

class even implements Runnable {
    int l;

    even(int n) {
        l = n;
    }

    public void run() {
        for (int i = 0; i <= l; i++) {
            if (i % 2 == 0)
                System.out.print(i + "  ");
        }
        System.out.println("");

    }

}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit :");
        int l = sc.nextInt();
        fibonacci f = new fibonacci(l);
        Thread T1 = new Thread(f);
        T1.start();
        even e = new even(l);
        Thread T2 = new Thread(e);
        T2.start();
    }
}