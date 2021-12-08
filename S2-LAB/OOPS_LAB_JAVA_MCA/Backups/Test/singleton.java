class Singleton {
    private String objectState;
    private static Singleton instance = null;

    private Singleton() throws Exception {
        this.objectState = "Javatpoint";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            try {
                instance = new Singleton();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    public String getObjectState() {
        return objectState;
    }

    public void setObjectState(String objectState) {
        this.objectState = objectState;
    }

    public static void main(String []arg){
        Singleton obj1 = getInstance();
        Singleton obj2 = getInstance();
        obj1.setObjectState("ONE");
        System.out.println(obj1.getObjectState());
        System.out.println(obj2.getObjectState());
    }
}

