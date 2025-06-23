class GameShop
{
   private:
      int Codigo;
      int Idade;
      double SaldoHoras;
      
   public:
      GameShop(int, int, double);
      void ComprarHoras(double);
      void Brinde();
      void Jogar(double);
      double getSaldo();            
};      
