package hu.hazazs.elte.exception;

@SuppressWarnings("serial")
public final class TooMuchWaterException extends RuntimeException {

	public TooMuchWaterException(String message) {
		super(message);
	}

}