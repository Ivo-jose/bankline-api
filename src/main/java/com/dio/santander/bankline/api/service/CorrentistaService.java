package com.dio.santander.bankline.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NovoCorrenstista;
import com.dio.santander.bankline.api.model.Conta;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;

@Service
public class CorrentistaService {
	
	@Autowired
	private CorrentistaRepository repository;
	
	public void save(NovoCorrenstista novoCorrentista) {
		
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(correntista.getNome());
		//
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		repository.save(correntista);
	}
}
