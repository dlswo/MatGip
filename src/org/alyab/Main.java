package org.alyab;

public class Main {

    public static void main(String[] args) {

        MatGipService service = new MatGipService();
        MatGipUI ui = new MatGipUI(service);

        ui.init();
    }
}