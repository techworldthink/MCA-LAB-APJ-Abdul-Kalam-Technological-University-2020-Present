public class array {
    public static void main(String []arg){
        int[] data = new int[3];
        int []data1 = new int[3];
        int data2[] = new int[3];
        data[0]=123;
        data1[0]=1234;
        data2[0]=1235;
        //int[] cont = {1,2,3};
        for(int i: data){
            System.out.println(i);
        }
        for(int i: data1){
            System.out.println(i);
        }
        for(int i: data2){
            System.out.println(i);
        }
    }
}
