package com.seeburger.jucon.mapping;

import java.io.*;
import java.math.BigDecimal;
import java.lang.reflect.Method;
import java.lang.Class;

import com.seeburger.jucon.*;
import com.seeburger.jucon.seebicapi.BICMapping;
import com.seeburger.jucon.dochandler.*;
import com.seeburger.jucon.basicfunctions.mapfile.MapFileMain;

public class No_Message_to_No_Message_1 extends Mapping
{
	private static String COMPILATION_TIME = "Wed, 01 Dec 2021 15:53:05 +0530";
	public boolean isDebuggerClosed = false;


	
public static MapInfo mapInfo = new MapInfo("No_Message","DUMMY","No_Message","DUMMY","No_Message_to_No_Message","No_Message_to_No_Message_1",1,"P2","","","","host.docker.internal","n/a","Wed, 01 Dec 2021 15:53:05 +0530","6.5.2-2");


	public No_Message_to_No_Message_1()
	{
		mMapInfo = mapInfo;
		try{
			Method meth2 = mapInfo.getClass().getMethod("setHost", String.class);
			meth2.invoke(mapInfo, "host.docker.internal");
		}catch(Exception e){}
		try{
			Method meth3 = mapInfo.getClass().getMethod("setRepositoryVersionNumber", String.class);
			meth3.invoke(mapInfo, "n/a");
		}catch(Exception e){}
	}

	public void setMessenger(JuMessenger messenger)
	{
		super.setMessenger(messenger);
	}

	// PROG_NEW_MAPPING
	public void ProcNewMapping()
	{
		// <<RecId=-1;RecName=PROG_NEW_MAPPING>>
		initializeRecord(-1, "PROG_NEW_MAPPING", false);
		initFunctions();
		newMappingFunctionCalls();
	}

	// PROG_ROOT
	public void ProcRoot()
	{
		// <<RecId=-2;RecName=PROG_ROOT>>
		initializeRecord(-2, "PROG_ROOT", false);
	}

	// default
	public void ProcP1()
	{
		// <<RecId=-10;RecName=default>>
		initializeRecord(-10, "default", true);
		// <<Line#=1>>   
		m_messenger.iLineNo = 1;
		m_messenger.outTraceln("88");
	}

	// Main function of the mapping
	public int main() throws Exception
	{
		mapInfo.setCompilationTime(COMPILATION_TIME);
		
		int index = 0;
		
		try
		{
			// Main loop - Running until end of incoming document
			while (noErrorDetected() && (stdin.moveNext() > 0)  && noErrorDetected())
			{
				do
				{
					index = stdin.getTypeIndex();
		
					// Switch on type of record... call record programs
					switch(index)
					{
					case -1:
						resetVariable();
						resetFunction();
						ProcNewMessage();
						break;
					case -2:
						ProcNewMessageType();
						break;
					case -3:
						ProcRoot();
						break;
					case -4:
						ProcMessageEnd();
						break;
					case -5:
						ProcMessageTypeEnd();
						break;
					case -6:
						ProcFileEnd();
						break;
					case -7:
						ProcMappingEnd();
						break;
					case -11:
						break;
					case 0:
						ProcP1();
						break;
					default:   // ERROR
						throw new Exception("program not available");
					}
		
					if(index >= 0)
						stdin.checkAccessedFields();
		
					m_messenger.iRecNo = 0;
					m_messenger.iLineNo = 0;
		
					// Check if mapping is canceled
					checkSuspension();
				}
				while (index != -11);
		
				// Check if mapping is canceled
				checkSuspension();
				// clear locals
				localVariables.clear();
			}
		}
		catch (Exception e)
		{
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			m_messenger.outWarnln(1, "Fatal exception in user mapping ...\r\n" + sw.toString());
		}
		catch (Error e)
		{
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			m_messenger.outWarnln(1, "Fatal error in user mapping ...\r\n" + sw.toString());
		}
		
		this.m_messenger.setRecordNumber(-11);
		stdin      = null;
		stdout     = null;
		stdmap     = null;
		m_stdDBmap = null;
		
		return 1;
	}

	private static char getCharValue(String value)
	{
		return (value == null || value.length() == 0) ? '\0' : value.charAt(0);
	}

	private void resetVariable()
	{
	}

	private void resetFunction()
	{
	}

	private void initFunctions()
	{
	}

	private final void initFunction(Object userObject)
	{
		if (userObject instanceof Mapping)
		{
			((Mapping) userObject).initMembers(this);
		}
	}

	private void newMappingFunctionCalls()
	{
m_messenger.bIsProcedure = false;
	m_messenger.bIsGlobalProcedure = false;
	m_messenger.progName = null;
	}

}
