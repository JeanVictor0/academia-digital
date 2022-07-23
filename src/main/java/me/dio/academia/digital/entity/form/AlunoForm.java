package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NotBlank
@Size(min = 3, max = 50, message = "Aaaaa")
public class AlunoForm {

  private String nome;

  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getBairro() {
	return bairro;
}

public void setBairro(String bairro) {
	this.bairro = bairro;
}

public LocalDate getDataDeNascimento() {
	return dataDeNascimento;
}

public void setDataDeNascimento(LocalDate dataDeNascimento) {
	this.dataDeNascimento = dataDeNascimento;
}
  
  
}
