public String removeAll(String phrase, String ch) {
    if (ch == null || ch.length() != 1) {
        return phrase;
    }

    int index = phrase.indexOf(ch);

    while (index != -1) {
        phrase = phrase.substring(0, index) + phrase.substring(index + 1);
        index = phrase.indexOf(ch);
    }

    return phrase;
}