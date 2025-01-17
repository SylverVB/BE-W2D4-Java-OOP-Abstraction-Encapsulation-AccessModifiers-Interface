// Access modifiers are simply keywords in Java that provide accessibility of a class and its member. They set the access level to methods, variable, classes and constructors.

// There are 4 types of access modifiers available in Java. In order of most accessible to least accessible they are:

//     • public: The member with public modifiers can be accessed by any classes. The public methods, variables or class have the widest scope.
//     • protected: The protected modifier is used within same package. It lies between public and default access modifier. It can be accessed outside the package but through inheritance only.
//     • default: When we do not mention any access modifier, it is treated as default. It is accessible only within same package.
//     • private: The private methods, variables and constructor are not accessible to any other class. It is the most restrictive access modifier. Classes cannot be private unless the class is a nested class.


// A real-world example of using access modifiers can be found in a banking application. Consider a scenario where you have different types of bank accounts, such as savings accounts and checking accounts, each with specific rules and restrictions regarding access to account information and operations.

// In this scenario, access modifiers can be used to control the visibility and accessibility of various class members (fields and methods) within the bank account classes. Here's how access modifiers can be applied in this context:
// Private Access Modifier:

// The balance field in the bank account class could be marked as private. This ensures that the balance of an account can only be accessed and modified internally within the class itself. Other classes or external code cannot directly access or modify the balance field, preventing unauthorized changes to account balances.
// Protected Access Modifier:

// The interestRate field in a savings account class could be marked as protected. This allows subclasses (e.g., different types of savings accounts) to access and modify the interest rate field, while restricting access to other classes outside of the inheritance hierarchy. Subclasses can override methods or define additional behavior based on the protected members inherited from the superclass.
// Public Access Modifier:

// Getter and setter methods for accessing and modifying account balances (getBalance() and setBalance()) could be marked as public. This allows external classes or modules, such as the banking system's user interface or transaction processing module, to retrieve and update account balances as needed. Public methods provide a well-defined interface for interacting with the account class, while hiding the internal implementation details. Similarly, methods for depositing (deposit()) and withdrawing (withdraw()) funds from an account could be marked as public. This allows clients of the account class to perform transactions securely and efficiently, while encapsulating the transaction logic within the account class itself.

// By using access modifiers appropriately, the banking application ensures that sensitive data and critical operations are protected from unauthorized access or modification, while providing a well-defined interface for interacting with account objects. This promotes security, encapsulation, and maintainability in the application's design, aligning with best practices in object-oriented programming.


// private

// The private access modifier is accessible only within the class.

// In this example, we have created two classes A and Simple. The A class contains a private data member and a private method. We are accessing these private members from outside the class, so there is a compile-time error.

class A{  
private int data=40;  
private void msg(){System.out.println("Hello java");}  
}  
  
public class Simple{  
 public static void main(String args[]){  
   A obj=new A();  
   System.out.println(obj.data);//Compile Time Error  
   obj.msg();//Compile Time Error  
   }  
}  

// Role of Private Constructor

// If you make any class constructor private, you cannot create the instance of that class from outside the class. For example:

class A{  
private A(){}//private constructor  
void msg(){System.out.println("Hello java");}  
}  
public class Simple{  
 public static void main(String args[]){  
   A obj=new A();//Compile Time Error  
 }  
}  

// default

// If you don't use any modifier, it is treated as having default access. Default classes or class members are accessible only within package. They cannot be accessed from outside the package. It provides more accessibility than private. But, it is more restrictive than protected, and public.

// In this example, we have created two packages pack and mypack. We are accessing the A class from outside its package, since the A class is not public, so it cannot be accessed from outside the package.

//save by A.java  
package pack;  
class A{  
  void msg(){System.out.println("Hello");}  
}  
//save by B.java  
package mypack;  
import pack.*;  
class B{  
  public static void main(String args[]){  
   A obj = new A();//Compile Time Error  
   obj.msg();//Compile Time Error  
  }  
}  

// In the above example, the scope of class A and its method msg() is default so it cannot be accessed from outside the package.

// protected

// The protected access modifier is accessible within package and outside the package but through inheritance only.

// The protected access modifier can be applied on the data member, method and constructor. It can't be applied on the class.

// It provides more accessibility than the default modifer.

// In this example, we have created the two packages pack and mypack. The A class of pack package is public, so can be accessed from outside the package. But msg method of this package is declared as protected, so it can be accessed from outside the class only through inheritance.

//save by A.java  
package pack;  
public class A{  
protected void msg(){System.out.println("Hello");}  
}  
//save by B.java  
package mypack;  
import pack.*;  
  
class B extends A{  
  public static void main(String args[]){  
   B obj = new B();  
   obj.msg();  
  }  
}  

// public

// The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.

// Example of public access modifier

//save by A.java  
  
package pack;  
public class A{  
public void msg(){System.out.println("Hello");}  
}  
//save by B.java  
  
package mypack;  
import pack.*;  
  
class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}