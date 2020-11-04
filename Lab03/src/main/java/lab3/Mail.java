package lab3;

public class Mail {
	
	private User sender;
	private User recipient;
	private String message=null;
	
	public Mail(User sender,User recipient,String Message) {
		this.sender =sender;
		this.recipient =recipient;
		this.message = Message;
		
		
	}

	public String getSender() {
		
		return sender.toString();
	}

	public User getRecipient() {
		return recipient;
	}

	public String getMessage() {
		return message;
	}
	
	
	
	public void setMessage(String message) {
		this.message = message;
	}

	private void empty() {
		
		if(this.getMessage()==null || this.getMessage()=="") {
			
			this.setMessage("** Something went wrong! **");
		}
	}
	public void print() {
		System.out.println("From: " + sender);
		System.out.println("To: " + recipient);
		System.out.println("Message: " + message);
	}

}
