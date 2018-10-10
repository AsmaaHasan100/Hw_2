import java.util.Comparator;

public class ThreeWayQuick{

public static void sort(Comparable[] a)

{

StdRandom.shuffle(a);

sort(a, 0, a.length - 1);

}

public static void sort(Object[] a, Comparator c)

{

StdRandom.shuffle(a);

sort(a, 0, a.length - 1, c);

}

public static void sort(Comparable[] a, int lo, int hi)

{

if (hi <= lo) return;

// partition

int i = lo;

int lt = lo;

int gt = hi;

while (i <= gt){

if (less(a[i], a[lt])) exch(a, i++, lt++);

else if (less(a[lt], a[i])) exch(a, i, gt--);

else i++;

}

sort(a, lo, lt - 1);

sort(a, gt + 1, hi);

}

public static void sort(Object[] a, int lo, int hi, Comparator c)

{

if (hi <= lo) return;

// partition

int i = lo;

int lt = lo;

int gt = hi;

while (i <= gt){

if (less(a[i], a[lt], c)) exch(a, i++, lt++);

else if (less(a[lt], a[i], c)) exch(a, i, gt--);

else i++;

}

sort(a, lo, lt - 1, c);

sort(a, gt + 1, hi, c);

}

// test client

public static void main(String[] args)

{

String[] arraypart = { "T", "H", "R", "E", "E",

"W", "A", "Y",

"Q", "U", "I", "C", "K",

"S", "O", "R", "T",

"E", "X", "A", "M", "P", "L", "E"};

String[] arraysort = new String[arraypart.length];

System.arraycopy(arraypart, 0, arraysort, 0, arraypart.length);

System.out.print("Original:\t");

for (String str : arraypart)

System.out.print(str);

System.out.println();

System.out.print("Full sort:\t");

ThreeWayQuick.sort(arraysort);

for (String str : arraysort)

System.out.print(str);

System.out.println();

}

// private

private static void exch(Comparable[] a, int i, int j)

{

Comparable tmp = a[i];

a[i] = a[j];

a[j] = tmp;

}

private static void exch(Object[] a, int i, int j)

{

Object tmp = a[i];

a[i] = a[j];

a[j] = tmp;

}

private static boolean less(Comparable a, Comparable b)

{ return a.compareTo(b) < 0; }

private static boolean less(Object a, Object b, Comparator c)

{ return c.compare(a, b) < 0; }

}