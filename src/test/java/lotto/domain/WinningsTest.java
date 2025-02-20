package lotto.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class WinningsTest {
    @Test
    void 당첨금의합() {
        Winnings winnings = new Winnings(Arrays.asList(
                Winning.MATCH6,
                Winning.MATCH5_BONUS,
                Winning.MATCH5,
                Winning.MATCH4,
                Winning.MATCH3
        ));
        assertThat(winnings.totalMoney()).isEqualTo(2000000000 + 30000000 + 1500000 + 50000 + 5000);
    }

    @Test
    void 같은_당첨금_횟수세기() {
        Winnings winnings = new Winnings(Arrays.asList(
                Winning.MATCH4,
                Winning.MATCH5,
                Winning.MATCH4,
                Winning.MATCH3
        ));
        assertThat(winnings.countOf(Winning.MATCH4)).isEqualTo(2);
    }
}
