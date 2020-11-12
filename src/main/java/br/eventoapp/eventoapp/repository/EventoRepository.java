package br.eventoapp.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.eventoapp.eventoapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
    Evento findByCodigo(long codigo);
}
