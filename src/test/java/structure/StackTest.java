package structure;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class StackTest {
    @Test
    void stack() {
        Stack<Integer> stack = new MyStack<>(3);
        assertThat(stack.size()).isEqualTo(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertThat(stack.size()).isEqualTo(3);
        stack.push(4);
        assertThat(stack.size()).isEqualTo(3*2);
        stack.pop();
        assertThat(stack.size()).isEqualTo(3);
        stack.pop();
        assertThat(stack.size()).isEqualTo(3);
        stack.push(3);
        assertThat(stack.size()).isEqualTo(3);
        stack.push(4);
        assertThat(stack.size()).isEqualTo(3*2);
        System.out.println(stack);
        assertThat(stack.peek()).isEqualTo(4);
        assertThat(stack.search(4)).isEqualTo(3);
    }
}
