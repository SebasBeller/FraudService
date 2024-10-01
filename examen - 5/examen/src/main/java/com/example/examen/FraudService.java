package com.example.examen;

import java.util.ArrayList;
import java.util.List;

public class FraudService {

    private static final List<String> blacklistedCards = new ArrayList<>();

    static {
        blacklistedCards.add("4111111111111111");
        blacklistedCards.add("5111111111111111");

    }
    public boolean isBlacklisted(String card) {
        return blacklistedCards.contains(card);
    }

    }
