package org.example;

/**
 * Test class.
 */
public class TestClass {

    /**
     * Test documentations.
     *
     * @return response
     */
    public int createResponse() {
        var test = 1 + 1;
        var ololo = "";

        return test;
    }

    /**
     * Еще немного документации на русском.
     *
     * @param args аргументы
     */
    public static void main(String[] args) {
        var response = new TestClass().createResponse();
        System.out.println(response);
    }
}
