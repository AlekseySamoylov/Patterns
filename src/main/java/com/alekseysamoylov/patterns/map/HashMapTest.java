package com.alekseysamoylov.patterns.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapTest {

    public static void main(String[] args) {
        Map<Element, String> map = new HashMap<>(3, 1.5f);
        Element element = new Element(1, 1);
        map.put(element, "Hello");
        element.setA(17);
        element.setB(24);
        System.out.println(map.get(element));
        map.put(new Element(12, 22), "no2");
        map.put(new Element(13, 23), "no3");
        map.put(new Element(14, 24), "no4");
        map.put(new Element(15, 24), "no4");
        map.put(new Element(16, 24), "no6");
        map.put(new Element(17, 25), "no7");
        map.put(new Element(18, 25), "no8");
        map.put(new Element(19, 24), "no9");
        System.out.println(map.get(element));
        element.setA(1);
        element.setB(1);
        System.out.println(map.get(element));
    }

    private static class Element {
        private int a;
        private int b;

        public Element(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public Element setA(int a) {
            this.a = a;
            return this;
        }

        public int getB() {
            return b;
        }

        public Element setB(int b) {
            this.b = b;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Element that = (Element) o;
            return a == that.a
                    &&
                    b == that.b;
        }


        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }
}
