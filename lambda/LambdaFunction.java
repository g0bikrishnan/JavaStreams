package lambda;

public class LambdaFunction {
    public static void main(String[] args) {
        Runnable r=()-> System.out.println("overriding run method using lambda function");
        Thread t=new Thread(r);
        t.start();
    }
}
