class String_m {
    String text;

    String_m(String get_text) {
        this.text = get_text;
    }

    void manipulations(){
        String value = this.text;
        System.out.println( "String Length is : " + value.length());
        System.out.println("String concatination : " +value.concat("concated"));
        System.out.println("Index of character 's': " + value.indexOf('s'));
        System.out.println("Character at position 5: " + value.charAt(5));
        System.out.println("Compare To 'text': " + value.compareTo("text"));
        System.out.println("Contains sequence 'ome': " + value.contains("ome"));
        System.out.println("EndsWith character 'r': " + value.endsWith("r"));
        System.out.println("Replace 'text' with 'words': " + value.replace("text", "words"));
        System.out.println("Convert to LowerCase: " + value.toLowerCase());
        System.out.println("Convert to UpperCase: " + value.toUpperCase());
    }

    public static void main(String []args) {
    String_m object = new String_m("some text");
    object.manipulations();
    }
}
