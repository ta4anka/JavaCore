package net.proselyte.javacore.Coursera;

class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public boolean connected(int p, int q)
    { return id[p] == id[q]; }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for(int i = 0; i < id.length; i++)
            if (id[i] == pid)
                id[i] = qid; // id[i] == id[p]==>it's a big mistake!
    }

  /*  Union is too expensive. It takes N^2 array accesses to process a sequence of
    N union commands on N objects.*/
}

public class QuickFindUFTest {
    public static void main(String[] args) {
        QuickFindUF qf = new QuickFindUF(5);

        System.out.println(qf.connected(2,3)); // false
        qf.union(2,3);
        System.out.println(qf.connected(2,3)); // true

    }
}
