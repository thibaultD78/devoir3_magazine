package sio.devoir2magazine.services;

import org.springframework.stereotype.Service;
import sio.devoir2magazine.entities.Magazine;
import sio.devoir2magazine.repositories.MagazineRepository;

import java.util.List;

@Service
public class MagazineService
{
    private MagazineRepository magazineRepository;

    public MagazineService(MagazineRepository magazineRepository) {
        this.magazineRepository = magazineRepository;
    }
    public List<Magazine> getAllMagazines(){
        return magazineRepository.findAll();
    }
}
