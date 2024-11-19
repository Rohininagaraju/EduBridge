import java.util.Scanner;
class CharacterCheck
{
public static void main(String args[])
{
System.out.println("Enter a charcter");
Scanner sc=new Scanner(System.in);
char name=sc.next().charAt(0);
switch(name)
{
case 'R' :case 'r' :case 'o' : case 'O':case 'H' :case 'h' :case 'I' :case 'i' :
case 'N' :case 'n' :
System.out.println("Present");
break;
default : System.out.println("Not Present");
break;
 }
}}