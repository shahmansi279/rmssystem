package com.project.rms.request;

public class AcceptedState implements RequestState{

	@Override
	public void execute(Request r,ReqMgmtFacade rf) 
	
	{
		
		
		
		System.out.println(" Request State -- Accepted State");
	
		rf.addRequestToQueue(r);
		
		r.setrState(new QueuedState());
	}

}
