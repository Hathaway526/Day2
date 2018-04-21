package test2;

public class IndexArray {

	public void array(int a[], int b[], int c[]) {
		int lenA = a.length, lenB = b.length;
		int m = 0, n = 0, x = 0;

		while (m < lenA && n < lenB) {
			if (a[m] < b[n]) {
				c[x] = a[m];
				m++;
			} else {
				c[x] = b[n];
				n++;
			}
			x++;
		}

		while (m < lenA) {
			c[x] = a[m];
			x++;
			m++;
		}

		while (n < lenB) {
			c[x] = b[n];
			x++;
			n++;
		}

	}

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7, 9 }, b[] = { 2, 4, 6, 8 };
		int x = a.length + b.length;
		int c[] = new int[x];
		IndexArray indexArray = new IndexArray();
		indexArray.array(a, b, c);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}
}
