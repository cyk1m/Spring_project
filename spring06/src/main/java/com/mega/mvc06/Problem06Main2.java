package com.mega.mvc06;

public class Problem06Main2 {
//에러를 문자로 알리고 싶을 때 처리
   public static void main(String[] args) {
      Problem06 error = new Problem06();
      try {
         error.call();
      } catch (Exception e) {
         System.out.println("호출한 곳에서 다르게 알아서 처리함@@@@");
      }//try/catch 뺐더니 걍 중단 된 모습이다.
      System.out.println("에러 발생후 실행될까요....!!!!s");
      System.out.println("에러 발생후 실행될까요....!!!!s");
      System.out.println("에러 발생후 실행될까요....!!!!s");
      System.out.println("에러 발생후 실행될까요....!!!!s");
      System.out.println("에러 발생후 실행될까요....!!!!s");
      System.out.println("에러 발생후 실행될까요....!!!!s");
      System.out.println("에러 발생후 실행될까요....!!!!s");
      System.out.println("에러 발생후 실행될까요....!!!!s");
      System.out.println("에러 발생후 실행될까요....!!!!s");
      System.out.println("에러 발생후 실행될까요....!!!!s");
   }

}