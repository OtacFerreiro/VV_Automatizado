package br.unipe.testeInt.stubs;

import br.unipe.testeInt.model.Cliente;

public class ClienteBStub implements Cliente {

	@Override
	public String getTipoCliente() {
		return "B";
	}

}
