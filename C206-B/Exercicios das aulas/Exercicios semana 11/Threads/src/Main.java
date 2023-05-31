public class Main {
    public static void main(String[] args) {

        Contador1 contador1=new Contador1();
        Thread th1=new Thread(contador1);
        Contador2 contador2=new Contador2();
        Thread th2=new Thread(contador2);

        th1.start();
        th2.start();


    }
}