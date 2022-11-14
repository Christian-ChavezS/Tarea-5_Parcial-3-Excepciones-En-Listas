package uaslp.objetos.list;

public interface Iterator<T> {

    /**
     * Indica si hay un elemento disponible en el Iterador
     * @return true si hay un elemento disponible, de lo contrario false
     */
    boolean hasNext();


    /**
     * Regresa el elemento actual y avanza al siguiente
     * @return El elemento actual
     */
    T next();
}
