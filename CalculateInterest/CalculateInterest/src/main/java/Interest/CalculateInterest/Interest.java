package Interest.CalculateInterest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Interest {
	public static final Logger logger=LogManager.getLogger(CompoundInterest.class);

	double rateOfInterest,time,principal;
	public abstract void calculate();
	void input()
	{
		logger.info("entering input method");
		PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
		out.println("Enter the Principal amount:");
		Scanner sc=new Scanner(System.in);
		principal=sc.nextDouble();
		out.println("Enter rate of interest");
		rateOfInterest=sc.nextDouble();
		out.println("Enter time");
		time=sc.nextDouble();
		logger.info("input method completed");
	}
	
	

}
