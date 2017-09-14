long swapPairBits(long k, int p1, int p2) {

    if(k==1)
    {
        return 1;
    }
    String x = Long.toBinaryString(k);
    System.out.println(x);
    
    int length = x.length()-p1;
    
    String sun ="";
    for(int i=0; i<length; i++)
    {
        sun+="0";
    }
    x = sun +""+x;
    System.out.println(x);
    char[] c = x.toCharArray();

// Replace with a "swap" function, if desired:
char temp = c[c.length-p1];
c[c.length-p1] = c[c.length-p2];
 c[c.length-p2] = temp;

String swappedString = new String(c);
    
    System.out.println(swappedString);
    return k;
}
