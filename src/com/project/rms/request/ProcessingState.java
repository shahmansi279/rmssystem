package com.project.rms.request;

public class ProcessingState implements RequestState {

	@Override
	public void execute(Request r, ReqMgmtFacade rf)

	{

		// TODO Auto-generated method stub

		System.out.println(" Request State -- Processing State");

		if (rf.validateRequest(r))
		
			r.setrState(new AcceptedState());

		else
			r.setrState(new RejectedState());
	}

}
