import arithamatic_package.*;

class main_arithamatic {
    public static void main(String []args){
        arithamatic_package testObj = new arithamatic_package();
        System.out.println(testObj.add(1,2));
        System.out.println(testObj.substract(1,2));
        System.out.println(testObj.multiple(1,2));
        System.out.println(testObj.divide(5,2));
        System.out.println(testObj.remainder(11,2));
    }
}
