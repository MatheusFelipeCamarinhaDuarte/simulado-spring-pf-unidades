package br.com.fiap.simuladospringpfunidades.resource;

import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

public interface ResourceDTO<Request, Response> {

    Response findById(Long id);

    ResponseEntity<Response> save(Request r);

}
