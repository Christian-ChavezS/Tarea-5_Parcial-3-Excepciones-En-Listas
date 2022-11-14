/*package uaslp.objetos.list.exceptions;

public class WrongIndexException extends RuntimeException{
    public WrongIndexException(int wrongIndex)
    {
        super("Index " + wrongIndex + " is out of bounds");
    }
}*/

package uaslp.objetos.list.exceptions;

// Al heredar de RuntimeException (o cualquier hija de RuntimeException)
// La excepción se vuelve una "unchecked exception" -> Excepción no comprobada



public class WrongIndexException extends RuntimeException {
}
