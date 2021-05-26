class Main{

    public static void main(String[] args) {
       Literature litObj = new Literature("Lit","A story of a Tree","ASCA");
       Fiction FicObj = new Fiction("Fic","A story of theory","MASC");
       litObj.display();
       FicObj.display();
       
    }
}

class Publisher {
    String publisherName;
    Publisher(String P){
        this.publisherName = P;
    }
    void display(){
        System.out.println("Publisher Name : " + this.publisherName);
    }
}

class Books extends Publisher{  
    String bookName;
    Books(String B,String P){
        super(P);
        this.bookName =B;
    }
    void display(){
        super.display();
        System.out.println("Bookname Name : " + this.bookName);
    }
}

class Literature extends Books{  
    String LiteratureName;
    Literature(String L,String B,String P){
        super(B,P);
        this.LiteratureName = L;
    }
    void display(){
        System.out.println("..........................................");
        super.display();
        System.out.println("Literature Name : " + this.LiteratureName);
        System.out.println("..........................................");
    }
 
}

class Fiction extends Books{  
    String FictionName;
    Fiction(String F,String B,String P){
        super(B,P);
        this.FictionName = F;
    }
    void display(){
        System.out.println("..........................................");
        super.display();
        System.out.println("Fiction Name : " + this.FictionName);
        System.out.println("..........................................");
    }
}

