#include "GameShop.h"

GameShop::GameShop(int c, int i, double s)
{
  Codigo=c;
  Idade=i;
  SaldoHoras=s;                       
}  
                     
void GameShop::ComprarHoras(double horas)
{
   SaldoHoras = SaldoHoras + horas;  
}    

void GameShop::Brinde()
{
     SaldoHoras = SaldoHoras * 2;
}    
void GameShop::Jogar(double horas)
{
     SaldoHoras = SaldoHoras - horas;
}    
double GameShop::getSaldo()
{
    return(SaldoHoras);
}       
