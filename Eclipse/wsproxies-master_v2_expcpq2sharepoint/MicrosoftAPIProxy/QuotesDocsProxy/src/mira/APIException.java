package mira;

public class APIException extends Exception {
    
    @SuppressWarnings("compatibility:6199386255498486407")
    private static final long serialVersionUID = 1L;
    
    
    public APIException(){
        super();    
    }
    

    public APIException(String error){
        super( error );    
    }
    

    public APIException(String error, Throwable cause){
        super( error );    
        this.initCause(cause);
    }

}
