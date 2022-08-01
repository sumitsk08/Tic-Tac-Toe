import java.util.Scanner;
public class TicTacToe{
	public static void main(String[]args){
	while(true)
	{
	System.out.printf("	Welcome to Tic-Tac-Toe!\n");
	System.out.printf("Press 0 for Two Player Game\nPress 1 for Computer version\n");
	char [][] b;
	int i,flag=0,flag1=0,f5=0,f6=0,j,k;
	b= new char[3][3];
	b[0][0]=' ';
	b[0][1]=' ';
	b[0][2]=' ';
	b[1][0]=' ';
	b[1][1]=' ';
	b[1][2]=' ';
	b[2][0]=' ';
	b[2][1]=' ';
	b[2][2]=' ';
	Scanner in = new Scanner(System.in);
	int z=in.nextInt();
	if(z==0)
	{
		System.out.printf("\nPlayer 1 is X       Player 2 is 0\n\n");
		showb(b);
		for(i=0;i<9;i++)
		{
			if(i%2==0)
			{
				System.out.printf("It is Player 1 turn !\nPlease choose the Coordinate where you want to place X: ");

				while(true)
				{
					Scanner i1 = new Scanner (System.in);
					int x=i1.nextInt();
					int y=i1.nextInt();
					if(x>=3 || y>=3 || b[x][y]!=' ')
					{
						System.out.printf("Invalid Coordinate!! Please enter again: ");
					}
					else
					{
						b[x][y]='X';
						int v=status(b);
						if(v==1)
						{
							
							flag=1;
							
							
						}
						showb(b);
						break;
					}
				}
				if(flag==1)
				{
					flag=0;
					System.out.printf("Player 1 wins\n");
				
					break;
				}
			}
			else
			{
				System.out.printf("It is Player 2 turn !\nPlease choose the coordinates where you want to place 0: ");
				while(true)
				{
					Scanner i2 = new Scanner(System.in);
					int x=i2.nextInt();
					int y=i2.nextInt();
					if(x>=3 || y>=3 || b[x][y]!=' ')
					{
						System.out.printf("Invalid Coordinate!! Please enter again: ");
					}
					else
					{
						b[x][y]='0';
						int g=status(b);
						if(g==2)
						{
							flag=1;
						}
						
						showb(b);
						break;
					}
				}
				if(flag==1)
				{
					flag=0;
					System.out.printf("Player 2 wins\n");
					
					break;
				}
				
			}	
		
		}
		if(i==9)
		{
			System.out.printf("Game ties\n");
			
		}
	
	

	
	
	
	}
	else
	{
		System.out.printf("Welcome to Computer version!\n You are X and Computer is 0\n");
		showb(b);
		for(i=0;i<9;i++)
		{
			if(i%2==0)
			{
				System.out.printf("It is your turn! Please choose the coordinate where you want to place X: ");
				while(true)
				{
					Scanner h1=new Scanner(System.in);
					int x=h1.nextInt();
					int y=h1.nextInt();
					if(x>=3 || y>=3 || b[x][y]!=' ')
					{
						System.out.printf("Invalid coordinate!! Please enter again: ");
					}
					else
					{
						b[x][y]='X';
						int g1=status(b);
						if(g1==1)
						{
							f5=1;
						}
						showb(b);
						break;
					}
				}
				if(f5==1)
				{
					f5=0;
					System.out.printf("You win!!\n");
					break;
				}
			}
			else
			{
				System.out.printf("It is Computer turn\n");
				if((b[0][0]=='X' && b[0][1]=='X' && b[0][2]==' ')||(b[0][0]=='0' && b[0][1]=='0' && b[0][2]==' '))
				{	
					b[0][2]='0';
					
				}
				else
				{
				if((b[0][1]=='X' && b[0][2]=='X' && b[0][0]==' ')|| (b[0][1]=='0' && b[0][2]=='0' && b[0][0]==' '))
				{
					b[0][0]='0';
						
				}
				else
				{
				if((b[0][0]=='X' && b[0][1]=='X' && b[0][1]==' ') || (b[0][0]=='0' && b[0][1]=='0' && b[0][1]==' '))
				{
					b[0][1]='0';
				}
				else
				{
				if((b[1][0]=='X' && b[1][1]=='X' && b[1][2]==' ')|| (b[1][0]=='0' && b[1][1]=='0' && b[1][2]==' '))
				{
					b[1][2]='0';
				}
				else
				{
				if((b[1][1]=='X' && b[1][2]=='X' && b[1][0]==' ')||(b[1][1]=='0' && b[1][2]=='0' && b[1][0]==' '))
				{
					b[1][0]='0';
				}
				else
				{
				if((b[1][0]=='X' && b[1][2]=='X' && b[1][1]==' ') || (b[1][0]=='0' && b[1][2]=='0' && b[1][1]==' '))
				{
					b[1][1]='0';
				}
				else
				{
				if((b[2][0]=='X' && b[2][1]=='X' && b[2][2]==' ')|| (b[2][0]=='0' && b[2][1]=='0' && b[2][2]==' '))
				{
					b[2][2]='0';
				}
				else
				{
				if((b[2][1]=='X' && b[2][2]=='X' && b[2][0]==' ')|| (b[2][1]=='0' && b[2][2]=='0' && b[2][0]==' '))
				{
					b[2][0]='0';
				}
				else
				{
				if((b[0][0]=='X' && b[1][0]=='X' && b[2][0]==' ')||(b[0][0]=='0' && b[1][0]=='0' && b[2][0]==' '))
				{
					b[2][0]='0';
				}
				else
				{
				if((b[1][0]=='X' && b[2][0]=='X' && b[0][0]==' ')|| (b[1][0]=='0' && b[2][0]=='0' && b[0][0]==' '))
				{
					b[0][0]='0';
				}
				else
				{
				if((b[0][0]=='X' && b[2][0]=='X' && b[1][0]==' ')|| (b[0][0]=='0' && b[2][0]=='0' && b[1][0]==' '))
				{
					b[1][0]='0';
				}
				else
				{
				if((b[0][1]=='X' && b[1][1]=='X' && b[2][1]==' ')||(b[0][1]=='0' && b[1][1]=='0' && b[2][1]==' '))
				{
					b[2][1]='0';
				}
				else
				{
				if((b[1][1]=='X' && b[2][1]=='X' && b[0][1]==' ')|| (b[1][1]=='0' && b[2][1]=='0' && b[0][1]==' '))
				{
					b[0][1]='0';
																	
				}
				else
				{
				if((b[0][1]=='X' && b[2][1]=='X' && b[1][1]==' ')||(b[0][1]=='0' && b[2][1]=='0' && b[1][1]==' '))
				{
					b[1][1]='0';
				}
				else
				{
				if((b[0][2]=='X' && b[1][2]=='X' && b[2][2]==' ')||(b[0][2]=='0' && b[1][2]=='0' && b[2][2]==' '))
				{
					b[2][2]='0';
				}
				else
				{
				if((b[1][2]=='X' && b[2][2]=='X' && b[0][2]==' ')||(b[1][2]=='0' && b[2][2]=='0' && b[0][2]==' '))
				{
					b[0][2]='0';
																				
				}
				else
				{
				if((b[0][2]=='X' && b[2][2]=='X' && b[1][2]==' ')||(b[0][2]=='0' && b[2][2]=='0' && b[1][2]==' '))
				{
					b[1][2]='0';
				}
				else
				{
				if((b[0][0]=='X' && b[1][1]=='X' && b[2][2]==' ')||(b[0][0]=='0' && b[1][1]=='0' && b[2][2]==' '))
				{
					b[2][2]='0';
				}
				else
				{
				if((b[1][1]=='X' && b[2][2]=='X' && b[0][0]==' ')||(b[1][1]=='0' && b[2][2]=='0' && b[0][0]==' '))
				{
					b[0][0]='0';
				}
				else
				{
				if((b[0][0]=='X' && b[2][2]=='X' && b[1][1]==' ')||(b[0][0]=='0' && b[2][2]=='0' && b[1][1]==' '))
				{
					b[1][1]='0';
				}
				else
				{
				if((b[0][2]=='X' && b[1][1]=='X' && b[2][0]==' ')||(b[0][2]=='0' && b[1][1]=='0' && b[2][0]==' '))
				{
					b[2][0]='0';
				}
				else
				{
				if((b[1][1]=='X' && b[2][0]=='X' && b[0][2]==' ')||(b[1][1]=='0' && b[2][0]=='0' && b[0][2]==' '))
				{
					b[0][2]='0';
				}
				else
				{
				if((b[0][2]=='X' && b[2][0]=='X' && b[1][1]==' ')||(b[0][2]=='0' && b[2][0]=='0' && b[1][1]==' '))
				{
					b[1][1]='0';
				}
				else
				{
					for(j=0;j<3;j++)
					{
						for(k=0;k<3;k++)
						{
							if(b[j][k]==' ')
							{
								b[j][k]='0';
								f6=1;
								break;
							}
							
						}
						if(f6==1)
						{
							f6=0;
							break;
						}
					}
					
				}
				
				}
				}
				}
				}
				}
				
				}															
				}
																			
				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
									
				}
				}
				}
				}
				}
				showb(b);
				int g2=status(b);
				if(g2==2)
				{
					System.out.printf("Computer Win\n");
					break;
				}
				
				
			}
		}
		if(i==9)
		{
			System.out.printf("Game Ties\n");
		}
	}
	
	
	
	
	
	
	
	
	System.out.printf("Want to play again?[Y/N]:");
	Scanner i3=new Scanner(System.in);
	char h=i3.next().charAt(0);
	if(h=='Y')
	{
		flag1=1;
		}
	else
	{
		flag=0;
		}
	if(flag1==0)
	{
		System.out.printf("Thank You! Have A Nice Day\n");
		break;
	}
	}
	 
}
	
	public static void showb(char [][]b)
	{
		int i,j;
		for(i=0;i<3;i++)
		{
			System.out.printf("	    ");
			for(j=0;j<3;j++)
			{
				System.out.printf("%c",b[i][j]);
				if(j<=1)
				{
					System.out.printf(" | ");
				}
				
			}
			System.out.printf("\n");
			if(i<=1)
			{
				System.out.printf("	   --- --- ---\n");
			}
			
		}    
	}
	public static int  status(char [][]b)
	{
		if(b[0][0]=='X' && b[0][1]=='X' && b[0][2]=='X')
		{
			return 1;
		} 
		if(b[1][0]=='X' && b[1][1]=='X' && b[1][2]=='X')
		{
			 return 1;
		}
		if(b[2][0]=='X' && b[2][1]=='X' && b[2][2]=='X')
		{
			return 1;
		}
		if(b[0][0]=='X' && b[1][0]=='X' && b[2][0]=='X')
		{
			return 1;
		} 
		if(b[0][1]=='X' && b[1][1]=='X' && b[2][1]=='X')
		{
			 return 1;
		}
		if(b[0][2]=='X' && b[1][2]=='X' && b[2][2]=='X')
		{
			return 1;
		}
		if(b[0][0]=='X' && b[1][1]=='X' && b[2][2]=='X')
		{
			return 1;
		}
		if(b[0][2]=='X' && b[1][1]=='X' && b[2][0]=='X')
		{
			return 1;
		}
		
		
		if(b[0][0]=='0' && b[0][1]=='0' && b[0][2]=='0')
		{
			return 2;
		} 
		if(b[1][0]=='0' && b[1][1]=='0' && b[1][2]=='0')
		{
			 return 2;
		}
		if(b[2][0]=='0' && b[2][1]=='0' && b[2][2]=='0')
		{
			return 2;
		}
		if(b[0][0]=='0' && b[1][0]=='0' && b[2][0]=='0')
		{
			return 2;
		} 
		if(b[0][1]=='0' && b[1][1]=='0' && b[2][1]=='0')
		{
			 return 2;
		}
		if(b[0][2]=='0' && b[1][2]=='0' && b[2][2]=='0')
		{
			return 2;
		}
		if(b[0][0]=='0' && b[1][1]=='0' && b[2][2]=='0')
		{
			return 2;
		}
		if(b[0][2]=='0' && b[1][1]=='0' && b[2][0]=='0')
		{
			return 2;
		}
	
		
		
		return 0;
	}
		
		 
				
	
}
