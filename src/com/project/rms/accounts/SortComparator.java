package com.project.rms.accounts;

import java.util.Comparator;

public class SortComparator implements Comparator<Member>

{

@Override
		public int compare(Member e1,Member e2)
	    {
	        if(e1.getnMemberID() > e2.getnMemberID())
	        {
	        	
	            return 1;
	        } else 
	        {
	            return -1;
	        }
	    }

		

	
	}


