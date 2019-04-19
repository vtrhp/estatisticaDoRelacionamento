package br.com.vtrhp.estatistica.api.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.vtrhp.estatistica.api.enums.NacionalidadeEnum;
import br.com.vtrhp.estatistica.api.enums.OrientacaoSexualEnum;
import br.com.vtrhp.estatistica.api.enums.PaisesEnum;
import br.com.vtrhp.estatistica.api.enums.SexoEnum;
import br.com.vtrhp.estatistica.api.enums.SignosEnum;

public class Pessoa {

	private Long idFamilia;
	private Long idRelacaoFamilia;
	private Long idAmigo;
	private Long idProfissao;
	private Long idVeiculo;
	private Long idResidencia;
	private Long idAssuntosDeInteresse;
	private Long idContatoComFamilia;
	private Long idDia;
	private Long idOndeConheci;
	private Long idPontosNegativosFamilia;
	private Long idPontosPositivosFamilia;
	private Long idFalecimento;
	private Long idDeficiencia;

	private String nome;
	private String sobreNome;
	private Double altura;
	private Double peso;
	private String corOlhos;
	private String corCabelo;
	@Enumerated(EnumType.STRING)
	private SexoEnum sexo;
	private LocalDate dataNascimento;
	private LocalTime horaNascimento;
	private String estadoNascimento;
	private String cidadeNascimento;
	@Enumerated(EnumType.STRING)
	private OrientacaoSexualEnum orientacaoSexual;
	@Enumerated(EnumType.STRING)
	private PaisesEnum paisDeOrigem;
	@Enumerated(EnumType.STRING)
	private NacionalidadeEnum nacionalidade;
	private char adotivo;
	@Enumerated(EnumType.STRING)
	private SignosEnum signo;
	private String descendencia;
	private Integer tamanhoPe;
	private String grauDeParentesco;
	private List<Deficiencia> deficiencia;
	private List<Veiculo> veiculo;
	private List<Amigos> amigos;
	private List<Familia> familia;
	private List<AssuntosDeInteresse> assuntosDeInteresse;
	private List<Residencia> residencia;
	private List<Profissao> profissao;
	private List<PontosPositivos> pontosPositivos;
	private List<PontosNegativos> pontosNegativos;
	private List<RelacaoComFamilia> relacaoComFamilia;
	private List<Visao> problemasDeVisao;
	private OndeConheci ondeConheci;
	private Dia eventosImportantesDia;
	private Falecimento falecimento;
	private List<Viagens> viagens;
	private Documentos documentos;
	private List<Objetivos> objetivos;

	public Long getIdFamilia() {
		return idFamilia;
	}

	public void setIdFamilia(Long idFamilia) {
		this.idFamilia = idFamilia;
	}

	public Long getIdRelacaoFamilia() {
		return idRelacaoFamilia;
	}

	public void setIdRelacaoFamilia(Long idRelacaoFamilia) {
		this.idRelacaoFamilia = idRelacaoFamilia;
	}

	public Long getIdAmigo() {
		return idAmigo;
	}

	public void setIdAmigo(Long idAmigo) {
		this.idAmigo = idAmigo;
	}

	public Long getIdProfissao() {
		return idProfissao;
	}

	public void setIdProfissao(Long idProfissao) {
		this.idProfissao = idProfissao;
	}

	public Long getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(Long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public Long getIdResidencia() {
		return idResidencia;
	}

	public void setIdResidencia(Long idResidencia) {
		this.idResidencia = idResidencia;
	}

	public Long getIdAssuntosDeInteresse() {
		return idAssuntosDeInteresse;
	}

	public void setIdAssuntosDeInteresse(Long idAssuntosDeInteresse) {
		this.idAssuntosDeInteresse = idAssuntosDeInteresse;
	}

	public Long getIdContatoComFamilia() {
		return idContatoComFamilia;
	}

	public void setIdContatoComFamilia(Long idContatoComFamilia) {
		this.idContatoComFamilia = idContatoComFamilia;
	}

	public Long getIdDia() {
		return idDia;
	}

	public void setIdDia(Long idDia) {
		this.idDia = idDia;
	}

	public Long getIdOndeConheci() {
		return idOndeConheci;
	}

	public void setIdOndeConheci(Long idOndeConheci) {
		this.idOndeConheci = idOndeConheci;
	}

	public Long getIdPontosNegativosFamilia() {
		return idPontosNegativosFamilia;
	}

	public void setIdPontosNegativosFamilia(Long idPontosNegativosFamilia) {
		this.idPontosNegativosFamilia = idPontosNegativosFamilia;
	}

	public Long getIdPontosPositivosFamilia() {
		return idPontosPositivosFamilia;
	}

	public void setIdPontosPositivosFamilia(Long idPontosPositivosFamilia) {
		this.idPontosPositivosFamilia = idPontosPositivosFamilia;
	}

	public Long getIdFalecimento() {
		return idFalecimento;
	}

	public void setIdFalecimento(Long idFalecimento) {
		this.idFalecimento = idFalecimento;
	}

	public Long getIdDeficiencia() {
		return idDeficiencia;
	}

	public void setIdDeficiencia(Long idDeficiencia) {
		this.idDeficiencia = idDeficiencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getCorOlhos() {
		return corOlhos;
	}

	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}

	public String getCorCabelo() {
		return corCabelo;
	}

	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}

