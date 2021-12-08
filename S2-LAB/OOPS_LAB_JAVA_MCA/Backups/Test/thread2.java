class Main {
    public static void main(String[] arg) {
        A a = new A();
        B b = new B();
        Thread a1 = new Thread(a);
        Thread b1 = new Thread(b);
        a1.start();
        b1.start();
    }
}

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 100; i < 105; i++) {
            System.out.println(i);
        }
    }
}

