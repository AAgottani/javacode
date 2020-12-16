public class javaclass {
   /* Codingbat
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.*/
   public boolean sleepIn(boolean weekday, boolean vacation) {
    if (weekday!= true ){
      return true;
    }else if(vacation){
      return true;
    }else{
    return false;
    }
  }
  /*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
  A solução do site é mais simples: return(aSmile==bSmile);
  */
  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if(aSmile==true & bSmile==true ){
      return true;
    }else if(aSmile== false & bSmile == false){
      return true;
    }else{
      return false;
    }
  }
  /*Given two int values, return their sum. Unless the two values are the same, then return double their sum.*/
  public int sumDouble(int a, int b) {
  
    int sum= a+b;
    
  if (a==b){
   sum = sum *2;
    
  }
  return sum;
}
/*Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.*/
public int diff21(int n) {
  if (n<21){
    int a = 21-n;
    return a;
  } else{
    int b= (n - 21) *2;
    return b;
  }
}
/*Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.*/
public String notString(String str) {
  if ( str.length() >=3 && str.substring(0,3).equals("not")){
    return str;
  }
  return "not " + str;
}
/*Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.*/

public String front22(String str) {
  if(str.length()>2){
  String a= str.substring(0,2);
  return a+str+a;
  }
    return str+str+str;
  
}

/*Given a string, return true if the string starts with "hi" and false otherwise.*/
public boolean startHi(String str) {
  if (str.length() >1){
  String a = str.substring(0,2);
  String b = "hi";
  return (a.equals(b));}
  else {
    return false;
  }
}
/*Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.*/
public String delDel(String str) {
  String a= "del";
  if(str.length()>=4){
  String b= str.substring(1,4);
  if(a.equals(b)){
   String c= str.substring(0,1);
   String d= str.substring(4, str.length());
   return c+d;
  }}
  return str;
}


}