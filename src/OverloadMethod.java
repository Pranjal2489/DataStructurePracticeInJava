class Calculate{

    public float sum(int a,float b,int c){
        return a+b+c;
    }
    public int sum(int a,int c){
        return a+c;
    }
    public float sum(float b,int c){
        return b+c;
    }
}
public class OverloadMethod {
    public static void main(String[] args) {
        Calculate c1=new Calculate();
        Calculate c2=new Calculate();
        Calculate c3=new Calculate();
        System.out.println(c1.sum(3,6.5f,3));
        System.out.println(c2.sum(3.5f,5));
        System.out.println(c3.sum(3,4));
    }
}
