package neapolitan;
public class NotRealNoteException extends Exception {
    /**
     * To be thrown when there is an attempt to reference a note that doesn't exist. For example, h5 is not in fact a real note.
     * @param errorMessage: Gives context for the error.
     */
    public NotRealNoteException(String errorMessage){
        super(errorMessage);
    }
}
