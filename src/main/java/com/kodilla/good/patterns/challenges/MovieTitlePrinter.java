package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieTitlePrinter {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String titles = movieStore.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(titles);
    }
}