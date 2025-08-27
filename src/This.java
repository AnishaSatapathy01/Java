class Testo {
    int i;

    void setValue(int i) {
        this.i = i; //this keyword refers to the instance variable outside the function body!
    }
    void getValue(){
        System.out.println(i);
    }
}
    public class This {
        public static void main (String args[]){
            Testo a = new Testo();
            a.setValue(10);
            a.getValue();
        }
    }

