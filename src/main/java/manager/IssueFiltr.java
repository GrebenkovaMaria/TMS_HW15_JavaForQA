package manager;

import domain.Issue;

import java.util.function.Predicate;

public class IssueFiltr implements <> {


    @Override
    public Predicate<Issue> and(Predicate<? super Issue> other) {
        return null;
    }

    @Override
    public Predicate<Issue> negate() {
        return null;
    }

    @Override
    public Predicate<Issue> or(Predicate<? super Issue> other) {
        return null;
    }
}
