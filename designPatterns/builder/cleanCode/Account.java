package com.vicko.java.builder.cleanCode;

public class Account {
    private final int id;
    private final String email;
    private final ContactDetails name;

    private Account(Builder builder){
        this.id = builder.id;
        this.email = builder.email;
        this.name = builder.name;
    }

    public int getId(){
        return this.id;
    }

    public String getEmail(){
        return  this.email;
    }


    public ContactDetails getName(){
        return this.name;
    }

    public static class Builder{

        private int id;
        private String email;
        private ContactDetails name;

        public Builder Id(int id){
            this.id = id;
            return this;
        }

        public Builder Email(String email){
            this.email = email;
            return this;
        }

        public Builder name(ContactDetails name){
            this.name = name;
            return this;
        }

        public Account build(){
            return new Account(this);
        }

    }
}
