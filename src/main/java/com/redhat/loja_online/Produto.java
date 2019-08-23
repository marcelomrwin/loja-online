package com.redhat.loja_online;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Produto implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Descrição")
	private java.lang.String descricao;
	@org.kie.api.definition.type.Label(value = "Valor Unitário")
	private java.lang.Double valorUnitario;
	@org.kie.api.definition.type.Label(value = "Código")
	private java.lang.String codigo;

	public Produto() {
	}

	public java.lang.String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(java.lang.String descricao) {
		this.descricao = descricao;
	}

	public java.lang.Double getValorUnitario() {
		return this.valorUnitario;
	}

	public void setValorUnitario(java.lang.Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public java.lang.String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(java.lang.String codigo) {
		this.codigo = codigo;
	}

	public Produto(java.lang.String descricao, java.lang.Double valorUnitario,
			java.lang.String codigo) {
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.codigo = codigo;
	}

}