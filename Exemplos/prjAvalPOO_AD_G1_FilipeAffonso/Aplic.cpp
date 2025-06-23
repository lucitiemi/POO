#include "GameShop.h"
#include <iostream.h>

int main()
{
   int cod, id;
   double horas;
   
   cout << "Digite o codigo: ";
   cin >> cod;
   cout << "Digite a idade: ";
   cin >> id;
   cout << "Digite as horas: ";
   cin >> horas;
 
   //instanciação do objeto
   GameShop objGame(cod,id,horas);
   
   cout << "\nSeu Saldo e de : " 
        << objGame.getSaldo();
       
   cout << "\nDigite as horas jogadas: ";
   cin >> horas;
   objGame.Jogar(horas);
   
   cout << "\nSeu Saldo e de : " 
        << objGame.getSaldo();
        
   cout << "\nDigite as horas compradas: ";
   cin >> horas; 
   objGame.ComprarHoras(horas);
   
   cout << "\nSeu Saldo e de : " 
        << objGame.getSaldo();
   
   cout << "\nVoce ganhou um brinde !!!";
   objGame.Brinde();
   
   cout << "\nSeu Saldo e de : " 
        << objGame.getSaldo();
   
   
   
   cout << "\n\n";
   system("pause");
   return (0);   
}    
      
      
