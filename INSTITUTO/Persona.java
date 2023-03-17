package INSTITUTO;


public abstract class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    //He creado dos atributos de la clase, una constante y otra que se puede modificar al crear los objetos.
    public static final char SEXO='H';
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String dNI, double peso, double altura) {
        this(nombre, edad, dNI, SEXO, peso, altura);
    }

    public Persona(String nombre, int edad, String dNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        DNI = dNI;
        this.sexo=sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public char getSexo() {
        return (sexo == SEXO) ? SEXO : sexo;
    }

    

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }


    public void calcularIMC(double peso, double altura){
        double IMC = peso/Math.pow(altura,2);
        System.out.print("Según su IMC, la persona ");
        if(IMC<18.5){
            System.out.println("está por debajo de su peso ideal.");
        }else if(IMC>18.5 && IMC<24.9){
            System.out.println("está en su peso ideal.");
        }else if(IMC>25 && IMC<29.9){
            System.out.println("tiene sobrepeso.");
        }else if(IMC>30){
            System.out.println("tiene obesidad.");
        }
    }

    public void esMayorDeEdad(int edad){
        if (edad>18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }

    public abstract void comprobarSexo(char sexo);

    @Override
    public String toString() {
        return ", nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + getSexo() + ", peso=" + peso + ", altura=" + altura;
    }

    

    

    
}
