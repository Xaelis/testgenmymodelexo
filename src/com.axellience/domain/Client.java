package com.axellience.domain;
import java.util.Set;
import java.util.HashSet;

//Start of user code Import bloc for Class Client

//End of user code



public class Client
{
	
	
	protected Set<Address> adresses;
	
	
	protected Set<Command> commands;
	
	
	protected String name;
	
	
	protected String surname;

	//Start of user code Attribute bloc for Class Client

	//End of user code

	public Client(){
		//Start of user code standard constructor bloc for Class Client

		//End of user code
	}

	//Start of user code Other constructor bloc for Class Client

	//End of user code

	
	
	public void addAdresses(Address newAdresses) {
		if(this.adresses == null) {
			this.adresses = new HashSet<Address>();
		}
		
		this.adresses.add(newAdresses);	
	}
	
	
	
	public void addAllAdresses(Set<Address> newAdresses) {
		if (this.adresses == null) {
			this.adresses = new HashSet<Address>();
		}
		this.adresses.addAll(newAdresses);	
	}
	
	
	
	public void addAllCommands(Set<Command> newCommands) {
		if (this.commands == null) {
			this.commands = new HashSet<Command>();
		}
		for (Command tmp : newCommands)
			tmp.setClient(this);
			
	}
	
	
	
	public void addCommands(Command newCommands) {
		if(this.commands == null) {
			this.commands = new HashSet<Command>();
		}
		
		if (this.commands.add(newCommands))
			newCommands.basicSetClient(this);	
	}
	
	
	
	public Set<Address> getAdresses() {
		if(this.adresses == null) {
				this.adresses = new HashSet<Address>();
		}
		return (Set<Address>) this.adresses;	
	}
	
	
	
	public Set<Command> getCommands() {
		if(this.commands == null) {
				this.commands = new HashSet<Command>();
		}
		return (Set<Command>) this.commands;	
	}
	
	
	
	public String getName() {
		return this.name;	
	}
	
	
	
	public String getSurname() {
		return this.surname;	
	}
	
	
	
	public void removeAdresses(Address oldAdresses) {
		if(this.adresses == null)
			return;
		
		this.adresses.remove(oldAdresses);	
	}
	
	
	
	public void removeAllAdresses(Set<Address> newAdresses) {
		if(this.adresses == null) {
			return;
		}
		
		this.adresses.removeAll(newAdresses);	
	}
	
	
	
	public void removeAllCommands(Set<Command> newCommands) {
		if(this.commands == null) {
			return;
		}
		
		this.commands.removeAll(newCommands);	
	}
	
	
	
	public void removeCommands(Command oldCommands) {
		if(this.commands == null)
			return;
		
		if (this.commands.remove(oldCommands))
			oldCommands.unsetClient();
			
	}
	
	
	
	public void setName(String myName) {
		this.name = myName;	
	}
	
	
	
	public void setSurname(String mySurname) {
		this.surname = mySurname;	
	}
	
	
	
	public void unsetName() {
		this.name = null;	
	}
	
	
	
	public void unsetSurname() {
		this.surname = null;	
	}
	
	//Start of user code Method bloc for Class Client

	//End of user code

}

