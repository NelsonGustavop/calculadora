package com.Slayer.mercado;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Slayer.mercado.domain.Compra;
import com.Slayer.mercado.domain.Funcionario;
import com.Slayer.mercado.domain.Tecnico;
import com.Slayer.mercado.domain.enums.Entrega;
import com.Slayer.mercado.domain.enums.Nivel;
import com.Slayer.mercado.domain.enums.Status;
import com.Slayer.mercado.repositories.CompraRepository;
import com.Slayer.mercado.repositories.FuncionarioRepository;
import com.Slayer.mercado.repositories.TecnicoRepository;

@SpringBootApplication
public class MercadoApplication implements CommandLineRunner {
	
	@Autowired
	private TecnicoRepository TecnicoRepository;
	@Autowired
	private FuncionarioRepository fR;
	@Autowired
	private CompraRepository cR;

	public static void main(String[] args) {
		SpringApplication.run(MercadoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico t1 = new Tecnico(1, "Maria Jaeger", null);
		t1.addNivel(Nivel.Tecnico);
		
		Funcionario f1 = new Funcionario(2, "Cleito fia", null);
		f1.addNivel(Nivel.FUNCIONARIO);
		
		Compra co1 = new Compra(3, "em espera", "Nz",12.23, Status.RECEBER,Entrega.ANDAMENTO, t1, f1);
		TecnicoRepository.saveAll(Arrays.asList(t1));
		fR.saveAll(Arrays.asList(f1));
		cR.saveAll(Arrays.asList(co1));
	}

}
