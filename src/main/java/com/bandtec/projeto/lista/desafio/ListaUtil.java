package com.bandtec.projeto.lista.desafio;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        this.inteiros = new ArrayList<>();
    }

    public Integer count() {
        return this.inteiros.size();
    }

    public void add(Integer value) {
        if (value != null) {
            this.inteiros.add(value);
        }
    }

    public void remove(Integer value) {
        if(Objects.nonNull(null)) {
            this.inteiros.remove(value);
        }
    }

    public Integer countPares() {
        return null;
    }

    public Integer countImpares() {
        return null;
    }

    public Integer somar() {
        return null;
    }

    public Integer getMaior() {
        return null;
    }

    public Integer getMenor() {
        Integer min = Integer.MAX_VALUE;
        for (Integer integer : inteiros) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;
    }

    public Boolean hasDuplicidade() {
        return null;
    }
}
