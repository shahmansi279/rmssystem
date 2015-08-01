package com.project.rms.request;

import java.util.Comparator;
import java.util.Date;

public class RequestComparator implements Comparator<Request>
{
    @Override
    public int compare(Request r1, Request r2)
    {
        return r1.rPickupDateTime.compareTo(r2.rPickupDateTime);
        
    }
}