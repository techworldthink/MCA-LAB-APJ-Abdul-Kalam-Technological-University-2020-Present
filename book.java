 class Book {
    int ISBN;
    String title;
    String author;
    int price;
    String Publisher;

    Book(int isbn,String title,String author,int price,String publisher){
        this.ISBN = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.Publisher = publisher;
    }
    public void display(){
        System.out.println(this.ISBN);
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.price);
        System.out.println(this.Publisher);
    }
    public static void main(String []args){
}
