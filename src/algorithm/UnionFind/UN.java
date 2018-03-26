package algorithm.UnionFind;

public class UN {
    private int[] id;
    private int[] sz;
    private int count;
    public UN(int N) {
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0 ; i < N ; i++) {
            id[i] = i;
        }
        for (int i = 0; i < N ;i++) {
            sz[i] = 1;
        }
    }
    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p)== find(q);
    }

    private int find(int x) {
        while (x != id[x]) {
            id[x] = id[id[x]];
            x = id[x];
        }
        return x;
    }

    public void Union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) {
            return;
        }
        if (sz[pId] < sz[qId]) {
            id[pId] = qId;
            sz[qId] += sz[pId];
        }else {
            id[qId] = pId;
            sz[pId] += sz[qId];
        }
        count--;
    }


    public static void main(String[] args) {
        UN un = new UN(10);

        System.out.println(un.find(5));
        System.out.println(un.connected(1, 5));
        un.Union(1, 5);
        un.Union(1, 2);
        un.Union(1, 3);
        un.Union(1, 4);
        System.out.println(un.connected(1, 5));
        System.out.println(un.find(1));
        System.out.println(un.count);


    }


}
