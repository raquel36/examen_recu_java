
import java.util.ArrayList;
import java.util.Arrays;

public class Pares {
    public static void main(String[] args){
    ArrayList<Integer> numeros=new ArrayList<>(Arrays.asList(6,3,3,4,5,6,6,7));
    boolean esPseudo = esPseudoDomino(numeros);
    System.out.println(esPseudo);
    }

    public static boolean esPseudoDomino(ArrayList<Integer> numeros){
        boolean resultado=true;
        // Creamos una ArrayList que nos guardará los pares
        ArrayList<String> pares = new ArrayList<>();
        int i = 0;
        int size=numeros.size();
        //System.out.println(size);
        //Mientras el indice sea menor al tamaño del array de números:
        while(i < size) {
          int num1 = numeros.get(i);
          //System.out.println(num1);
          //Inicializamos el segundo número
          int num2;
          // Si el indice mas 1 es menor al tamaño de números:
          if(i+1 < numeros.size()) {
            //num2 será el número siguient en el índice
            num2 = numeros.get(i+1);
            //System.out.println(num2);
          } else {
            //En caso contrario será 0(Esto en caso de ArraList impares)
            num2 = 0;
          }
          String num1Str=String.valueOf(num1);
          String num2Str=String.valueOf(num2);
          String par=num1Str+num2Str;
          //Añadimos el par de números en el arrayList en cada interacción del bucle
          pares.add(par);
          //Incrementamos el índice en 2 para que me coja el siguiente par.
          i += 2;
        }
        //System.out.println(pares);
        int sizePares=pares.size();
        //Recorremos el ArrayList de pares
        for(int j=0; j<sizePares; j++){
            String par1 = pares.get(j);
            //Cogemos el segundo caracter del par
            char caracter1 = par1.charAt(1);
            //Si el indice es menor a el tamaño de pares menos 1:
            if (j<sizePares-1){
                //El segundo par sera el valor del indice mas 1.
                String par2=pares.get(j+1);
                //Extraemos el primer caracter
                char caracter2=par2.charAt(0);
                //Comparamos los caracteres
                if (caracter1 == caracter2){
                    resultado=true;
                }else{
                    //Si encuentra un resultado que no sea igual, el array ya
                    //no será pseudo dominó.
                    resultado=false;
                    break;
                }
            }
    
        }
        return resultado;
    }
    
    
}
