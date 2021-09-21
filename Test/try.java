
class Main {
    public static void main(String args[]) {
        try {
            int a = 1 / 0;
        } catch (ArithmeticException ex) {
            System.out.print(ex.getMessage());
        }
    }

}
