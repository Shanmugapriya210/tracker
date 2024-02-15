package com.application.expensetracker;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

    	//ExpenseJdbc ref = context.getBean("expenseJdbc",ExpenseJdbc.class);

    	//UserJdbc userRef = context.getBean("userJdbc",UserJdbc.class);

    	Scanner sc = new Scanner(System.in);


    	boolean isLoggedIn = false;

    	boolean continueToLogin=false;

    	System.out.println("welcome to expense tracker");

    	int loggedInUserId = 0;

    	do

    	{

    	System.out.println("Choose an option to continue , 1. Login , 2. Register as a new user");

    	int userChoice = sc.nextInt();

    	sc.nextLine();

    	switch(userChoice) {

    	case 1 :

    	System.out.println("Enter User name");

    	String currentUserName = sc.nextLine();

    	System.out.println("Enter your Password");

    	String currentPwd = sc.nextLine();

    	List<RegisteredUser> userList = userRef.getAllUsers();

    	for(RegisteredUser regUser : userList) {

    	if(currentUserName.equals(regUser.userName)&&currentPwd.equals(regUser.pwd)){

    	isLoggedIn = true;

    	loggedInUserId = regUser.getUserId();

    	}

    	}

    	continueToLogin=false;

    	break;

    	case 2:

    	System.out.println("Enter full name , user name and password");

    	RegisteredUser user = new RegisteredUser(sc.nextLine(),sc.nextLine(),sc.nextLine());

    	userRef.insertUser(user);

    	System.out.println("New user has beeen registered");

    	continueToLogin=true;

    	break;

    	}

    	}while(continueToLogin);


    	if(isLoggedIn) {

    	System.out.println("Login Successfull");

    	}

    	else{

    	System.out.println("Ivalid Credentials ");

    	}

    	while(isLoggedIn) {

    	System.out.println("Enter your Choice , 1. Add An Expense , 2. View All Expenses, 3. view expenses in time range ,4.View by category ,5.Logout");

    	Integer choice = sc.nextInt();

    	sc.nextLine();

    	switch(choice) {

//    	case 1:
//
//    	System.out.println("Enter Expense name , category , cost");
//
//    	ref.insertExpense(new Expense(sc.nextLine(),sc.nextLine(),sc.nextDouble()), loggedInUserId);
//
//    	sc.nextLine();
//
//    	break;
//
//    	case 2:
//
//    	//List<Expense> expList = ref.getAllExpense(loggedInUserId);
//
//    	expList.forEach(exp->{
//
//    	System.out.println(exp);
//
//    	});
//
//    	break;
//
//    	case 3:
//
//    	System.out.println("Enter the no of past days, you want to view expenses for ");
//
//    	int noOfPastDays = sc.nextInt();
//
//    	sc.nextLine();
//
//    	//List<Expense> expListByDate = ref.getAllExpenseByDate(loggedInUserId,noOfPastDays);
//
//    	//for(Expense expense : expListByDate) {
//
//    	System.out.println(expense);
//
//    	}
//
//    	break;
//
//    	case 4:
//
//    	List<Expense> expListByCategory = ref.getAllExpenseByCategory(loggedInUserId);
//
//    	expListByCategory.forEach(exp->{
//
//    	System.out.println(exp);
//
//    	});
//
//    	break;
//
//    	case 5:
//
//    	System.out.println("Logging Out ....");
//
//    	isLoggedIn = false;
//
//    	break;
//
//    	}
//
//    	
//
//    	

    	}
    	
     }
    }
    }
