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
        if(!Objects.nonNull(null)) {
            this.inteiros.remove(value);
        }
    }

    public Integer countPares() {
        Integer pares = 0;
        
        for (Integer i : this.inteiros) {
            if (i % 2 == 0) {
                pares++;
            }
        }

        return pares;
    }

    public Integer countImpares() {
        Integer impares = 0;
        
        for (Integer i : this.inteiros) {
            if (i % 2 != 0) {
                impares++;
            }
        }

        return impares;
    }

    public Integer somar() {
        Integer soma = 0;

        for (Integer i : this.inteiros) {
            soma += i;
        }

        return soma;
    }

    public Integer getMaior() {
        Integer max;

        if (this.inteiros.size() == 0) {
            return 0;
        } else {
            max = Integer.MIN_VALUE;

            for (Integer i : this.inteiros) {
                if (i > max) {
                    max = i;
                }
            }
    
            return max;
        }

    }

    public Integer getMenor() {

        if (this.inteiros.size() == 0) {
            return 0;
        } else {
            Integer min = Integer.MAX_VALUE;

            for (Integer i : this.inteiros) {
                if (i < min) {
                    min = i;
                }
            }

            return min;
        }

    }

    public Boolean hasDuplicidade() {
        
        Boolean has = false;

        for (Integer i = 0; i < this.inteiros.size(); i++) {
            for (Integer j = 0; j < this.inteiros.size(); j++) {
                if (i != j && this.inteiros.get(i) == this.inteiros.get(j)) {
                    has = true;
                }
            }
        }

        return has;
    }
}
