package $

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AppShould {

    @Test
    void add_two_numbers_with_hamcrest() {
        assertThat(1 + 1, is(equalTo(2)));
    }
}