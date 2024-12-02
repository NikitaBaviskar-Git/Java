
public class Break {

	public static void main(String[] args) 
	{
		a:    
			for(int i = 1; i<= 10; i++) 
			{    
				b:    
					for(int j = 1; j<=15;j++) 
					{    
						c:    
							for (int k = 1; k<=10; k++) 
							{    
								System.out.println(k);   
									if(k==5) 
									{    
										break a;    
									}    
							}    
					}    

			}
	}

}
