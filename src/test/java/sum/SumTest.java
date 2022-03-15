package sum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumTest {
    @Test
    void sum() {
        //given
        int even = 10;
        int odd = 11;

        //when
        int evenSum = Main.sum(even);
        int oddSum = Main.sum(odd);

        //then
        assertThat(evenSum).isEqualTo(55);
        assertThat(oddSum).isEqualTo(66);
    }

    @Test
    void sumOfGauss() {
        //given
        int even = 10;
        int odd = 11;

        //when
        int evenSum = Main.sumOfGauss(even);
        int oddSum = Main.sumOfGauss(odd);

        //then
        assertThat(evenSum).isEqualTo(55);
        assertThat(oddSum).isEqualTo(66);
    }
}