package javaapplcation3;

/*
 * Jose Pablo Castillo
 * Carne 10007
 * Universidad del Valle de Guatemala
 * Estructura de Datos
 *
 */
public class SinglyLinked<E>{
	/**
	 * Contador de Cuantos Elementos poseo en mi lista simplemente encadenada
         * pre: contador 0
         * post: cuantos elementos tenga
	 */
	protected int counter;
	/**
	 * Hace Referencia al siguiente objeto a quien se le atribuye su direccion de memoria
	 * Por medio de "NODE"
	 */
	protected Noder<E> cabeza;
	/**
	 * CONSTRUCTOR
	 */
	public SinglyLinked(){
		cabeza = null;
		counter = 0;	
	}
	/**
	 *  Pre Cabeza = null
         *  Post: cabeza apuntando a un objeto
	 */
	public void setCabeza( E objeto){
		cabeza = new Noder<E>(objeto,cabeza);
	}
    /**
     *
     * @param item :Indica el objeto a quien se le ara referencia.
     * @Override
     * pre: listado, cantidad n
     * post: listado cantidad n+1
     */
    
    public void push(E item){
        cabeza = new Noder<E>(item, cabeza);
		counter++;
    }
    /**
     * METODO QUE INDICA QUE VALOR HE DE DEVOLVER (EL PRIMERO DE LA LISTA)
     * pre: debe de tener datos u algun objeto tipo E
     * post: se queda sin un objeto encadenado
     * * pre: listado, cantidad n
     * post: listado cantidad n-1
     * @return 
     */
	public E pop(){
		Noder<E> tempo = cabeza;
		if(isEmpty())
			return null;
		else{
			cabeza = cabeza.next();
			counter--;
		}
		return tempo.value();
	}
        /**
         * Muestra el primer objeto de la lista sin 
         * eleminar algo
         * no hay cambio
         * en Pre y Post.
         */
	public E peek(){
		return cabeza.value();
	}
        /**
         * regresa el contador, que tiene el tamaño de la lista creada y diseñada
         * por nosotros
         */

	public int size(){
		return counter;
	}
        /**
         * regresa un boolean (true) si esta efectivamente vacio
         */
	public boolean isEmpty(){
		return counter==0;
	}
}