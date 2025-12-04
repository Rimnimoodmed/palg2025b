package palg.Cviko10;


import palg.Messages.Message;

public class InsertionSorter extends Sorter
{
    @Override
    public void sort(Message[] messages)
    {
        for (int i = 0; i < messages.length; i++) {
            int p = i;
            while (p>=1 && messages[p].compareTo(messages[p-1])<0) { 
                swap(messages, p, p-1);
                p--;
            }
        }
    }
}
