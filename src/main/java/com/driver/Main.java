package com.driver;

  public static class B extends A {
    public void meth(){
               System.out.println("Method is overrridden in extended class B");

  }
           public static void main(String[] args){
               B obj=new B();
              obj.meth();

             B obj1=new B();
             obj1.meth();
    }
}