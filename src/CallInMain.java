class Calculator{
    int a,b;

    public int add(){
        a=10;
        b=23;
        int sum=a+b;
        return sum;
    }
}
public class CallInMain {
    public static  void main(String[] args) {
        Calculator casio=new Calculator();

        System.out.println(casio.add());
    }
}
