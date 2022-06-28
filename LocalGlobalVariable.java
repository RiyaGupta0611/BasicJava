package JavaBasics;
public class LocalGlobalVariable {
    int var = 11;//this is our global varibale.
    void localVariable() {
        int var = 22;//this is our local variable of method localVariable()
        System.out.println("print var = "+var);//here local variable var is print
    }

    public static void main(String[] args) {
        LocalGlobalVariable obj = new LocalGlobalVariable();//our object for calling method is created here.
        System.out.println(" variable var  : " + obj.var);
        //calling method()
        obj.localVariable();
    }
    
}