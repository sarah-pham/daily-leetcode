import java.util.TreeSet;

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */

class BookedInterval implements Comparable<BookedInterval> {
    int start;
    int count = 0;

    public BookedInterval(int start) {
        this.start = start;
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
        t.add(new BookedInterval(0));
        t.add(new BookedInterval(Integer.MAX_VALUE));
    }

    public boolean book(int start, int end) {
        BookedInterval startObj = new BookedInterval(start);
        BookedInterval endObj = new BookedInterval(end);

        for (BookedInterval i : t.subSet(startObj, endObj)) {
            if (i.count == 2) {
                return false;
            }
        }
        BookedInterval startFloor = t.floor(startObj);
        if (startFloor.count == 2) {
            return false;
        }
        if (startFloor.start != start) {
            startObj.count = startFloor.count;
            t.add(startObj);
        }
        BookedInterval endFloor = t.floor(endObj);
        if (endFloor.start != end) {
            endObj.count = endFloor.count;
            t.add(endObj);
        }

        for (BookedInterval i : t.subSet(startObj, endObj)) {
            i.count++;
        }

        return true;
    }
}
