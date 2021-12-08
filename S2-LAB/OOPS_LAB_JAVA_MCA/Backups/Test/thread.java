class Main {
    public static void main(String[] arg) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 100; i < 105; i++) {
            System.out.println(i);
        }
    }
}

