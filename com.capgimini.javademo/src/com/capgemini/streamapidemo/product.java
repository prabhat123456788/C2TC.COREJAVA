package com.capgemini.streamapidemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class product
{
	int id;
	String name;
	float price;
	
	public product(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
