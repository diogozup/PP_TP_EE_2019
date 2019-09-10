package pp_tp_ee_2019;


/*
* Nome: Diogo Sa Tinoco Magalhaes
* Número: 8120336
* Turma: 1
*/


public class ContainerOfObjects {

    private final int DEFAULT_SIZE = 100;
    private Object objects[];
    private int numObjects;
    

    
    
    /**
     * <h3>Método Construtor</h3> que permite a instância da class tendo por
     * base um vetor de elementos recebidos
     *
     * @param objects Lista de objectos sem tamanho fixo
     */
    public ContainerOfObjects(Object[] objects) {
	this.objects = objects;
    }


    

    public Object getObjectP(int position) {
	return objects[position];
    }

    /**
     * <h3 style="font-weight:bold;">Método Construtor</h3> que permite a
     * instância da class tendo por base um valor por defeito (100)
     */
    public ContainerOfObjects() {
	this.objects = new Object[DEFAULT_SIZE];
    }

    /**
     * <h3>Método Construtor</h3> que permite a instânciação da class definindo
     * um valor máximo de elementos
     *
     * @param maxSize número máximod de elementos permitidos no vetor
     */
    public ContainerOfObjects(int maxSize) {
	this.objects = new Object[maxSize];
    }

    /**
     * <h3>Método responsável por inserir um {@link Object object} na coleção de
     * {@link ContainerOfObjects#objects objects}</h3>
     *
     * @param newObject {@link Object object} a inserir no vetor
     * @return valor boolean que sinaliza o sucesso/insucesso da operação
     */
    protected boolean addObject(Object newObject) {
	if (numObjects >= this.objects.length) {
	    return false;
	} else {

	    this.objects[this.numObjects] = newObject;
	    this.numObjects++;

	    return true;
	}
    }

    /**
     *
     * <h3>Remover um {@link Object object} do vetor de
     * {@link ContainerOfObjects#objects objects}</h3>
     *
     * @param position indice correspondente ao elemento a eliminar
     * @return o {@link Object object} eliminado
     */

//    protected Object removeObject(int position) {
//
//	Object obj = this.objects[position];
//
//	if (position >= this.numObjects) {
//	    return false;
//	}
//
//	for (int i = position; i < this.numObjects - 1; i++) {
//
//	    this.objects[i] = this.objects[i + 1];
//	}
//
//	// Decrement number of objects
//	this.numObjects--;
//
//	if (this.numObjects <= this.objects.length) {
//	    this.objects[this.numObjects] = null;
//	}
//
//	return obj;
//    }
    
    // OVERLOAD DE METODO remove. Este devolve boolean
    protected boolean removeObject(int position) {

	Object obj = this.objects[position];

	if (position >= this.numObjects) {
	    return false;
	}

	for (int i = position; i < this.numObjects - 1; i++) {

	    this.objects[i] = this.objects[i + 1];
	}

	// Decrement number of objects
	this.numObjects--;

	if (this.numObjects <= this.objects.length) {
	    this.objects[this.numObjects] = null;
	}

	return true;
    }

    /**
     * <h3>Método responsável por substituir um {@link Object object}</h3> no vetor
     * {@link ContainerOfObjects#objects objects}
     *
     * @param position indice do elemento a modificar
     * @param newObject novo object a colocar no vetor
     * @return valor boolean que sinaliza sucesso/incesso da operação
     */
    protected boolean setObject(int position, Object newObject) {

	if (position >= this.numObjects) {
	    return false;
	}

	this.objects[position] = newObject;

	if (this.objects[position].equals(newObject)) {
	    return true;
	} else {
	    return false;
	}
    }
    
    

    /**
     * <h3>Método responsável por encontrar um {@link Object object} no vetor
     *
     * @param obj objeto a encontrar
     * @return a posição do objeto ou então, em caso de erro, retorna -1
     */
//    protected int findObject(Object obj) {
//	for (int i = 0; i < this.objects.length; i++) {
//	    if (this.objects[i].equals(obj)) {
//		return i;
//	    }
//	}
//
//	return -1;
//    }
    // VERSAO ALTERADA PARA ENCAIXAR EM TrabPract de PP de EpEspecial
    protected int findObject(Object obj) {
	for (int i = 0; i < this.objects.length; i++) {
	    if (this.objects[i].equals(obj)) {
		return i;
	    }
	}

	return -1;
    }

    
    public int getNumObjects() {
	return numObjects;
    }
    
    
    ///////////////// SAVE TO JSON FILE ////////////////////////////////
    //add gson jar 
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     *
     */
}
