package com.axellience.domain;
import java.util.Date;

//Start of user code Import bloc for Class Invoice

//End of user code



public class Invoice
{
	
	
	protected Address address;
	
	
	protected Command command;
	
	
	protected Date date;
	
	
	protected String ref;

	//Start of user code Attribute bloc for Class Invoice

	//End of user code

	public Invoice(){
		//Start of user code standard constructor bloc for Class Invoice

		//End of user code
	}

	//Start of user code Other constructor bloc for Class Invoice

	//End of user code

	
	
	public void basicSetCommand(Command myCommand) {
		if (this.command != myCommand) {
			if (myCommand != null){
				if (this.command != myCommand) {
					Command oldcommand = this.command;
					this.command = myCommand;
					if (oldcommand != null)
						oldcommand.unsetInvoice();
				}
			}
		}	
	}
	
	
	
	public Address getAddress() {
		return this.address;	
	}
	
	
	
	public Command getCommand() {
		return this.command;	
	}
	
	
	
	public Date getDate() {
		return this.date;	
	}
	
	
	
	public String getRef() {
		return this.ref;	
	}
	
	
	
	public void setAddress(Address myAddress) {
		this.address = myAddress;	
	}
	
	
	
	public void setCommand(Command myCommand) {
		this.basicSetCommand(myCommand);
		myCommand.basicSetInvoice(this);
			
	}
	
	
	
	public void setDate(Date myDate) {
		this.date = myDate;	
	}
	
	
	
	public void setRef(String myRef) {
		this.ref = myRef;	
	}
	
	
	
	public void unsetAddress() {
		this.address = new Address();	
	}
	
	
	
	public void unsetCommand() {
		if (this.command == null)
			return;
		Command oldcommand = this.command;
		this.command = null;
		oldcommand.unsetInvoice();	
	}
	
	
	
	public void unsetDate() {
		this.date = new Date();;	
	}
	
	
	
	public void unsetRef() {
		this.ref = null;	
	}
	
	//Start of user code Method bloc for Class Invoice

	//End of user code

}

