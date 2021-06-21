package clothshopbilling;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.*;


public class SmartBillingApp  {

	public static void main(String[] args) {

		List<ChiuMart> list = new ArrayList<>();
		int PID;
		String name="";
		boolean flag= false;
		boolean flag1=true;
		int a = 0;int b = 0;
		int c = 0;int jcount = 0;
		int total = 0;int temp = 0;
		int dRes = 0;int disc = 0;
		int dRes1 = 0;int count = 1;int count1 = 0;
		 HashMap<Integer, String> suj = new HashMap<Integer, String>();
		 
	    
		 suj.put(101, "MISS. Neha Katke");
		 suj.put(102, "MISS. Sujata Bhagat");
		 suj.put(103, "MR. Vikas Katke");
		 suj.put(104, "MR. Akash Landge");
		 suj.put(105, "MR. Amol salve");
		 suj.put(107, "MISS. Sonali bhise ");
		 suj.put(108, "MISS. Anjali Alure ");
		 suj.put(109, "MISS .Ashwini Patil ");
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
		   LocalDateTime now = LocalDateTime.now();  
		   
		do {

			if (list != null) {
				for (ChiuMart chiuMart : list) {
					System.out.println(chiuMart.getProduct() + "        \t         " + chiuMart.getPrice());

				}

			}
			System.out.println("Enter product name");
			Scanner sc = new Scanner(System.in);
			String product = sc.nextLine();
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter product price");
			int price = sc1.nextInt();
			ChiuMart sb = new ChiuMart(product, price);
			list.add(sb);
			System.out.println("");

			System.out.println("PRESS 1: ADD PRODUCT");
			System.out.println("PRESS 2: EXIT");
			System.out.println("");
			Scanner sc2 = new Scanner(System.in);
			a = sc2.nextInt();
		} while (a != 2);
		System.out.println("Press :1 PREMIUM MEMBER");
		System.out.println("Press :2 BILL          ");
		Scanner sc3 = new Scanner(System.in);
		b = sc3.nextInt();
		if (b == 1) {
			
			System.out.println("  Welcome Into Premium Membership");
			System.out.println("----------------------------------");
			System.out.println("Please Enter Your Premium Id");
			Scanner scc=new Scanner(System.in);
			PID=scc.nextInt();
			  for(int z:suj.keySet())
			  {
				  if(PID==z)
				  {
					  flag=true;
				  }
			  }
			  if(flag) {
				  System.out.println(" " );
				  System.out.println(" NAME:  "+suj.get(PID));
				  System.out.println("----------------------------------");
				  name=suj.get(PID);
			  }
			  	if(flag) {
			for (ChiuMart chiuMart : list) {

				total = total + chiuMart.getPrice();
			}

			temp = total;

			System.out.println("ENTER DISCOUNT");
			Scanner sc5 = new Scanner(System.in);
			disc = sc5.nextInt();
			dRes = 100 - disc;
			dRes1 = (dRes * temp / 100);
			List<ChiuMart> list1 = list;
			  	}
			  	else
			  		
			  	{
			  		flag1=false;
			  		try
			  		{
			  			throw new MyException("b   ");
			  		}catch(MyException e)
			  		{ 
			  			System.out.println(" ");
			  			System.out.println(" ");
			  			System.out.println("OOPS.....");  
			  			System.out.println("InvalidIdException.....!");
			  			System.out.println("TRY NEXT TIME..");
			  		}
			  		//throw new SmartBillingApp("not valid");
			  	}
			  	if(flag) {

			Collections.sort(list, ChiuMart.suja);
			System.out.println("============================================================================");
			System.out.println("NAME:"+name+ "                                     DATE: "+dtf.format(now));
			System.out.println("============================================================================");
			System.out.println(" INDEX          PRODUCT NAME                             PRICE             |");
			System.out.println("============================================================================");

			for (ChiuMart chiuMart : list) {
				System.out.println("  "+((++count1))+ "     \t   " + chiuMart.getProduct() + "      \t\t\t \t      "
			+ chiuMart.getPrice());
				

			}
			  	}
			// System.out.println("index Product name price quantity ");
			/*			 * for (int i = jcount; i < list1.size()-1; i++) { for (int j = i + 1; j
			 * <list1.size(); j++) { count = 1; if (list1.get(i).equals(list1.get(j))) {
			 * System.out.println("my nasme is dom"); ++count; System.out.println(count1 +
			 * " " + list1.get(i) + "                      X  " + count);
			 * 
			 * // list1.add(i,null); } else { continue; } } if (list1 != null && count<=1) {
			 * System.out.println(count1 + " " + list1.get(i) +
			 * "                          X  " + count);
			 * 
			 * if (count > 1) { jcount = i + count; } } ++count1;
			 * 
			 * 
			 * 
			 * }
			 */
		} else if (b == 2) {
			for (ChiuMart chiuMart : list) {

				total = total + chiuMart.getPrice();
			}

			temp = total;
			List<ChiuMart> list1 = list;

			Collections.sort(list, ChiuMart.suja);
			System.out.println("============================================================================");
			System.out.println("NAME:"+name+ "                                DATE:"+dtf.format(now) );
			System.out.println("============================================================================");
			System.out.println(" INDEX          PRODUCT NAME                                PRICE          |");
			System.out.println("============================================================================");

			for (ChiuMart chiuMart : list1) {
				System.out.println(("   "+(++count1))+ "      \t  " + chiuMart.getProduct() + "    \t  \t\t \t      "
				+ chiuMart.getPrice()   );

			}
		}
		if(flag1) {
		System.out.println("============================================================================");
		System.out.println("                                              TOTAL BILL:     " + total);
		System.out.println("----------------------------------------------------------------------------");
		if (b == 1) {
			System.out.println(disc + "  :With Discount:                        FINAL BILL TOTAL:   " + dRes1);
		}
		
		}

			
					}


	}
