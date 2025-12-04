package palg.Cviko10;

import palg.Messages.Message;

public class HeapSorter extends Sorter
{
    public void sort(Message[] messages)
    {
        palg.Cviko09.Heap heap = new palg.Cviko09.Heap(messages.length);

        for (Message message : messages) {
            heap.add(message);
        }
        for (int i = 0; i < messages.length; i++) {
            messages[i] = heap.extractMin();
        }
    }
}
