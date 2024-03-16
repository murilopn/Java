package exercicios;
import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date ();
        System.out.println("A hora do sistema é:");
        System.out.println(relogio.toString());
    }
}
/* 
package exercicios;
import java.util.Locale;

public class HoraDoSistema {
    public static void main(String[] args) {
        Locale relogio = Locale.getDefault();
        System.out.println("A linguagem do sistema é:");
        System.out.println(relogio.getDisplayLanguage());
        System.out.println(relogio.getLanguage());
    }
}
*/
