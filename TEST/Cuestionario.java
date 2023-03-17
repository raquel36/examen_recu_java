package TEST;
import java.util.ArrayList;
import java.util.Scanner;



public class Cuestionario{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int preguntas = 10;
        ArrayList<Character> claves= new ArrayList<>();
        ArrayList<Character> respuestas = new ArrayList<>();
        while(preguntas>0){
        System.out.println("Introduzca una respuesta: a, b, c");
        char ru = sc.next().charAt(0);
        respuestas.add(ru);
        preguntas--;
        } 
        int totalPuntos = puntosCuestionario(respuestas, claves);
        System.out.println(totalPuntos);
        sc.close();

    }

    public static Integer puntosPregunta(char ru, char rc){
        int puntos=0;
        if (ru == rc){
            puntos=2;
        }else{
            puntos=0;
        }
        return puntos;
    }

    public static Integer puntosCuestionario(ArrayList<Character> respuestas, ArrayList<Character> claves){
        int total=0;
        for(int i=0; i<respuestas.size(); i++){
            for(int j=0; j<claves.size(); j++){
                char respuesta=respuestas.get(i);
                char correcta=claves.get(j);
                int puntos=puntosPregunta(respuesta, correcta);
                total+=puntos;
                }
            }
            return total;
        }
    }


