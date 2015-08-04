package com.project.rms.request;

public class AllocatingState implements RequestState {

	@Override
	public void execute(Request r, ReqMgmtFacade rf)

	{

		// TODO Auto-generated method stub

		System.out.println("Request State -- Allocating State");

		r.setrState(new ProcessedState());
	}

}
