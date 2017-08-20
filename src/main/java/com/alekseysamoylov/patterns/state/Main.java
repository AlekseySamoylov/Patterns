package com.alekseysamoylov.patterns.state;

import java.util.Arrays;

/**
 * Created by alekseysamoylov on 7/8/17.
 */
public class Main {

    public static void main(String[] a) {
        System.out.println(Arrays.asList('w', 'o', 'l', 'f').stream().unordered().parallel()
                .reduce("", (c, s1) -> c + s1, (s2, s3) -> s2 + s3));
    }
}
