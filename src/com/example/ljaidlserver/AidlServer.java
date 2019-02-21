package com.example.ljaidlserver;

import com.example.ljaidlserver.aidl.IAidlServer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class AidlServer extends Service{
	IAidlServer.Stub mStub = new IAidlServer.Stub() {
		
		@Override
		public int add(int a, int b) throws RemoteException {
			// TODO Auto-generated method stub
			return a+b;
		}
	};
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return mStub;
	}

}
