package com.project.rms.request;

public class AcceptedState implements RequestState{

	@Override
	public void execute(Request r,ReqMgmtFacade rf) 
	
	{
		
		
		System.out.println(" Request State -- Accepted \n");
		addtoQueue(r,rf);
		r.setrState(new QueuedState());
		r.executeAction(rf);
	}

	@Override
	public boolean validateRequest(Request r) {
		
		System.out.println(" Requested Already Validated");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addtoQueue(Request r, ReqMgmtFacade rf) {
		
		System.out.println(" Requested Ready to be Queued");
		
		return rf.addRequestToQueue(r);
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean processRequest(Request r, ReqMgmtFacade rf) {
		
		System.out.println(" Requested Need to be Queued First before it can be processed");
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retrieveFromQueue(Request r, ReqMgmtFacade rf) {
		
		System.out.println(" Requested Need to be Queued First before it can be retrieved");
		// TODO Auto-generated method stub
		return false;
		
	}

	

}
