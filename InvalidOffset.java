package string.encoder;

public class InvalidOffset extends Exception {

	public InvalidOffset(String message) {
		super(message);
	}

	public InvalidOffset(String message, Throwable t) {
		super(message, t);
	}
}
