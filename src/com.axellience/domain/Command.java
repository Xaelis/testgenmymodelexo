package com.axellience.domain;
import java.util.Set;
import java.util.HashSet;

//Start of user code Import bloc for Class Command

//End of user code



public class Command
{
	
	
	protected Client client;
	
	
	protected Invoice invoice;
	
	
	protected Set<Product> produits;
	
	
	protected String ref;

	//Start of user code Attribute bloc for Class Command

	//End of user code

	public Command(){
		//Start of user code standard constructor bloc for Class Command

		//End of user code
	}

	//Start of user code Other constructor bloc for Class Command

	//End of user code

	
	
	public void addAllProduits(Set<Product> newProduits) {
		if (this.produits == null) {
			this.produits = new HashSet<Product>();
		}
		this.produits.addAll(newProduits);	
	}
	
	
	
	public void addProduits(Product newProduits) {
		if(this.produits == null) {
			this.produits = new HashSet<Product>();
		}
		
		this.produits.add(newProduits);	
	}
	
	
	
	public void basicSetClient(Client myClient) {
		if (this.client != myClient) {
			if (myClient != null){
				if (this.client != myClient) {
					Client oldclient = this.client;
					this.client = myClient;
					if (oldclient != null)
						oldclient.removeCommands(this);
				}
			}
		}	
	}
	
	
	
	public void basicSetInvoice(Invoice myInvoice) {
		if (this.invoice != myInvoice) {
			if (myInvoice != null){
				if (this.invoice != myInvoice) {
					Invoice oldinvoice = this.invoice;
					this.invoice = myInvoice;
					if (oldinvoice != null)
						oldinvoice.unsetCommand();
				}
			}
		}	
	}
	
	
	
	public Client getClient() {
		return this.client;	
	}
	
	
	
	public Invoice getInvoice() {
		return this.invoice;	
	}
	
	
	
	public Set<Product> getProduits() {
		if(this.produits == null) {
				this.produits = new HashSet<Product>();
		}
		return (Set<Product>) this.produits;	
	}
	
	
	
	public String getRef() {
		return this.ref;	
	}
	
	
	
	public void removeAllProduits(Set<Product> newProduits) {
		if(this.produits == null) {
			return;
		}
		
		this.produits.removeAll(newProduits);	
	}
	
	
	
	public void removeProduits(Product oldProduits) {
		if(this.produits == null)
			return;
		
		this.produits.remove(oldProduits);	
	}
	
	
	
	public void setClient(Client myClient) {
		this.basicSetClient(myClient);
		myClient.addCommands(this);	
	}
	
	
	
	public void setInvoice(Invoice myInvoice) {
		this.basicSetInvoice(myInvoice);
		myInvoice.basicSetCommand(this);
			
	}
	
	
	
	public void setRef(String myRef) {
		this.ref = myRef;	
	}
	
	
	
	public void unsetClient() {
		if (this.client == null)
			return;
		Client oldclient = this.client;
		this.client = null;
		oldclient.removeCommands(this);	
	}
	
	
	
	public void unsetInvoice() {
		if (this.invoice == null)
			return;
		Invoice oldinvoice = this.invoice;
		this.invoice = null;
		oldinvoice.unsetCommand();	
	}
	
	
	
	public void unsetRef() {
		this.ref = null;	
	}
	
	//Start of user code Method bloc for Class Command

	//End of user code

}

