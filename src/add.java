public class add {
    int a;
    int k;
    int n;
    int m;
    public void prostye()
    {
    for (int m = 1; m < a; m++) {
        a = 1000;
        k = 0;
        for (int n = 1; n < m+1; n++) {
            if (m % n == 0) {
                k++;
            }

        }
        if (k == 2) {
            System.out.println(m + " ");
        }
    }}}

