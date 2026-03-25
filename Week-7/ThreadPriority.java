class A extends Thread
{
	public void run()
	{
		for(int i = 1; i<=5; i++)
		{
			System.out.println("\t From ThreadA:i="+i);
		}
		System.out.println("Exist from A");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j = 1; j<=5; j++)
		{
			System.out.println("\t From ThreadB:j="+j);
		}
		System.out.println("Exist from B");
	}
}
class C extends Thread
{
public void run()
	{
		for(int k = 1; k<=5; k++)
		{
			System.out.println("\t From ThreadC:k="+k);
		}
		System.out.println("Exist from C");
    }
}

class ThreadPriority
{
	public static void main(String args[])throws Exception
	{
		A threadA=new A();
		B threadB=new B();
		C threadC=new C();
		//new A().start();
		//new B().start();
        //new C().start();
		threadC.setPriority(10);
		threadB.setPriority(5);
		threadA.setPriority(1);

		System.out.println("Started Thread A");
		System.out.println("Started Thread B");
		System.out.println("Started Thread C");
	}
}