import java.io.*;
import java.util.Scanner;

public class votingsystem
{
public static void main(String args[])
{
Voting h1=new Voting();
h1.registration();
h1.vote();
h1.couting();
}
}



class Voting
{
    int age[];
    int u,x,y,z;
    int p;
 		int k[]=new int[4];    
void registration()
{
Scanner h=new Scanner(System.in);
System.out.println("enter the population");
p=h.nextInt();
String e[]=new String[p+1];
int m;
System.out.println("enter the name of the person");
for(m=0;m<e.length;m++)
e[m]=h.nextLine();

String a[]=new String[p];
int o;
System.out.println("enter the address of the person");
for(o=0;o<a.length;o++)
a[o]=h.nextLine();

age=new int[p];

System.out.println("enter the age of the person");

for(int n=0;n<age.length;n++)
age[n]=h.nextInt();


}

void vote()
{
Scanner s=new Scanner(System.in);
int i;
	for(i=0;i<p;i++)
	{
	if(age[i]>=18)
	{
System.out.println("***************");
System.out.println("****WELCOME TO VOTING****");
System.out.println("1.NAVYA");
System.out.println("2.GAYATHRI");
System.out.println("3.HRUSHIKESH");
System.out.println("4.KRISHNA");
System.out.println("******* VOTE TO ANYONE ********");
int w; // w is used to know who is elected
w=s.nextInt();






	switch(w)
	{
	case 1:
	x++;
	break;

	case 2:
	y++;
	break;

	case 3:
	z++;
	break;

	case 4:
	u++;
	break;
	default:
	System.out.println("***YOUR VOTE IS NOT VAILD***");
	

	}


}

else
System.out.println("you are not elligble to vote");

}

}

void couting() {
k[0]=x;
k[1]=y;
k[2]=z;
k[3]=u;

for(int w=0;w<4;w++) {
for(int i=0;i<3;i++) {
if(k[i]>k[i+1]) {
int temp;
temp=k[i];
k[i]=k[i+1];
k[i+1]=temp;}
}
}

if(k[3]==k[2]&&k[3]==k[1]&&k[3]==k[0]) 
System.out.println("reconduct"); 
	
else if(k[3]==k[2]&&k[3]==k[1]) 
	System.out.println("reconduct");
 
else if(k[3]==k[2])
		System.out.println("reconduct");
		
else {
	if(x>y&&x>z&&x>u) //xyzu xy xz xu 
	System.out.println("NAVYA IS ELECTED");
	else if(y>z&&y>u) 
	System.out.println("GAYATHRI IS ELECTED");
	else if(z>u)
	System.out.println("HRUSHIKESH IS ELECTED");
    else 
    System.out.println("KRISHNA IS ELECTED");
 
 } 
   System.out.println("**************");
   System.out.println("**************");
   System.out.println("**************");
System.out.println("navya got "+x);
System.out.println("gayathri got "+y);
System.out.println("hrushikesyh got"+z);
System.out.println("krishna got "+u);
   System.out.println("**************");
   System.out.println("**************");
   System.out.println("**************");
}}
