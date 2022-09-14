package model.exceptions;

public class DomainException extends RuntimeException { //para que as exceções não necessitem ser obrigatoriamente tratadas ou propagadas.
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg); //para repassar a mensagem pro construtor da super classe
	}
	
}
