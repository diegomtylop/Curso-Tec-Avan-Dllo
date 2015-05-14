package co.metrobus.rasbus.core.exception;

public class UseCaseException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UseCaseException(String msg ){
		super(msg);
	}

	public UseCaseException(RepositoryException e) {
		// TODO Auto-generated constructor stub
		super(e.getMessage());
	}
}
