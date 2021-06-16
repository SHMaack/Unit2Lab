package com.olympic.cis143.m02.student.cards;

import java.util.*; 

interface IDeck 
{
    Stack<Card> getDeck();

    void shuffle(); 

    boolean hasNext();
    Card dealCard();

}
