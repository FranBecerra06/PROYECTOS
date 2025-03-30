package Sistimpresion;

import java.util.LinkedList;
import java.util.Queue;

public class SistemaImpresion {
    private Queue<String> colaImpresion;

    public SistemaImpresion() {
        colaImpresion = new LinkedList<>();
    }

    // Agregar un documento a la cola de impresión
    public void agregarDocumento(String nombreDocumento) {
        colaImpresion.add(nombreDocumento);  // Agrega el documento al final de la cola.
    }

    // Imprimir y eliminar el documento en el frente de la cola
    public String imprimirDocumento() {
        if (colaImpresion.isEmpty()) {
            throw new IllegalStateException("No hay documentos en la cola.");
        }
        return colaImpresion.poll();  // Elimina y retorna el documento del frente de la cola.
    }

    // Ver los documentos pendientes de imprimir
    public void verDocumentosPendientes() {
        if (colaImpresion.isEmpty()) {
            System.out.println("No hay documentos pendientes.");
        } else {
            System.out.println("Documentos pendientes de impresión:");
            colaImpresion.forEach(System.out::println);  // Muestra todos los documentos pendientes.
        }
    }
}
