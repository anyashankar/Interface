import java.util.ArrayList;

public class NL extends AB{

    private int NumNL;

    public NL (){
        NumNL = 1;
    }

    public int getNumNL(){
        return NumNL;
    }

    public void setNumNL(int a){
        NumNL = a;
    }

    public void method2AB (){
        System.out.println("hi! (from NL lol)");
    }

    public ArrayList method2 (int a, int b){
        ArrayList <Integer> ay  = new ArrayList();
        ay.add(a);
        ay.add(b);
        return ay;
    }

    public void method1(int a){
        System.out.println("method1 in NL");
    }

    public String methodNL (String a){
        a = "i love coding";
        return a;
    }
}
