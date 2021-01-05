package AbstracSinif.Acces_Modifieres;

public class ProtectedIstifadesi {
    protected int sayi1=8;
    protected void protectedMethod(){

    }
    protected class InnerProtectedSinifi{

    }
}

class T extends  ProtectedIstifadesi{
    @Override
    protected void protectedMethod() {
        super.protectedMethod();
        System.out.println(sayi1);
    }
}
