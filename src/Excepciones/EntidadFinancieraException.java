package Excepciones;

public class EntidadFinancieraException extends Exception{
    public EntidadFinancieraException(){
        super();
    }
    public EntidadFinancieraException(String message){
        super(message);
    }
}
