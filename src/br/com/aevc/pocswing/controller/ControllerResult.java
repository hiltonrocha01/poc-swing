package br.com.aevc.pocswing.controller;


public class ControllerResult<T> {

	private final T result;
	private final String Message;
	
	public ControllerResult(T result, String message) {
		super();
		this.result = result;
		Message = message;
	}

	public T getResult() {
		return result;
	}

	public String getMessage() {
		return Message;
	}
	
}
