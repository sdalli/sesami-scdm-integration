package com.sesami.sesamiscdmintegration.accountinquiry.bean;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalInputBean {

	
	    public String name;
	    @JsonProperty("UIPrompt") 
	    public String uIPrompt;
	    public boolean numeric;
	    public ArrayList<String> predefinedValues;
	
	
}
