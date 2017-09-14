String[] missingPermutations(String[] permutationList) {

    ArrayList<String> arr = new ArrayList<>();
    
    for(int i=0; i<permutationList.length; i++)
    {
        arr.add(permutationList[i]);
    }

     ArrayList<String>    arr2 =    permutation(permutationList[0],arr);
        String[] a = new String[arr2.size()];
        for(int i=0; i<a.length; i++)
        {
            a[i] = arr2.get(i);
        }
          Arrays.sort(a);
        return a;
}

 ArrayList<String> permutation(String str,ArrayList<String> arr) { 
     ArrayList<String> arr2 = new ArrayList<>();
   return permutation("", str,arr,arr2); 
}

 ArrayList<String> permutation(String prefix, String str , ArrayList<String> arr,ArrayList<String> arr2) {
    int n = str.length();
    if (n == 0 && !arr.contains(prefix)) 
    {
        System.out.println(prefix);
     arr2.add(prefix);  
    // return prefix;
    }
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),arr,arr2);
    }
     return arr2;
}