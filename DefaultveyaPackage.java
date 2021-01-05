package AbstracSinif.Acces_Modifieres;

public class DefaultveyaPackage {

    int sayi = 7;
    void method1(){

    }

}

class numune extends DefaultveyaPackage{
    @Override
    void method1() {
        super.method1();
        System.out.println(sayi);
    }
}