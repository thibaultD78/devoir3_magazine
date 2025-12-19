package sio.devoir2magazine.services;

import org.springframework.stereotype.Service;
import sio.devoir2magazine.entities.Article;
import sio.devoir2magazine.entities.Magazine;
import sio.devoir2magazine.repositories.ArticleRepository;

import java.util.List;

@Service
public class ArticleService
{
    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
    public List<Article> getAllArticlesByMagazine(Magazine numMag)
    {
        return articleRepository.findAllByNumMag(numMag);
    }
}
