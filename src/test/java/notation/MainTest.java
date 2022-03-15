package notation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void convertToBinary() {
        //given
        int number = 59;
        int radix = 2;

        //when
        char[] result = Main.convert(number, radix);

        //then
        assertThat(result).isEqualTo(new char[]{'1', '1', '1', '0', '1', '1'});
    }

    @Test
    void convertToOctal() {
        //given
        int number = 59;
        int radix = 8;

        //when
        char[] result = Main.convert(number, radix);

        //then
        assertThat(result).isEqualTo(new char[]{'7', '3'});
    }

    @Test
    void convertToHexadecimal() {
        //given
        int number = 59;
        int radix = 16;

        //when
        char[] result = Main.convert(number, radix);

        //then
        assertThat(result).isEqualTo(new char[]{'3', 'B'});
    }
}