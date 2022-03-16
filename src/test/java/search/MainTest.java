package search;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    void lineaSearch() {
        //given
        int[] a = {1, 2, 3, 4, 5};
        int existentKey = 5;
        int nonExistentKey = 6;

        //when
        int existentIndex = Main.linearSearch(a, existentKey);
        int nonExistentIndex = Main.linearSearch(a, nonExistentKey);

        //then
        assertThat(existentIndex).isEqualTo(4);
        assertThat(nonExistentIndex).isEqualTo(-1);
    }

    @Test
    void binarySearch() {
        //given
        int[] a = {1, 2, 3, 4, 5};
        int existentKey = 5;
        int nonExistentKey = 6;

        //when
        int existentIndex = Main.binarySearch(a, 0, a.length, existentKey);
        int nonExistentIndex = Main.binarySearch(a, 0, a.length, nonExistentKey);

        //then
        assertThat(existentIndex).isEqualTo(4);
        assertThat(nonExistentIndex).isEqualTo(-1);

        assertThat(Arrays.binarySearch(a, 0, a.length, existentKey)).isEqualTo(4);
        assertThat(Arrays.binarySearch(a, 0, a.length, nonExistentKey)).isEqualTo(-6);
    }
}