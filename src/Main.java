import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador5=0,contadorn=0,contadorp=0,promedion=0,promediop=0,suman=0,sumap=0,nedad;
        System.out.print("ingrese la cantidad de edades");
        nedad = entrada.nextInt();

        int edad[]= new int[nedad];

        for (int i = 0;i<nedad;i++){
            System.out.print("digitar las edades");
            edad[i]= entrada.nextInt();
            if (edad[i]>5){
                contador5++;

            } else if (edad[i]>5){
              contadorp++;
              sumap += edad[i];
            }
            else {
                contadorn++;
                suman += edad[i];

            }
        }
       if(contadorp==0) {
           System.out.print("no se pudo hacer el promedio de edades mayor a 5 anos");
       }
        else{
            promediop =sumap/contadorp;
           System.out.print("\n el promedio de las edade mayor a si son: "+promediop);
       }
        if(contadorn==0){
            System.out.print("no se puede hacer el promedio de las edades menor a 5");
        }
        else{
            promedion= suman/contadorn;
            System.out.print("\nel promdio de las menores a 5 anos son: "+promedion);

        }
        System.out.print("\nlas edades son:");
        for (int i=0;i<=nedad;i++){
            System.out.print(edad[i]+ "  ");
        }

        System.out.print("\nla cantidad de estudiantes q tienen 5 sños son :"+contador5);
    }
}