import java.util.*;

class Search {
    int count;
    int[] array = new int[10];
   
    public void get_array() {
        int count_loop;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        this.count = sc.nextInt();
       
        System.out.print("Enter matrix elements : ");
        for (count_loop = 0; count_loop < this.count; count_loop++) {
                this.array[count_loop] = sc.nextInt();    
        }
    }

    public void search(){
        int count_loop,search,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to be search : ");
        search = sc.nextInt();
        for(count_loop = 0; count_loop < this.count;count_loop++){
            if(array[count_loop] == search){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Element present");
        }
        else{
            System.out.println("Element not present");
        }
    }

    public static void main(String[] args) {
        Search data = new Search();
        data.get_array();
        data.search();
    }
}
