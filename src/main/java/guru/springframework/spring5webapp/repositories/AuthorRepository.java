package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jacek.maszota on 2017-11-29.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
