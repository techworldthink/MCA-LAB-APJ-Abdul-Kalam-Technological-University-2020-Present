public class complex {
    int real;
    int imaginary;

    public complex(int real_get,int imag_get){
        this.real = real_get;
        this.imaginary = imag_get;
    }
    public static complex sum(complex c1,complex c2){
        complex temp = new complex(0,0);
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }
    public static void main(String []args){
        complex first = new complex(1,2);
        complex second = new complex(32,22);
        complex temp = sum(first,second);
        System.out.println("Sum is : " + temp.real + "+" +temp.imaginary + "i");
    }
}
