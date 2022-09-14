package com.cts.disbursepension.exception;

/**
 * This exception is thrown when user sends invalid token in REST API request
 * @author Ankit Barnwal
 *
 */
public class InvalidTokenException extends Exception {
	private static final long serialVersionUID = -5091342239524021914L;

	public InvalidTokenException(String message) {
		super(message);
	}

}
