package com.mycompany.app;

/*import com.mycompany.app.Week2.Week2ClassPractice.book;
import com.mycompany.app.Week2.Week2ClassPractice.recursion;
import com.mycompany.app.Week2.Week2ClassPractice.time;
import com.mycompany.app.Week2.Week2Exercise.AccessControl.AccessControl_EX1;
import com.mycompany.app.Week2.Week2Exercise.AccessControl.AccessControl_EX5;
//import com.mycompany.app.Week2.Week2Exercise.AccessControl.AccessControl_EX6;
import com.mycompany.app.Week2.Week2Exercise.AccessControl.AccessControl_EX7;
import com.mycompany.app.Week2.Week2Exercise.Polymorphism.Polymorphism_EX1;
import com.mycompany.app.Week2.Week2Exercise.Polymorphism.Polymorphism_EX10;
import com.mycompany.app.Week2.Week2Exercise.Polymorphism.Polymorphism_EX5;
import com.mycompany.app.Week2.Week2Exercise.Polymorphism.Polymorphism_EX9;
import com.mycompany.app.Week2.Week2Exercise.ReusingClasses.ReusingClasses_EX1;
import com.mycompany.app.Week2.Week2Exercise.Polymorphism.Polymorphism_EX11.sandwich;
import com.mycompany.app.Week2.Week2Exercise.Polymorphism.Polymorphism_EX13.ReferenceCounting;
import com.mycompany.app.Week2.Week2Exercise.Polymorphism.Polymorphism_EX15.PolyConstructors;*/
import com.mycompany.app.Week3.Week3ClassPractice.DisruptLecture;
import com.mycompany.app.Week3.Week3ClassPractice.GlyphTest;
import com.mycompany.app.Week3.Week3ClassPractice.TestArithmetic;
import com.mycompany.app.Week3.Week3ClassPractice.Transmogrify;

//import Debug.KUROdebug;
//import Debugoff.KUROdebug;

public class App {
    public static void main(String[] args) {

        /*//week 2 class practice
        book myObj = new book();
        myObj.an();

        time temp = new time();
        temp.SetHour(6);
        temp.SetMinute(43);
        temp.SetSecond(13);
        System.out.println(temp.print());

        recursion r = new recursion();
        System.out.println(r.factorial(5));
        System.out.println(" ");
        System.out.println(" ");

        //Week 2 exercise
        //ACCESS CONTROL

        //EXERCISE 1
        AccessControl_EX1 c = new AccessControl_EX1();
        c.MyClass();

        //EXERCISE 3
        KUROdebug.debug("KURO");

        //EXERCISE 5
         AccessControl_EX5 tried = new AccessControl_EX5();
        //Normal access
        //tried.NormalAccess();//Error is that the NormalAccess not visible for the system  

        //Public access
        tried.PublicAccess(); //Normal :)))

        //Private access
        //tried.PrivateAccess(); //Problems appear when access the private one, remove "//" to see

        //Protected access
        //tried.ProtectedAccess(); //The same error as private

        //EXERCISE 6
        //AccessControl_EX6_P1 a = new AccessControl_EX6_P1();
        //a.hello();//As I have explained in EX5, the hello() is not visible because of protected

        //EXERCISE 7
        AccessControl_EX7 widget = new AccessControl_EX7();
        widget.K();



        //REUSING CLASSESS
        //EXERCISE 1
        ReusingClasses_EX1 l = new ReusingClasses_EX1();
        l.lunch();

        //EXERCISE 4
        //As a result, even if i don't create a constructor for scissor(), the compiler will still synthesize a default constructor from the previous base class constructors 

        //EXERCISE 6
        //If I don’t call the base-class constructor in BoardGame(), the compiler will complain that it can’t find a constructor of the form Game()
        
        
        //POLYMORPHISM
        //EXERCISE 1
        Polymorphism_EX1 b = new Polymorphism_EX1();
        b.bike();
        
        //EXERCISE 5
        Polymorphism_EX5 w = new Polymorphism_EX5();
        w.wheel();
        System.out.println(" ");

        //EXERCISE 9
        Polymorphism_EX9 m = new Polymorphism_EX9();
        m.mice();

        //EXERCISE 10
        Polymorphism_EX10 S = new Polymorphism_EX10();
        S.econd();
        System.out.println("The first method is not override, but it calls the second one => Java always uses the most-derived method for the object type");
    
        //EXERCISE 11
        sandwich s = new sandwich();
        s.andwich();
        System.out.println(" ");

        //EXERCISE 13
        ReferenceCounting coun = new ReferenceCounting();
        coun.ting();
        System.out.println(" ");

        //EXERCISE 15
        PolyConstructors Poly = new PolyConstructors();
        Poly.constructor();
        */


        //WEEK 3
        //CLASS PRACTICE
        //DisruptLecture
        DisruptLecture P = new DisruptLecture();
        P.hone();
        System.out.println(" ");

        //TestArithmetic
        TestArithmetic Test = new TestArithmetic();
        Test.Arithmetic();
        System.out.println(" ");

        //GlyphTest
        GlyphTest Glyph = new GlyphTest();
        Glyph.Test();
        System.out.println(" ");

        //Transmogrify
        Transmogrify trans = new Transmogrify();
        trans.morgrifty();
    }
}