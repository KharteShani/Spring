package com.sk.beans;
import java.util.Arrays;

public class Tourplan {
   private String[] places;
   public Tourplan() {
	   System.out.println("Tourplan()::0-param constructor");
   }
   
   public void setPlaces(String[] places) {
	this.places = places;
   }

   @Override
   public String toString() {
	   return "Tourplan [places=" + Arrays.toString(places) + "]";
   } 
}
