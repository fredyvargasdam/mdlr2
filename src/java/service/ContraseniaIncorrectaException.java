package service;

/**
 * Excepción que se lanza cuando ocurre algun problema a la hora de leer
 *
 * @author 2dam
 */
public class ContraseniaIncorrectaException extends Exception {

    /**
     * Constructor vacio
     */
    public ContraseniaIncorrectaException() {
    }

    /**
     * Constructor el cual recibe un mensaje detallado
     *
     * @param message
     */
    public ContraseniaIncorrectaException(String message) {
        super(message);
    }
}
