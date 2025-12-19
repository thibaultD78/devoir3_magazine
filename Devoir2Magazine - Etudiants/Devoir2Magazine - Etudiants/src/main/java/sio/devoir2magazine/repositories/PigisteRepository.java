package sio.devoir2magazine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sio.devoir2magazine.entities.Article;
import sio.devoir2magazine.entities.Pigiste;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface PigisteRepository extends JpaRepository<Pigiste,Integer>
{
    List<Pigiste> findAllByArticles(Set<Article> articles);
}
