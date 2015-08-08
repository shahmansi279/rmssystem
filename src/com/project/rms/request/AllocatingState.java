package com.project.rms.request;

import com.project.rms.request.FailedState;

public class AllocatingState implements RequestState {

	@Override
	public void execute(Request r, ReqMgmtFacade rf)

	{

		// TODO Auto-generated method stub

		System.out.println("Request State -- Allocating State\n");
		if (retrieveFromQueue(r, rf)) {
			if (processRequest(r, rf))

			{
				r.setrState(new ProcessedState());
				r.executeAction(rf);

			} else {

				r.setrState(new FailedState());
				r.executeAction(rf);

			}
		}

		else {

			r.setrState(new FailedState());
			r.executeAction(rf);
		}

	}

	@Override
	public boolean validateRequest(Request r) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addtoQueue(Request r, ReqMgmtFacade rf) {
		return false;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean processRequest(Request r, ReqMgmtFacade rf) {

		rf.processRequest(r);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retrieveFromQueue(Request r, ReqMgmtFacade rf) {

		if (rf.removeRequestFromQueue().getrId() == r.getrId())

			return true;

		else
			return false;

		// TODO Auto-generated method stub

	}

}
