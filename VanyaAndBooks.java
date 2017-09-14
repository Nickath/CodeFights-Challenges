int VanyaAndBook1s(int n) {

    int digits =0;
    int x = Integer.toString(n).length();
    int c=0;
    for(int i=1; i<x; i++)
    {
        digits += 9*(i)*Math.pow(10,c);
        c++;
    }
    int s=1;
    for(int i=1; i<x;i++)
    {
        s*=10;
    }
    for(int i=s; i<=n; i++)
    {
        digits += Integer.toString(i).length();
    }
    
    System.out.println(s);
    
    return digits;
}


/* shorter solution

    int VanyaAndBook1s(int n) {

        int d =0,s=1,i=1,x = Integer.toString(n).length();
        
        for(; i<x; i++)
        {
            d += 9*i*Math.pow(10,i-1);
            s*=10;
        }
      
       
      for(i=s; i<=n; i++)
        d += Integer.toString(i).length();


     
        
        return d;
    }
*/