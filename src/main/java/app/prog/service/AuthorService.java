package app.prog.service;


import app.prog.model.AuthorsEntity;
import app.prog.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthorService {
    private final AuthorRepository AuthorRepository;

    public List<AuthorsEntity> getAuthors() {return  AuthorRepository.findAll();}

}
