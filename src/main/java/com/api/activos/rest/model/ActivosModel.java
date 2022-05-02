package com.api.activos.rest.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class ActivosModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id_activos;
	@Column
	private String nombre;
	@Column
	private String descripción;
	@Column
	private String tipo;
	@Column
	private String serial;
	@Column
	private long numero;
	@Column
	private String interno_inventario;
	@Column
	private double peso;
	@Column
	private double alto;
	@Column
	private double ancho;
	@Column
	private double largo;
	@Column
	private float valor_compra;
	@Column
	private Date fecha_compra;
	
	public int getId_activos() {
		return id_activos;
	}
	public void setId_activos(int id_activos) {
		this.id_activos = id_activos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripción() {
		return descripción;
	}
	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getInterno_inventario() {
		return interno_inventario;
	}
	public void setInterno_inventario(String interno_inventario) {
		this.interno_inventario = interno_inventario;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public float getValor_compra() {
		return valor_compra;
	}
	public void setValor_compra(float valor_compra) {
		this.valor_compra = valor_compra;
	}
	public Date getFecha_compra() {
		return fecha_compra;
	}
	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	public ActivosModel(String nombre, String descripción, String tipo, String serial, long numero,
			String interno_inventario, double peso, double alto, double ancho, double largo, float valor_compra,
			Date fecha_compra) {
		super();
		this.nombre = nombre;
		this.descripción = descripción;
		this.tipo = tipo;
		this.serial = serial;
		this.numero = numero;
		this.interno_inventario = interno_inventario;
		this.peso = peso;
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
		this.valor_compra = valor_compra;
		this.fecha_compra = fecha_compra;
	}
	public ActivosModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ActivosModel [nombre=" + nombre + ", descripción=" + descripción + ", tipo=" + tipo + ", serial="
				+ serial + ", numero=" + numero + ", interno_inventario=" + interno_inventario + ", peso=" + peso
				+ ", alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + ", valor_compra=" + valor_compra
				+ ", fecha_compra=" + fecha_compra + "]";
	}

}
