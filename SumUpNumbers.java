/*
Find the sum of all integers that occur in the string.

Example

For inputString = "2 apples, 12 oranges", the output should be
sumUpNumbers(inputString) = 14.
*/
int sumUpNumbers(String inputString) {
Pattern p = Pattern.compile("-?\\d+");
Matcher m = p.matcher(inputString);
    int sum=0;
while (m.find()) {
    sum+= Integer.parseInt(m.group());
  System.out.println(m.group());
}
    return sum;
}