	public SexoEnum getSexo() {
		return sexo;
	}

	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalTime getHoraNascimento() {
		return horaNascimento;
	}

	public void setHoraNascimento(LocalTime horaNascimento) {
		this.horaNascimento = horaNascimento;
	}

	public String getEstadoNascimento() {
		return estadoNascimento;
	}

	public void setEstadoNascimento(String estadoNascimento) {
		this.estadoNascimento = estadoNascimento;
	}

	public String getCidadeNascimento() {
		return cidadeNascimento;
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	public OrientacaoSexualEnum getOrientacaoSexual() {
		return orientacaoSexual;
	}

	public void setOrientacaoSexual(OrientacaoSexualEnum orientacaoSexual) {
		this.orientacaoSexual = orientacaoSexual;
	}

	public PaisesEnum getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(PaisesEnum paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}

	public NacionalidadeEnum getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(NacionalidadeEnum nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public char getAdotivo() {
		return adotivo;
	}

	public void setAdotivo(char adotivo) {
		this.adotivo = adotivo;
	}

	public SignosEnum getSigno() {
		return signo;
	}

	public void setSigno(SignosEnum signo) {
		this.signo = signo;
	}

	public String getDescendencia() {
		return descendencia;
	}

	public void setDescendencia(String descendencia) {
		this.descendencia = descendencia;
	}

	public Integer getTamanhoPe() {
		return tamanhoPe;
	}

	public void setTamanhoPe(Integer tamanhoPe) {
		this.tamanhoPe = tamanhoPe;
	}

	public String getGrauDeParentesco() {
		return grauDeParentesco;
	}

	public void setGrauDeParentesco(String grauDeParentesco) {
		this.grauDeParentesco = grauDeParentesco;
	}

	public List<Deficiencia> getDeficiencia() {
		return deficiencia;
	}

	public void setDeficiencia(List<Deficiencia> deficiencia) {
		this.deficiencia = deficiencia;
	}

	public List<Veiculo> getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}

	public List<Amigos> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Amigos> amigos) {
		this.amigos = amigos;
	}

	public List<Familia> getFamilia() {
		return familia;
	}

	public void setFamilia(List<Familia> familia) {
		this.familia = familia;
	}

	public List<AssuntosDeInteresse> getAssuntosDeInteresse() {
		return assuntosDeInteresse;
	}

	public void setAssuntosDeInteresse(List<AssuntosDeInteresse> assuntosDeInteresse) {
		this.assuntosDeInteresse = assuntosDeInteresse;
	}

	public List<Residencia> getResidencia() {
		return residencia;
	}

	public void setResidencia(List<Residencia> residencia) {
		this.residencia = residencia;
	}

	public List<Profissao> getProfissao() {
		return profissao;
	}

	public void setProfissao(List<Profissao> profissao) {
		this.profissao = profissao;
	}

	public List<PontosPositivos> getPontosPositivos() {
		return pontosPositivos;
	}

	public void setPontosPositivos(List<PontosPositivos> pontosPositivos) {
		this.pontosPositivos = pontosPositivos;
	}

	public List<PontosNegativos> getPontosNegativos() {
		return pontosNegativos;
	}

	public void setPontosNegativos(List<PontosNegativos> pontosNegativos) {
		this.pontosNegativos = pontosNegativos;
	}

	public List<RelacaoComFamilia> getRelacaoComFamilia() {
		return relacaoComFamilia;
	}

	public void setRelacaoComFamilia(List<RelacaoComFamilia> relacaoComFamilia) {
		this.relacaoComFamilia = relacaoComFamilia;
	}

	public List<Visao> getProblemasDeVisao() {
		return problemasDeVisao;
	}

	public void setProblemasDeVisao(List<Visao> problemasDeVisao) {
		this.problemasDeVisao = problemasDeVisao;
	}

	public OndeConheci getOndeConheci() {
		return ondeConheci;
	}

	public void setOndeConheci(OndeConheci ondeConheci) {
		this.ondeConheci = ondeConheci;
	}

	public Dia getEventosImportantesDia() {
		return eventosImportantesDia;
	}

	public void setEventosImportantesDia(Dia eventosImportantesDia) {
		this.eventosImportantesDia = eventosImportantesDia;
	}

	public Falecimento getFalecimento() {
		return falecimento;
	}

	public void setFalecimento(Falecimento falecimento) {
		this.falecimento = falecimento;
	}

	public List<Viagens> getViagens() {
		return viagens;
	}

	public void setViagens(List<Viagens> viagens) {
		this.viagens = viagens;
	}

	public Documentos getDocumentos() {
		return documentos;
	}

	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}

	public List<Objetivos> getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(List<Objetivos> objetivos) {
		this.objetivos = objetivos;
	}

}
