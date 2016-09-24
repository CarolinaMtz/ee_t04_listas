package ee_t04_listas;

/**@Carolina Martinez
 * 
 * 
 * Este proyecto consiste en: 
 * Crear dos clases llamadas ListaSimplementeLigada y Nodo, cada clase
 * con sus respectivos metodos. 
 */
import ee_t04_listas.INodo;

public class ILista<T> {

	  private INodo<T> inicio;
	 
		public ILista()
		{
			inicio=null;
		}
		
		
		public INodo<T> getInicio() {
			return inicio;
		}


		public void setInicio(INodo<T> inicio) {
			this.inicio = inicio;
		}
		
		//INSERCION AL INICIO DE UNA LSL (Lista Simplemente Ligada)	
		public void insertaInicio(T dato){
			INodo<T> aux = new INodo<T>(dato);
		         aux.setSiguiente((T)inicio);
		         inicio = aux;
		    }
		
		//INSERCION AL FINAL DE UNA LSL
		public void insertaFinal( T dato ){
			INodo aux= inicio;
			while(aux.getSiguiente()!=null){
				aux= (INodo) aux.getSiguiente();
			}
			INodo q= new INodo (dato);
			aux.setSiguiente(q);
		}
		
		//INSERCION DE UN NODO ANTES QUE OTRO EN UNA LSL
		
		public void insertaAntes( T dato){
		 INodo q = inicio;
		 int band = 1;
		 INodo   t= new INodo(dato);
		 while(q.getDato()!= dato && band ==1 )
		     {
			  if(q.getSiguiente() != null){
				  t = q;
				  q=(INodo) q.getSiguiente();
			  }
			  else{
				  band=0;
			  }
		     }
		  if(band==1){
			  INodo  x= new INodo(dato);
			  dato= (T) x.getDato();
			  if(inicio == q){
				  inicio= (INodo) x.getSiguiente();
				  inicio = x;
			  } else{
				  x= (INodo) t.getSiguiente();
				     q= (INodo) x.getSiguiente();
			  }
			  System.out.println("El nodo dado como referencia no se encuentra en la lista");
		  }
		}
		
		//INSERCIÓN DE UN NODO DESPUES DE OTRO EN UNA LSL
		public void insertaDespues( T dato){
			INodo q;
			q=inicio;
			int band=1;
			
			while(q.getDato()!= dato && band==1){
				if(q.getSiguiente()!= null){
					q=(INodo) q.getSiguiente();
				}else {
					band=0;
				}
				
			}
			if(band ==1){
				INodo t= new INodo(dato);
				  dato= (T) t.getDato() ;
			    t.setSiguiente(q.getSiguiente());
			    t= (INodo) q.getSiguiente() ;
			} else{
				System.out.println("El nodo dado como referencia no se encuentra en la lista");
			}
		}
		
		//ELIMINA EL PRIMER NODO DE UNA LSL
		public void eliminaInicio(){
			INodo q;
			  q= inicio;
			  inicio = (INodo) q.getSiguiente();
			  q= null;
		}
		
		//ELIMINA EL ULTIMO NODO DE UNA LSL
		public void eliminaUltimo(){
			INodo q,t; 	
		 q= inicio;
		 t= inicio;
		 if(inicio.getSiguiente() == null){
			 inicio= null;
		 } else{
			 while(q.getSiguiente()!= null){
				t=q;
				q=(INodo) q.getSiguiente();
			 }
			 t.setSiguiente(null);
		 }
		 q=null;
		}
		
		//ELIMINAR UN NODO CON INFORMACION x DE UNNA LSL
		public void eliminarX( T x){
			INodo q= new INodo(x);
			 INodo t= new INodo(x);
			 q=inicio;
			 int band =1;
			 while(q.getDato() == x && band ==1){
				if(q.getSiguiente() != null) {
					
					t=q;
					q=(INodo) q.getSiguiente();
				} else{
					band =0;
				}
			 }
			if(band ==0){
				System.out.println("El elemento con informacion x no se encuentra en la lista");
			} else{
				if(inicio == q){
					inicio = (INodo) q.getSiguiente();
						
				} else
					t.setSiguiente(q.getSiguiente());  
				
			}
			 q= null;
		}
		
		//ELIMINAR EL NODO ANTERIOR AL NODO CON INFROMACION x EN UNA LSL
		public void eliminaAntes( T dato){
			if(inicio.getDato() == dato ){
				System.out.println("No existe un nodo que proceda al que contiene un dato");
			}else{
				INodo q= inicio;
				INodo t = inicio;
				INodo r= new INodo(dato);
				int band = 1;
				while(q.getDato() != dato && band ==1){
					if(q.getSiguiente() != null){
						r= t;
						t= q;
						q= (INodo) q.getSiguiente();
					}else{
						band=0;
					}
				}
				if(band == 0){
					System.out.println("El elemento no se encuentra en la lista");
				} else {
					if(inicio.getSiguiente() == q){
						inicio=q;
					} else{
						q= (INodo) r.getSiguiente();
					}
					t= null;
				}
			}
		}
		
		//BUSQUEDA DESORDENADA
		public void busquedaDesordenada( T dato){
			INodo q = inicio;
			while(q != null && q.getDato()!= dato ){
				q = (INodo) q.getSiguiente(); 				
			}
			if(q == null){
				System.out.println("El elemento no se encuentra en la lista");
			} else{
				System.out.println("El elemento si se encuentra en la lista");
			    }
			}
		
		//BUSQUEDA ORDENADA
		public void busquedaOrdenada( T dato){
			INodo q= inicio;
			while(q != null){
				q = q = (INodo) q.getSiguiente(); 
			}
			if(q == null ){
				
				System.out.println("El elemento no se encuentra en la lista");
				
			}
			else{
				System.out.println("El elemento si se encuentra en la lista.");
			}
		}
		
		//BUSQUEDA RECURSIVO
		public void busquedaRecursivo( T dato){
			if(inicio != null){
				if(inicio.getDato() == dato){
					System.out.println("El elemento  se encuentra en la lista");
				}
				else{
					busquedaRecursivo((T) ((INodo) dato).getSiguiente() );
					           
				}
				
					System.out.println("El elemento no se encuentra en la lista.");
				}
			}
		
		//METODO QUE RECORRE LA LSL
		public void recorrer(){
			INodo<T> aux = inicio;
	    
		   while(aux != null){
		         System.out.print(aux+"-->");
		         aux =(INodo<T>)  aux.getSiguiente();
		         
		        }
			}
			     
		//METODO QUE RECORRE LA LSL DE FORMA RECURSIVA    
			     
			public void recorrer_r(INodo<T> aux){
			  if (aux != null){
			      System.out.println(aux.getDato());
			      recorrer_r((INodo<T>) aux.getSiguiente());
			   }
			 }
	}
