package ArbolBinariodeBusqueda;
public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Insertar un contacto en el árbol binario
    public void insertar(String nombre, String telefono) {
        raiz = insertarRec(raiz, nombre, telefono);
    }

    private Nodo insertarRec(Nodo raiz, String nombre, String telefono) {
        if (raiz == null) {
            raiz = new Nodo(nombre, telefono);  // Crea un nuevo nodo si la raíz está vacía.
            return raiz;
        }
        if (nombre.compareTo(raiz.nombre) < 0) {
            raiz.izquierda = insertarRec(raiz.izquierda, nombre, telefono);  // Inserta en el subárbol izquierdo si el nombre es menor.
        } else if (nombre.compareTo(raiz.nombre) > 0) {
            raiz.derecha = insertarRec(raiz.derecha, nombre, telefono);  // Inserta en el subárbol derecho si el nombre es mayor.
        }
        return raiz;
    }

    // Buscar un contacto por nombre
    public String buscar(String nombre) {
        Nodo nodo = buscarRec(raiz, nombre);
        return nodo == null ? "Contacto no encontrado" : nodo.telefono;  // Retorna el teléfono del contacto o un mensaje si no se encuentra.
    }

    private Nodo buscarRec(Nodo raiz, String nombre) {
        if (raiz == null || raiz.nombre.equals(nombre)) {
            return raiz;  // Devuelve el nodo si el nombre coincide o si se alcanza el final del árbol.
        }
        if (nombre.compareTo(raiz.nombre) < 0) {
            return buscarRec(raiz.izquierda, nombre);  // Busca en el subárbol izquierdo.
        }
        return buscarRec(raiz.derecha, nombre);  // Busca en el subárbol derecho.
    }

    // Recorrido inorden (ordenado) para mostrar los contactos
    public void recorridoInorden() {
        recorridoInordenRec(raiz);
    }

    private void recorridoInordenRec(Nodo raiz) {
        if (raiz != null) {
            recorridoInordenRec(raiz.izquierda);  // Recorrido en el subárbol izquierdo.
            System.out.println("Nombre: " + raiz.nombre + ", Teléfono: " + raiz.telefono);  // Muestra el contacto.
            recorridoInordenRec(raiz.derecha);  // Recorrido en el subárbol derecho.
        }
    }
}