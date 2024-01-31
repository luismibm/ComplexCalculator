public class Main {
    public static void main(String[] args) {

        //Example values
        Complex Complex1 = new Complex(5,5);
        Complex Complex2 = new Complex(4,3);

        //Test Suma
        Complex suma = Complex1.suma(Complex2);
        suma.toString(suma);

        //Test Resta
        Complex rest = Complex1.resta(Complex2);
        rest.toString(rest);

        //Test Multiplicación
        Complex mult = Complex1.multiplicacion(Complex2);
        mult.toString(mult);

        //Test Division
        Complex divi = Complex1.division(Complex2);
        divi.toString(divi);

    }
}