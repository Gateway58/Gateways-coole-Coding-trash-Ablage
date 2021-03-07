using System;

namespace CsharpTest
{
    class Program
    {


        static void Main(string[] args)
        {

            var rand = new Random();

            String[,] helloWorld = {
                { "Hallo", "Hello" },
                { "Welt", "World" },
                {  "Übersetzer", "Translator" }
                };
            Console.WriteLine("Enter eng or germ ");
            bool a = true;

            while (a)
            {
                String lang = Console.ReadLine();
                if (lang.Equals("eng"))
                {

                    int random = rand.Next(0, 3);
                    Console.WriteLine(helloWorld[random, 1]);
                    String trans = Console.ReadLine();
                    if (trans.Equals(helloWorld[random, 0]))
                    {
                        Console.WriteLine("Right! " + helloWorld[random, 0] + " means " + helloWorld[random, 1] + " in English! Awsome!");
                    }
                    else if (!trans.Equals(helloWorld[random, 0]))
                    {
                        Console.WriteLine("Nah, " + helloWorld[random, 1] + " means " + (helloWorld[random, 0]) + " in German");
                    }


                }
                else if (lang.Equals("germ"))
                {

                    int rando = rand.Next(0, 3);
                    Console.WriteLine(helloWorld[rando, 0]);
                    String tran = Console.ReadLine();
                    if (tran.Equals(helloWorld[rando, 1]))
                    {
                        Console.WriteLine("Geil, oiddddda " + helloWorld[rando, 1] + " moint " + helloWorld[rando, 0] + " auf Deitsch");
                    }
                    else if (!tran.Equals(helloWorld[rando, 0]))
                    {
                        Console.WriteLine("Ned guad, " + helloWorld[rando, 0] + " hoast " + (helloWorld[rando, 1]) + " auf Englüsch");
                    }

                    
                }
                else if (!lang.Equals("germ") && !lang.Equals("eng"))
                {
                    Console.WriteLine("Please enter in eng or germ!");
                }



            }
        }
    }
}
