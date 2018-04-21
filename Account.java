import java.io.*;

class Account{

int acc_No;
String name;
double balance;

static int getIntegerValue()
{
return 5;
}
void  getData(int a, String str, double val)
{
acc_No = a;
name = str;
balance= val;
}

void putData(){

System.out.println("Account no : "+ acc_No);
System.out.println("Account holder name: "+name);
System.out.println("current balance :: "+ balance);
}

public static void main(String args[])
{
Account acc  = new Account();
acc.getData(01234, "Sandeeo Wakchaure", 23000000);
acc.putData();
  }
}