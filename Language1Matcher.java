public class Language1Matcher extends RegularExpressionMatcher {
    public Language1Matcher() {
        // TODO
        setRegularExpressionString("(\\Qc(a+b)\\E)|a\\Q+\\Eb|(\\Q(a+b)\\E\\Q(a+b)\\E(\\Q(a+b)\\E)*)");
    }
}

