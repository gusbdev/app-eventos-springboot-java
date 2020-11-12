package br.eventoapp.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.eventoapp.eventoapp.models.Convidado;
import br.eventoapp.eventoapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByRg(String rg);
}
