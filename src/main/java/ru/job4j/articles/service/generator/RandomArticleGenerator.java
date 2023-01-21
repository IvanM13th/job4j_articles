package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RandomArticleGenerator implements ArticleGenerator {
    @Override
    public Article generate(List<Word> words) {
        Collections.shuffle(words);
        String rsl = "";
        StringBuilder builder = new StringBuilder();
        for (var s : words) {
            rsl = builder.append(s.getValue()).append(" ").toString();
        }
        return new Article(rsl);
    }
}
