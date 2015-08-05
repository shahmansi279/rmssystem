package com.project.rms.request;

public class ProcessingState implements RequestState {

	@Override
	public void execute(Request r, ReqMgmtFacade rf)

	{

		// TODO Auto-generated method stub

		System.out.println(" Request State -- Processing \n");

		if (validateRequest(r))

		{
			r.setrState(new AcceptedState());
			r.executeAction(rf);
		}

		else {
			r.setrState(new RejectedState());
			r.executeAction(rf);
		}
	}

	@Override
	public boolean validateRequest(Request r) {

		System.out.println("Validating Request Parameters");

		return true;

		// rf.validateRequest(r);
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addtoQueue(Request r, ReqMgmtFacade rf) {

		System.out.println("Request Cannot be Queued In this State");
		// TODO Auto-generated method stub
		return false;

	}

	@Override
	public boolean processRequest(Request r, ReqMgmtFacade rf) {

		System.out.println("Request Cannot be Processed In this State");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retrieveFromQueue(Request r, ReqMgmtFacade rf) {

		System.out.println("Request Cannot be Retireved In this State");
		

		// TODO Auto-generated method stub
		return false;

	}

}
