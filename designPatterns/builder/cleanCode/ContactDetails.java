package com.vicko.java.builder.cleanCode;

public class ContactDetails {
    private final String completeName;
    private final int zipCode;

    private ContactDetails(Builder builder){
        this.completeName = builder.completeName;
        this.zipCode = builder.zipCode;
    }

    public String getCompleteName(){
        return this.completeName;
    }

    public int getZipCode(){
        return this.zipCode;
    }

    public static class Builder{
        private  String completeName;
        private int zipCode;

        public Builder completeName(String completeName){
            this.completeName = completeName;
            return this;
        }

        public Builder zipCode(int zipCode){
            this.zipCode = zipCode;
            return this;
        }

        public ContactDetails build(){
            return new ContactDetails(this);
        }
    }
}
