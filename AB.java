import java.util.ArrayList;

abstract class AB implements IF{
    private int A1;
    private String A2;

    public void method1(int a){
        System.out.println("method1 in abstract class AB");
    }

    public void method2AB (){
        System.out.println("hi :)");
    }

    public AB (){
        A1 = 2;
        A2 = "HAPPY!";
    }

    public int getA1 (){
        return  A1;
    }

    public void setA1 (int a){
        A1 = a;
    }

    public String getA2(){
        return A2;
    }

    public void setA2(String a){
        A2 = a;
    }

}
