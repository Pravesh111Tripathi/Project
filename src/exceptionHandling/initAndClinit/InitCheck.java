package exceptionHandling.initAndClinit;

public class InitCheck {
    int a = 10/0;
/**
 * All that instance (non-static) data which is written in class level
 * is automatically copied inside the <init> method
 * init method is a method which is generated by the compiler at compile time
 * all that code which is written inside the constructor is automatically
 * copied in < init > method
 * each and every code in java is written inside a method
 * just like int a = 10/0
 * here this `a` is not declared in any method it means it is indirectly
 * written inside the constructor
 * because at compile time this code and constructors code both are copied in
 * same location which is known as < init > method
 */
}
