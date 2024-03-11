package com.mycompany.app;
import com.mycompany.app.Week2.Week2Exercise.InitializationCleanup.*;
import com.mycompany.app.Week2.Week2Exercise.InitializationCleanup.InitializationCleanupEx2;
import com.mycompany.app.Week2.Week2Exercise.Interfaces.InterfacesEx12;
import com.mycompany.app.Week2.Week2Exercise.Interfaces.InterfacesEx19;
import com.mycompany.app.Week2.Week2Exercise.Interfaces.InterfacesEx2;
import com.mycompany.app.Week2.Week2Exercise.Interfaces.InterfacesEx3;
import com.mycompany.app.Week2.Week2Exercise.Interfaces.InterfacesEx4;
import com.mycompany.app.Week2.Week2Exercise.Interfaces.InterfacesEx6;
import com.mycompany.app.Week2.Week2Exercise.Interfaces.InterfacesEx7;
import com.mycompany.app.Week2.Week2Exercise.Interfaces.InterfacesEx8;
import com.mycompany.app.Week2.Week2Exercise.Interfaces.InterfacesEx9;
import com.mycompany.app.Week2.Week2Exercise.Interfaces.InterfacesEx11.InterfacesEx11;
import com.mycompany.app.Week1.EX5;
import com.mycompany.app.Week2.Week2ClassPractice.book;
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
import com.mycompany.app.Week2.Week2Exercise.Polymorphism.Polymorphism_EX15.PolyConstructors;
import com.mycompany.app.Week3.Week3ClassPractice.DisruptLecture;
import com.mycompany.app.Week3.Week3ClassPractice.GlyphTest;
import com.mycompany.app.Week3.Week3ClassPractice.TestArithmetic;
import com.mycompany.app.Week3.Week3ClassPractice.Transmogrify;
import com.mycompany.app.Week1.*;

//import Debug.KUROdebug;
//import Debugoff.KUROdebug;

