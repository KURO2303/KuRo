package com.mycompany.app.Week2.Week2Exercise.AccessControl;

//Try to access to normal, public, private, protected and result
public class AccessControl_EX5_P2 {
    public static void main(String[] args){
        AccessControl_EX5_P1 tried = new AccessControl_EX5_P1();
        //Normal access
        tried.NormalAccess(); //This is normal, as alway 

        //Public access
        tried.PublicAccess(); //Also normal :)))

        //Private access
        //tried.PrivateAccess(); //Problems appear when access the private one, remove "//" to see

        //Protected access
        tried.ProtectedAccess(); //Dunno why this is still accessable, i'm clueless :)))
    }
}
