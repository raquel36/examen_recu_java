package INSTITUTO;


public class Main {
    public static void main(String[] args){
    Profesor profe1 = new Profesor("Jaume",35,"41542314R",85,1.80);
    System.out.println(profe1.toString());
    profe1.calcularIMC(profe1.getPeso(), profe1.getAltura());
    System.out.println("--------------------------------------------------------------------------------");
    Estudiante stud1 = new Estudiante("Raquel",36,"43114123S",86,1.65,'F');
    System.out.println(stud1.toString()); 
    stud1.calcularIMC(stud1.getPeso(),stud1.getAltura());
    

   
    }
}

