package pl.wsiiz.patientservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.*;
import java.util.function.Function;

public abstract class BaseController<E> {

    private final String LIST_VIEW = "listPage";
    protected final Map<String, Function<E, String>> functionsMap = new HashMap<>();

    @GetMapping
    public String page() {
        return LIST_VIEW;
    }

    @ModelAttribute("list")
    public abstract List<List<String>> list();

    @ModelAttribute("fields")
    public List<String> fields() {
        return new ArrayList<>(functionsMap.keySet());
    }

    protected List<List<String>> convertForListing(List<E> list, Map<String, Function<E, String>> functions) {
        List<List<String>> result = new ArrayList<>();
        for (E item : list) {
            List<String> values = new ArrayList<>();
            functions.forEach((key, value) -> values.add(value.apply(item)));
            result.add(values);
        }
        return result;
    }
}
