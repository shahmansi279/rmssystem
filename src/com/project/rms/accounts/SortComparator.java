package com.project.rms.accounts;

import java.util.Comparator;

public class SortComparator implements Comparator<Member>

{

	@Override
	public int compare(Member e1, Member e2) {

		return e1.getnMemberID().compareTo(e2.getnMemberID());
	}
}
