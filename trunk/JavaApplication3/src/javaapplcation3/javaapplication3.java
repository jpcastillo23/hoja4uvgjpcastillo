package javaapplcation3;

/**
 * 
 * 
 * 
 * @author Jose Pablo Castillo
 * Carne 10007
 * Universidad del Valle de Guatemala
 * Programacion Orientada a objetos
 *
 */
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author Jose Pabo Castillo jaypicastillo
 */
public class javaapplication3 {
        /**
     * Despriega el menu de pantalla
     *
     *
     *
     */
    public static void Menu(){
        System.out.println("------------------------------------------------------");
		System.out.println("-------------------    Menu    -----------------------");
		System.out.println("-------------------------------------Ingrese Opc.-----");
		System.out.println(" (1) Apilar Operandos                                 ");
		System.out.println(" (2) Operadores                                       ");
		System.out.println(" (3)Mostrar Resultado                                 ");
        System.out.println(" (4) Salir                                            ");
		System.out.println("------------------------------------------------------");
	}
    /**
     * etodo que despliega el menu correspondiente a
     * hacer una operacion
     *
     *
     * 
     */
    public static void Oper(){
                System.out.println("  Ingrese Operando:                                   ");
                System.out.println("------------------------------------------------------");
                System.out.println("------------------------------------------------------");
                System.out.println("--(1)Suma---------------------------------------------");
                System.out.println("--(2)Resta--------------------------------------------");
                System.out.println("--(3)Multiplicacion-----------------------------------");
                System.out.println("--(4)Division-----------------------------------------");
                System.out.println("------------------------------------------------------");
        }
        /**
         * Metodo quien crea Muestra en Pantalla las instrucciones
         * para seguir
         *
         *
     * 
     */
    public static void Instru(){
                System.out.println("------------------------------------------------------");
                System.out.println("-------------------- Instrucciones  ------------------");
                System.out.println("------------------------------------------------------");
                System.out.println("---Seleccione la Operacion que desea Realizar para ---");
                System.out.println("---Ingresar-------------------------------------------");
                System.out.println("------------------------------------------------------");
        }
        /**
         * @param msg - ensaje a desplegar cuando ingresa un dato
         * @param err - mensaje de error cuando tira un exception
         * @param inf - limite inferior del rango aceptado
         * @param sup - limite superior del rango aceptado
         * @return - El numero correcto seleecionado por el usuario
         * @Descripcion:
         * Metoroo cuya funcion es recibir un mensaje de muestra
         * para obtener datos determinados por msg. Asi mismo indica
         * si lo ingresado fue o no un numero por lo que se tiene
         * su propia defensa,  tambien se encuentra con parametros.
         * Estos parametros son determinados por el prograador de manera que
         * determine el rango (incluyente) en el cual el usuario va a poder
         * ingresar sus numeros
         *
     * 
     */
    public static double Ingre(String msg, String err,int inf, int sup){
                Scanner in = new Scanner(System.in);
                double  ing=3.141592646;
                //System.out.println("CICLO FOR");
                while(!((inf<=(int)ing)&((int)ing<=sup))||(ing==3.141592646)){
                    System.out.println(" "+msg);
                    try{
                       ing = in.nextDouble();
                    }catch (InputMismatchException E){
                        System.out.println(" "+err);
                    }
                    in.nextLine();
                }
              //System.out.println("ANTES DEL CICLO FOR");
            return ing;
        }
        /**
         * @param uno - Es el Item (double) que se encontraba  en la 2posicion del stack
         * @param dos - Es el nuevo dato ingresado del stack para operar
         * @param choice  - Indica cual es la opcion de operacion (+,-,*,/) respectivamete
         * @return Double - El dato ya operado
         * metodo cuya funcion es operar los datos. Dependiendo la operacion
         * a realizar, el metodo devuelve un double ya operado.
         *
         *
         */
       
        public static double calc(double uno, double dos,double choice){
            int op = (int)choice;
            double result=0;
            switch(op){
                case 1:
                    result = uno + dos;
                    break;
                case 2:
                    result =  uno - dos;
                    break;
                case 3:
                    result = uno * dos;
                    break;
                default:
                    try{
                        result = dos / uno;
                    }
                    catch(Exception cualquier_excepcion){
                        System.out.println("Limite tiende al Infinito");
                        System.err.println("Division by Cero");
                    }
                    break;
            }
            return result;
        }
    /**
     * @param args the command line arguments
     * Inicializador del programa
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double opcion,uno,dos;
        String ms1="    Ingresar Operando",ms2="Fail, Ingrese Un Entero Valido",ms3="-----Ingrese Opcion---";
        


	SinglyLinked<Double> pila = new SinglyLinked<Double>();
        Instru();
        while(true){
            Menu();
            opcion=Ingre(ms3,ms2,1,3);
            switch((int)opcion){
                case 1: //ingresar opeprandos
                    System.out.println("Numero Apilamiento:");
                    opcion=Ingre(ms1,ms2,-1000,1000);
                    pila.push(opcion);
                    break;
                case 2://Procesos
                    //Defensiva por si esta vacio. Si esta vacio, se defiende,de locontrario
                    //siqgue la rutina
                    if(!pila.isEmpty()){
                        uno=pila.pop();
                        if(pila.isEmpty()){
                            System.out.println("Necesita un Operando Mas");
                            pila.push(uno);
                        } // si esta vacia
                        else{
                            Oper();
                            opcion=Ingre("Ingresar Operador","Fail, Ingrese Un Entero Valido",1,4);
                            dos=pila.pop();
                            uno= calc(uno,dos,opcion); //guarda el resultado en la Pila
                            pila.push(uno);
                            System.out.println("Resultado Apilado: "+pila.peek());
                        }
                    }
                    break;
                case 3:
                    try{
                         System.out.println("Resultado: "+pila.peek());
                    }catch(Exception e){
                          System.out.println("\n \n  ");
                          System.out.println("  -- NO HAY NUMEROS INGRESADOS ----");
                          System.out.println("  --   INGRESE    OPERANDOS    --");
                          System.out.println("\n \n  ");

                    }
                    break;
                default:
                  //
                  System.exit(0);
                  break;

            }
        }


    }
}
