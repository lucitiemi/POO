#include "Retangulo.h"
#include <math.h>
                 
Retangulo::Retangulo(double b, double a)
{
  Base=b;
  Altura=a;                          
}          
                 
double Retangulo::getBase()
{
  return(Base);     
}              
double Retangulo::getAltura() 
{
  return(Altura);
}  
double Retangulo::calcArea()
{
  double Area;
  Area = Base * Altura;
  return(Area);     
} 
double Retangulo::calcPerimetro()
{
  double Perimetro;
  Perimetro = 2 * (Base + Altura); 
  return(Perimetro);    
}             

double Retangulo::calcDiagonal()
{
   double Diagonal;
   Diagonal = sqrt((Base*Base) + (Altura*Altura));    
   return(Diagonal);
}




