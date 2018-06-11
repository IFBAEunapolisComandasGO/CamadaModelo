package com.comandas.controler;
import javax.persistence.Persistence;

/**
 * Classe para a criação e atualização das tabelas no banco de dados por meio da EntityManangerFactory 
 * */
public class CriarTabelas {
	
	public static void main (String[] args) {
		Persistence.createEntityManagerFactory("comandasGoCore");
	}
}
