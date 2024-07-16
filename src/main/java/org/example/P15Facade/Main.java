package org.example.P15Facade;

import org.example.P15Facade.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage(
                "hyuki@hyuki.com",
                "/Users/yson/code/DesignMethod/src/main/java/org/example/P15Facade/welcome.html"
        );
    }
}
