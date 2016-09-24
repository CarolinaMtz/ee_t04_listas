package ee_t04_listas;
/**@Carolina Martinez
 * 
 */
public class INodo<T> {
    T siguiente;
    T dato;
	 
	 public INodo(T dato){
		 this.dato= dato;
		 siguiente=null;	 }
	 
	 public INodo(T dato, INodo<T> siguiente){
	        this.siguiente=(T)siguiente;
	        dato = dato;
	    }

	public T getSiguiente() {
		return siguiente;
	}

	public   void setSiguiente(T siguiente) {
		this.siguiente = siguiente;
	}
	
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

}
