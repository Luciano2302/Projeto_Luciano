package com.sistema.cliente;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean(name= "clienteMB")
@RequestScoped
public class ClienteBean {
	
	
	private Cliente clienteSelecioando = new Cliente();
	
	
	public void salvar(){
		
		
	}


	public Cliente getClienteSelecioando() {
		return clienteSelecioando;
	}


	public void setClienteSelecioando(Cliente clienteSelecioando) {
		this.clienteSelecioando = clienteSelecioando;
	}
	
	

}
