public class EjemploInvestigacion {
    public static void main(String[] args) {

        String s1 = "Hola";
        String s2 = "Hola";
        String s3 = s1.charAt(0)+s2.substring(1);

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        System.out.println("s1 == s2 -> " + (s1==s2));
        System.out.println("s1 == s3 -> " + (s1==s3));
    }
}
