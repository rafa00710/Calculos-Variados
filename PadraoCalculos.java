package CalculosVariados;

public class PadraoCalculos implements CalculadoraPadrao {

    private float a = 0;
    private float b = 0;
    private String c = "";

    String nome;
    float peso;
    float altura;
    float area, raio;
    float quadrado = 0, base = 0;
    String valor = "";






    public PadraoCalculos(float a, float b, String c, String nome, float peso, float altura, float area, float raio, float quadrado, float base, String valor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.area = area;
        this.raio = raio;
        this.quadrado = quadrado;
        this.base = base;
        this.valor = valor;
    }

    public PadraoCalculos(float a, float b, String c) {
    }

    public PadraoCalculos() {

    }

    public float getArea() {
        return area;
    }

    public float getQuadrado() {
        return quadrado;
    }

    public void setQuadrado(float quadrado) {
        this.quadrado = quadrado;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public float getArea(float v) {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    @Override
    public void soma() {


        System.out.println("Soma: " + (this.getA() + this.getB()));


    }


    @Override
    public void subtracao() {

        System.out.println("Subtracao: " + (this.getA() - this.getB()));

    }

    @Override
    public void divisao() {

        System.out.println("Divisão: " + (this.getA() / this.getB()));

    }

    @Override
    public void multiplicacao() {

        System.out.println("Multiplicação: " + (this.getA() * this.getB()));

    }

    @Override
    public void potenciacao() {

        System.out.println("Potenciação: " + Math.pow(this.getA(), this.getB()));


    }

    @Override
    public String classificarIMC() {
        float imc;
        String classe;
        imc = calcularIMC();

        if (imc <= 19)
            classe = "Abaixo do Peso";
        else
        if (imc <= 25)
            classe = "Peso ideal";
        else
        if (imc <= 30)
            classe = "Acima do Peso";
        else
        if (imc <= 35)
            classe = "Obesidade Leve";
        else
            classe = "Obesidade";

        return classe;
    }

    @Override
    public void circulo() {

        float area = (float) (3.1416 * (Math.pow(raio, 2)));
        System.out.println("O valor da area e: " + area);
    }

    @Override
    public void quadrado() {

        quadrado = (base * altura) /2;

        System.out.println("A nossa area quadrada e: " + quadrado);
    }

    @Override
    public void retangulo() {

        area = base * altura;

        System.out.println("A area do retângulo e: " + area);
    }

    float calcularIMC() {

        return (float) (peso/Math.pow(altura, 2));
    }

    @Override
    public String toString() {
        return "Calculo entre dois valores = {" +
                "1°valor: " + a +
                ", 2°valor: " + b +
                '}';
    }
}
