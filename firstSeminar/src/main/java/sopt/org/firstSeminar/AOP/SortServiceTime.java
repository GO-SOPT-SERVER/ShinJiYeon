package sopt.org.firstSeminar.AOP;

public class SortServiceTime implements SortService {
    private SortService sortService;

    public SortServiceTime(final SortService sortService) {
        this.sortService = sortService;
    }

    @Override
    public void sort() {
        long start = System.currentTimeMillis();
        sortService.sort();
        long end = System.currentTimeMillis();
        System.out.printf("실행시간: %d", (end-start));
    }
}
