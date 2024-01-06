package exceptionHandling.initAndClinit;

public class ClInitCheck {
static  int a = 10/0;
/**
 * All that static data ( static variable ) which is written in class level
 * is automatically copied inside the < clinit > method
 * clinit method is a method which is generated by the compiler at compile time
 * each and every code in java is written inside a method
 * just like static int a = 10/0
 * here this `a` is not declared in any method it means it is indirectly
 * written inside the < clinit > method
 * because at compile time all the static declaration and object created are  copied in
 * same location which is known as < clinit > method
 */
}