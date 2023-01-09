package equals_hashcode;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();
        usuario1.nome = "julio kuniwake";
        usuario1.email = "julio.email.com";

        Usuario usuario2 = new Usuario();
        usuario2.nome = "julio kuniwake";
        usuario2.email = "julio.email.com";

        System.out.println(usuario1 == usuario2);
        System.out.println(usuario1.equals(usuario2));
        System.out.println(usuario2.equals(usuario1));

        System.out.println(usuario2.equals(new Date()));
    }
}
