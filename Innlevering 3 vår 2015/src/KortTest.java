import java.util.ArrayList;
public class KortTest {
    public static void main(String[] args) {
        
        ArrayList<Kort> reg = new ArrayList<Kort>();
        
        Kort k1 = new Ansatt("Ole", "Olsen", 1234, 152);
        Kort k2 = new Gjest("Marit", "Olsen");
        reg.add(k1);
        reg.add(k2);
        for (int i=0; i<reg.size(); i++) {
            Kort kort = (Kort)reg.get(i);
            System.out.print(kort);
            System.out.println("\nTest av kort: med kode 1234 er" + (kort.sjekkPIN(1234) ?  " gyldig" :  " ugyldig" ) );
            System.out.println("\nTest av kort: med kode 9999 er" + (kort.sjekkPIN(9999) ?  " gyldig" :  " ugyldig" ) );
        }
        
        Ansatt a1 = (Ansatt)k1;
        
        Ansatt klone = (Ansatt) a1.clone();
        
        a1.setNavn("Hans-Victor Andersson Lindb�ck");
        System.out.println(a1);
        System.out.println(klone);
        System.out.println();
        System.out.println(a1 == klone);
    }
}