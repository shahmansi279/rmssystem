package com.project.rms.request;

public class QueuedState implements RequestState {

	@Override

	public void execute(Request r, ReqMgmtFacade rf)

	{

		// TODO Auto-generated method stub

		
		System.out.println(" Request State -- Queued State");

		r.setrState(new AllocatingState());
	}

}
