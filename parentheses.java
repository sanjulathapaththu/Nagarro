package solution;
import java.util.Scanner;

public class parentheses {
	
	public static void main(String[] args){
	      
	      int j=0, count=0;
	      char c;
	      char[] stk = new char[20];
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.print("s: ");
	      String expression = sc.nextLine();
	      
	      int length = expression.length();
	      
	      for(int i=0; i<length; i++){
	    	  
	         char ch = expression.charAt(i);
	         
	         if(ch=='(' || ch=='{' || ch=='['){
	            stk[j] = ch;
	            j++;
	            count = 1;
	         }
	         else if(ch==')'){
	            if(count==1)
	               j--;
	              c = stk[j];
	            if(stk.length==0 || c != '('){
	               System.out.println("False");
	               return;
	            }
	         }
	         else if(ch=='}'){
	            if(count==1)
	               j--;
	            c = stk[j];
	            if(stk.length==0 || c != '{'){
	               System.out.println("False");
	               return;
	            }
	         }
	         else if(ch==']'){
	            if(count==1)
	               j--;
	            c = stk[j];
	            if(stk.length==0 || c != '['){
	               System.out.println("False");
	               return;
	            }
	         }
	      }
	      System.out.println("True");
	   }
	}
		
	