/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad1;


public class Main {
  public static void main(String[] args) {
	  
	 if (args.length != 2) syntax();
	 	   
	 String txt = args[0];
	 String subtxt = args[1];

      StringUtil stringUtil = new StringUtil(txt, subtxt);

      System.out.println("1) " + stringUtil.getLength());
      System.out.println("2) " + stringUtil.getFirstAndLastLetter());
      System.out.println("3) " + stringUtil.substringFromFourthLetter());
      System.out.println("4) " + stringUtil.substringFromFourthLetterToLastButOne());
      System.out.println("5) " + stringUtil.howManyTimesSubtxtInTxt());
      System.out.println("6) " + stringUtil.getWords());
      System.out.println("7) " + stringUtil.ifFirstAndLastWordTheSame());
  }
  
  static void syntax() {
	   System.out.println("*** ");
	   System.exit(1);                     
	 }
}
