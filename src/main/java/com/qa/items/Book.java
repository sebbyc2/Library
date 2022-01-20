package com.qa.items;

import com.qa.Interfaces.PaperBased;

public class Book extends LibraryItem implements PaperBased {

    public Book(String name, int fee) {
        super(name, fee);
    }

    @Override
    public String annotate(String annotation) {
        return null;
    }

    @Override
    public String photoCopy() {
        return null;
    }

    @Override
    public void throwIt() {
    }
}
