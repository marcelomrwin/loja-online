package com.redhat.loja_online;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Compra implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Cliente")
	private com.redhat.loja_online.Cliente cliente;
	@org.kie.api.definition.type.Label(value = "Produtos")
	private java.util.List<com.redhat.loja_online.ProdutoCompra> produtos;
	@org.kie.api.definition.type.Label(value = "Valor do frete")
	private java.lang.Double frete;
	@org.kie.api.definition.type.Label(value = "Data da compra")
	private java.time.LocalDateTime data;
	@org.kie.api.definition.type.Label(value = "Valor total da compra")
	private java.lang.Double valorTotal;
	@org.kie.api.definition.type.Label(value = "Total de descontos")
	private java.lang.Double totalDescontos;

	public Compra() {
	}

	public com.redhat.loja_online.Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(com.redhat.loja_online.Cliente cliente) {
		this.cliente = cliente;
	}

	public java.util.List<com.redhat.loja_online.ProdutoCompra> getProdutos() {
		return this.produtos;
	}

	public void setProdutos(
			java.util.List<com.redhat.loja_online.ProdutoCompra> produtos) {
		this.produtos = produtos;
	}

	public java.lang.Double getFrete() {
		return this.frete;
	}

	public void setFrete(java.lang.Double frete) {
		this.frete = frete;
	}

	public java.time.LocalDateTime getData() {
		return this.data;
	}

	public void setData(java.time.LocalDateTime data) {
		this.data = data;
	}

	public java.lang.Double getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(java.lang.Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public java.lang.Double getTotalDescontos() {
		return this.totalDescontos;
	}

	public void setTotalDescontos(java.lang.Double totalDescontos) {
		this.totalDescontos = totalDescontos;
	}

	public Compra(com.redhat.loja_online.Cliente cliente,
			java.util.List<com.redhat.loja_online.ProdutoCompra> produtos,
			java.lang.Double frete, java.time.LocalDateTime data,
			java.lang.Double valorTotal, java.lang.Double totalDescontos) {
		this.cliente = cliente;
		this.produtos = produtos;
		this.frete = frete;
		this.data = data;
		this.valorTotal = valorTotal;
		this.totalDescontos = totalDescontos;
	}

	
	public void aplicarDescontoPercentual(Double percentual) {
		double percent = percentual/100;
		this.valorTotal = this.valorTotal - (percent * this.valorTotal);
	}
	
	public java.lang.Integer quantidadeDeItens() {
		Integer qtd = 0;
		if (this.produtos != null && !this.produtos.isEmpty())
			for (ProdutoCompra produtoCompra : produtos) {
				qtd += produtoCompra.getQuantidade();
			}
		return qtd;
	}
}