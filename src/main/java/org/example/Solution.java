package org.example;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        char before = ' ';
        for(char c : s.toCharArray()) {
            char newC =
                    before == ' '
                            ? Character.toUpperCase(c)
                            : Character.toLowerCase(c);

            answer.append(newC);
            before = c;
        }
        return answer.toString();
    }
}