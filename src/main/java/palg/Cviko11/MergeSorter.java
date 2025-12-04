package palg.Cviko11;

import java.util.Arrays;
import palg.Cviko10.Sorter;
import palg.Messages.Message;

public class MergeSorter extends Sorter
{
    public void sort(Message[] sequence)
    {
        sortPart(sequence,0,sequence.length-1);
    }
    private void sortPart(Message[] sequence, int start,int end){
        if (end-start<=1) {
            return;
        }
        int mid = (end+start)/2;
        sortPart(sequence, start, mid);
        sortPart(sequence, mid, end);
        var part1copy = Arrays.copyOfRange(sequence, start, mid);
        var part2copy = Arrays.copyOfRange(sequence, mid, end);
        Utils.merge(part1copy,part2copy,sequence,start);
    }
}
