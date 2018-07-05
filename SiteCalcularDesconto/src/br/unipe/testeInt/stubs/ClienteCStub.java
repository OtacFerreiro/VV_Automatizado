package br.unipe.testeInt.stubs;

import br.unipe.testeInt.model.Cliente;

public class ClienteCStub implements Cliente {

	@Override
	public String getTipoCliente() {
		return "C";
	}

}
