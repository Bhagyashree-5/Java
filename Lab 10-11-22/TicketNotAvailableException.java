package airlineticket;

public class TicketNotAvailableException extends Exception {
	public TicketNotAvailableException (String str)  
    {  
        super(str);
    }

}
