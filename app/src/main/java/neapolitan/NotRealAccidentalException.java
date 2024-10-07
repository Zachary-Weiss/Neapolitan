package neapolitan;

public class NotRealAccidentalException extends Exception {
    /**
     * To be thrown when there is an attempt to use an accidental that isn't 's' (sharp), 'f' (flat), or 'n' (natural)
     * @param errorMessage: Gives context for the error.
     */
    public NotRealAccidentalException(String errorMessage){
        super(errorMessage);
    }
}
