package com.hackerrank.thirtydaysofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> friendsContact = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++)
        {
            String name = in.next();
            int phone = in.nextInt();
            friendsContact.put(name, phone);
        }
        
        while(in.hasNext())
        {
            String s = in.next();
            if (friendsContact.containsKey(s))
            {
                System.out.println(s + "=" + friendsContact.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
