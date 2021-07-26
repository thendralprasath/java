package org.old;
//import Singleton.SingletonClass;

public class SingletonClass {

	    public static SingletonClass sSoleInstance;
	    public int r=10;

	    private SingletonClass(){}  //private constructor.

	    public static SingletonClass getInstance(){
	        if (sSoleInstance == null){ //if there is no instance available... create new one
	            sSoleInstance = new SingletonClass();
	        }

	        return sSoleInstance;
	    }
            public static void main(String[] args) {
            	SingletonClass instance1 = SingletonClass.getInstance();
            	System.out.println(instance1.hashCode());
            	System.out.println( sSoleInstance.hashCode());
	
}	
}
