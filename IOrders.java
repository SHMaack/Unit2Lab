package com.olympic.cis143.m02.student.tacotruck.queue;
import com.olympic.cis143.m02.student.tacotruck.TacoImpl;
public interface IOrders
{
	void addOrder(TacoImpl tacoOrder);
	boolean hasNext();
	TacoImpl closeNextOrder();
	int howManyOrders();
}
