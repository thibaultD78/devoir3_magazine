package sio.devoir2magazine.services;

import org.springframework.stereotype.Service;
import sio.devoir2magazine.entities.Article;
import sio.devoir2magazine.entities.Pigiste;
import sio.devoir2magazine.repositories.PigisteRepository;

import java.util.List;

@Service
public class PigisteService
{
    private PigisteRepository pigisteRepository;

    public PigisteService(PigisteRepository pigisteRepository) {
        this.pigisteRepository = pigisteRepository;
    }

//    public List<Pigiste> getAllPigistesByArticle(Article article){
//        return pigisteRepository.findAllByArticles(article);
//    }
}
