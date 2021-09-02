import java.util.*;

public class matrix {
    int row;
    int column;
    int[][] array = new int[10][10];

    public void get_metrix(){
        int rc,cc;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size of matrix , row count : ");
        this.row = sc.nextInt();
        System.out.print("Enter size of matrix , column count  : "); 
        this.column = sc.nextInt();
        System.out.print("Enter matrix elements : ");
        for(rc=0;rc<this.row;rc++){
            for(cc=0;cc<this.column;cc++){
                this.array[rc][cc] = sc.nextInt();
            }
        }
    }

    public static matrix sum(matrix c1, matrix c2) {
        int rc, cc;
        matrix temp = new matrix();

        if (c1.row == c2.row && c1.column == c2.column) {
            temp.row =c1.row;
            temp.column = c1.column;
            for (rc = 0; rc < c1.row; rc++) {
                for (cc = 0; cc < c1.column; cc++) {
                    temp.array[rc][cc] =  c1.array[rc][cc] +  c2.array[rc][cc];
                }
            }
        } 
        else {
            System.out.println("Addition not possible ");
        }

        return temp;
    }

    public void display_matrix(){
        int rc,cc;
        for(rc=0;rc<this.row;rc++){
            for(cc=0;cc<this.column;cc++){
                System.out.print(this.array[rc][cc] );
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        matrix first = new matrix();
        matrix second = new matrix();
        matrix temp = sum(first, second);

        first.get_metrix();
        second.get_metrix();
        temp = sum(first,second);

        //first.display_matrix();
        //second.display_matrix();

        System.out.println("......SUM MATRIX.......");
        temp.display_matrix();
        System.out.println("......END.......");
    }
}
