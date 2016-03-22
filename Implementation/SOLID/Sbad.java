
//Single responsability principle - Bad example

interface IEmail {
	public void setSender (String sender);
	public void setReceiver (String receiver);
	public void setContent (String content);
}

class Email implements IEmail {
	public void setSender(String sender){
		//Set sender
	}
	public void setReceiver(String receiver){
		//Set receiver 
	}
	public void setContent(String content){
		//Set content 
	}
}