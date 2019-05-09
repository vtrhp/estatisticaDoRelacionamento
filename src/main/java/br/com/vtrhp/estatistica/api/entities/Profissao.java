package br.com.vtrhp.estatistica.api.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.javamoney.moneta.Money;

@Entity
@Table(name = "profissao")
public class Profissao implements Serializable {

	private static final long serialVersionUID = -4452861555374092394L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idProfissao;
	private String nomeEmpresa;
	private String profissao;
	private String cargo;
	private String Descricao;	
	private Money salarioBruto;
	private Money salarioLiquido;
	private Integer qtdSubordinados;
	private LocalDate dataDemissao;
	private LocalDate dataContratacao;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_conjuge", nullable = false)
	private Conjuge conjuge;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_amigo", nullable = false)
	private Amigos amigos;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_familia", nullable = false)
	private Familia familia;

	private LocalDate dataCriacao;
	private LocalDate dataAtualizacao;
	
	public Long getIdProfissao() {
		return idProfissao;
	}

	public void setIdProfissao(Long idProfissao) {
		this.idProfissao = idProfissao;
	}
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Money getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Money salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Money getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(Money salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public Integer getQtdSubordinados() {
		return qtdSubordinados;
	}

	public void setQtdSubordinados(Integer qtdSubordinados) {
		this.qtdSubordinados = qtdSubordinados;
	}

	public LocalDate getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(LocalDate dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	@PreUpdate
	public void preUpdate() {
		dataAtualizacao = LocalDate.now();
	}

	@PrePersist
	public void prePersist() {
		final LocalDate atual = LocalDate.now();
		dataAtualizacao = atual;
	}

}
