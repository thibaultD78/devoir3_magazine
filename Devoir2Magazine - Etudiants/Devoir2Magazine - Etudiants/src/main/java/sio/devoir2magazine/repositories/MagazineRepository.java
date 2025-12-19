package sio.devoir2magazine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sio.devoir2magazine.entities.Magazine;

import java.util.List;

@Repository
public interface MagazineRepository extends JpaRepository<Magazine, Integer>
{
    @Override
    List<Magazine> findAll();
}
