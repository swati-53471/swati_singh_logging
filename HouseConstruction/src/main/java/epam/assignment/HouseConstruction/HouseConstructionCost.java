package epam.assignment.HouseConstruction;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class HouseConstructionCost implements MaterialPrice{

	public static final Logger logger=LogManager.getLogger(App.class);

	private int materialStandard,automation;
	private double area,totalCost;
	PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	Scanner sc=new Scanner(System.in);
	public void input()
	{	
		logger.info("entering input method");
		out.println("Enter the area of land");
		area=sc.nextDouble();
		out.println("Enter the material standard choice(1/2/3):\n1. Standard material\n2. Above Standard Material\n3. High standard material");
		materialStandard=sc.nextInt();
		if(materialStandard==3)
		{
		out.println("Do you want fully automated home? (1/2):\n1. Yes\n2. No");
		automation=sc.nextInt();
		logger.info("input method completed");
		}
	}
	public void cost()
	{
		logger.info("entering cost method");
		if(materialStandard==1)
			totalCost=area*standard;
		else if(materialStandard==2)
			totalCost=area*aboveStandard;
		else if(materialStandard==3)
		{	
			if(automation==1)
				totalCost=area*highStandardAutomated;
			else 
				totalCost=area*highStandard;
		}
		else 
			{
				logger.warn("Invalid choice.Please try again!!!");
				input();
				cost();
			}
		out.println("The total cost of contruction is"+totalCost);
		logger.info("total cost calulated");
	}
	
}
