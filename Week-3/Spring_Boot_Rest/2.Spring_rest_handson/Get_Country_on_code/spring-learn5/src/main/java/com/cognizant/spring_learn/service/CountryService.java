package com.cognizant.spring_learn.service;



import java.util.List;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;



@Service
public class CountryService {



public Country getCountry(String code){



ApplicationContext context=

new ClassPathXmlApplicationContext("country.xml");



List<Country> countries=

context.getBean("countryList",List.class);



for(Country c:countries){



if(c.getCode().equalsIgnoreCase(code)){


return c;


}


}


return null;


}


}