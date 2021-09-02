import java.util.*;

class MyException extends Exception {
    public MyException(String value) {
        super(value);
    }
}

class Main {
    public static void main(String args[]) {
        int totalNums;
        int i;
        int temp, count = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Total numbers");
        totalNums = Integer.parseInt(sc.nextLine());
        for (i = 0; i < totalNums; i++) {
            try {
                temp = Integer.parseInt(sc.nextLine());
                if (temp > 0) {
                    sum += temp;
                    count += 1;
                } else {
                    throw new MyException(Integer.toString(temp));
                }
            } catch (MyException ex) {
                System.out.print(ex.getMessage());
                System.out.println(" - Not a positive number");
            }
        }
        System.out.print("Count : ");
        System.out.println(count);
        System.out.print("sum: ");
        System.out.println(sum);
        System.out.print("Average : ");
        System.out.println(sum / count);

    }
}
