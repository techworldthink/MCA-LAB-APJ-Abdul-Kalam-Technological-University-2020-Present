import java.util.*;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;
class stringMenu {
    String sentance;

    public void read(){
        Scanner sc = new Scanner(System.in);
        sentance = sc.nextLine();
    }

    public void count(){
        String sentannce = this.sentance;
        String[] arrOfStr = sentannce.split(" ");

        //System.out.println("<- After split up ->");
        //for (String a : arrOfStr)
            //System.out.println(a);
        
        
        Set<String> set = new HashSet<>(Arrays.asList(arrOfStr));
        //System.out.println("<- After convert to set ->");
        //for (String a : set)
            //System.out.println(a);

        for(String each:set){
            int count=0;
            for(String eacha:arrOfStr){
                if((each.compareTo(eacha)) == 0){
                    count++;
                }
            }
            System.out.println(each+" : "+ count);
        }
        
    }

    public void replace(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the word that need to replace : ");
        String word = sc.nextLine();
        System.out.print("Enter the word that need to place : ");
        String rword = sc.nextLine();

        String sentannce = this.sentance;
        String sent="";
        String[] arrOfStr = sentannce.split(" ");

        for(int i=0;i<arrOfStr.length;i++){
            if((arrOfStr[i].compareTo(word))==0){
                arrOfStr[i] = rword;
            }
            sent = sent +  arrOfStr[i] + " ";
        }
        this.sentance = sent;

    }

    public void reverse(){
        String sentannce = this.sentance;
        String sent="";
        String temp;
        String[] arrOfStr = sentannce.split(" ");
        
        for(int i=0;i<arrOfStr.length;i++){;
            temp="";
            String[] temparray = arrOfStr[i].split("");
            for(int j=arrOfStr[i].length()-1;j>=0;j--){
                temp = temp + temparray[j];
            }
            sent = sent +  temp + " ";
        }
        this.sentance = sent;

    }

    public String dis(){
        return sentance;
    }

    public static void main(String[] args) {
        int opt;
        stringMenu Obj = new stringMenu();
        while(true){
            Scanner sc = new Scanner(System.in);

            System.out.println("1) Enter Sentence");
            System.out.println("2) Display Sentence");
            System.out.println("3) Count of each word");
            System.out.println("4) Replace word");
            System.out.println("5) Reverse each word ");
    
            System.out.print("Option :: ");
            
            opt = Integer.parseInt(sc.nextLine());
            switch(opt){
                case 1:
                    System.out.print("Enter the sentance : ");
                    Obj.read();
                    break;
                case 2:
                    System.out.println("Sentance : "+Obj.dis());
                    break;
                case 3:
                    System.out.println("Counts");
                    Obj.count();
                    break;
                case 4:
                    System.out.println("Replace words");
                    Obj.replace();
                    break;
                case 5:
                    System.out.println("Reverse each word");
                    Obj.reverse();
                    break;
                default:
                System.out.println("try another menu!");
                    
            }
        }
    }
}
