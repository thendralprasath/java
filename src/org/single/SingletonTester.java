package org.single;
import org.old.SingletonClass;

public class SingletonTester {
	 public static void main(String[] args) {
		 
	        //Instance 1
	        SingletonClass instance1 = SingletonClass.getInstance();

	        //Instance 2
	        SingletonClass instance2 = SingletonClass.getInstance();
	   

	        //now lets check the hash key.
	        System.out.println("Instance 1 hash:" + instance1.hashCode());
	        System.out.println("Instance 2 hash:" + instance2.hashCode()); 
	       System.out.println(SingletonClass.sSoleInstance.hashCode());
	       System.out.println(instance1.r);
	   }
}
