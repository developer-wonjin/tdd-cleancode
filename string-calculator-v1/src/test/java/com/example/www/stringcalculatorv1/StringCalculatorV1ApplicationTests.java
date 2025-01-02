package com.example.www.stringcalculatorv1;

import com.example.www.stringcalculatorv1.StringCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
class StringCalculatorV0ApplicationTests {
    /*
     *   "-1,2,3" => 음수라서 runtime예외
     *   "1"을 `,`로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
     */
    @Test
    void 빈문자열_null_입력시_0반환 () {
        // 예외사항은 맨 상단에 구현한다.
        assertThat(StringCalculator.splitAndSum_final("")).isEqualTo(0);
        assertThat(StringCalculator.splitAndSum_final(null)).isEqualTo(0);
    }

    @Test
    void 쉼표_구분자 () {
        assertThat(StringCalculator.splitAndSum_final("1,2")).isEqualTo(3);
        assertThat(StringCalculator.splitAndSum_final("1,2,3")).isEqualTo(6);
    }

    @Test
    void 콜론_구분자 () {
        assertThat(StringCalculator.splitAndSum_final("1:2")).isEqualTo(3);
    }

    @Test
    void 쉽표콜론_구분자 () {
        assertThat(StringCalculator.splitAndSum_final("1,2:3")).isEqualTo(6);
    }

    @Test
    void 커스텀_구분자 () {
        assertThat(StringCalculator.splitAndSum_final("//;\n1;2;3")).isEqualTo(6);
    }

    @Test
    void 음수_기본구분자 () {
        assertThatThrownBy(()-> {
            StringCalculator.splitAndSum_final("-1,2,3");
        }).isInstanceOf(RuntimeException.class);
    }

    @Test
    void 음수_커스텀구분자 () {
        assertThatThrownBy(()-> {
            StringCalculator.splitAndSum_final("//;\n-1;2;3");
        }).isInstanceOf(RuntimeException.class);
    }

}