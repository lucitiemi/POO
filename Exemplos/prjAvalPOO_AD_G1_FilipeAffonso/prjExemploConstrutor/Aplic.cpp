#include "Retangulo.h"
#include <iostream>

int main()
{
  double MedBase, MedAlt;
  
  std::cout << "Digite a medida da base: ";
  std::cin >> MedBase; 
  std::cout << "Digite a medida da altura: ";
  std::cin >> MedAlt; 
  
  //instanciação do objeto    
  Retangulo  objRet(MedBase, MedAlt);
 
  
  std::cout << "\n\n\nMedida da Base: "
            << objRet.getBase();
  std::cout << "\nMedida da Altura: "
            << objRet.getAltura();
  std::cout << "\nMedida da Área: "
            << objRet.calcArea();
  std::cout << "\nMedida do Perímetro: "
            << objRet.calcPerimetro();  
  std::cout << "\nMedida da Diagonal: "
            << objRet.calcDiagonal();                            
                      
  std::cout << "\n\n";
  system("pause");
  
  return(0);   
}   
