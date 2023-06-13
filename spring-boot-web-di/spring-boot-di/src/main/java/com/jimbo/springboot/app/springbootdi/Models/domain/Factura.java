package com.jimbo.springboot.app.springbootdi.Models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Factura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6019539280819854104L;

	@Value("${factura.descripcion}")
	private String descripcion;

	@Autowired
	private Cliente cliente;

	@Autowired

	private List<ItemFactura> items;

	@PostConstruct
	public void inicializar() {
		cliente.setNombre(cliente.getNombre().concat(" ").concat("Eduardo"));
		descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
	}

	@PreDestroy
	public void destruir() {
		System.out.println("Factura destruida: ".concat(descripcion));
	}

	public Factura(String descripcion, Cliente cliente, List<ItemFactura> items) {
		this.descripcion = descripcion;
		this.cliente = cliente;
		this.items = items;
	}

	public Factura() {
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}
}
