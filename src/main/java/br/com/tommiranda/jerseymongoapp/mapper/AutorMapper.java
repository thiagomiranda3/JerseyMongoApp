package br.com.tommiranda.jerseymongoapp.mapper;

import br.com.tommiranda.jerseymongoapp.domain.Autor;
import br.com.tommiranda.jerseymongoapp.dtos.AutorDto;
import org.bson.Document;

public final class AutorMapper {

    private AutorMapper() {
    }

    public static Document toDocument(final Autor autor) {
        return new Document("nome", autor.getNome())
                .append("email", autor.getEmail());
    }

    public static Autor toAutor(final Document document) {
        String nome = document.get("nome", String.class);
        String email = document.get("email", String.class);

        return new Autor(nome, email);
    }

    public static Autor toAutor(final AutorDto autorView) {
        return new Autor(autorView.nome, autorView.email);
    }

    public static AutorDto toAutorDto(final Autor autor) {
        return new AutorDto(autor.getNome(), autor.getEmail());
    }
}
