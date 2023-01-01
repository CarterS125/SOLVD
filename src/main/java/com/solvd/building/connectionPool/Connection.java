package com.solvd.building.connectionPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Connection implements Future {

    private static Connection _instance;
    private static Connection _instanceForDoubleCheckLocking;
    private boolean empty = false;
    private String patientName = "default";

    private Connection() {
        System.out.println("Instance Created");
    }

    public static synchronized Connection
    getInstanceSynchronizedWay() {
        if (_instance == null)
            _instance = new Connection();

        return _instance;
    }

    public static Connection
    getInstanceSynchronizedBlockWay() {
        if (_instanceForDoubleCheckLocking == null)
            synchronized (Connection.class) {
                if (_instanceForDoubleCheckLocking == null)
                    _instanceForDoubleCheckLocking
                            = new Connection();
            }

        return _instanceForDoubleCheckLocking;
    }

    public boolean isOperationTheatreEmpty() {
        return empty;
    }

    public void endOperation() { empty = true; }


    public synchronized void operation(String aName) {

        if (empty == true) {;

            System.out.println("Operation can be done get builders together for assembly " );
            empty = false;
        }

        else {
            System.out.println("Sorry Operation cannot be preformed builders are busy " );
        }
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override
    public Object get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }
}


class BuildingOperation {

    public static void main(String args[]) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {

                Connection i1 = Connection.getInstanceSynchronizedWay();
                System.out.println("The instance 1 in Synchronized Method is " + i1);
                i1.endOperation();
                i1.operation("123");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {

                Connection i2 = Connection.getInstanceSynchronizedWay();
                System.out.println("The instance 2 in Synchronized Method is " + i2);
                i2.operation("789");
            }
        });

        t1.start();

        try {
        Thread.sleep(1000);
        }
        catch (InterruptedException e) {}


        t2.start();
        System.out.println("Double Checked locking - Synchronized Block only");

        Thread t3 = new Thread(new Runnable() {
            public void run() {

                Connection i1 = Connection.getInstanceSynchronizedBlockWay();
                System.out.println("The instance 1 in Double Checked Locking way is " + i1);
                i1.endOperation();
            }
        });

        Thread t4 = new Thread(new Runnable() {
            public void run() {
                Connection i2 = Connection.getInstanceSynchronizedBlockWay();
                System.out.println("The instance 2 in Double Checked Locking way is " + i2);
                i2.endOperation();
            }
        });

        Thread t5 = new Thread(new Runnable() {
            public void run() {
                Connection i3 = Connection.getInstanceSynchronizedBlockWay();
                System.out.println("The instance 3 in Double Checked Locking way is " + i3);
                i3.endOperation();
            }
        });
        try {
        Thread.sleep(1000);
        }
        catch (InterruptedException e) {}
        t3.start();
        try {
        Thread.sleep(1000);
        }
        catch (InterruptedException e) {}
        t4.start();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {}
    }
}
