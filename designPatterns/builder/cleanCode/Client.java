package com.vicko.java.builder.cleanCode;

public class Client {
    public static void main(String args[]){
       ContactDetails name = new ContactDetails.Builder()
               .completeName("Mariano Vargas")
               .zipCode(765980)
               .build();

       Account MarianoAccount = new Account.Builder()
               .Email("marianovargas@gmail.com")
               .Id(34)
               .name(name)
               .build();

       System.out.println(MarianoAccount.getName().getZipCode());
    }


}
