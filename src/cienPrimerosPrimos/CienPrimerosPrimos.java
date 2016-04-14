package cienPrimerosPrimos;

public class CienPrimerosPrimos 
{
	public static void main(String[] args)
	{
		boolean tieneDivisor = false;
		int contadorPrimos = 0;
		int dividendo = 1;
		int divisor = 2;
		while(contadorPrimos != 100)
		{
			tieneDivisor = false;
			divisor = 2;
			while(divisor <= dividendo/2 && !tieneDivisor)
			{
				if(dividendo % divisor == 0)
				{
					tieneDivisor = true;
				}
				divisor++;
			}
			if(!tieneDivisor)
			{
				System.out.println(dividendo);
				contadorPrimos++;
			}
			dividendo += 2;
		}
	}
}