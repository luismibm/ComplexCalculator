public class Complex {

    private double real, imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex suma (Complex c) {
        Complex aux = new Complex();
        aux.real = this.real + c.real;
        aux.imaginary = this.imaginary + c.imaginary;
        return aux;
    }

    public Complex resta (Complex c) {
        Complex aux = new Complex();
        aux.real = this.real - c.real;
        aux.imaginary = this.imaginary - c.imaginary;
        return aux;
    }

    public Complex multiplicacion (Complex c) {
        Complex aux = new Complex();
        aux.real = this.real * c.real;
        aux.imaginary = this.imaginary * c.imaginary;
        return aux;
    }

    public Complex division (Complex c) {
        Complex aux = new Complex();
        aux.real = this.real / c.real;
        aux.imaginary = this.imaginary / c.imaginary;
        return aux;
    }

    public void toString(Complex c) {
        System.out.println("(" + c.getReal() + "," + c.getImaginary() + "i)");
    }

}