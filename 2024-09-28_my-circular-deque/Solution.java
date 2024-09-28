import java.util.TreeSet;

class BookedInterval implements Comparable<BookedInterval> {
    int start;
    int count;

    public BookedInterval(int start) {
        this.start = start;
        this.count = 1;
    }

    public BookedInterval(int start, int count) {
        this.start = start;
        this.count = count;
    }

    @Override
    public int compareTo(BookedInterval o) {
        return this.start - o.start; // Sort by start time
    }
}

class MyCalendarTwo {
    TreeSet<BookedInterval> t;

    public MyCalendarTwo() {
        t = new TreeSet<>((a, b) -> Integer.compare(a.start, b.start));
        t.add(new BookedInterval(0, 0));
        t.add(new BookedInterval(Integer.MAX_VALUE, 0));
    }

    public boolean book(int start, int end) {

        // Look for intervals between start and end

        // If any have count 2, return false

        // Otherwise, add 1 to each interval count
        // Split interval at start and end if necessary

        BookedInterval b = new BookedInterval(start);



        if (t.floor(b).count == 2) {
            return false;
        }


        for ( : t.subSet(b, b))





        BookedInterval l = t.floor(new BookedInterval(start));
        if (l.start < start) {
            t.add(new BookedInterval(start));

            // Handle the case where an interval with the same start time already exists
            // For example, you might want to increment the count or handle overlaps
        }

        // Add logic to handle booking

        return true; // Placeholder return statement
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */
