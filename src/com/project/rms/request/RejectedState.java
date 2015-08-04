package com.project.rms.request;

public class RejectedState implements RequestState {

	@Override
	public void execute(Request r, ReqMgmtFacade rf)

	{

		System.out.println(" Request State -- Rejected State");
	}

}
