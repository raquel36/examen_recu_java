package INSTITUTO;

public class Profesor extends Persona {
    //He creado este atributo como una prueba de como se puede utilizar una CONSTANTE
    private final String tipo = "Profesor";

    

    public Profesor() {
    }

    

    public Profesor(String nombre, int edad, String dNI, double peso, double altura) {
        super(nombre, edad, dNI, SEXO, peso, altura);
    }



    public Profesor(String nombre, int edad, String dNI, char sexo, double peso, double altura) {
        super(nombre, edad, dNI, sexo, peso, altura);
    }



    @Override
    public void comprobarSexo(char sexo) {
        if (sexo == SEXO) {
            System.out.println("La persona tiene el sexo por defecto Masculino");
        } else if(sexo == 'H') {
            System.out.println("La persona tiene el sexo Masculino");
        } else if(sexo == 'F') {
            System.out.println("La persona tiene el sexo Femenino");
        } else{
            System.out.println("El sexo indicado es incorrecto");
        }
    }


    @Override
    public String toString() {
        return "tipo= " + tipo + super.toString();
    }



}

    

