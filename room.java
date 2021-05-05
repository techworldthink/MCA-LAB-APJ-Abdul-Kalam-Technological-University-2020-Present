import java.util.*;

class room {
    String room_no;
    String room_type;
    int room_area;

    room() {

    }

    room(String no, String type, int area) {
        this.room_area = area;
        this.room_no = no;
        this.room_type = type;
    }

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter room no : ");
        this.room_no = sc.nextLine();
        System.out.print("Enter room type : ");
        this.room_type = sc.nextLine();
        System.out.print("Enter room area : ");
        this.room_area = sc.nextInt();
    }

    public void display() {
        System.out.println("No : " + this.room_no);
        System.out.println("Type : " + this.room_type);
        System.out.println("Area : " + this.room_area);
    }

    public static void main(String[] args) {
        room room_1 = new room();
        room_1.read();
        room_1.display();

        room room_2 = new room("A12","FULL",45);
        room_2.display();
    }
}
