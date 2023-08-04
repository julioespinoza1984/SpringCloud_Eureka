package edu.jespinoza.spring.eureka.client.exception;

public class TechnicalException extends RuntimeException {
    private static final long serialVersionUID = 4067284762756294381L;

    /**
     * Constructor
     *
     * @param message The Message
     * @param cause   The Cause of Exception
     */
    public TechnicalException(String message, Throwable cause) {
        super(message, cause);
    }
}