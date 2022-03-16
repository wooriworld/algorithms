package digit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void isPrime1() {
        assertThat(Main.isPrime1(80)).isFalse();
        assertThat(Main.isPrime1(79)).isTrue();
    }

    @Test
    void isPrime2() {
        assertThat(Main.isPrime2(80)).isFalse();
        assertThat(Main.isPrime2(79)).isTrue();
    }

    @Test
    void isPrime3() {
        assertThat(Main.isPrime3(80)).isFalse();
        assertThat(Main.isPrime3(79)).isTrue();
    }
}