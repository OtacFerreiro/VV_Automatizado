package br.unipe.testeInt.stubs;

import br.unipe.testeInt.model.Cliente;

public class ClienteAStub implements Cliente {

	@Override
	public String getTipoCliente() {
		return "A";
	}

}
