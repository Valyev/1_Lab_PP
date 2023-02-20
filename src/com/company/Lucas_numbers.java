package com.company;
/**Class for calculating*/
public class Lucas_numbers {
    /** first number in Lucas numbers*/ byte first = 2;
    /** second number in Lucas numbers*/ byte second = 1;
    /** how much we need to add them*/ int width;

    /**variables for filling*/ int n0,n1,n2;

    /**Constructor, here program creates a massive, which will be shown to the user, and the sum of its numbers will be shown too
     ,*/
    public Lucas_numbers(int w) {

        width = w;

        n0=first;
        n1=second;
        if(width>1) /*If width>1 then make a massive and work on it*/
        {
            long totalsum =   0; /* variable for total sum of these numbers*/
            long[] counts = new long[width]; /* massive for numbers*/
            counts[0]= first;
            counts[1]= second;
            totalsum+=3;
            for (short i = 2; i < width; i++)/* cycle for filling into an array*/
            {
                n2 = n0 + n1;
                counts[i] = n2;
                totalsum += n2;
                n0 = n1;
                n1 = n2;
            }

            for (short i = 0; i < width; i++) { /* array output*/
                System.out.print(counts[i] + " ");
            }
            System.out.print("Summed result of these numbers: "+ totalsum);
        }

        else if(width==1) /* if there`s only one length*/
        {
            System.out.print(first+ " Sum of 2 is 2");
        }

    }

}
