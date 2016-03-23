
//Single responsability principle - Bad example

interface IEmail {
	public void setSender (String sender);
	public void setReceiver (String receiver);
	public void setContent (IContent content);
}

interface IContent {
	public String getAsString(); //used for serialization
}


class Email implements IEmail {
	public void setSender(String sender){
		//Set sender
	}
	public void setReceiver(String receiver){
		//Set receiver 
	}
	public void setContent(IContent content){
		//Set content 
	}
}