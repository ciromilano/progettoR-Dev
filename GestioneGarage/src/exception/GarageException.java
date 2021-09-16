package exception;


public class GarageException extends Exception {

   
	private static final long serialVersionUID = 1L;
	private String message;

    public GarageException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
