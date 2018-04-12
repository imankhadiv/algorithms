package com.irast.algorithms.sorting;

import java.util.*;

class Range {
    public int start;
    public int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Range)) return false;
        Range range = (Range) o;
        return start == range.start &&
                end == range.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        return "Range{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

public class RangeCombiner {
    public List<Range> combineRangeList(List<Range> rangeList) {
        Comparator<Range> comparator = Comparator.comparingInt(Range::getStart);
        Collections.sort(rangeList, comparator);
        List<Range> combinedList = new ArrayList<>();
        Range previous = rangeList.get(0);
        for(int i = 1 ; i < rangeList.size(); i++){
            Range current = rangeList.get(i);
            if(current.start > previous.end){
                combinedList.add(previous);
                previous = current;
            }else {
                previous = new Range(previous.start, previous.end < current.end ? current.end: previous.end);
            }
        }
        combinedList.add(previous);
        System.out.println(combinedList);
        return combinedList;
    }
}
