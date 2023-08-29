package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    public void assertAnswer(String s, String answer) {
        // when
        String result = solution.solution(s);

        // then
        Assertions.assertEquals(result, answer);
    }

    @Test @DisplayName("Test 1")
    void testcase1() {
        // given
        String s = "3people unFollowed me";
        String answer = "3people Unfollowed Me";

        // when & then
        assertAnswer(s, answer);
    }

    @Test @DisplayName("Test 2")
    void testcase2() {
        // given
        String s = "for the last week";
        String answer = "For The Last Week";

        // when & then
        assertAnswer(s, answer);
    }
}