package pl.majewski;

import java.util.*;
import java.util.stream.Collectors;

public class AutoComplete {
    private final TreeSet<String> dictionary;

    public AutoComplete() {
        this.dictionary = new TreeSet<>();
    }

    public AutoComplete(String[] dictionary) {
        this.dictionary = new TreeSet<>();
        this.addToDictionary(dictionary);
    }

    public void addToDictionary(String[] words) {
        Collections.addAll(this.dictionary, words);
    }

    public SortedSet<String> autoComplete(String query) {
        return dictionary.tailSet(query).stream()
                .takeWhile(word -> word.startsWith(query))
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
