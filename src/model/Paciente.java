package model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Paciente {
	private int id_paciente;
	private String nome_paciente;
	private String cpf;
	private String rg;
	private String email;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate data_nasc;
	private String sexo;
	private String estado_civil;
	private String nome_conjuge;
	private String endereco;
	private String bairro;
	private String cidade;
	private String cep;
	private String estado_saude;
	private boolean tem_alergia;
	private String alergias;
	private boolean tem_diabetes;
	private boolean bebe;
	private boolean tem_prob_resp;
	private String prob_resp;
	private boolean cirurgia_previa;
	private String cirurgias;
	private boolean fuma;
	private boolean tem_prob_circ;
	private String prob_circ;
	private boolean usa_medicamentos;
	private String medicamentos;
	
	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public String getNome_paciente() {
		return nome_paciente;
	}
	
	public void setNome_paciente(String nome_paciente) {
		this.nome_paciente = nome_paciente;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getData_nasc() {
		return data_nasc;
	}
	
	public void setData_nasc(LocalDate data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getEstado_civil() {
		return estado_civil;
	}
	
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	
	public String getNome_conjuge() {
		return nome_conjuge;
	}

	public void setNome_conjuge(String nome_conjuge) {
		this.nome_conjuge = nome_conjuge;
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getEstado_saude() {
		return estado_saude;
	}
	
	public void setEstado_saude(String estado_saude) {
		this.estado_saude = estado_saude;
	}
	
	public boolean isTem_alergia() {
		return tem_alergia;
	}
	
	public void setTem_alergia(boolean tem_alergia) {
		this.tem_alergia = tem_alergia;
	}
	
	public String getAlergias() {
		return alergias;
	}
	
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	
	public boolean isTem_diabetes() {
		return tem_diabetes;
	}
	
	public void setTem_diabetes(boolean tem_diabetes) {
		this.tem_diabetes = tem_diabetes;
	}
	
	public boolean isBebe() {
		return bebe;
	}
	
	public void setBebe(boolean bebe) {
		this.bebe = bebe;
	}
	
	public boolean isTem_prob_resp() {
		return tem_prob_resp;
	}
	
	public void setTem_prob_resp(boolean tem_prob_resp) {
		this.tem_prob_resp = tem_prob_resp;
	}
	
	public String getProb_resp() {
		return prob_resp;
	}
	
	public void setProb_resp(String prob_resp) {
		this.prob_resp = prob_resp;
	}
	
	public boolean isCirurgia_previa() {
		return cirurgia_previa;
	}
	
	public void setCirurgia_previa(boolean cirurgia_previa) {
		this.cirurgia_previa = cirurgia_previa;
	}
	
	public String getCirurgias() {
		return cirurgias;
	}
	
	public void setCirurgias(String cirurgias) {
		this.cirurgias = cirurgias;
	}
	
	public boolean isFuma() {
		return fuma;
	}
	
	public void setFuma(boolean fuma) {
		this.fuma = fuma;
	}
	
	public boolean isTem_prob_circ() {
		return tem_prob_circ;
	}
	
	public void setTem_prob_circ(boolean tem_prob_circ) {
		this.tem_prob_circ = tem_prob_circ;
	}
	
	public String getProb_circ() {
		return prob_circ;
	}
	
	public void setProb_circ(String prob_circ) {
		this.prob_circ = prob_circ;
	}
	
	public boolean isUsa_medicamentos() {
		return usa_medicamentos;
	}
	
	public void setUsa_medicamentos(boolean usa_medicamentos) {
		this.usa_medicamentos = usa_medicamentos;
	}
	
	public String getMedicamentos() {
		return medicamentos;
	}
	
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}
	
}
