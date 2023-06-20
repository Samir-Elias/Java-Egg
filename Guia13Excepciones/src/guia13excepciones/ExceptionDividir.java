/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package guia13excepciones;

/**
 *
 * @author SAMIR
 */
public class ExceptionDividir extends ArithmeticException{
  
    /**
     * Creates a new instance of <code>ExceptionDividir</code> without detail
     * message.
     */
    public ExceptionDividir() {
    }

    /**
     * Constructs an instance of <code>ExceptionDividir</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExceptionDividir(String msg) {
        super(msg);
    }
}
