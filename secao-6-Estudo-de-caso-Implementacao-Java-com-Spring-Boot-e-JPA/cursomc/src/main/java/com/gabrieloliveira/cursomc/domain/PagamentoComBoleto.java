package com.gabrieloliveira.cursomc.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gabrieloliveira.cursomc.domain.enums.EstadoPagamento;

import jakarta.persistence.Entity;

@Entity
public class PagamentoComBoleto extends Pagamento {

	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataVencimento;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataPagamento;

	public PagamentoComBoleto() {
		// TODO Auto-generated constructor stub
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataPagamento,
			Date dataVencimento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	@Override
	public String toString() {
		return "PagamentoComBoleto [dataVencimento=" + dataVencimento + ", dataPagamento=" + dataPagamento + "]";
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