public class App {
    public static void main(String[] args) {

        // WEEK 1
        EX1 temp2 = new EX1();
        temp2.count();
        System.out.println(" ");
        System.out.println(" ");

        EX2 ran = new EX2();
        System.out.println("EX 2: So sanh so ngau nhien");
        ran.dom();
        System.out.println(" ");
        System.out.println(" ");

        EX4 number = new EX4();
        System.out.println("EX 4: So nguyen to");
        number.E_N(); 
        System.out.println(" ");
        System.out.println(" ");

        EX5 in = new EX5();
        System.out.println("EX 5: So nhi phan");
        in.inter();
        System.out.println(" ");
        System.out.println(" ");

        EX7 count2 = new EX7();
        System.out.println("EX 7: Dem den 99 thi stop");
        count2.stop();
        System.out.println(" ");
        System.out.println(" ");

        EX8 case1 = new EX8();
        System.out.println("EX 8: Tao case");
        case1.hello();
        System.out.println(" ");
        System.out.println(" ");

        EX9 fabo = new EX9();
        System.out.println("EX 9: Tim so fabonacsi");
        fabo.fin();
        System.out.println(" ");
        System.out.println(" ");

        //week 2 class practice
        book myObj = new book();
        myObj.an();

        time temp1 = new time();
        temp1.SetHour(6);
        temp1.SetMinute(43);
        temp1.SetSecond(13);
        System.out.println(temp1.print());

        recursion r = new recursion();
        System.out.println(r.factorial(5));
        System.out.println(" ");
        System.out.println(" ");

        //Week 2 exercise
        //ACCESS CONTROL

        //EXERCISE 1
        AccessControl_EX1 c = new AccessControl_EX1();
        c.MyClass();
        System.out.println(" ");

        //EXERCISE 3
        //KUROdebug.debug("KURO");

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
        System.out.println(" ");

        //Initialization Cleanup

        //EXERCISE 2
        InitializationCleanupEx2 D = new InitializationCleanupEx2();
        D.Print();
        System.out.println(" ");

        //EXERCISE 3
        InitializationCleanupEx3 temp = new InitializationCleanupEx3();
        temp.Messenger();
        System.out.println(" ");

        //EXERCISE 4
        InitializationCleanupEx4 pri = new InitializationCleanupEx4();
        pri.nter4();
        System.out.println(" ");

        //EXERCISE 5
        InitializationCleanupEx5 my = new InitializationCleanupEx5();
        my.dog();
        System.out.println(" ");

        //EXERCISE 6
        InitializationCleanupEx6 bark = new InitializationCleanupEx6();
        bark.theDog();
        System.out.println(" ");

        //EXERCISE 7
        InitializationCleanupEx7 Had = new InitializationCleanupEx7();
        Had.d1();
        System.out.println(" ");

        //EXERCISE 8
        InitializationCleanupEx8 me = new InitializationCleanupEx8();
        me.thod();
        System.out.println(" ");

        //EXERCISE 9
        InitializationCleanupEx9 de = new InitializationCleanupEx9();
        de.mo1();
        System.out.println(" ");

        //EXERCISE 10
        InitializationCleanupEx10 fina = new InitializationCleanupEx10();
        fina.lize();
        System.out.println(" ");

        //EXERCISE 12
        InitializationCleanupEx12 big = new InitializationCleanupEx12();
        big.tank();
        System.out.println(" ");
        
        //EXERCISE 13
        InitializationCleanupEx13 CU = new InitializationCleanupEx13();
        CU.P();
        System.out.println(" ");

        //EXERCISE 14
        InitializationCleanupEx14 Sta = new InitializationCleanupEx14();
        Sta.tic();
        System.out.println(" ");

        //EXERCISE 15
        InitializationCleanupEx15 tes = new InitializationCleanupEx15();
        tes.ter();
        System.out.println(" ");

        //EXERCISE 16
        InitializationCleanupEx16 Clean = new InitializationCleanupEx16();
        Clean.upEx16();
        System.out.println(" ");

        //EXERCISE 17
        InitializationCleanupEx17 In17 = new InitializationCleanupEx17();
        In17.it();
        System.out.println(" ");

        //EXERCISE 18
        InitializationCleanupEx18 In18 = new InitializationCleanupEx18();
        In18.it18();
        System.out.println(" ");

        //EXERCISE 19
        InitializationCleanupEx19 Shows = new InitializationCleanupEx19();
        Shows.tring();
        System.out.println(" ");

        //EXERCISE 20
        InitializationCleanupEx20 Clea = new InitializationCleanupEx20();
        Clea.nup20(args);
        System.out.println(" ");

        //EXERCISE 21
        InitializationCleanupEx21 Ha = new InitializationCleanupEx21();
        Ha.dd21();
        System.out.println(" ");

        //EXERCISE 22
        InitializationCleanupEx22 Hadd = new InitializationCleanupEx22();
        Hadd.Ex22();
        System.out.println(" ");

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


        //Interfaces

        //EXERCISE 2
        InterfacesEx2 Lo = new InterfacesEx2();
        Lo.go();
        System.out.println(" ");

        //EXERCISE 3
        InterfacesEx3 So = new InterfacesEx3();
        So.n();
        System.out.println(" ");

        //EXERCISE 4
        InterfacesEx4 Du = new InterfacesEx4();
        Du.uc();
        System.out.println(" ");

        //EXERCISE 6
        InterfacesEx6 Say = new InterfacesEx6();
        Say.One();
        System.out.println(" ");

        //EXERCISE 7
        InterfacesEx7 De = new InterfacesEx7();
        De.nt();
        System.out.println(" ");

        //EXERCISE 8
        InterfacesEx8 lu = new InterfacesEx8();
        lu.nch();
        System.out.println(" ");

        //EXERCISE 9
        InterfacesEx9 or = new InterfacesEx9();
        or.chestra();
        System.out.println(" ");

        //EXERCISE 11
        InterfacesEx11 sw = new InterfacesEx11();
        sw.ap();
        System.out.println(" ");

        //EXERCISE 12
        InterfacesEx12 he = new InterfacesEx12();
        he.ro();
        System.out.println(" ");

        //EXERCISE 19
        InterfacesEx19 Coin = new InterfacesEx19();
        Coin.Dice();
        System.out.println(" ");

        

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