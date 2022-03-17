package recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    void factorial() {
        //given
        int n = 5;

        //when
        int result = Main.factorial(n);

        //then
        assertThat(result).isEqualTo(120);
    }

    @Test
    void gcd() {
        //given
        int n = 9;
        int m = 72;

        //when
        int result = Main.gcd(m, n);

        //then
        assertThat(result).isEqualTo(9);
    }

    @Test
    void lcm() {
        //given
        int n = 9;
        int m = 72;

        //when
        int result = Main.lcm(m, n);

        //then
        assertThat(result).isEqualTo(72);
    }

    @Test
    void towersOfHanoi() {
        Main.towersOfHanoi(4, 1, 2,3);
    }
}